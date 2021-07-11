package miniproj.regI;


public interface SigninI {
	
	public boolean checkLogin(String email, String password);
	public boolean isExist(String email);

}
