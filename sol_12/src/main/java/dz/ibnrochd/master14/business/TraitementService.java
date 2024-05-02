package dz.ibnrochd.master14.business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.ibnrochd.master14.mapper.TraitementMapper;
import dz.ibnrochd.master14.model.Traitement;

import java.util.List;
@Service
public interface TraitementService {

	    private TraitementMapper traitementMapper ;

	    //reade touis les consultation
	    public List<Traitement> getAllTraitement() {
	       return traitementMapper.getAllTraitement();
	    }


	    //get consultaion
	    public Traitement getById(String nom ) {

	        return traitementMapper.getById(nom);
	    }

	    //create consultaion
	    public void createTraitement(Traitement traitement) {
	        traitmentMappers.createTraitement(traitement);

	    }

	    //update consultation
	    public void updateTraitement(Traitement traitement) {
	     traitmentMappers.updateTraitement(traitement);
	    }

	    //delete consultation
	    public void deletTraitement(int id) {
	       traitmentMappers.deletTraitement(id);
	    }
	

}
