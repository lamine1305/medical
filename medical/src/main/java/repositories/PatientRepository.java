package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.dao.Patient;

public interface PatientRepository extends JpaRepository<Patient, String>{

}
