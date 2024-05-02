package dz.ibnrochd.master14.business;

import java.util.List;

import dz.ibnrochd.master14.mapper.PatientMapper;
import dz.ibnrochd.master14.model.Patient;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public interface PatientService {   
	    

	    @Autowired
	    private PatientMapper patientMapper;

	    public List<Patient> getAll(){
	        return patientMapper.getAll();
	    }


	    public List<Patient> getPatientByName(String name) {
	        return patientMapper.getByName(name);
	    }
	    public void createPatient(Patient patient) {
	        patientMapper.createPatient(patient);
	    }

	    public  void updatePatient(Patient patient) {
	        patientMapper.updatePatient(patient);
	    }

	    //delete consultation
	    public  void deletPatient(int id) {
	        patientMapper.deletPatient(id);
	    }

	}
