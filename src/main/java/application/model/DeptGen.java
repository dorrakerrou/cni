package application.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author dell
 */
@Entity
@Table(name = "DEPT_GEN")
@XmlRootElement
public class DeptGen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CODE")
    private String code;
    
  
    @Column(name = "LIB_A")
    private String libA;
    
    @Column(name = "LIB_L")
    private String libL;
    

    @Column(name = "TYP_DEPT")
    private String typDept;

    @Column(name = "CPT_MISSION")
    private short cptMission;
    
    @Column(name = "CPT_NBP")
    private Integer cptNbp;
    
    @Column(name = "CPT_NOP")
    private Integer cptNop;
    
    
    @Column(name = "COD_COMM")
    private String codComm;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "code")
    @JsonIgnore
    private Collection<Missionnaire> missionnaireCollection;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deptGen")
    @JsonIgnore
    private Collection<Mission> missionCollection;
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dept")
    @JsonIgnore
    private Collection <Projet> ProjetCollection  ; 
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departement")
    @JsonIgnore
    private Collection <UserStruct> userCollection ;
  
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "depart")
    @JsonIgnore
    private Collection <AvoirBudget> AvoirBudgetCollection ;
    
    @JsonIgnore
    public Collection<UserStruct> getUserCollection() {
		return userCollection;
	}

	public void setUserCollection(Collection<UserStruct> userCollection) {
		this.userCollection = userCollection;
	}

	@JsonIgnore
    public Collection<Mission> getMissionCollection() {
		return missionCollection;
	}

	public void setMissionCollection(Collection<Mission> missionCollection) {
		this.missionCollection = missionCollection;
	}

	@JsonIgnore
    public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnaireCollection;
	}

	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnaireCollection = missionnaireCollection;
	}

	
	public DeptGen() {
		super() ; 
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibA() {
		return libA;
	}

	public void setLibA(String libA) {
		this.libA = libA;
	}

	public String getLibL() {
		return libL;
	}

	public void setLibL(String libL) {
		this.libL = libL;
	}

	public String getTypDept() {
		return typDept;
	}

	public void setTypDept(String typDept) {
		this.typDept = typDept;
	}

	public short getCptMission() {
		return cptMission;
	}

	public void setCptMission(short cptMission) {
		this.cptMission = cptMission;
	}

	public Integer getCptNbp() {
		return cptNbp;
	}

	public void setCptNbp(Integer cptNbp) {
		this.cptNbp = cptNbp;
	}

	public Integer getCptNop() {
		return cptNop;
	}

	public void setCptNop(Integer cptNop) {
		this.cptNop = cptNop;
	}

	public String getCodComm() {
		return codComm;
	}

	public void setCodComm(String codComm) {
		this.codComm = codComm;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public DeptGen(String code, String libA, String libL, String typDept, short cptMission, Integer cptNbp,
			Integer cptNop, String codComm) {
		super();
		this.code = code;
		this.libA = libA;
		this.libL = libL;
		this.typDept = typDept;
		this.cptMission = cptMission;
		this.cptNbp = cptNbp;
		this.cptNop = cptNop;
		this.codComm = codComm;
	}
    
}
