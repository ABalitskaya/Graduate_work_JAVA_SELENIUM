package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import enums.Roles;
import enums.UserEmails;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class PageBase {
    private SelenideElement menuBlock = $x("//div[@id='home-header-logged-in-teachers']");
    private ElementsCollection socialLinks = $$x("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-5 links css-waew46']//a"); //общий локатор для 3х элементов (ссылок)

    String defaultPassword = "123456";
    public void selectRole(Roles role, WebElement selectElement) {
        selectOption(role.getValue(),selectElement);
    }

    public void selectOption(String optionName, WebElement selectElement) {
        Select select = new Select(selectElement);
        select.selectByVisibleText(optionName);
    }


}