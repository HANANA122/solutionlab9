package dz.ibnrochd.master14.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import dz.ibnrochd.master14.model.Consultation;

@Mapper
public interface ConsultationMapper {
	
	
	

	    //reade touis les consultation
	   List<Consultation> getAllConsultation();


	   //get consultaion
	    Consultation getById(int id);

	    //create consultaion
	    void createConsultaion(Consultation consultation);
	    //update consultation
	    void updateConsultaion(Consultation consultation);
	    //delete consultation
	    void deletConsultation(int id);
	
	
}
