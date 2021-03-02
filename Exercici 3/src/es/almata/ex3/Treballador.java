package es.almata.ex3;

/**

 * Esta classe defineix un treballador

 * @author: Guillem Dolcet Jove

 */

 

public class Treballador {

	private String DNI;
	private String nom;
	private String cognoms;
	private int edat;
	private String poblacio;
	private int sou;
	private Empresa empresa;
	

	public Treballador() {
		super();
	}
	
	
	public Treballador(String dNI, String nom, String cognoms) {
		super();
		DNI = dNI;
		this.nom = nom;
		this.cognoms = cognoms;
	}
	
	
	public Treballador(String dNI, String nom, String cognoms, int edat, String poblacio, int i) {
		super();
		DNI = dNI;
		this.nom = nom;
		this.cognoms = cognoms;
		this.edat = edat;
		this.poblacio = poblacio;
		this.sou = i;
	}


	public Treballador(String dNI, String nom, String cognoms, int edat, Empresa empresa) {
		super();
		DNI = dNI;
		this.nom = nom;
		this.cognoms = cognoms;
		this.edat = edat;
		this.empresa = empresa;
	}

	public Treballador(String dNI, String nom, String cognoms, int edat, String poblacio, int sou, Empresa empresa) {
		super();
		DNI = dNI;
		this.nom = nom;
		this.cognoms = cognoms;
		this.edat = edat;
		this.poblacio = poblacio;
		this.sou = sou;
		this.empresa = empresa;
	}


	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognoms() {
		return cognoms;
	}
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	public String getPoblacio() {
		return poblacio;
	}
	public void setPoblacio(String poblacio) {
		this.poblacio = poblacio;
	}
	public int getSou() {
		return sou;
	}
	public void setSou(int sou) {
		this.sou = sou;
	}
    /**

     * Métode que compara el sou mes gran de 2 treballadors

     */
	public boolean souMesGran(Treballador treballador) {
		if(this.getPoblacio().equals(treballador.getPoblacio())) {
			if(this.getSou() > treballador.getSou()) {
				return true;
			}else {
				return false;
			}
		}else {
			throw new RuntimeException("Els treballadors no són de la mateixa població");
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		result = prime * result + ((cognoms == null) ? 0 : cognoms.hashCode());
		result = prime * result + edat;
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((poblacio == null) ? 0 : poblacio.hashCode());
		result = prime * result + sou;
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
		Treballador other = (Treballador) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		if (cognoms == null) {
			if (other.cognoms != null)
				return false;
		} else if (!cognoms.equals(other.cognoms))
			return false;
		if (edat != other.edat)
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (poblacio == null) {
			if (other.poblacio != null)
				return false;
		} else if (!poblacio.equals(other.poblacio))
			return false;
		if (sou != other.sou)
			return false;
		return true;
	}
	
	
	
	
}
