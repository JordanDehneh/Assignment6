// Name: Jordan Dehneh
// Subject: Software Engineering tools and methods

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExerciseOneTest {
	
	ExerciseOne t1 = new ExerciseOne();
	
	// Tests 1 to 4 for blank testing.
	
	@Test
	public void testLogin1() {
		assertFalse(t1.login("", "pass"));	
	}
	@Test
	public void testLogin2() {
		assertFalse(t1.login("", ""));
	}
	@Test
	public void testLogin3() {
		assertFalse(t1.login("", "pass"));
	}
	@Test
	public void testLogin4() {
		assertFalse(t1.login("user", ""));
	}
	
	// Tests 5 to 8 for character count tests
	
	@Test
	public void testLogin5() {
		assertFalse(t1.login("userrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", "passssssssssssssssssssssssssssssssssssssssss"));
	}
	@Test
	public void testLogin6() {
		assertFalse(t1.login("userrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", "passsssssssssssss"));
	}
	@Test
	public void testLogin7() {
		assertFalse(t1.login("userrrrr", "passssssssssssssssssssssssssssssssssssssssss"));
	}
	
	// The correct "supposed" method of logging in
	
	@Test
	public void testLogin8() {
		assertTrue(t1.login("user", "pass"));
	}
	
	// Testing the second method

	@Test
	public void testCheckLogininDB() {
		t1.checkLogininDB("one", "two");
		t1.checkLogininDB("user", "two");
	}

}
