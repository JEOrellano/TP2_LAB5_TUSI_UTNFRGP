package packageTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.entidad.Email;

class EmailTest {
	private String testCorreo;
	
	@Test
	public void testValidarCorreo_almenosUnaMayuscula() {
		this.testCorreo = "correo1@email.com";
		assertEquals(true,Email.validarCorreo(testCorreo), "correo invalido almenos una mayuscula");
	}

}
