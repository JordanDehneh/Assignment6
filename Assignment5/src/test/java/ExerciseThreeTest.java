import org.junit.jupiter.api.Test;

class ExerciseThreeTest {
	
	ExerciseThree t3 = new ExerciseThree();

	@Test
	void testm3() {
		
		t3.m3("abc", "ab");
		t3.m3("abc", "abc");
		t3.m3("abc", "");
	}

}
