package com.opitzconsulting.bwertr.spec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class BwertrDriver {

    private final WebDriver webDriver = new HtmlUnitDriver();

    public void visitBwertr() {
        webDriver.get("http://localhost:8080/");
    }

    public void rateWith(String rating) {
        visitBwertr();
        // * select rating
        Select select = new Select(webDriver.findElement(By.id("rating")));
        select.selectByValue(rating);
        // * submit form
        select.getFirstSelectedOption().submit();
    }

    public String numberOfRatingsShown() {
        return webDriver.findElement(By.id("numberOfRatings")).getText();
    }

    public String givenRatingShown() {
        return webDriver.findElement(By.id("givenRating")).getText();
    }

    public String averageRatingShown() {
        return webDriver.findElement(By.id("averageRating")).getText();
    }
}