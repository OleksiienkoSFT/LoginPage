package navigationTest;

import baseTest.BaseTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import pages.LoginPage;
import pages.ProductPages;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class HomePageNavigationTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);
    ProductPages productPages = new ProductPages(driver);

    @Test
    public void setName(){
        loginPage.setUsernamePassword("standard_user", "secret_sauce");
        productPages.isLogin();
    }



}
