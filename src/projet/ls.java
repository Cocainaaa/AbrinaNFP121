package projet;

public class ls{
	public static ConfigurationLS configuration(String... args) {
		ConfigurationLS config = new ConfigurationLS();
	    boolean finOptions = false;
	    int i = 0;
	    while (i < args.length && ! finOptions) {
	        String arg = args[i];
	        switch (arg) {
	            case "-a": // Afficher les fichiers cach�s
	                config.showHidden = true;
	                break;
	            case "-l": // Afficher les informations d�taill�es des fichiers
	                config.showDetails = true;
	                break;
	            case "-R": // Parcourir les sous-r�pertoires
	                config.recursive = true;
	                break;
	            default:
	                finOptions = arg.length() == 0 || arg.charAt(0) != '-';
	                if (! finOptions) {
	                    System.out.println("Option inconnue : " + arg);
	                }
	        }
	        i++;
	    }
	    return config;
	}

}
