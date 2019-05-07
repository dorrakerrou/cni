package application.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "CLASSE")
@XmlRootElement

public class Classe implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CLASSGRD")
    private String classgrd;
  

    @Column(name = "LIBCLASSGRDA")
    private String libclassgrda;

    @Column(name = "LIBCLASSGRDL")
    private String libclassgrdl;
    
    
    

    @OneToMany(mappedBy = "classgrd", fetch = FetchType.EAGER)
    @JsonIgnore
    private Collection<Missionnaire> missionnaireCollection;

 
    
    
    @JsonIgnore
	public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnaireCollection;
	}

	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnaireCollection = missionnaireCollection;
	}

	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classe(String classgrd, String libclassgrda, String libclassgrdl) {
		super();
		this.classgrd = classgrd;
		this.libclassgrda = libclassgrda;
		this.libclassgrdl = libclassgrdl;
	}

	public String getClassgrd() {
		return classgrd;
	}

	public void setClassgrd(String classgrd) {
		this.classgrd = classgrd;
	}

	public String getLibclassgrda() {
		return libclassgrda;
	}

	public void setLibclassgrda(String libclassgrda) {
		this.libclassgrda = libclassgrda;
	}

	public String getLibclassgrdl() {
		return libclassgrdl;
	}

	public void setLibclassgrdl(String libclassgrdl) {
		this.libclassgrdl = libclassgrdl;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classgrd == null) ? 0 : classgrd.hashCode());
		result = prime * result + ((libclassgrda == null) ? 0 : libclassgrda.hashCode());
		result = prime * result + ((libclassgrdl == null) ? 0 : libclassgrdl.hashCode());
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
		Classe other = (Classe) obj;
		if (classgrd == null) {
			if (other.classgrd != null)
				return false;
		} else if (!classgrd.equals(other.classgrd))
			return false;
		if (libclassgrda == null) {
			if (other.libclassgrda != null)
				return false;
		} else if (!libclassgrda.equals(other.libclassgrda))
			return false;
		if (libclassgrdl == null) {
			if (other.libclassgrdl != null)
				return false;
		} else if (!libclassgrdl.equals(other.libclassgrdl))
			return false;
		if (missionnaireCollection == null) {
			if (other.missionnaireCollection != null)
				return false;
		} else if (!missionnaireCollection.equals(other.missionnaireCollection))
			return false;
		return true;
	}
   
  
	
}