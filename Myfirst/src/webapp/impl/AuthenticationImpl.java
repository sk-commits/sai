package webapp.impl;

import java.util.HashMap;
import java.util.Map;

import webapp.auth.Authentication;

public class AuthenticationImpl implements Authentication{

	@Override
	public boolean validlogin(String user, String pwd) {
		// TODO Auto-generated method stub
		boolean flag =  false;
		
		Map<String, String> map = new HashMap<String, String>();
		
		try {
			
			map.put("user", "sai");
			map.put("pwd", "krishna");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		if (map.containsValue(user) && map.containsValue(pwd)){
			
			flag = true;
		}
			else {
				flag = false;
			}
			
		
		
		return flag;
	}

}
