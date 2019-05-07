package application.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable
public class ProjetPK implements Serializable {
	
	    @Column(name = "COD_PRJ")
	    private String codPrj;
	  
	    @Column(name = "CODE")
	    private String code;

	    public ProjetPK() {
	    }

		public ProjetPK(String codPrj, String code) {
			super();
			this.codPrj = codPrj;
			this.code = code;
		}

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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((codPrj == null) ? 0 : codPrj.hashCode());
			result = prime * result + ((code == null) ? 0 : code.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ProjetPK other = (ProjetPK) obj;
			if (codPrj == null) {
				if (other.codPrj != null)
					return false;
			} else if (!codPrj.equals(other.codPrj))
				return false;
			if (code == null) {
				if (other.code != null)
					return false;
			} else if (!code.equals(other.code))
				return false;
			return true;
		}

	    
}
