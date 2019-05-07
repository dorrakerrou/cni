package application.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "AVOIR_BUDGET_PROJET")
@XmlRootElement
@IdClass(AvoirBudgetProjetPK.class)
public class AvoirBudgetProjet implements Serializable{
	    
	// @EmbeddedId
	     //protected AvoirBudgetProjetPK avoirBudgetProjetPK;
	    @Id 
	    @Column(name = "COD_PRJ")
	    private String codPrj;
	    
	    @Column(name = "ANNEE")
	    private Date annee;
	    @Id
	    @Column(name = "CODE")
	    private String code;
	    @Id
	    @Column(name = "DATE_BPROJ")
	    private Date dateBproj;  
	    
	    @Column(name = "REFERENCE")
	    private String reference;
	     @Column(name = "VALEUR")
	     private BigDecimal valeur;
	     @Column(name = "DATE_VAL")
	     private Date dateVal;
	     
	     @Column(name = "COD_UTIL")
	     private String codUtil;
	     
	     @Column(name = "TYPE_BUDGETP")
	     private String typeBudgetp;
	    
	     @JoinColumns({
	         @JoinColumn(name = "COD_PRJ", referencedColumnName = "COD_PRJ", insertable = false, updatable = false)
	         , @JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false)})
	     @ManyToOne(optional = false)
	     private Projet projet;

	     public AvoirBudgetProjet() {
	    
	     }

		public String getReference() {
			return reference;
		}

		public void setReference(String reference) {
			this.reference = reference;
		}

		public BigDecimal getValeur() {
			return valeur;
		}

		public void setValeur(BigDecimal valeur) {
			this.valeur = valeur;
		}

		public Date getDateVal() {
			return dateVal;
		}

		public void setDateVal(Date dateVal) {
			this.dateVal = dateVal;
		}

		public String getCodUtil() {
			return codUtil;
		}

		public void setCodUtil(String codUtil) {
			this.codUtil = codUtil;
		}

		public String getTypeBudgetp() {
			return typeBudgetp;
		}

		public void setTypeBudgetp(String typeBudgetp) {
			this.typeBudgetp = typeBudgetp;
		}

		public String getCodPrj() {
			return codPrj;
		}

		public void setCodPrj(String codPrj) {
			this.codPrj = codPrj;
		}

		public Date getAnnee() {
			return annee;
		}

		public void setAnnee(Date annee) {
			this.annee = annee;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Date getDateBproj() {
			return dateBproj;
		}

		public void setDateBproj(Date dateBproj) {
			this.dateBproj = dateBproj;
		}

		public Projet getProjet() {
			return projet;
		}

		public void setProjet(Projet projet) {
			this.projet = projet;
		}

		public AvoirBudgetProjet(String codPrj, Date annee, String code, Date dateBproj, String reference,
				BigDecimal valeur, Date dateVal, String codUtil, String typeBudgetp, Projet projet) {
			super();
			this.codPrj = codPrj;
			this.annee = annee;
			this.code = code;
			this.dateBproj = dateBproj;
			this.reference = reference;
			this.valeur = valeur;
			this.dateVal = dateVal;
			this.codUtil = codUtil;
			this.typeBudgetp = typeBudgetp;
			this.projet = projet;
		}
	     
		
}
