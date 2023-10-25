package tests;

import Pages.HomePage;
import Pages.ResultPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import utils.baseTest.BaseTest;

import static org.testng.Assert.assertTrue;

public class WikipediaTests extends BaseTest {

    @Test
    @Parameters({ "textToSearch" })
    public void searchTest(String textToSearch){
        HomePage home = loadFirstPage();
        ResultPage results = home.searchText(textToSearch);

        assertTrue(results.isTitleCorrect(textToSearch), "the title does not match");
    }
}