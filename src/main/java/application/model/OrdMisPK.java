package application.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Embeddable;

//@Embeddable
public class OrdMisPK implements Serializable {
 
    @Column(name = "CODE")
    private String code;

  
    @Column(name = "NUMORD")
    private short numord;
    
    @Column(name = "NUM_MISSION")
    private String numMission; 
    
	public OrdMisPK() { 
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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




}
