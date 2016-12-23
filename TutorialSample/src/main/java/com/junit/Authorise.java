package com.junit;

public class Authorise {

	public boolean isAuthorise (UserInfo userinfo, UserStorage userStorage) {

//		if((userinfo.getName() != null && userinfo.getName().trim().length() > 0 ) && 
//			(userinfo.getDOB() != null && userinfo.getDOB().trim().length() > 0 ) && 
//			(userinfo.getPhone() != null && userinfo.getPhone().trim().length() > 0 )) {
			
			StringBuilder strbuilder = new StringBuilder();
			strbuilder.append(userinfo.getName().substring(0,2));
			strbuilder.append(userinfo.getDOB().substring(0,2));
			strbuilder.append(userinfo.getPhone().substring(0,2));

			String Key =userStorage.readFromFile();

			return strbuilder.reverse().toString().equals(Key) ? true : false ;
			
//		} else {
//			return false; 
//		} 

	}

}
