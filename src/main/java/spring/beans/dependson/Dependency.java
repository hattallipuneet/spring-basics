package spring.beans.dependson;

public class Dependency {

    private static String needsInitialization;

    static {
        System.out.println("Initialized the indirect dependency class");
        needsInitialization = "This was initialized";
    }

    public static String getInitializedValue() {
        return needsInitialization;
    }
}
