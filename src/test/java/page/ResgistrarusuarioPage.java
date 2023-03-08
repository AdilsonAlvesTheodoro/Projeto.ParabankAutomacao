package page;

import elementos.Elementos;
import metodos.Metodos;
import org.openqa.selenium.By;

public class ResgistrarusuarioPage {
    Metodos metodos = new Metodos();
    Elementos elementos = new Elementos();


    public void acessarFormulario() {

        metodos.clicar(elementos.menuRegister, "abrindo o formulario pelo menu register da home");
    }

    public void enviarFormulario(String firstname, String lastname, String address, String city, String state, String zipcode, String phone, String ssn, String username, String password, String confirmpassword) {
        metodos.preecher(elementos.firstName, firstname, "preencher o campo FirstName");
        metodos.preecher(elementos.lastName, lastname, "preencher o campo LastName");
        metodos.preecher(elementos.Address, address, "preencher o campo Address");
        metodos.preecher(elementos.City, city, "preencher o campo City");
        metodos.preecher(elementos.State, state, "preencher o campo State,");
        metodos.preecher(elementos.zipCode, zipcode, "preencher o campo ZipCode");
        metodos.preecher(elementos.Phone, phone, "preencher o campo Phone");
        metodos.preecher(elementos.ssN, ssn, "preencher o campo SSN");
        metodos.preecher(elementos.userName, username, "preencher o campo Username");
        metodos.preecher(elementos.passWord, password, "preencher o campo Password");
        metodos.preecher(elementos.ConfirmPassword, confirmpassword, "preencher o campo CnfirmPassword");
        metodos.clicar(elementos.btnRegister, "clicando no botao register para enviar o formulario");

    }


}






