package dz.ibnrochd.master14.business;

import java.util.List;

import dz.ibnrochd.master14.model.Patient;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {   
	    
List<Patient> listerPatients();
    
    Patient trouverPatientParNom(String nom);
    
    void creerPatient(Patient patient);
    
    void mettreAJourPatient(Patient patient);
    
    void supprimerPatient(int id); 
}
