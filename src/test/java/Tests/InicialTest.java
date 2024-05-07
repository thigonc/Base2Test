package Tests;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import suporte.Web;

import java.io.IOException;

public class InicialTest {

    private WebDriver navegador;
    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp(){
    navegador = Web.createchrome();
    }
    @Test
    public void test() throws IOException {
        //Fazer o login
        new Login(navegador);

    }
//    @After
//    public void tearDown(){
//        navegador.quit();
//    }
}
