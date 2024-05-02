package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import dz.ibnrochd.master14.model.Traitement;

@Mapper
public interface TraitementMapper {
	
	    //reade tous les Traitment
	    List<Traitement> getAllTraitement();


	    //get Traitement
	    Traitement getById(String nom);

	    //create Traitement
	    void createTraitement(Traitement traitement);
	    //update Traitement
	    void updateTraitement(Traitement traitement);
	    //delete Traitement
	    void deletTraitement(int id);
	}

