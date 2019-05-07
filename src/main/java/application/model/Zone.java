package application.model;


import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author dell
 */
@Entity
@Table(name = "ZONE")
public class Zone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_ZONE")
    private String codZone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIB_ZONEA")
    private String libZonea;
    @Size(max = 60)
    @Column(name = "LIB_ZONEL")
    private String libZonel;
   
    @OneToMany(mappedBy = "codZone")
    @JsonIgnore
    private Collection<Pays> paysCollection;

    public Zone() {
    }

    public Zone(String codZone) {
        this.codZone = codZone;
    }

    public Zone(String codZone, String libZonea) {
        this.codZone = codZone;
        this.libZonea = libZonea;
    }

    public String getCodZone() {
        return codZone;
    }

    public void setCodZone(String codZone) {
        this.codZone = codZone;
    }

    public String getLibZonea() {
        return libZonea;
    }

    public void setLibZonea(String libZonea) {
        this.libZonea = libZonea;
    }

    public String getLibZonel() {
        return libZonel;
    }

    public void setLibZonel(String libZonel) {
        this.libZonel = libZonel;
    }

   /* @XmlTransient
    public Collection<Pays> getPaysCollection() {
        return paysCollection;
    }

    public void setPaysCollection(Collection<Pays> paysCollection) {
        this.paysCollection = paysCollection;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codZone != null ? codZone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zone)) {
            return false;
        }
        Zone other = (Zone) object;
        if ((this.codZone == null && other.codZone != null) || (this.codZone != null && !this.codZone.equals(other.codZone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Zone[ codZone=" + codZone + " ]";
    }
    @JsonIgnore
	public Collection<Pays> getPaysCollection() {
		return paysCollection;
	}

	public void setPaysCollection(Collection<Pays> paysCollection) {
		this.paysCollection = paysCollection;
	}
    
}
