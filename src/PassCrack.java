

public class PassCrack {
	  private PasswordGenerator passwordGenerator;
	    private PasswordProtectedFile fileToCrack;
	    private int password_length;

	    public PassCrack(PasswordProtectedFile file, int password_length) {
	        this.password_length = password_length;
	        this.passwordGenerator = new PasswordGenerator();
	        this.fileToCrack = file;
	    }

	    public String crack_it() {
	        String generatedPassword;
	        do {
	            generatedPassword = passwordGenerator.generate(password_length);
	        } while (!fileToCrack.open(generatedPassword));

	        return generatedPassword;
	    }

}
