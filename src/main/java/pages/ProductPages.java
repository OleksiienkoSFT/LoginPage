package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPages extends BasePage{

    public ProductPages(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement products;

    public void isLogin(){
        System.out.println(products.getTagName());
    }
}
