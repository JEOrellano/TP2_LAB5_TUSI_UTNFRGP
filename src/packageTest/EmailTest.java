package packageTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.entidad.Email;

class EmailTest {
	private String testCorreo;

	@Test
	public void testValidarCorreo_almenosUnaMayuscula() {
		this.testCorreo = "Correo1@email.com";
		assertEquals(true, Email.validarCorreo(testCorreo), "correo invalido almenos una mayuscula");
	}

	@Test
	public void testValidarCorreo_AlMenosUnNumero() {

		this.testCorreo = "9correo@email.com";
		assertTrue(Email.validarCorreoAlMenosUnNumero_retornaTrue(testCorreo), "No incluye al menos un numero");

	}
	
	@Test
	public void testValidarCorreo_Logitud() {
		this.testCorreo = "12345678@email.com";
		assertTrue(Email.validarLongitud(testCorreo), "No tiene el minimo de 8 caracteres antes del arroba");

	}
	
	@Test
	public void testValidarCorreo_almenosUnaMinuscula() {
		this.testCorreo = "Correo1@email.com";
		assertEquals(true, Email.validarMinuscula(testCorreo), "correo invalido al menos una minuscula");
	}
	@Test 
	public void validarCorreoAlMenosDosNumeros () {
		
		this.testCorreo ="corr33eo@gmail.com";
	
		assertTrue(Email.validarCorreoAlMenosDosNumeros_retornaTrue(testCorreo), "La direccion no incluye al menos dos Numeros");
		
		
	}
	
	@Test
    public void testValidarCorreo_AlMenosUnCaracterAlfanumerico() {
        Email email = new Email("correo33@email.com");
        assertTrue(email.validarUnCaracterAlfanumerico(), "El correo no contiene al menos un carácter alfanumérico");
    }

	@Test 
	public void validarCorreoEmpieceConUnNumero () {
	
	this.testCorreo ="9correo@gmail.com";
	
	assertTrue(Email.validarCorreoEmpieceConNumero_retornaTrue(testCorreo), "La direccion no inicia con numero");
	
	
	}
	
	@Test
	public void todasLasCondiciones () {
		
		this.testCorreo ="9Corre9o@gmail.com";
		assertEquals(true, Email.validarCorreo(testCorreo), "correo invalido almenos una mayuscula");
		assertTrue(Email.validarCorreoAlMenosUnNumero_retornaTrue(testCorreo), "No incluye al menos un numero");
		assertTrue(Email.validarLongitud(testCorreo), "No tiene el minimo de 8 caracteres antes del arroba");
		assertEquals(true, Email.validarMinuscula(testCorreo), "correo invalido al menos una minuscula");
		assertTrue(Email.validarCorreoEmpieceConNumero_retornaTrue(testCorreo), "La direccion no inicia con numero");
	}
	
	

}
