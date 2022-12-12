package test;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;


public class lastAddedMovieTest extends TestBase {

    public lastAddedMovieTest() {
        super();
    }

    @Test(description = "Test if the movie was added to favorites")
    public void movieAdded() throws InterruptedException {
        MainPage.clickOnFilms();
        FilmsPage.clickOnBestMovies();
        BestMovies.setFilter();
        BestMovies.clickOnMostPopularMovie();
        String title = MostPopularMovie.getName();
        MostPopularMovie.clickOnFavoriteButton();
        //MostPopularMovie.clickOnCloseWindow();
        MostPopularMovie.moveToProfile();
        MostPopularMovie.clickOnWatchLater();
        System.out.println(ProfilePage.getTitle());
        System.out.println(title);
        Assert.assertTrue(title.contains(ProfilePage.getTitle()));

    }
}
