package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.util.List;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class CourseListPage extends HomePage{
    public SelenideElement searchBox = $x("//input[@id=':r0:']");
    public ElementsCollection courseTitles = $$x("//div[@class='list-item-wrapper vertical MuiBox-root css-89nl51']//h3");


    public List<String>getTitles(){return courseTitles.texts();}

    public void searchCourseByName(String name){
        searchBox.shouldBe(Condition.visible);
        searchBox.sendKeys(name);
    }


}