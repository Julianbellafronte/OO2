package ar.edu.unlp.info.oo2.Ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TweetTest {

	Tweet tw1;
	Tweet tw2;
	Tweet tw3;
	
	@BeforeEach
	void setUp() throws Exception {
		tw1 = new Tweet("hola");
		tw2 = new Tweet("chau");
		tw3 = new Tweet("reTweet", tw1);
	}
	
    @Test
    public void testTweet() {
        assertEquals("hola", tw1.getTxt());
        assertEquals("chau", tw2.getTxt());
    }
    
    @Test
    public void testReTweet() {
    	assertEquals(tw1, tw3.getReTw());
    }
    
	
}
