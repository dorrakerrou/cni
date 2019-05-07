package application.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable
public class MissionPK implements Serializable {
    @Column(name = "NUM_MISSION")
    private String numMission;
    
    @Column(name = "CODE")
    private String code;

	public MissionPK() {
		super();
		// TODO Auto-generated constructor stub
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

	public MissionPK(String numMission, String code) {
		super();
		this.numMission = numMission;
		this.code = code;
	}
    
}

