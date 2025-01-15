
import java.util.Random;
public class PasswordGenerator {
	  private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	  
	    public String generate(int password_length) {
	        Random r = new Random();
	        String password = ""; 

	        for (int i = 0; i < password_length; i++) {
	            int indice = r.nextInt(ALPHABET.length());
	            password += ALPHABET.charAt(indice);
	        }

	        return password;
	    }

}
