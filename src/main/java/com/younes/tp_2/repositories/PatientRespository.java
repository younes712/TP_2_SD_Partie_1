package com.younes.tp_2.repositories;
import com.younes.tp_2.entities.Patient;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRespository extends JpaRepository<Patient, Long> {

    Patient findPatientsByNom(String s);
    //void    updatePatient(Patient patient);
    void    deletePatientById(Long id);
    @Query("select p from Patient p where p.score=:x")
    List<Patient> search(@Param("x")int x);

}
