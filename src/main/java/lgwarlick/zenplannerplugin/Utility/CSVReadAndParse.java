package lgwarlick.zenplannerplugin.Utility;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import lgwarlick.zenplannerplugin.Model.Client;
import lgwarlick.zenplannerplugin.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;


public class CSVReadAndParse {
    private static final String CSV_PATH = "";

    private ClientRepository clientRepository;

    public CSVReadAndParse(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void read() throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(CSV_PATH));
                ){
            CsvToBean<Client> csvToBean = new CsvToBeanBuilder<Client>(reader)
                    .withType(Client.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<Client> clientIterator = csvToBean.iterator();

            Client unsavedClient = new Client();

            while (clientIterator.hasNext()){
                unsavedClient = clientIterator.next();
                clientRepository.save(unsavedClient);
            }
        }
    }
}
