package projet;

import com.sun.jdi.Field;

public class formClass{

public static CLI fromClass(Class<?> configClass) {
    CLI cli = new CLI();
    java.lang.reflect.Field[] fields = configClass.getDeclaredFields();
    for (java.lang.reflect.Field field : fields) {
        String fieldName = field.getName();
        Class<?> fieldType = field.getType();
        String optionAccess = fieldName.substring(0, 1).toLowerCase();
        String optionDescription;
        if (fieldType.equals(boolean.class)) {
            String optionAccessUpperCase = optionAccess.toUpperCase();
            optionDescription = "Positionner " + fieldName + " à vrai (ou faux)";
            cli.addOption(new BooleanOption(optionAccess, optionDescription, configClass, fieldName));
            cli.addOption(new BooleanOption(optionAccessUpperCase, optionDescription, configClass, fieldName));
        } else {
            optionDescription = "Valeur de " + fieldName;
            cli.addOption(new ValueOption(optionAccess, optionDescription, configClass, fieldName));
        }
    }
    return cli;
}
}
