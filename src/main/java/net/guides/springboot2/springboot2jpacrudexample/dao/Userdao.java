package net.guides.springboot2.springboot2jpacrudexample.dao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.guides.springboot2.springboot2jpacrudexample.model.User;
import org.springframework.stereotype.Repository;


@Repository
public class Userdao {
	  private static final Map<String, User> userMap = new HashMap<String, User>();
	  
	    static {
	        initUser();
}
	    private static void initUser() {
	       User user1 = new User("E01", "Smith", "sarat456");
	       User user2 = new User("E02", "Allen", "allen456");
	         User user3 = new User("E03", "Jones", "jones456");
	 
	        userMap.put(user1.getuserno(), user1);
	        userMap.put(user2.getuserno(), user2);
	        userMap.put(user3.getuserno(), user3);
	    }
	 
	    public User getUser(String userno) {
	        return userMap.get(userno);
	    }
	 
	    public User addUser(User user) {
	       userMap.put(user.getuserno(), user);
	        return user;
	    }
	 
	    public User updateUser(User user) {
	        userMap.put(user.getuserno(), user);
	        return user;
	    }
	 
	    public void deleteUser(String userno) {
	        userMap.remove(userno);
	    }
	 
	    public List<User> getAllUser() {
	        Collection<User> c = userMap.values();
	        List<User> list = new ArrayList<User>();
	        list.addAll(c);
	        return list;
	    }
	 
	}