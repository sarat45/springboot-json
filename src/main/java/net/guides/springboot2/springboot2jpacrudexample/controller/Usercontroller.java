package net.guides.springboot2.springboot2jpacrudexample.controller;
import java.util.List;

import net.guides.springboot2.springboot2jpacrudexample.dao.Userdao;
import net.guides.springboot2.springboot2jpacrudexample.model.User;
import net.guides.springboot2.springboot2jpacrudexample.controller.Usercontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class Usercontroller {
	   @Autowired
	    private Userdao userdao;
	 
	    @RequestMapping("/")
	    @ResponseBody
	    public String welcome() {
	        return "Welcome to RestTemplate Example.";
	    }
	 
	   
	    @RequestMapping(value = "/user", 
	            method = RequestMethod.GET, 
	            produces = { MediaType.APPLICATION_JSON_VALUE
	                    })
	    @ResponseBody
	    public List<User> getUser() {
	        List<User> list = userdao.getAllUser();
	        return list;
	    }
	 
	    @RequestMapping(value = "/user", 
	            method = RequestMethod.POST, 
	            produces = { MediaType.APPLICATION_JSON_VALUE, 
	              })
	    @ResponseBody
	    public User addEmployee(@RequestBody User user) {
	 
	        System.out.println("(Service Side) Creating user: " + user.getuserno());
	 
	        return userdao.addUser(user);
	    }
	 
	   
	    @RequestMapping(value = "/user", 
	            method = RequestMethod.PUT, 
	            produces = { MediaType.APPLICATION_JSON_VALUE, 
	                 })
	    @ResponseBody
	    public User updateEmployee(@RequestBody User user) {
	 
	        System.out.println("(Service Side) Editing user: " + user.getuserno());
	 
	        return userdao.updateUser(user);
	    }
	 
	 
	    @RequestMapping(value = "/user/{userno}", //
	            method = RequestMethod.DELETE, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, })
	    @ResponseBody
	    public void deleteUser(@PathVariable("userno") String userno) {
	 
	        System.out.println("(Service Side) Deleting employee: " + userno);
	 
	        userdao.deleteUser(userno);
	    }
	 
	}

