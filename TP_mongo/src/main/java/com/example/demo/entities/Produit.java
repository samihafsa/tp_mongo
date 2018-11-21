package com.example.demo.entities;
import java.io.Serializable;
import javax.persistence.*;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Document
@Entity
public class Produit implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1368341395775435079L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long reference;
	private String designation;
    private double prix;
    
    public Long getId() {
		return reference;
	}

	public void setId(Long reference) {
		this.reference = reference;
	}

    protected Produit() {}

    public Produit(String designation) {
        this.designation = designation;
    }

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}
