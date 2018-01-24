package core;

public class UiSelector {

    private String locator = "new UiSelector()";

    public UiSelector resourceId (String value) {
        locator += ".resourceId(\""+value+"\")";
        return this;
    }
}
