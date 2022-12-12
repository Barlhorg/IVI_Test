package test;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class LastSerials extends TestBase {
    public LastSerials() {
        super();
    }
    @Test(description = "Test if the serial was added to favorites")
    public void movieAdded() throws InterruptedException {
        MainPage.clickOnSerials();
        SerialPage.clickOnBestSerials();
        BestMovies.setFilter();
        BestMovies.clickOnMostPopularMovie();
        String title = MostPopularSerials.getName();
        MostPopularSerials.clickOnFavoriteButton();
        MostPopularSerials.moveToProfile();
        MostPopularSerials.clickOnWatchLater();
        System.out.println(ProfilePage.getTitle());
        System.out.println(title);
        Assert.assertTrue(title.contains(ProfilePage.getTitle()));

    }
}

