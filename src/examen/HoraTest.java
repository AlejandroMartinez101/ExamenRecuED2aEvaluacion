package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HoraTest {

	Hora mihora=new Hora();
	@Test
	void test() {
		assertFalse(mihora.validarHora(2, 23, 100));
		assertFalse(mihora.validarHora(4, 3, -1));
		assertFalse(mihora.validarHora(80, 20, 20));
		assertFalse(mihora.validarHora(23, 70, 22));
	}

}
