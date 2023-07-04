package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.google.common.base.Enums;
import enums.Roles;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class MyProfilePage extends HomePage{
    public SelenideElement tellMeAboutYourselfTitle = $x("//h2[normalize-space()='Please tell us more about yourself']");
    public SelenideElement roleDropdown = $x("//div[@class='filter-option-inner-inner']");
    public SelenideElement teacherRole = $x("//span[normalize-space()='teacher']");
    public SelenideElement studentRole = $x("//span[normalize-space()='student']");
    public SelenideElement fullNameInput = $x("//input[@id='sw-form-capture-full_name-input']");
    public SelenideElement emailInput = $x("//input[@id='sw-form-capture-full_name-input']");
    public SelenideElement aboutMeInput = $x("//textarea[@id='sw-form-capture-About']");
    public SelenideElement avatarImageInput = $x("//input[@type='file']");
    public SelenideElement externalProfileLinkInput = $x("//input[@id='sw-form-capture-External Profile URL']");
    public SelenideElement majorInput = $x("//input[@id='sw-form-capture-Major']");
    public SelenideElement updateProfileButton = $x("//a[@id='sw-update-profile-btn']");
    public SelenideElement changePasswordTitle = $x("//h2[normalize-space()='Change password']");
    public SelenideElement oldPasswordInput = $x("//input[@id='sw-form-password-input']");
    public SelenideElement newPasswordInput = $x("//input[@id='sw-new-password-input']");
    public SelenideElement changePasswordButton = $x("//a[@id='sw-change-password-btn']");


    public void updateUserProfile(String userName, String userEmail, String description, String externalProfileLink, String majorIn, Roles role ){
        tellMeAboutYourselfTitle.shouldBe(Condition.visible);
        selectRole(role,roleDropdown);
        fullNameInput.sendKeys(userName);
        emailInput.sendKeys(userEmail);
        aboutMeInput.sendKeys(description);
       // avatarImageInput.sendKeys("images/teacher.jpg"); this functional does not work. Was created bug report Defect ID: [12]
        externalProfileLinkInput.sendKeys(externalProfileLink);
        majorInput.sendKeys(majorIn);
        updateProfileButton.click();
    }

    public void changePassword(String oldPassword, String newPassword){
        changePasswordTitle.shouldBe(Condition.visible);
        oldPasswordInput.sendKeys(oldPassword);
        newPasswordInput.sendKeys(newPassword);
        changePasswordButton.click();
    }




}