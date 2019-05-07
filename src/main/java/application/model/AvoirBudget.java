package application.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@IdClass(AvoirBudgetPK.class)
public class AvoirBudget implements Serializable  {

	//@EmbeddedId
   // protected AvoirBudgetPK avoiBudgetPK;
 
	@Id
	@Column(name = "CODE")
   	private String code ; 
  
	@Column(name = "DATE_BUDG")
    @Id
 	private Date date_budg ;
	
	private Date annee ; 	
	private Double valeur_miss ; 
	private String reference_mis ; 
	private Double valeur_tr ; 
	private String reference_tr ; 
	private Date date_val ; 
	private String cod_util ; 
	private String type_budget ;
	
	
	@JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
	@JsonIgnore
    private DeptGen depart;
	
	public Date getDate_budg() {
		return date_budg;
	}
	public void setDate_budg(Date date_budg) {
		this.date_budg = date_budg;
	}
	
	public Date getAnnee() {
		return annee;
	}
	public void setAnnee(Date annee) {
		this.annee = annee;
	}
	public Double getValeur_miss() {
		return valeur_miss;
	}
	public void setValeur_miss(Double valeur_miss) {
		this.valeur_miss = valeur_miss;
	}
	public String getReference_mis() {
		return reference_mis;
	}
	public void setReference_mis(String reference_mis) {
		this.reference_mis = reference_mis;
	}
	
	public String getReference_tr() {
		return reference_tr;
	}
	public void setReference_tr(String reference_tr) {
		this.reference_tr = reference_tr;
	}
	public Double getValeur_tr() {
		return valeur_tr;
	}
	public void setValeur_tr(Double valeur_tr) {
		this.valeur_tr = valeur_tr;
	}
	public Date getDate_val() {
		return date_val;
	}
	public void setDate_val(Date date_val) {
		this.date_val = date_val;
	}
	public String getCod_util() {
		return cod_util;
	}
	public void setCod_util(String cod_util) {
		this.cod_util = cod_util;
	}
	public String getType_budget() {
		return type_budget;
	}
	public void setType_budget(String type_budget) {
		this.type_budget = type_budget;
	}
	
	public AvoirBudget() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public DeptGen getDepart() {
		return depart;
	}
	public void setDepart(DeptGen depart) {
		this.depart = depart;
	}
	public AvoirBudget(String code, Date date_budg, Date annee, Double valeur_miss, String reference_mis,
			Double valeur_tr, String reference_tr, Date date_val, String cod_util, String type_budget, DeptGen depart) {
		super();
		this.code = code;
		this.date_budg = date_budg;
		this.annee = annee;
		this.valeur_miss = valeur_miss;
		this.reference_mis = reference_mis;
		this.valeur_tr = valeur_tr;
		this.reference_tr = reference_tr;
		this.date_val = date_val;
		this.cod_util = cod_util;
		this.type_budget = type_budget;
		this.depart = depart;
	}
	
	
	

}
