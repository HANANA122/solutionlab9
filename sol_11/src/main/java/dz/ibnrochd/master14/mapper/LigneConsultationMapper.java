package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import dz.ibnrochd.master14.model.LigneConsultation;

@Mapper
public interface LigneConsultationMapper {

	
	@Select("select * from ligne_consultation ")
	List<LigneConsultation> findAll(); 
}
