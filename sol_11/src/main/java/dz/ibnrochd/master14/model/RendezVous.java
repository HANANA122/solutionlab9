package dz.ibnrochd.master14.model;

import java.io.Serializable;

import java.util.Date;




public class RendezVous implements Serializable {

	private static final long serialVersionUID = -7275578697948165342L;

    private Integer id;
    private Date dateRdv;

   

    //////////////////////////////////////////////
    
    public RendezVous() {
		
	}

	
	public RendezVous(Integer id, Date dateRdv) {
		super();
		this.id = id;
		this.dateRdv = dateRdv;
	}


	

	///////////////////////////////////////////////
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateRdv() {
		return dateRdv;
	}

	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}

	
    
    
}
