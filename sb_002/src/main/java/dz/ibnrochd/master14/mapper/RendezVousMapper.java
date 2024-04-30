package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import dz.ibnrochd.master14.model.RendezVous;

@Mapper
public interface RendezVousMapper {

	
	@Select("select * from cabinet.rendez_vous ")
	List<RendezVous> findAll(); 
}
