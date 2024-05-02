package dz.ibnrochd.master14.model;

import java.io.Serializable;


import java.util.Date;



public class Patient implements Serializable {

	private static final long serialVersionUID = -3415388341943341473L;

	
    private Integer id;
    private String nom;
    private String prenom;
    private String sexe;
    private Date dateNaissance;
    private String numeroTelephone;
    private String adresse;
    
  
    
    /////////////////////////////////////////////////////////
    
    public Patient() {		
	}

	public Patient(Integer id, String nom, String prenom, String sexe, Date dateNaissance, String numeroTelephone,
			String adresse) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.numeroTelephone = numeroTelephone;
		this.adresse = adresse;
	}
	
	//////////////////////////////////////////////////////

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
    public String toString() {
        return "Patient [nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", dateNaissance=" + dateNaissance + ", adresse=" + adresse + ", numeroTelephone=" + numeroTelephone + "]";	

	}}
