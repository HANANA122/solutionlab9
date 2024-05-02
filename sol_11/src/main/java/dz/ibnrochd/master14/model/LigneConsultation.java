package dz.ibnrochd.master14.model;

import java.io.Serializable;





public class LigneConsultation implements Serializable {

	private static final long serialVersionUID = -1882485395538957648L;

	 private Integer id;
	    private Integer idConsultation;
	    private Integer idTraitement;
	    private String posologie;
	    private String uniteTemps;
	    private String quantite;
	    
	 
	    
	    
		public LigneConsultation(Integer id, Integer idConsultation, Integer idTraitement, String posologie,
				String uniteTemps, String quantite) {
			super();
			this.id = id;
			this.idConsultation = idConsultation;
			this.idTraitement = idTraitement;
			this.posologie = posologie;
			this.uniteTemps = uniteTemps;
			this.quantite = quantite;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public Integer getIdConsultation() {
			return idConsultation;
		}


		public void setIdConsultation(Integer idConsultation) {
			this.idConsultation = idConsultation;
		}


		public Integer getIdTraitement() {
			return idTraitement;
		}


		public void setIdTraitement(Integer idTraitement) {
			this.idTraitement = idTraitement;
		}


		public String getPosologie() {
			return posologie;
		}


		public void setPosologie(String posologie) {
			this.posologie = posologie;
		}


		public String getUniteTemps() {
			return uniteTemps;
		}


		public void setUniteTemps(String uniteTemps) {
			this.uniteTemps = uniteTemps;
		}


		public String getQuantite() {
			return quantite;
		}


		public void setQuantite(String quantite) {
			this.quantite = quantite;
		}
	    
	    
	    
}
