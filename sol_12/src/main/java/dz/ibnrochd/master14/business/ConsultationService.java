package dz.ibnrochd.master14.business;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.mapper.ConsultationMapper;
import dz.ibnrochd.master14.model.Consultation;

import java.util.List;

@Service
public interface ConsultationService {
	
	
	    @Autowired
	    ConsultationMapper consultationMapper;
	    //reade touis les consultation
	    List<Consultation> getAllConsultation() {

	        return consultationMapper.getAllConsultation();
	    }


	    //get consultaion
	    public Consultation getById(int id) {
	        return consultationMapper.getById(id);
	    }

	    //create consultaion
	    public void createConsultation(Consultation consultation) {
	      consultationMapper.createConsultaion(consultation);
	    }

	    //update consultation
	   public  void updateConsultation(Consultation consultation) {
	   consultationMapper.updateConsultaion(consultation);
	    }

	    //delete consultation
	   public  void deletConsultationt(int id) {
	       consultationMapper.deletConsultation(id);
	    }
	}


}
