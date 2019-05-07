package application.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@IdClass(ProjetPK.class)
@Entity
@Table(name = "PROJET")
@XmlRootElement
public class Projet implements Serializable{
	
	   // @EmbeddedId
	    //protected ProjetPK projetPK;
	    
	@Id
	@Column(name = "COD_PRJ")
    private String codPrj;
  
	@Id
    @Column(name = "CODE")
    private String code;
	
	    @Column(name = "LIBPRJ_A")
	    private String libprjA;
	    
	    @Column(name = "LIB_PRJ_L")
	    private String libPrjL;
	    
	    @JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false)
	    @ManyToOne(optional = false)
	    private DeptGen dept;
	    
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projet")
	    @JsonIgnore
	    private Collection<AvoirBudgetProjet> avoirBudgetProjetCollection;

	    public Projet() {
	    }

		

		public Projet(String codPrj, String code, String libprjA, String libPrjL, DeptGen dept,
				Collection<AvoirBudgetProjet> avoirBudgetProjetCollection) {
			super();
			this.codPrj = codPrj;
			this.code = code;
			this.libprjA = libprjA;
			this.libPrjL = libPrjL;
			this.dept = dept;
			this.avoirBudgetProjetCollection = avoirBudgetProjetCollection;
		}



		public String getCodPrj() {
			return codPrj;
		}



		public void setCodPrj(String codPrj) {
			this.codPrj = codPrj;
		}



		public String getCode() {
			return code;
		}



		public void setCode(String code) {
			this.code = code;
		}



		public DeptGen getDept() {
			return dept;
		}



		public void setDept(DeptGen dept) {
			this.dept = dept;
		}


	    @JsonIgnore
		public Collection<AvoirBudgetProjet> getAvoirBudgetProjetCollection() {
			return avoirBudgetProjetCollection;
		}



		public void setAvoirBudgetProjetCollection(Collection<AvoirBudgetProjet> avoirBudgetProjetCollection) {
			this.avoirBudgetProjetCollection = avoirBudgetProjetCollection;
		}



		public String getLibprjA() {
			return libprjA;
		}

		public void setLibprjA(String libprjA) {
			this.libprjA = libprjA;
		}

		public String getLibPrjL() {
			return libPrjL;
		}

		public void setLibPrjL(String libPrjL) {
			this.libPrjL = libPrjL;
		}



	
		
	    
}
