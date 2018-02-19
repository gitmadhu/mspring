package in.bonakula.mdemo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import in.bonakula.mdemo.model.User;
import in.bonakula.mdemo.repository.UserRepo;


@Controller
public class HelloController {

	@Resource
	UserRepo userRepo;
    @RequestMapping("/")
    public String index(Model model) {
    	
        return "home";
    }
    
    @GetMapping("/greet")
    public String greet(Model model){
    	
    	User user = new User();
    	user.setName("madhu");
		userRepo.save(user);
		
    	model.addAttribute("users", userRepo.findAll());
    	
    	return "home";
    }
    
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable(name="name") String name,Model model){
    	
    	User user = new User();
    	user.setName(name);
		userRepo.save(user);
		
    	model.addAttribute("users", userRepo.findAll());
    	
    	return "home";
    }

}