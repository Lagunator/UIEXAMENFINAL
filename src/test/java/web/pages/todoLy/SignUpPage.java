package web.pages.todoLy;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;

public class SignUpPage {
    public TextBox nameTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox psswdTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Button acceptButton = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signUp = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
}
