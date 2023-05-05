package stepDefinitions;

import io.cucumber.java.en.Given;
import lombok.AllArgsConstructor;
import steps.stepDefinitions.CommonStep;

@AllArgsConstructor
public class CommonDefanitions {
    private CommonStep commonStep;

    @Given("the site page is opened")
    public void theSitePageIsOpened() {
        commonStep.checkSitePageIsOpen();
    }
}
