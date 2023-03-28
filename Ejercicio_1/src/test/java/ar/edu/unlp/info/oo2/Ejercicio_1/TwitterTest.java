package ar.edu.unlp.info.oo2.Ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TwitterTest {
	
	Twiter tw1;
	User u1; 
	User u2;
	Tweet t1;
	
	@BeforeEach
	void setUp() throws Exception {
		tw1 = new Twiter();
	}
	
  @Test
    public void testAddUser() {
        tw1.addUser("fran");
        assertEquals("fran", tw1.getLastAddUser().getScreenName());
    }
	
    @Test
    public void testCheckScreenName() {
    	tw1.addUser("fran");
        assertFalse(tw1.checkScreenName("fran"));
    }
    
    @Test
    public void testDeleteUser() {
    	tw1.addUser("fran");
        assertTrue(tw1.deleteUser("fran"));
    }
	
	
	
}
