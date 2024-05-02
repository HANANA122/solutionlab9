package dz.ibnrochd.master14.model;

import java.io.Serializable;


public class Traitement implements Serializable {

	private static final long serialVersionUID = 8248365590951840055L;

    private Integer id;
    private String nom;
    
    
    
	public Traitement(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

    
    
}
