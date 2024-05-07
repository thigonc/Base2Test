package Tests;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;

import java.io.IOException;

public class Login {
    @Rule
    public TestName test = new TestName();

    private WebDriver navegador;
//    String Entrar = navegador.findElement(By.xpath("//input[@value='Entrar']")).click();

    public Login(WebDriver navegador){
        this.navegador = navegador;
    }


    public void loginsistema() throws IOException {
        //Fazer o login
        navegador.findElement(By.id("username")).sendKeys("Thiago_Viveiros");
        navegador.findElement(By.xpath("//input[@value='Entrar']")).click();
        navegador.findElement(By.id("password")).sendKeys("qwerty123");
        navegador.findElement(By.xpath("//input[@value='Entrar']")).click();
        String screenshotArquivo = "C:\\Users\\thigo\\IdeaProjects\\Pikachu\\massa1\\Base2\\Evidencias" + Generator.datahoraArquivo() + test.getMethodName() + ".png";
        Screenshot.tirar(navegador, screenshotArquivo);
    }
}
