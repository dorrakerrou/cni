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
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author dell
 */
@Entity
@Table(name = "TYP_FRAIS")
@XmlRootElement
public class TypFrais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
  
    @Size(min = 1, max = 2)
    @Column(name = "TYP_FRAIS")
    private String typFrais;
   
    @Size(min = 1, max = 30)
    @Column(name = "LIB_FRAIS")
    private String libFrais;
    @Size(max = 30)
    @Column(name = "LIB_FRAISL")
    private String libFraisl;
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typFrais1")
    @JsonIgnore
    private Collection<AvoirFrais> avoirFraisCollection;

    public TypFrais() {
    }

    public TypFrais(String typFrais) {
        this.typFrais = typFrais;
    }

    public TypFrais(String typFrais, String libFrais) {
        this.typFrais = typFrais;
        this.libFrais = libFrais;
    }

    public String getTypFrais() {
        return typFrais;
    }

    public void setTypFrais(String typFrais) {
        this.typFrais = typFrais;
    }

    public String getLibFrais() {
        return libFrais;
    }

    public void setLibFrais(String libFrais) {
        this.libFrais = libFrais;
    }

    public String getLibFraisl() {
        return libFraisl;
    }

    public void setLibFraisl(String libFraisl) {
        this.libFraisl = libFraisl;
    }

  /*  @XmlTransient
    public Collection<AvoirFrais> getAvoirFraisCollection() {
        return avoirFraisCollection;
    }

    public void setAvoirFraisCollection(Collection<AvoirFrais> avoirFraisCollection) {
        this.avoirFraisCollection = avoirFraisCollection;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typFrais != null ? typFrais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypFrais)) {
            return false;
        }
        TypFrais other = (TypFrais) object;
        if ((this.typFrais == null && other.typFrais != null) || (this.typFrais != null && !this.typFrais.equals(other.typFrais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TypFrais[ typFrais=" + typFrais + " ]";
    }
    @JsonIgnore
	public Collection<AvoirFrais> getAvoirFraisCollection() {
		return avoirFraisCollection;
	}

	public void setAvoirFraisCollection(Collection<AvoirFrais> avoirFraisCollection) {
		this.avoirFraisCollection = avoirFraisCollection;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
