// Name: Jordan Dehneh
// Subject: Software Engineering tools and methods

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ExerciseTwoTest {
	
	ExerciseTwo t2 = new ExerciseTwo();
	
	// The two tests to check the if statement in xMethod.
	
	@Test
	void testxMethod1() {
		 assertEquals("***3", t2.xMethod(3), "Must be ***3");
	}
	@Test
	void testxMethod2() {
		 assertEquals("incorrect number", t2.xMethod(-1), "Must print out 'incorrect number'");
	}
}
