package lgwarlick.zenplannerplugin.Service;

import lgwarlick.zenplannerplugin.Model.Client;
import lgwarlick.zenplannerplugin.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    public Client addClient(Client client){
        return clientRepository.save(client);
    }
}
