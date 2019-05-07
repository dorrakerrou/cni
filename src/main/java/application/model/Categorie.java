package application.model;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The persistent class for the CATEGORIE database table.
 * 
 */
@Entity
@Table(name="categorie")
@XmlRootElement
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COD_CAT")
	private String codeCat;
	
	@Column(name="LIB_CATA")
	private String libCatAr;

	@Column(name="LIB_CATL")
	private String libCatFr;
	
	
	@OneToMany(mappedBy = "codCat")
	@JsonIgnore
    private Collection<Missionnaire> missionnaireCollection;

	
	

    @JsonIgnore	
	public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnaireCollection;
	}


	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnaireCollection = missionnaireCollection;
	}


	public Categorie() {
		super() ; 
	}


	public String getCodeCat() {
		return codeCat;
	}


	public void setCodeCat(String codeCat) {
		this.codeCat = codeCat;
	}


	public String getLibCatAr() {
		return libCatAr;
	}


	public void setLibCatAr(String libCatAr) {
		this.libCatAr = libCatAr;
	}


	public String getLibCatFr() {
		return libCatFr;
	}


	public void setLibCatFr(String libCatFr) {
		this.libCatFr = libCatFr;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Categorie(String codeCat, String libCatAr, String libCatFr) {
		super();
		this.codeCat = codeCat;
		this.libCatAr = libCatAr;
		this.libCatFr = libCatFr;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeCat == null) ? 0 : codeCat.hashCode());
		result = prime * result + ((libCatAr == null) ? 0 : libCatAr.hashCode());
		result = prime * result + ((libCatFr == null) ? 0 : libCatFr.hashCode());
		result = prime * result + ((missionnaireCollection == null) ? 0 : missionnaireCollection.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categorie other = (Categorie) obj;
		if (codeCat == null) {
			if (other.codeCat != null)
				return false;
		} else if (!codeCat.equals(other.codeCat))
			return false;
		if (libCatAr == null) {
			if (other.libCatAr != null)
				return false;
		} else if (!libCatAr.equals(other.libCatAr))
			return false;
		if (libCatFr == null) {
			if (other.libCatFr != null)
				return false;
		} else if (!libCatFr.equals(other.libCatFr))
			return false;
		if (missionnaireCollection == null) {
			if (other.missionnaireCollection != null)
				return false;
		} else if (!missionnaireCollection.equals(other.missionnaireCollection))
			return false;
		return true;
	}
	

	




	
}