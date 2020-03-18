package NopCommHooverAct1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class HomePage extends Utils {

    //verify user is on home page

    public void userIsOnHomePage(){

        assertURL("\"https://demo.nopcommerce.com/\" ");
    }

    public void userClickOnLinkFromTopMenu(String category){

        driver.findElement(By.linkText(category)).click();
    }

    public void hooverOverCategoryLink(String category){

        WebElement link_category = driver.findElement(By.linkText(category));
        Actions builder = new Actions(driver);
        Action mouseOverCategory = builder.moveToElement(link_category).build();
        mouseOverCategory.perform();
    }

    public void clickOnSubCategoryLink(String subcategory){

        clickOnElement(By.linkText(subcategory));
    }

    public void userShouldBeAbleToNavigateToSubCategoryPageSuccessfully(String subcategory){

        assertURL(subcategory);


    }


}


