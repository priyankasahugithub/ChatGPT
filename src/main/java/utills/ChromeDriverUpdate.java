package utills;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ChromeDriverUpdate {

    public static void updateChromeDriver() {
        try {
            // Automatically matches installed Chrome version
            WebDriverManager.chromedriver().setup();
            System.out.println("ChromeDriver updated successfully!");
        } catch (Exception e) {
            System.err.println("Failed to update ChromeDriver: " + e.getMessage());
        }
    }
}


