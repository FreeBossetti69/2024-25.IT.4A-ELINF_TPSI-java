

public class PasswordBreaker {
	 final static int PASSWORD_LENGTH = 4; 

	    public static void main(String[] args) {
	        
	        PasswordProtectedFile file = new PasswordProtectedFile(PASSWORD_LENGTH);

	        PassCrack crack = new PassCrack(file, PASSWORD_LENGTH);

	        System.out.println("Un file password protected è stato creato.");
	        System.out.println("Stiamo cercando di violare la password...\n");

	        Cronometro crono = new Cronometro();
	        crono.start();

	        String pass = crack.crack_it();

	        crono.stop();
	        System.out.println("La password segreta è: " + pass);
	        System.out.println("Tempo impiegato per violare la password: " + crono.elapsed() + " millisecondi");
	    }
}
