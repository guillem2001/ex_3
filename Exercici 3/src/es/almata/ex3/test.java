package es.almata.ex3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class test {

	Treballador Treballador1 = null;
	Treballador Treballador2 = null;
	Treballador Treballador3 = null;
	Treballador Treballador4 = null;
	Treballador Treballador5 = null;
	Treballador Treballador6 = null;
	Empresa compsa = null;
	Empresa indra = null;
	Empresa mercadona = null;
	
	@BeforeEach
	public void setUp() {
		//compartir TestFitxure endtre distintes proves unitàries
		Treballador1 = new Treballador("3333333T","Albert","Gimenez",23,"Lleida",1000);
		Treballador2 = new Treballador("2222222E","Guillem","Campo",61,"Alcarras",2200);
		Treballador3 = new Treballador("8888888Ñ","Eduard","Dolcet",62,"Lleida",4100);
		Treballador4 = new Treballador("1111111D","Marta","Garcia",55,"Alcarras",1300);
		Treballador5 = new Treballador("2323232P","Eloi","Domenech",65,"Lleida",3400);
		Treballador6 = new Treballador("5555555H","Lucas","Larriba",59,"Lleida",1500);
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
	
	@Test
	void souMesPetit() {
		//arrange preparar
		//act executar
		boolean esMesGran = Treballador1.souMesGran(Treballador3);
		//assert
		assertFalse(esMesGran);
	}
	
	@Test
	void souComparable() {
		//arrange preparar
		//act executar
		//assert
		assertThrows(RuntimeException.class, new Executable() {

			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				Treballador3.souMesGran(Treballador2);
			}
			
		});
	}
	
	@Test
	void existeixTreballador() {
		//arrange preparar
		//act executar
		//assert
		boolean x = indra.existeixTreballador(Treballador2);
		assertTrue(x);
	}
	
	@Test
	void noExisteixTreballador() {
		//arrange preparar
		//act executar
		//assert
		boolean x = indra.existeixTreballador(Treballador3);
		assertFalse(x);
	}
	
	
	@Test
	void souMesGran2000() {
		//arrange preparar
		//act executar
		List<Treballador> treballadors= indra.treballadorsSouSuperior2000();
		//assert
		assertEquals(2, treballadors.size());
	}
	
	@Test
	void edatEntre60i65() {
		//arrange preparar
		//act executar
		List<Treballador> treballadors= indra.treballadorsEntre60i65();
		//assert
		assertEquals(2, treballadors.size());
	}

}
