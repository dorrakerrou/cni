package application.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "MISSIONNAIRE")
@XmlRootElement
public class Missionnaire implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="CIN")
    private String cin;
  
    @Column(name="MATRICULE")
    private String matricule;
      
    @Column(name = "nom")
	
	private String nom;
	@Column(name = "nomL")
	private String nomL;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "prenomL")
	private String prenomL;
	@Column(name = "nationalite")
	private String nationalite;
	@Column(name = "nationaliL")
	private String nationaliteL;
	@Column(name = "date_naiss")
	private Date datenaissance;
	@Column(name = "place_naiss")
	private String place_naissance ; 
	@Column(name = "rib")
	private String rib ; 
	@Column(name = "date_cin")
	private Date date_cin;
	@Column(name = "place_cin")
	private String place_cin;
	@Column(name = "groupe")
	private String groupe ; 
	@Column(name = "niveau")
	private String niveau;
	@Column(name = "ministr")
	private String ministr;
    
    @JoinColumn(name = "COD_CAT", referencedColumnName = "COD_CAT")
    @ManyToOne
    private Categorie codCat;
   
    @JoinColumn(name = "CLASSGRD", referencedColumnName = "CLASSGRD")
    @ManyToOne
    private Classe classgrd;
    
    @JoinColumn(name = "CODE", referencedColumnName = "CODE")
    @ManyToOne
    private DeptGen code;
    

    @JoinColumn(name = "CODGRP", referencedColumnName = "CODGRP")
    @ManyToOne
    private Groupe codgrp;


    @JoinColumn(name = "GRADE_ID", referencedColumnName = "GRADE_ID")
    @ManyToOne(cascade = {CascadeType.ALL})
	private Grade graade;
	
    @JoinColumn(name = "FONCTION_ID", referencedColumnName = "FONCTION_ID" )
    @ManyToOne (cascade = {CascadeType.ALL})
  	private Fonction fonnction;
    
	

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "missionnaire")
    @JsonIgnore
   	private Collection<OrdMis> ordMisCollection ;
     
    @JsonIgnore
    public Collection<OrdMis> getOrdMisCollection() {
		return ordMisCollection;
	}

	public void setOrdMisCollection(Collection<OrdMis> ordMisCollection) {
		this.ordMisCollection = ordMisCollection;
	}

	public Missionnaire() {
    }

	public Missionnaire(String cin, String matricule) {
		super();
		this.cin = cin;
		this.matricule = matricule;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Categorie getCodCat() {
		return codCat;
	}

	public void setCodCat(Categorie codCat) {
		this.codCat = codCat;
	}

	public Classe getClassgrd() {
		return classgrd;
	}

	public void setClassgrd(Classe classgrd) {
		this.classgrd = classgrd;
	}

	public DeptGen getCode() {
		return code;
	}

	public void setCode(DeptGen code) {
		this.code = code;
	}

	public Groupe getCodgrp() {
		return codgrp;
	}

	public void setCodgrp(Groupe codgrp) {
		this.codgrp = codgrp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomL() {
		return nomL;
	}

	public void setNomL(String nomL) {
		this.nomL = nomL;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPrenomL() {
		return prenomL;
	}

	public void setPrenomL(String prenomL) {
		this.prenomL = prenomL;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getNationaliteL() {
		return nationaliteL;
	}

	public void setNationaliteL(String nationaliteL) {
		this.nationaliteL = nationaliteL;
	}

	public Date getDatenaissance() {
		return datenaissance;
	}

	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}

	public String getPlace_naissance() {
		return place_naissance;
	}

	public void setPlace_naissance(String place_naissance) {
		this.place_naissance = place_naissance;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public Date getDate_cin() {
		return date_cin;
	}

	public void setDate_cin(Date date_cin) {
		this.date_cin = date_cin;
	}

	public String getPlace_cin() {
		return place_cin;
	}

	public void setPlace_cin(String place_cin) {
		this.place_cin = place_cin;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getMinistr() {
		return ministr;
	}

	public void setMinistr(String ministr) {
		this.ministr = ministr;
	}

	public Grade getGraade() {
		return graade;
	}

	public void setGraade(Grade graade) {
		this.graade = graade;
	}

	public Fonction getFonnction() {
		return fonnction;
	}

	public void setFonnction(Fonction fonnction) {
		this.fonnction = fonnction;
	}

	public Missionnaire(String cin, String matricule, String nom, String nomL, String prenom, String prenomL,
			String nationalite, String nationaliteL, Date datenaissance, String place_naissance, String rib,
			Date date_cin, String place_cin, String groupe, String niveau, String ministr, Categorie codCat,
			Classe classgrd, DeptGen code, Groupe codgrp, Grade graade, Fonction fonnction) {
		super();
		this.cin = cin;
		this.matricule = matricule;
		this.nom = nom;
		this.nomL = nomL;
		this.prenom = prenom;
		this.prenomL = prenomL;
		this.nationalite = nationalite;
		this.nationaliteL = nationaliteL;
		this.datenaissance = datenaissance;
		this.place_naissance = place_naissance;
		this.rib = rib;
		this.date_cin = date_cin;
		this.place_cin = place_cin;
		this.groupe = groupe;
		this.niveau = niveau;
		this.ministr = ministr;
		this.codCat = codCat;
		this.classgrd = classgrd;
		this.code = code;
		this.codgrp = codgrp;
		this.graade = graade;
		this.fonnction = fonnction;
	}

	
    
}

