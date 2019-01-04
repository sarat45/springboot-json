package net.guides.springboot2.springboot2jpacrudexample.model;

public class User {
	
	  private String userno;
	    private String userName;
	    private String password;
	 
	    public User() {
	 
	    }
	 
	    public User(String userno, String userName, String password) {
	        this.userno = userno;
	        this.userName = userName;
	        this.password = password;
	    }
	 
	    public String getuserno() {
	        return userno;
	    }
	 
	    public void setEmpNo(String userno) {
	        this.userno = userno;
	    }
	 
	    public String getuserName() {
	        return userName;
	    }
	 
	    public void setEmpName(String userName) {
	        this.userName = userName;
	    }
	 
	    public String getPosition() {
	        return password;
	    }
	 
	    public void setPosition(String position) {
	        this.password = position;
	    }

}
