package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.mapper.PatientMapper;
import dz.ibnrochd.master14.model.Patient;

@Service
public class IPatientService implements PatientService {
	
	
	@Autowired
    private PatientMapper patientMapper;
    
    @Override
    public List<Patient> listerPatients() {
        return patientMapper.findAll();
    }

    @Override
    public Patient trouverPatientParNom(String nom) {
        return patientMapper.findByNom(nom);
    }

    @Override
    public void creerPatient(Patient patient) {
        patientMapper.insert(patient);
    }
    
    @Override
    public void mettreAJourPatient(Patient patient) {
        patientMapper.update(patient);
    }

    @Override
    public void supprimerPatient(int id) {
        patientMapper.delete(id);
    }
}