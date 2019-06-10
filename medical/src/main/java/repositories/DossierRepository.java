package repositories;

import org.springframework.data.repository.CrudRepository;

import com.medical.dao.Dossier;

public interface DossierRepository extends CrudRepository<Dossier, Integer> {

}
