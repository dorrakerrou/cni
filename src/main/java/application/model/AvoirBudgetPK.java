package application.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable
public class AvoirBudgetPK implements Serializable {
	 @Column(name = "CODE")
	private String code ; 
	 @Column(name = "DATE_BUDG")
	private Date date_budg ;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDate_budg() {
		return date_budg;
	}
	public void setDate_budg(Date date_budg) {
		this.date_budg = date_budg;
	}
	public AvoirBudgetPK(String code, Date date_budg) {
		super();
		this.code = code;
		this.date_budg = date_budg;
	}
	public AvoirBudgetPK() {
		super();
		// TODO Auto-generated constructor stub
	} 

	 
	 
	 
}
