package ar.edu.unlp.info.oo2.Ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
	
	User u1; 
	User u2;
	Tweet t1;
	
	@BeforeEach
	void setUp() throws Exception {
		u1 = new User("fran");
		u2 = new User("juli");
	}
	
    @Test
    public void testUserScreenName() {
        assertEquals("fran", u1.getScreenName());
        assertEquals("fran", u1.getScreenName());
        assertEquals("juli", u2.getScreenName());
    }
    
    @Test
    public void testPublicTweet() {
    	u1.publicTweet("hola");
        assertEquals("hola", u1.getLastTweet().getTxt());
    }
    
    @Test
    public void testPublicReTweet() {
    	t1 = new Tweet("retweet");
    	u1.publicReTweet("retweeteando", t1);
        assertEquals(t1, u1.getLastTweet().getReTw());
    }
    
    @Test
    public void testDeleteTweets() {
    	u1.publicTweet("hola");
        assertEquals("hola", u1.getLastTweet().getTxt());
        u1.deleteTweets();
        assertNull(u1.getTws());
    }


}
