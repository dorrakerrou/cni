package application.model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
//@Embeddable

public class AvoirBudgetProjetPK implements Serializable {

    @Column(name = "COD_PRJ")
    private String codPrj;
    @Column(name = "CODE")
    private String code;
    @Column(name = "DATE_BPROJ")
    
    private Date dateBproj;

    public AvoirBudgetProjetPK() {}

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

	public Date getDateBproj() {
		return dateBproj;
	}

	public void setDateBproj(Date dateBproj) {
		this.dateBproj = dateBproj;
	}

	public AvoirBudgetProjetPK(String codPrj, String code, Date dateBproj) {
		super();
		this.codPrj = codPrj;
		this.code = code;
		this.dateBproj = dateBproj;
	}
    
    
    
    
    }