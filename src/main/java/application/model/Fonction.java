package application.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "FONCTION")
@XmlRootElement
public class Fonction implements Serializable {
    private static final long serialVersionUID = 1L; 
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FONCT_SEQ")
    @SequenceGenerator(sequenceName = "fonction_seq", allocationSize = 1, name = "FONCT_SEQ")
	@Column(name="FONCTION_ID")
    private Long id ; 
    
    @Column(name = "COD_FONCTION")
    private String codFonction;
    
	
    @Column(name = "LIB_FONCA")
    private String libFonca;

    @Column(name = "LIB_FONCL")
    private String libFoncl;
    

    @Column(name = "TYP_FONC")
    private String typFonc;
    
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fonnction")
    @JsonIgnore
    private Collection<Missionnaire> missionnaireCollection;
    
	
	public Fonction() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Fonction(Long id, String codFonction, String libFonca, String libFoncl, String typFonc,
			Collection<Missionnaire> missionnaireCollection) {
		super();
		this.id = id;
		this.codFonction = codFonction;
		this.libFonca = libFonca;
		this.libFoncl = libFoncl;
		this.typFonc = typFonc;
		this.missionnaireCollection = missionnaireCollection;
	}




	public String getLibFonca() {
		return libFonca;
	}


	public void setLibFonca(String libFonca) {
		this.libFonca = libFonca;
	}


	public String getLibFoncl() {
		return libFoncl;
	}


	public void setLibFoncl(String libFoncl) {
		this.libFoncl = libFoncl;
	}


	public String getTypFonc() {
		return typFonc;
	}


	public void setTypFonc(String typFonc) {
		this.typFonc = typFonc;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	public String getCodFonction() {
		return codFonction;
	}




	public void setCodFonction(String codFonction) {
		this.codFonction = codFonction;
	}

	
@JsonIgnore
	public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnaireCollection;
	}




	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnaireCollection = missionnaireCollection;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}

	
    
 
   
	
}
