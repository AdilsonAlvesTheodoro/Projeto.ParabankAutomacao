package parasoft.parabank.teste;

;

import org.junit.Before;
import org.junit.Test;
import page.ResgistrarusuarioPage;
import runner.Executa;

public class RegistrarUsuarioTeste  {

;
    ResgistrarusuarioPage registrar = new ResgistrarusuarioPage();


    @Before
    public void iniciarTeste() {
        Executa.abrirNavegador();
    }

    @Test
    public void testeRegistrarusuario() throws InterruptedException {
        Thread.sleep(3000);
        registrar.acessarFormulario();
        registrar.enviarFormulario("teste#", "teste#", "teste#", "teste#", "teste#", "teste#", "teste#", "teste#", "QA Adilson7", "Teste#123", "Teste#123");

    }


    @Test
    public void testeRegistrarusuarioDadosEmbranco() {


        registrar.enviarFormulario("", "", "", "", "", "", "", "", "", "", "");

    }

    @Test
    public void testeRegistrarusuarioSenhaDiferente() throws InterruptedException {
        Thread.sleep(3000);
        registrar.enviarFormulario("teste#", "teste#", "teste#", "teste#", "teste#", "teste#", "teste#", "teste#", "QA Adilson7", "Teste#123", "teste");
    }

    @Test
    public void testeRegistrarusuarioJaCadastrado() {


        registrar.acessarFormulario();
        registrar.enviarFormulario("teste#", "teste#", "teste#", "teste#", "teste#", "teste#", "teste#", "teste#", "QA Adilson7", "Teste#123", "Teste123");


    }


}

