package projet;

public class Option {
    private final String access;
    private final String description;
    private final boolean needsValue;
    private String value;

    public Option(String access, String description, boolean needsValue) {
        this.access = access;
        this.description = description;
        this.needsValue = needsValue;
    }

    public String getAccess() {
        return access;
    }

    public String getDescription() {
        return description;
    }

    public boolean needsValue() {
        return needsValue;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}