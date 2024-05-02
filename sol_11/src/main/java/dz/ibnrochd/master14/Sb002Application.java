package dz.ibnrochd.master14;

import java.sql.Date;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dz.ibnrochd.master14.mapper.ConsultationMapper;
import dz.ibnrochd.master14.mapper.LigneConsultationMapper;
import dz.ibnrochd.master14.mapper.PatientMapper;
import dz.ibnrochd.master14.mapper.RendezVousMapper;
import dz.ibnrochd.master14.mapper.TraitementMapper;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;

@SpringBootApplication
@MapperScan("dz.ibnrochd.master14.mapper")
public class Sb002Application implements CommandLineRunner {
	
	 @Autowired
	    private PatientMapper patientMapper;
	 @Autowired
	    private ConsultationMapper consultationmapper ; 
	 @Autowired
	    private LigneConsultationMapper lighneconsultationmapper ; 
	 @Autowired
	    private RendezVousMapper rendezvousmapper ;  
	 @Autowired
	    private TraitementMapper traitementmapper ; 
	
	

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


