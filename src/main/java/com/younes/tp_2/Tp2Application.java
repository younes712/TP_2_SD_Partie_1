package com.younes.tp_2;

import com.younes.tp_2.entities.Patient;
import com.younes.tp_2.repositories.PatientRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;


@SpringBootApplication
public class Tp2Application implements CommandLineRunner {
    @Autowired
    private PatientRespository patientRespository;
    public static void main(String[] args) {

        SpringApplication.run(Tp2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        Date d = new Date(90,04,20);
//        patientRespository.save(new Patient(null,"Alami Mohamed ",d,true,2));
//        patientRespository.save(new Patient(null,"Rahmani Aissam",new Date(89,07,02),true,1));
//        patientRespository.save(new Patient(null,"Najji Hajib",new Date(78,9,21),false,3));
//        patientRespository.save(new Patient(null,"Dori Imran",new Date(95,01,29),true,5));
//        List<Patient> patients = patientRespository.findAll();
//        patients.forEach(p ->{
//            System.out.println(p.toString());
//        });
//        //Cherchons un Patient avec le nom
//        Patient p = patientRespository.findPatientsByNom("Najji Hajib");
//
//        if (p != null) {
//            System.out.println("Le patient trouve :"+p.toString());
//        }
//
//        //Mettre a jour un patient
//        System.out.println("#################     Mettre a jour le patient Najji Hajib   #####################");
//        assert p != null;
//        p.setNom("Najji Morad");
//        patientRespository.save(p);
//        List<Patient> patients2 = patientRespository.findAll();
//        patients2.forEach(p2 ->{
//            System.out.println(p2.toString());
//        });
//        //Supprimer le patient avec id=2
//        System.out.println("#################     Supprimer le patient avec id=2  #####################");
//        long id = 2;
//        patientRespository.deleteById(id);
//        List<Patient> patients3 = patientRespository.findAll();
//        patients3.forEach(p2 ->{
//            System.out.println(p2.toString());
//        });
        List<Patient> patients =patientRespository.search(2);
        patients.forEach(p ->{
            System.out.println(p.toString());
        });
    }
}
