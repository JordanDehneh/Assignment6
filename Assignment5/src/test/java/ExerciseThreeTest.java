// Name: Jordan Dehneh
// Subject: Software Engineering tools and methods

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ExerciseThreeTest {
	
	ExerciseThree t3 = new ExerciseThree();

	// First test to check first if statement
	
	@Test
	void testhashingEx1() {
		assertEquals("", t3.hashingEx("abc","abc"), "Must be ''");
	}
	
	// Second test to check second if statement
	
	@Test
	void testhashingEx2() {
		assertEquals("abce", t3.hashingEx("abce",""), "Must be 'abce'");
	}
	
	// Third test to check all statements in hashingEx
	
	@Test
	void testhashingEx3() {
		assertEquals("c", t3.hashingEx("abce","abde"), "Must be 'c'");
	}
}