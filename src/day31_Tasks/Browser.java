package day31_Tasks;

public class Browser {

    private String browserName;

    public Browser(String browserName) {
        setBrowserName(browserName);
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public void openBrowser(){
        System.out.println("opening chrome browser");
    }

    public void closeBrowser(){
        System.out.println("closing chrome browser");
    }


}
