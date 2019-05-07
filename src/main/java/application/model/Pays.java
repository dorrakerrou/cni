package application.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PAYS")
public class Pays implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_PAYS")
    private String codPays;
    @Column(name = "LIB_PAYSA")
    private String libPaysa;
    @Column(name = "LIB_PAYSL")
    private String libPaysl;
    @Column(name = "LANGUE")
    private String langue;
    @Column(name = "PREP")
    private String prep;
    @Column(name = "POUR")
    private String pour;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pays")
    @JsonIgnore
    private Collection<AvoirFrais> avoirFraisCollection;
   
   
    
    @JoinColumn(name = "COD_ZONE", referencedColumnName = "COD_ZONE")
    @ManyToOne
    private Zone codZone;

    
    public Pays() {
    }

    public Pays(String codPays) {
        this.codPays = codPays;
    }

    public Pays(String codPays, String libPaysa, String langue, String prep, String pour) {
        this.codPays = codPays;
        this.libPaysa = libPaysa;
        this.langue = langue;
        this.prep = prep;
        this.pour = pour;
    }

    public String getCodPays() {
        return codPays;
    }

    public void setCodPays(String codPays) {
        this.codPays = codPays;
    }

    public String getLibPaysa() {
        return libPaysa;
    }

    public void setLibPaysa(String libPaysa) {
        this.libPaysa = libPaysa;
    }

    public String getLibPaysl() {
        return libPaysl;
    }

    public void setLibPaysl(String libPaysl) {
        this.libPaysl = libPaysl;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getPrep() {
        return prep;
    }

    public void setPrep(String prep) {
        this.prep = prep;
    }

    public String getPour() {
        return pour;
    }

    public void setPour(String pour) {
        this.pour = pour;
    }

   /* @XmlTransient
    public Collection<AvoirFrais> getAvoirFraisCollection() {
        return avoirFraisCollection;
    }

    public void setAvoirFraisCollection(Collection<AvoirFrais> avoirFraisCollection) {
        this.avoirFraisCollection = avoirFraisCollection;
    }

    public Zone getCodZone() {
        return codZone;
    }

    public void setCodZone(Zone codZone) {
        this.codZone = codZone;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPays != null ? codPays.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pays)) {
            return false;
        }
        Pays other = (Pays) object;
        if ((this.codPays == null && other.codPays != null) || (this.codPays != null && !this.codPays.equals(other.codPays))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pays[ codPays=" + codPays + " ]";
    }
    @JsonIgnore
	public Collection<AvoirFrais> getAvoirFraisCollection() {
		return avoirFraisCollection;
	}

	public void setAvoirFraisCollection(Collection<AvoirFrais> avoirFraisCollection) {
		this.avoirFraisCollection = avoirFraisCollection;
	}

	public Zone getCodZone() {
		return codZone;
	}

	public void setCodZone(Zone codZone) {
		this.codZone = codZone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Pays(String codPays, String libPaysa, String libPaysl, String langue, String prep, String pour,
			Collection<AvoirFrais> avoirFraisCollection, Zone codZone) {
		super();
		this.codPays = codPays;
		this.libPaysa = libPaysa;
		this.libPaysl = libPaysl;
		this.langue = langue;
		this.prep = prep;
		this.pour = pour;
		this.avoirFraisCollection = avoirFraisCollection;
		this.codZone = codZone;
	}
    
	
}
