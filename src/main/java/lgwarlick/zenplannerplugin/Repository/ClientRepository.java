package lgwarlick.zenplannerplugin.Repository;

import lgwarlick.zenplannerplugin.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
