package es.almata.ex3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test {
	
	Treballador1 = null;
	Treballador2 = null;
	Treballador3 = null;
	Treballador4 = null;
	Treballador5 = null;
	Treballador6 = null;
	compsa = null;
	indra = null;
	mercadona = null;
	
	@BeforeEach
	public void setUp() {
		//compartir TestFitxure endtre distintes proves unitàries
		Treballador1 = new Treballador("3333333T","Albert","Gimenez",23,"Lleida",1000);
		Treballador2 = new Treballador("2222222E","Guillem","Campo",75,"Alcarras",1200);
		Treballador3 = new Treballador("8888888Ñ","Eduard","Dolcet",62,"Lleida",1100);
		Treballador4 = new Treballador("1111111D","Marta","Garcia",55,"Alcarras",1300);
		Treballador5 = new Treballador("2323232P","Eloi","Domenech",33,"Lleida",1400);
		Treballador6 = new Treballador("5555555H","Lucas","Larriba",80,"Lleida",1500);
		List<Treballador> treballadorsIndra = new ArrayList<Treballador>();
		treballadorsIndra.add(Treballador2);
		treballadorsIndra.add(Treballador5);
		treballadorsIndra.add(Treballador6);
		List<Treballador> treballadorsMerca = new ArrayList<Treballador>();
		treballadorsMerca.add(Treballador3);
		List<Treballador> treballadorsCompsa = new ArrayList<Treballador>();
		treballadorsCompsa.add(Treballador1);
		treballadorsCompsa.add(Treballador4);
		mercadona = new Empresa("34343434L","mercadona","Lleida",treballadorsMerca);
		indra = new Empresa("23232323D","indra","Ager",treballadorsIndra);
		compsa = new Empresa("1111111U","compsa","Balaguer",treballadorsCompsa);
	}
	

	@Test
	void souMesGran() {
		//arrange preparar
		//act executar
		boolean esMesGran = Treballador3.souMesGran(Treballador1);
		//assert
		assertTrue(esMesGran);
	}

}
