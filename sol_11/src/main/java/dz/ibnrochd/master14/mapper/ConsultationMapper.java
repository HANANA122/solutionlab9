package dz.ibnrochd.master14.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import dz.ibnrochd.master14.model.Consultation;

@Mapper
public interface ConsultationMapper {

	
	@Select("select * from cabinet.consultation ")
	List<Consultation> findAll(); 
	
	
	@Select("select * from cabinet.consultation where id = #{id}")
    Consultation findConsultationById(@Param("id") Integer id);
	
	
}
