package web.webTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class VerificationTest extends TestBase{
    private static Random rand = new Random();
    String fullName = "ExamenFinalQA"+rand.nextInt(10000);
    String email = "laguna"+rand.nextInt(10000)+"@laguna.com";
    String psw = "laguna12345";
    @Test
    public void verifyCreateUser() throws InterruptedException {
        mainPage.signUp.click();
        signUpPage.nameTextBox.setText(fullName);
        signUpPage.emailTextBox.setText(email);
        signUpPage.psswdTextBox.setText(psw);
        signUpPage.acceptButton.click();
        signUpPage.signUp.click();
        Assertions.assertTrue(centralSection.openSettingsButton.isControlDisplayed(), "ERROR! No pudimos crear tu usuario");
        //new acc arr

        menuSection.logout.click();
        Assertions.assertTrue(mainPage.loginButton.isControlDisplayed(), "ERROR: fallo logout");
        //lout


        mainPage.signUp.click();
        signUpPage.nameTextBox.setText(fullName);
        signUpPage.emailTextBox.setText(email);
        signUpPage.psswdTextBox.setText(psw);
        signUpPage.acceptButton.click();
        signUpPage.signUp.click();
        Assertions.assertEquals("Account with this email address already exists!", mainPage.errorMessage.getTextValue(), "ERROR: el emnsaje no esta!");
        Thread.sleep(2000);
        //same account credent
    }

}
