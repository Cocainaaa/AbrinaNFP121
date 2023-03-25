package projet;

public class ConfigurationLS {
	public boolean showHidden;
	public boolean showDetails;
	public boolean recursive;

	public ConfigurationLS() {
		showHidden = false;
		showDetails = false;
		recursive = false;
	}

	public String toString() {
		return "Configuration : showHidden=" + showHidden + ", showDetails=" + showDetails + ", recursive=" + recursive;
	}
}