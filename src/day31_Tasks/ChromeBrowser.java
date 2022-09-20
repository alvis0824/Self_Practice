package day31_Tasks;

public class ChromeBrowser extends Browser{


    public ChromeBrowser(String browserName) {
        super(browserName);
    }

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }
}
