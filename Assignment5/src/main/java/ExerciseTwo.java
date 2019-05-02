public class ExerciseTwo {
	
	public String xMethod(int x) {
		String ast = "";
		if (x < 0 ) {
			return "incorrect number";
		}
		else {
			for (int i=0; i<x; i++) {
				ast+="*";
			}	
		}
		return ast + x;
	}
}
