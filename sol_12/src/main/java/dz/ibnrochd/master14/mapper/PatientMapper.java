package dz.ibnrochd.master14.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import dz.ibnrochd.master14.model.Patient;

@Mapper
public interface PatientMapper {
	
	//read tous les patients
	     List<Patient> getAll();
	//recharche patient by name
	    List<Patient> getByName(String name);
	    //create patient
	     void createPatient(Patient patient) ;
	     //update patient
	    void updatePatient(Patient patient);
	    //delete Patient
	    void deletPatient(int id);
	

	

}
