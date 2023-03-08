package metodos;

import drivers.DriversFactory;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Metodos extends DriversFactory {

    /**
     * @param elementos
     * @param passoTeste
     * @autor QA Adilson Theodoro
     * Metodos clicar em um elemento web Passando uma class  By
     * Try = tentar fazer algo catch = capturar algo conforme os sistem.out
     */
    public void clicar(By elementos, String passoTeste) {
        try {
            driver.findElement(elementos).click();
        } catch (Exception e) {
            System.err.println("****** Erro no passo " + passoTeste + "******");
            System.out.println("****** Causa do erro ****** " + e.getCause());
            System.out.println("****** Mensagem de erro " + e.getMessage());
        }
    }


    /**
     * Metodo preecher em um elemento web passando uma class By
     *
     * @param elementos
     * @param texto
     * @param passoTeste
     * @autor QA Adilson Theodoro
     */
    public void preecher(By elementos, String texto, String passoTeste) {
        try {
            driver.findElement(elementos).sendKeys(texto);
        } catch (Exception e) {
            System.err.println("****** Erro no passo " + passoTeste + "******");
            System.out.println("****** Causa do erro ****** " + e.getCause());
            System.out.println("****** Mensagem de erro " + e.getMessage());
        }


    }

    /**
     * Metodos validar Mensagem
     * @param elemento
     * @param MsgEsperada
     */
    public void Msgsuccessfully (By elemento, String MsgEsperada) {
        try {
            String msgCapturada = driver.findElement(elemento).getText();
            assertEquals(MsgEsperada, msgCapturada);
        } catch (Exception e) {
            System.out.println("Erro ao tentar validar a mensagem " + MsgEsperada);
        }

    }
}