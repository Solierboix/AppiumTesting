package core;

import api.android.Android;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class UiObject {
    private String locator;

    UiObject(String locator){
        this.locator = locator;
    }

    private boolean isXpath(){
        return !locator.contains("UiSelector");
    }

    public boolean exists(){
        try {
            WebElement element;
            if(isXpath()){
                element = Android.androidDriver.findElementByXPath(locator);
            } else {
                element = Android.androidDriver.findElementByAndroidUIAutomator(locator);
            }
            return element.isDisplayed();
        } catch (NoSuchElementException e){
            return false;
        }
    }

    public boolean isChecked(){
        WebElement element;
        if(isXpath()){
            element = Android.androidDriver.findElementByXPath(locator);
        } else {
            element = Android.androidDriver.findElementByAndroidUIAutomator(locator);
        }
        return element.getAttribute("checked").equals("true");
    }

    public boolean isCheckable(){
        WebElement element;
        if(isXpath()){
            element = Android.androidDriver.findElementByXPath(locator);
        } else {
            element = Android.androidDriver.findElementByAndroidUIAutomator(locator);
        }
        return element.getAttribute("checkable").equals("true");
    }

    public boolean isEnabled(){
        WebElement element;
        if(isXpath()){
            element = Android.androidDriver.findElementByXPath(locator);
        } else {
            element = Android.androidDriver.findElementByAndroidUIAutomator(locator);
        }
        return element.getAttribute("enabled").equals("true");
    }

    public boolean isFocusable(){
        WebElement element;
        if(isXpath()){
            element = Android.androidDriver.findElementByXPath(locator);
        } else {
            element = Android.androidDriver.findElementByAndroidUIAutomator(locator);
        }
        return element.getAttribute("focusable").equals("true");
    }

    public boolean isScrollable(){
        WebElement element;
        if(isXpath()){
            element = Android.androidDriver.findElementByXPath(locator);
        } else {
            element = Android.androidDriver.findElementByAndroidUIAutomator(locator);
        }
        return element.getAttribute("scrollable").equals("true");
    }

    public boolean isLongClickable(){
        WebElement element;
        if(isXpath()){
            element = Android.androidDriver.findElementByXPath(locator);
        } else {
            element = Android.androidDriver.findElementByAndroidUIAutomator(locator);
        }
        return element.getAttribute("longClickable").equals("true");
    }

    public boolean isSelected(){
        WebElement element;
        if(isXpath()){
            element = Android.androidDriver.findElementByXPath(locator);
        } else {
            element = Android.androidDriver.findElementByAndroidUIAutomator(locator);
        }
        return element.getAttribute("selected").equals("true");
    }

}
