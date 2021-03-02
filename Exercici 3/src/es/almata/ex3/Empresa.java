package es.almata.ex3;

import java.util.ArrayList;
import java.util.List;

/**

 * Esta classe defineix una empresa

 * @author: Guillem Dolcet Jove

 */

public class Empresa {
	
	private String CIF;
	private String nom;
	private String domicili;
	private List<Treballador> treballadors = new ArrayList<Treballador>();
	
	public Empresa() {
		super();
	}
	
	public Empresa(String cIF, String nom, String domicili, List<Treballador> treballadors) {
		super();
		CIF = cIF;
		this.nom = nom;
		this.domicili = domicili;
		this.treballadors = treballadors;
	}


	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDomicili() {
		return domicili;
	}
	public void setDomicili(String domicili) {
		this.domicili = domicili;
	}
	public List<Treballador> getTreballadors() {
		return treballadors;
	}
	public void setTreballadors(List<Treballador> treballadors) {
		this.treballadors = treballadors;
	}
	
	public void addTreballador(Treballador treballador) {
		this.treballadors.add(treballador);
	}
	
	public void removeTreballador (Treballador treballador) {
		this.treballadors.remove(treballador);
	}
	
    /**

     * Métode que retorna els treballadors entre 60 i 65 anys d'una empresa

     */
	
	public List<Treballador> treballadorsEntre60i65() {
		int i;
		List<Treballador> treballadors = this.getTreballadors();
		List<Treballador> treballadors2 = new ArrayList<Treballador>();
		for(i=0; treballadors.size() > i; i++) {
			if(treballadors.get(i).getEdat() <= 65 && treballadors.get(i).getEdat() >= 60) {
				treballadors2.add(treballadors.get(i));
			}
		}
		return treballadors2;
	}
	
    /**

     * Métode que retorna els treballadors que cobren mes de 2000 euros

     */
	
	public List<Treballador> treballadorsSouSuperior2000() {
		int i;
		List<Treballador> treballadors = this.getTreballadors();
		List<Treballador> treballadors2 = new ArrayList<Treballador>();
		for(i=0; treballadors.size() > i; i++) {
			if(treballadors.get(i).getSou() > 2000) {
				treballadors2.add(treballadors.get(i));
			}
		}
		return treballadors2;
	}
	
    /**

     * Métode que diu si existeix un treballador dins d'una empresa

     */
	
	public boolean existeixTreballador(Treballador treballador) {
		int i;
		List<Treballador> treballadors = this.getTreballadors();
		for(i=0; treballadors.size() > i; i++) {
			if(treballadors.get(i).equals(treballador)) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CIF == null) ? 0 : CIF.hashCode());
		result = prime * result + ((domicili == null) ? 0 : domicili.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((treballadors == null) ? 0 : treballadors.hashCode());
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
		Empresa other = (Empresa) obj;
		if (CIF == null) {
			if (other.CIF != null)
				return false;
		} else if (!CIF.equals(other.CIF))
			return false;
		if (domicili == null) {
			if (other.domicili != null)
				return false;
		} else if (!domicili.equals(other.domicili))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (treballadors == null) {
			if (other.treballadors != null)
				return false;
		} else if (!treballadors.equals(other.treballadors))
			return false;
		return true;
	}
	
	
	
}
