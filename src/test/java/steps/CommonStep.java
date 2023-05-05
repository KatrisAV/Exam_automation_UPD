package steps.stepCommon;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.page.ApparelPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@AllArgsConstructor
@Slf4j
public class CommonStep {
    private ApparelPage apparelPage;
    public void checkSitePageIsOpen() {
        log.info("Check page is open");
        assertThat(apparelPage.isBodyDisplayed()).as("The page is not displayed").isTrue();
        }

}

