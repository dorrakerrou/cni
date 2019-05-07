package application.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@NamedQuery(name="OrdMis.findAll", query="SELECT g FROM OrdMis g")

@Table(name = "ORD_MIS")
@XmlRootElement
@IdClass(OrdMisPK.class)
public class OrdMis implements Serializable{

  

		//@EmbeddedId
    //protected OrdMisPK ordMisPK;
	    @Id
	    @Column(name = "CODE")
	    private String code;
        @Id
	    @Column(name="CIN")
	    private String cin; 
	    @Id
		@GeneratedValue(strategy=GenerationType.AUTO)
        @Column(name = "NUMORD", unique = true, nullable = false) 
        private short numord;
        @Id
        @Column(name = "NUM_MISSION")
        private String numMission; 
        
    @Column(name = "DATDEP_P")
    private Date datdepP;
    

    @Column(name = "DATARR_P")
    private Date datarrP;
    
    @Column(name = "DATDEP_R")
    private Date datdepR;
    
    @Column(name = "DATARR_R")
    private Date datarrR;
    
    @Column(name = "TIMBR")
    private BigDecimal timbr;
    
    @Column(name = "AVANCE")
    private BigDecimal avance;
    


    @Column(name = "ETAT")
    private String etat;
    

    @Column(name = "NUM_PB")
    private String numPb;
    
    @Column(name = "DATE_PAY")
    private Date datePay;
    
    @Column(name = "AVANCE_ACC")
    private BigDecimal avanceAcc;
    
    @Column(name = "DAT_RAP")
    private Date datRap;
    
    @Column(name = "NUM_OP")
    private String numOp;
    
    @Column(name = "TAUX_SPEC")
    private BigDecimal tauxSpec;
    
    
    @Column(name = "AVANCE_OLD")
    private BigDecimal avanceOld;
    
    @Column(name = "OBS_CTRL")
    private String obsCtrl;
    @Column(name = "TYP_AV")
    private String typAv;  
    @Column(name = "RESUME")
    private String resume;
    

    @JoinColumns({
        @JoinColumn(name = "NUM_MISSION", referencedColumnName = "NUM_MISSION", insertable = false, updatable = false)
        , @JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Mission mission;
    
    @JoinColumn(name = "CIN", referencedColumnName = "CIN", insertable=false , updatable=false )
    @ManyToOne
    private Missionnaire missionnaire;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordMis")
    @JsonIgnore
    private Collection<AvoirFrais> avoirFraisCollection;
    
 
	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}


	public Missionnaire getMissionnaire() {
		return missionnaire;
	}

	public void setMissionnaire(Missionnaire missionnaire) {
		this.missionnaire = missionnaire;
	}

	public OrdMis() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Date getDatdepP() {
		return datdepP;
	}

	public void setDatdepP(Date datdepP) {
		this.datdepP = datdepP;
	}

	public Date getDatarrP() {
		return datarrP;
	}

	public void setDatarrP(Date datarrP) {
		this.datarrP = datarrP;
	}

	public Date getDatdepR() {
		return datdepR;
	}

	public void setDatdepR(Date datdepR) {
		this.datdepR = datdepR;
	}

	public Date getDatarrR() {
		return datarrR;
	}

	public void setDatarrR(Date datarrR) {
		this.datarrR = datarrR;
	}

	public BigDecimal getTimbr() {
		return timbr;
	}

	public void setTimbr(BigDecimal timbr) {
		this.timbr = timbr;
	}

	public BigDecimal getAvance() {
		return avance;
	}

	public void setAvance(BigDecimal avance) {
		this.avance = avance;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	

	public String getNumPb() {
		return numPb;
	}

	public void setNumPb(String numPb) {
		this.numPb = numPb;
	}

	public Date getDatePay() {
		return datePay;
	}

	public void setDatePay(Date datePay) {
		this.datePay = datePay;
	}

	public BigDecimal getAvanceAcc() {
		return avanceAcc;
	}

	public void setAvanceAcc(BigDecimal avanceAcc) {
		this.avanceAcc = avanceAcc;
	}

	public Date getDatRap() {
		return datRap;
	}

	public void setDatRap(Date datRap) {
		this.datRap = datRap;
	}

	public String getNumOp() {
		return numOp;
	}

	public void setNumOp(String numOp) {
		this.numOp = numOp;
	}

	public BigDecimal getTauxSpec() {
		return tauxSpec;
	}

	public void setTauxSpec(BigDecimal tauxSpec) {
		this.tauxSpec = tauxSpec;
	}


	public BigDecimal getAvanceOld() {
		return avanceOld;
	}

	public void setAvanceOld(BigDecimal avanceOld) {
		this.avanceOld = avanceOld;
	}

	public String getObsCtrl() {
		return obsCtrl;
	}

	public void setObsCtrl(String obsCtrl) {
		this.obsCtrl = obsCtrl;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getTypAv() {
		return typAv;
	}

	public void setTypAv(String typAv) {
		this.typAv = typAv;
	}

	  public short getNumord() {
			return numord;
		}

		public void setNumord(short numord) {
			this.numord = numord;
		}

		public String getNumMission() {
			return numMission;
		}

		public void setNumMission(String numMission) {
			this.numMission = numMission;
		}
	
	@JsonIgnore
	public Collection<AvoirFrais> getAvoirFraisCollection() {
		return avoirFraisCollection;
	}

	public void setAvoirFraisCollection(Collection<AvoirFrais> avoirFraisCollection) {
		this.avoirFraisCollection = avoirFraisCollection;
	}
    
       
    
}
