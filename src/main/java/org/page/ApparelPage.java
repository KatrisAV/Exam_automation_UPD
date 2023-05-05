package org.driver.page;

import lombok.AllArgsConstructor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@AllArgsConstructor
public class ApparelPage {
    @FindBy(id = "category")
    private WebElement body;

    public boolean isBodyDisplayed() {
        return body.isDisplayed();
        }

    }

