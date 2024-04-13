package frgp.utn.edu.ar.entidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	private String correo;

	public Email(String correo) {
		this.correo = correo;
	}

	public static boolean validarCorreo(String correo) {
		String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[a-zA-Z0-9]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(correo);
		return matcher.matches();
	}

	public static boolean validarCorreoAlMenosUnNumero_retornaTrue(String correo) {
		String regex = ".*\\d+.*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(correo);
		return matcher.find();
	}
	public static boolean validarMinuscula(String correo) {
		String regex = ".*[a-z].*@.*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(correo);
		return matcher.find();
	}
    public static boolean validarLongitud(String correo) {
        String regex = ".{8,}@.*"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
    
    public boolean validarUnCaracterAlfanumerico() {
        String regex = ".*[a-zA-Z0-9].*@.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
    
	@Override
	public String toString() {
		return "Email [correo=" + correo + "]";
	}
	
	public static boolean validarCorreoAlMenosDosNumeros_retornaTrue(String correo) {
		String regex = ".*\\d.*\\d.*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(correo);
		System.out.println(matcher.matches());
		return matcher.matches();
	}
	
	public static boolean validarCorreoEmpieceConNumero_retornaTrue(String correo) {
		String regex = "^\\d";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(correo);
		System.out.println(matcher.matches());
		return matcher.find();
	}
	
	
	
}
