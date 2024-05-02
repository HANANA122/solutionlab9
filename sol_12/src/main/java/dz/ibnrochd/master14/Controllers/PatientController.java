package dz.ibnrochd.master14.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dz.ibnrochd.master14.business.PatientService;
import dz.ibnrochd.master14.model.Patient;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

	     @Autowired
	    PatientService patientService;
	     @GetMapping("/patients")
	   public List<Patient> getAllPatient(){
	        return patientService.getAll();
	    }

	    @GetMapping("/nom/{nom_patient}")
	    public List<Patient> getPatientByName(@PathVariable String nom_patient) {
	        return patientService.getPatientByName(nom_patient);

	    }

	    @PostMapping("/add/patient")
	    public void createPatient(@RequestBody Patient patient) {
	        patientService.createPatient(patient);
	        System.out.println("patient add successfully");
	    }
	    @PutMapping("/update/patient")
	    public void updatePatient(@RequestBody Patient patient) {
	        patientService.updatePatient(patient);
	        System.out.println("patient updated successfully");
	    }
	    @DeleteMapping("delete")
	    public void deletePatient(@RequestBody Patient patient) {
	        patientService.updatePatient(patient);
	        System.out.println("patient updated successfully");
	    }


	}

}
