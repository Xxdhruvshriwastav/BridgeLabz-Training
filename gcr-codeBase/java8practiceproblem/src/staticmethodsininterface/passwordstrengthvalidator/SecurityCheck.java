package staticmethodsininterface.passwordstrengthvalidator;

public interface SecurityCheck {

	public static boolean checkPasswordStrength(String password) {
		
		String pass = 
				"^(?=.*[A-Z])" + // for ope uppercase
			    "(?=.*[a-z])"  +// for one lower case
				"(?=.*\\d)+"   + // at least one digit
			    "(?=.*[@#$%^&*!=+])"+ // one special char
				".{8,}$"; // must be 8 length
		
		return password.matches(pass);
	}
}
