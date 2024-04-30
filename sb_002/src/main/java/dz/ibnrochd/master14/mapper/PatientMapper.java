package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import dz.ibnrochd.master14.model.Patient;

@Mapper
public interface PatientMapper {
	
	@Select("select * from cabinet.patient")
	List<Patient> findAll(); 
	
	@Select("select * from cabinet.patient where nom = #{nom}")
	Patient findByNom(@Param("nom") String nom );
	
	
	

}
