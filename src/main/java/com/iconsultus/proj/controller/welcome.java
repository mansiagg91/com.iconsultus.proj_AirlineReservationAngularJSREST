/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iconsultus.proj.controller;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;


//import com.iconsultus.proj.model.loginDetails;
import com.iconsultus.proj.model.user_flight;
import com.iconsultus.proj.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mansigarg
 */
@Controller
@RequestMapping(value="/welcome")
public class welcome {
    @Autowired
    private UserService userService;
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView displayWelcome(){
        ModelAndView mv=new ModelAndView();
	mv.setViewName("login");
	user_flight login1 =new user_flight();
	mv.addObject("login1",login1);
     	return mv;
         }

    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView processWelcome(@Valid @ModelAttribute("login1") user_flight login1,BindingResult result) {
	/*	// boolean flag= userService.authenticate(login1.getUserName(), login1.getPassword());
	String src=login1.getSrc();
	String dest=login1.getDest();
	String userName=login1.getUserName();
	*/
	if (result.hasErrors()) {
		ModelAndView model=new ModelAndView();
	String view;
        view="Error";
	    model.setViewName(view);

	return model;
        
		}

	 userService.saveuser_flight(login1);

	// List list1= userService.check(login1.getUserName(), login1.getDest());
	ModelAndView model=new ModelAndView();
	String view;
		boolean flag=true;
	/*
	if(av==0) 
	    flag=false; 
	if(!flag){
	    model.addObject("message","Sorry No Seats Available");
	    view="login";
	    model.setViewName(view);
	}else{
	    model.addObject("src",src);
	    model.addObject("dest",dest);
            model.addObject("userName",userName);
            model.addObject("av",av);
          
	    view="login_success";
	    model.setViewName(view);
	}
	*/
		//model.addObject();
	    view="success";
	    model.setViewName(view);

	return model;
    }



}