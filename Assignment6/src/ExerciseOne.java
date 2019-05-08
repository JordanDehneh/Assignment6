public class ExerciseOne {
	public boolean login (String username, String password){
		// check parameters are not in blank
		
		if (username=="" || password=="") {
			return false;
		}
		
		// check parameters length < 30
		
		if (username.length()>30 || password.length()>30) {
			return false;
		}
		
		// call to mock DB method
		
		return checkLogininDB (username, password);
	}
	
	public boolean checkLogininDB(String username, String password){
		// método mock (simulado)
		if (username == "user" && password == "pass")
			return true;
		else
			return false;
	}
}