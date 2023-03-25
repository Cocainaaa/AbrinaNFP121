package projet;

public class PageRank {

    public static void main(String... args) {
        CLI cli = new CLI();
        cli.addOption(new Option("-K", "Valeur de l'indice à calculer", true));
        cli.addOption(new Option("-E", "Valeur de la précision à atteindre", true));
        cli.addOption(new Option("-A", "Valeur de alpha", true));
        cli.addOption(new Option("-C", "Mode matrice creuse", false));
        cli.addOption(new Option("-P", "Mode matrice pleine", false));

        cli.parse(args);

        Configuration config = new Configuration();

        for (Option option : cli.getOptions()) {
            if (option.getAccess().equals("-K") && option.getValue() != null) {
                config.indice = Integer.parseInt(option.getValue());
            } else if (option.getAccess().equals("-E") && option.getValue() != null) {
                config.epsilon = Double.parseDouble(option.getValue());
            } else if (option.getAccess().equals("-A") && option.getValue() != null) {
                config.alpha = Double.parseDouble(option.getValue());
            } else if (option.getAccess().equals("-C")) {
                config.mode = Mode.CREUSE;
            } else if (option.getAccess().equals("-P")) {
                config.mode = Mode.PLEINE;
            }
        }

        System.out.println(config);
        // Le reste du programme... Omis.
    }
}
