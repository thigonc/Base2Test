package suporte;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createchrome();
    }

    public static WebDriver createchrome(){
        //Abrindo navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thigo\\IdeaProjects\\Pikachu\\massa1\\Base2\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //URL
        navegador.get("https://mantis-prova.base2.com.br/bug_report_page.php");

        return navegador;
    }
}

