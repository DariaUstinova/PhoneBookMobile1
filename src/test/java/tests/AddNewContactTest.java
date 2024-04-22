package tests;

import config.AppiumConfig;
import helpers.AddressGenerator;
import helpers.EmailGenerator;
import helpers.NameAndLastNameGenerator;
import helpers.PhoneNumberGenerator;
import models.Contact;
import org.testng.annotations.Test;
import screens.ContactListScreen;
import screens.SplashScreen;

public class AddNewContactTest extends AppiumConfig {

    @Test
    public void addNewContact(){
        new SplashScreen(driver).switchToAuthScreen()
                .fillEmailField("testtest@test.com")
                .fillPasswordField("Codirovka84!")
                .clickByLoginButton();
        Contact contact = new Contact(NameAndLastNameGenerator.generateName(),
                NameAndLastNameGenerator.generateLastName(),
                PhoneNumberGenerator.generatePhoneNumber(),
                EmailGenerator.generateEmail(4,4,3),
                AddressGenerator.generateAddress(), "Desc");

//        new ContactListScreen(driver).openNewContactForm()
//                .fillTheForm(contact)
//                .createContact()
//                .isContactAdded;

    }
}
