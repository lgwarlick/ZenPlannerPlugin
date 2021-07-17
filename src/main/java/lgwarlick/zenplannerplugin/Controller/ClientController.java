package lgwarlick.zenplannerplugin.Controller;

import lgwarlick.zenplannerplugin.Service.ClientService;
import lgwarlick.zenplannerplugin.Model.Client;
import lgwarlick.zenplannerplugin.Utility.CSVReadAndParse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
public class ClientController {

    private final ClientService clientService;
    private final CSVReadAndParse csvReadAndParse;

    public ClientController(ClientService clientService, CSVReadAndParse csvReadAndParse) {
        this.clientService = clientService;
        this.csvReadAndParse = csvReadAndParse;
    }

    @GetMapping("/index")
    public String uploadPage(){
        return "index";
    }
}
