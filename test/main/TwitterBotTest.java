package main;

import org.junit.Test;
import twitter4j.TwitterException;

public class TwitterBotTest {

    @Test
    public void OneGroupOfPeopleShouldBeOneGroup() {

        try {
            TwitterBot.sendTweet("Hello");
        }
        catch (TwitterException e) {
            e.printStackTrace();
        }
    }

}