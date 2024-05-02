package dz.ibnrochd.master14;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("dz.ibnrochd.master14.mapper")
public class Sb002Application  {


	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}
/*
	@Override
	public void run(String... args) throws Exception {
		 System.out.println("1");
		        List<Patient> allPatients = patientMapper.findAll();
		        System.out.println("All Patients: " + allPatients);
		        
		        String searchName = "Yahi"; // Example search name
		        Patient foundPatient = patientMapper.findByNom(searchName);
		        System.out.println("2");
		        if (foundPatient != null) {
		            System.out.println("Found Patient: " + foundPatient);
		        } else {
		            System.out.println("Patient with name " + searchName + " not found.");
		        }
		
		        Patient newPatient = new Patient();
		        newPatient.setNom("park");
		        newPatient.setPrenom("jimin");
		        newPatient.setSexe("m");
		        newPatient.setDateNaissance(new Date (13/10/1995));
		        newPatient.setAdresse("korea");
		        newPatient.setNumeroTelephone("066358781");
		        
		       
		
		
		        System.out.println("3");
		        Integer consultationId = 3; 
		        Consultation foundConsultation = consultationmapper.findConsultationById(consultationId);
		        if (foundConsultation != null) {
		            System.out.println("Found Consultation: " + foundConsultation);
		        } else {
		            System.out.println("Consultation with ID " + consultationId + " not found.");
		        }
		    
		      
	
}*/
		
		
	}


