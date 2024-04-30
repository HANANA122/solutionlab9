package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import dz.ibnrochd.master14.model.Traitement;

@Mapper
public interface TraitementMapper {

	
	@Select("select * from cabinet.traitement ")
	List<Traitement> findAll(); 
}
