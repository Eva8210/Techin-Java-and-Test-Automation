package lt.techin.evelina.test;

import lt.techin.evelina.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainPageTest extends BasePageTest{

    @Test
    void moveToQaPage () {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButtonQa();
        Assertions.assertEquals("http://192.168.88.86/en-gb/catalog/QAstuff", driver.getCurrentUrl());
        Assertions.assertEquals("QA stuff", driver.getTitle());
    }
}
