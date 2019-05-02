import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciseOneTest {
	
	ExerciseOne t1 = new ExerciseOne();
	
	@Test
	public void testLogin() {
		assertFalse(t1.login("", "pass"));
		assertFalse(t1.login("", ""));
		assertFalse(t1.login("", "pass"));
		assertFalse(t1.login("user", ""));
		assertFalse(t1.login("userrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", "passssssssssssssssssssssssssssssssssssssssss"));
		assertFalse(t1.login("userrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", "passsssssssssssss"));
		assertFalse(t1.login("userrrrr", "passssssssssssssssssssssssssssssssssssssssss"));
		assertTrue(t1.login("user", "pass"));
	}

	@Test
	public void testCheckLogininDB() {
		
		t1.checkLogininDB("one", "two");
		t1.checkLogininDB("user", "two");
		
	}

}
