package application.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author dell
 */
@Entity
@Table(name = "MOTCLE")
public class Motcle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CODE_MOTCLE")
    private String codeMotcle;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "AMOTCLE")
    private String amotcle;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "LMOTCLE")
    private String lmotcle;
    
    @Column(name = "IND")
    private Short ind;
    
    
    
    
	@OneToMany(mappedBy="Motcle", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JsonIgnore
	private Collection<Mission> missions;
    
    
    
    
    
    
    

    public Motcle() {
    }

    public Motcle(String codeMotcle) {
        this.codeMotcle = codeMotcle;
    }

    public Motcle(String codeMotcle, String amotcle, String lmotcle) {
        this.codeMotcle = codeMotcle;
        this.amotcle = amotcle;
        this.lmotcle = lmotcle;
    }

    public String getCodeMotcle() {
        return codeMotcle;
    }

    public void setCodeMotcle(String codeMotcle) {
        this.codeMotcle = codeMotcle;
    }

    public String getAmotcle() {
        return amotcle;
    }

    public void setAmotcle(String amotcle) {
        this.amotcle = amotcle;
    }

    public String getLmotcle() {
        return lmotcle;
    }

    public void setLmotcle(String lmotcle) {
        this.lmotcle = lmotcle;
    }

    public Short getInd() {
        return ind;
    }

    public void setInd(Short ind) {
        this.ind = ind;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeMotcle != null ? codeMotcle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motcle)) {
            return false;
        }
        Motcle other = (Motcle) object;
        if ((this.codeMotcle == null && other.codeMotcle != null) || (this.codeMotcle != null && !this.codeMotcle.equals(other.codeMotcle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Motcle[ codeMotcle=" + codeMotcle + " ]";
    }

	public Collection<Mission> getMissions() {
		return missions;
	}

	public void setMissions(Collection<Mission> missions) {
		this.missions = missions;
	}
    
}
