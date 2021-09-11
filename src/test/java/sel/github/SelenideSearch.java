package sel.github;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearch {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void shouldFindSelenideGitHub(){
       open("https://github.com/");
       $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
       $$(".repo-list li").first().$("a").click();
       $("#wiki-tab").click();
       $(".js-wiki-more-pages-link").click();
       $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
       $(byText("SoftAssertions")).click();
       $("#wiki-content").shouldHave(text("JUnit5"));
       //sleep(5000);
       Selenide.closeWindow();
       Selenide.closeWebDriver();

    }
}
