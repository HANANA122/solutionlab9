package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class Consultation implements Serializable {

	private static final long serialVersionUID = -3669998604878710274L;

	    private Integer id;
	    private String motif;
	    private Date  dateConsultation;
	    private Integer  idPatient;
	    
	   
	    
		public Consultation(Integer id, String motif, Date dateConsultation, Integer idPatient) {
			super();
			this.id = id;
			this.motif = motif;
			this.dateConsultation = dateConsultation;
			this.idPatient = idPatient;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getMotif() {
			return motif;
		}


		public void setMotif(String motif) {
			this.motif = motif;
		}


		public Date getDateConsultation() {
			return dateConsultation;
		}


		public void setDateConsultation(Date dateConsultation) {
			this.dateConsultation = dateConsultation;
		}


		public Integer getIdPatient() {
			return idPatient;
		}


		public void setIdPatient(Integer idPatient) {
			this.idPatient = idPatient;
		}
	    
	    
		 @Override
		    public String toString() {
		        return "Consultation [id=" + id + ", motif=" + motif + ", dateConsultation=" + dateConsultation + "]";    
	    
	    
}}
