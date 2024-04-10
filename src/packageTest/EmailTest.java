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
		assertEquals(true,Email.validarCorreo(testCorreo), "correo invalido almenos una mayuscula");
	}
	@Test
	public void testValidarCorreo_AlMenosUnNumero() {
		
		this.testCorreo= "9correo@email.com";
		assertTrue(Email.validarCorreoAlMenosUnNumero_retornaTrue(testCorreo), "No incluye al menos un numero");
				
		
		}
	
	

}
 