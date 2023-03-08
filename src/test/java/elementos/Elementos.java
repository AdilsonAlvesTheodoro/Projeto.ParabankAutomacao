package elementos;

import org.openqa.selenium.By;

public class Elementos {
    //Elementos do Registro
    public By firstName = By.id("customer.firstName");
    public By lastName = By.id("customer.lastName");
    public By Address = By.id("customer.address.street");
    public By City = By.id("customer.address.city");
    public By State = By.id("customer.address.state");
    public By zipCode = By.id("customer.address.zipCode");
    public By Phone = By.id("customer.phoneNumber");
    public By ssN = By.id("customer.ssn");
    public By userName = By.id("customer.username");
    public By passWord = By.id("customer.password");
    public By ConfirmPassword = By.id("repeatedPassword");
    public By btnRegister = By.xpath("//input[@value='Register']");
    public By menuRegister = By.xpath("//a[text()='Register']");


}
