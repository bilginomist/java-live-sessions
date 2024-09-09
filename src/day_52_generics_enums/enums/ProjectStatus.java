package day_52_generics_enums.enums;

public enum ProjectStatus {

    NEW("New"),
    CANCELED("Canceled"),
    ON_HOLD("On Hold Project");

    private final String  value;
    ProjectStatus(String value) {

        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
