package runner;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Executa extends DriversFactory {

    /**
     * Metodo abrir navegador chrome
     * @autor QA Adilson Theodoro
     *
     */
    public static void abrirNavegador() {
        String navegador = "Chrome";
        String url = "https://parabank.parasoft.com/parabank/register.htm";
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeoptions = new ChromeOptions();
        driver = new ChromeDriver(chromeoptions);
        driver.get(url);
        driver.manage().window().maximize();
        //driver.quit();
    }

}






