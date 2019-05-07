package application.model;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@IdClass(MissionPK.class)
@Entity
@Table(name="MISSION")
public class Mission implements Serializable{
	    
//	    @EmbeddedId
//        protected MissionPK missionPK;
	    @Id 
	    @Column(name = "NUM_MISSION")
	    private String numMission;
	    @Id 
	    @Column(name = "CODE")
	    private String code;
    
	
	    @Column(name = "OBJETA")
	    private String objeta;
	    
	    @Column(name = "OBJETL")
	    private String objetl ; 
	    
	    @Column(name = "DATDEP_P")
	    private Date datdepP;
	
	    @Column(name = "DATARR_P")
	    private Date datarrP;

	   
	    

	    @JoinColumn(name = "CODE", insertable=false , updatable=false )
	    @ManyToOne
	    private DeptGen deptGen;
	    
	    
	    @ManyToOne
		private Motcle Motcle;
	    
	    
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mission")
	    @JsonIgnore
	    private Collection<OrdMis> ordMisCollection;
	    

		

	


		public Mission(String numMission, String code, String objeta, String objetl, Date datdepP, Date datarrP,
				DeptGen deptGen, application.model.Motcle motcle, Collection<OrdMis> ordMisCollection) {
			super();
			this.numMission = numMission;
			this.code = code;
			this.objeta = objeta;
			this.objetl = objetl;
			this.datdepP = datdepP;
			this.datarrP = datarrP;
			this.deptGen = deptGen;
			Motcle = motcle;
			this.ordMisCollection = ordMisCollection;
		}

		public Mission() {
			super();
			// TODO Auto-generated constructor stub
		}

//		public MissionPK getMissionPK() {
//			return missionPK;
//		}
//
//		public void setMissionPK(MissionPK missionPK) {
//			this.missionPK = missionPK;
//		}

		public String getObjeta() {
			return objeta;
		}

		public String getNumMission() {
			return numMission;
		}




		public void setNumMission(String numMission) {
			this.numMission = numMission;
		}




		public String getCode() {
			return code;
		}




		public void setCode(String code) {
			this.code = code;
		}




		public void setObjeta(String objeta) {
			this.objeta = objeta;
		}

		public String getObjetl() {
			return objetl;
		}

		public void setObjetl(String objetl) {
			this.objetl = objetl;
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

	




		public DeptGen getDeptGen() {
			return deptGen;
		}



		public void setDeptGen(DeptGen deptGen) {
			this.deptGen = deptGen;
		}




		public Motcle getMotcle() {
			return Motcle;
		}




		public void setMotcle(Motcle motcle) {
			Motcle = motcle;
		}




		public Collection<OrdMis> getOrdMisCollection() {
			return ordMisCollection;
		}




		public void setOrdMisCollection(Collection<OrdMis> ordMisCollection) {
			this.ordMisCollection = ordMisCollection;
		}
       
	   
    

}
