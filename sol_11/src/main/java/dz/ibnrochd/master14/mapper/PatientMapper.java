package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import dz.ibnrochd.master14.model.Patient;

@Mapper
public interface PatientMapper {
	
	@Select("select * from cabinet.patient")
	List<Patient> findAll(); 
	
	@Select("select * from cabinet.patient where nom = #{nom}")
	Patient findByNom(@Param("nom") String nom );
	
	@Insert("INSERT INTO cabinet.patient(nom, prenom, sexe, dateNaissance, numeroTelephone, adresse) "
            + "VALUES (#{patient.nom}, #{patient.prenom}, #{patient.sexe}, #{patient.dateNaissance}, "
            + "#{patient.numeroTelephone}, #{patient.adresse})")
    void insert(@Param("patient") Patient patient);
	
	@Update("UPDATE cabinet.patient SET nom = #{patient.nom}, prenom = #{patient.prenom}, "
            + "sexe = #{patient.sexe}, dateNaissance = #{patient.dateNaissance}, "
            + "numeroTelephone = #{patient.numeroTelephone}, adresse = #{patient.adresse} "
            + "WHERE id = #{patient.id}")
    void update(@Param("patient") Patient patient);
    
    @Delete("DELETE FROM cabinet.patient WHERE id = #{id}")
    void delete(@Param("id") int id);
	
	

}
