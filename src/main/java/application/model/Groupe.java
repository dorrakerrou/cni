package application.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "GROUPE")
@XmlRootElement
public class Groupe implements Serializable {
	
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CODGRP")
    private String codgrp;
 
    @Column(name = "LIBGRP")
    private String libgrp;
    
    @Column(name = "LIBGRPL")
    private String libgrpl;
      
  
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codgrp")
    @JsonIgnore
    private Collection<Missionnaire> missionnaireCollection;

     
    
    @JsonIgnore
	public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnaireCollection;
	}


	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnaireCollection = missionnaireCollection;
	}


	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Groupe(String codgrp, String libgrp, String libgrpl) {
		super();
		this.codgrp = codgrp;
		this.libgrp = libgrp;
		this.libgrpl = libgrpl;
	}


	public String getCodgrp() {
		return codgrp;
	}


	public void setCodgrp(String codgrp) {
		this.codgrp = codgrp;
	}


	public String getLibgrp() {
		return libgrp;
	}


	public void setLibgrp(String libgrp) {
		this.libgrp = libgrp;
	}


	public String getLibgrpl() {
		return libgrpl;
	}


	public void setLibgrpl(String libgrpl) {
		this.libgrpl = libgrpl;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


    
    
}
