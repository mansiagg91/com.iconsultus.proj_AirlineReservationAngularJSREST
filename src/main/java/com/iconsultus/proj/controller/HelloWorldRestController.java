package com.iconsultus.proj.controller;
 
import com.iconsultus.proj.model.flight;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


//import com.iconsultus.proj.model.loginDetails;
import com.iconsultus.proj.model.user_flight;
import com.iconsultus.proj.service.UserService;
import static java.lang.System.console;
import java.util.ArrayList;
 
@RestController
public class HelloWorldRestController {
 
    @Autowired
    UserService userService;  //Service which will do all data retrieval/manipulation work
 
    
    //-------------------Retrieve All Users--------------------------------------------------------
     
    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<user_flight>> listAllUsers() {
        user_flight dummy=new user_flight();
        dummy.setName("Dummy");
        dummy.setSource("LAX");
        dummy.setDestination("SFO");
        
            List<user_flight> users = new ArrayList <user_flight>();
                users.add(dummy);
            /*userService.findAllUsers();
        if(users.isEmpty()){
            return new ResponseEntity<List<user_flight>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }*/
        return new ResponseEntity<List<user_flight>>(users, HttpStatus.OK);
    }
 
 
    
    /*//-------------------Retrieve Single User--------------------------------------------------------
     
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<user_flight> getUser(@PathVariable("id") long id) {
        System.out.println("Fetching User with id " + id);
        User user = userService.findById(id);
        if (user == null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<user_flight>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<user_flight>(user, HttpStatus.OK);
    }
 
     
    */ 
    //-------------------Create a User--------------------------------------------------------
     
    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody user_flight user,    UriComponentsBuilder ucBuilder) {
        System.out.println("Controller Server Creating User " + user.getName());
 //console.log('Saving New User with name:'+user.name, user);  
               
       
       userService.saveuser_flight(user);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
 
    
     
    //------------------- Update a User --------------------------------------------------------
     /*
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<user_flight> updateUser(@PathVariable("id") long id, @RequestBody User user) {
        System.out.println("Updating User " + id);
         
        User currentUser = userService.findById(id);
         
        if (currentUser==null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<user_flight>(HttpStatus.NOT_FOUND);
        }
 
        currentUser.setUsername(user.getUsername());
        currentUser.setAddress(user.getAddress());
        currentUser.setEmail(user.getEmail());
         
        userService.updateUser(currentUser);
        return new ResponseEntity<user_flight>(currentUser, HttpStatus.OK);
    }
 
    
    
    //------------------- Delete a User --------------------------------------------------------
     
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<user_flight> deleteUser(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting User with id " + id);
 
        User user = userService.findById(id);
        if (user == null) {
            System.out.println("Unable to delete. User with id " + id + " not found");
            return new ResponseEntity<user_flight>(HttpStatus.NOT_FOUND);
        }
 
        userService.deleteUserById(id);
        return new ResponseEntity<user_flight>(HttpStatus.NO_CONTENT);
    }
 
     
    
    //------------------- Delete All Users --------------------------------------------------------
     
    @RequestMapping(value = "/user/", method = RequestMethod.DELETE)
    public ResponseEntity<user_flight> deleteAllUsers() {
        System.out.println("Deleting All Users");
 
        userService.deleteAllUsers();
        return new ResponseEntity<user_flight>(HttpStatus.NO_CONTENT);
    }*/
    
    @RequestMapping(value = "/flight/{source}", method = RequestMethod.GET )
    public ResponseEntity<List<flight>> createUser(@PathVariable("source") String src) {
     System.out.println("Controller Server  flight " + src);
 //console.log('Saving New User with name:'+user.name, user);  
               
 
       
      List<flight> li= userService.find_flight(src);
       
       if ( li == null) {
        
          //  System.out.println("Unable to delete. User with id " + id + " not found");
            return new ResponseEntity<List<flight>>(HttpStatus.NOT_FOUND);
        }
 
       
        return new ResponseEntity<List<flight>>(li, HttpStatus.OK);
    }   
 
}