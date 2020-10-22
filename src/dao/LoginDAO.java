package dao;

public class LoginDAO {
	public static boolean Validate(String userName, String passWord) {
		boolean result = false;
		if(userName.equals("manhkm") && passWord.equals("3004")) {
			result = true;
		} else {
		}
		return result;
	}
}
