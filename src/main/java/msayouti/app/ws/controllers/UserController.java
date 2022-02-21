package msayouti.app.ws.controllers;




import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import msayouti.app.ws.entities.UserEntity;
import msayouti.app.ws.requests.UserRequest;
import msayouti.app.ws.services.UserService;



@CrossOrigin(origins="*")
@RestController
@RequestMapping("/users")


public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public HttpStatus createUser(@RequestBody UserRequest userRequest){
		
			userService.createUser(userRequest);
			
			return ( HttpStatus.CREATED);
	}
	
	@GetMapping()
	public ResponseEntity<List<UserEntity>> getAllUsers(@RequestParam(value="page") int page,@RequestParam(value="limit")  int limit) {
				
		List<UserEntity> listUserEntity = new ArrayList<>();
		
		listUserEntity= userService.getUsers(page, limit);
		
		return new ResponseEntity<List<UserEntity>>(listUserEntity, HttpStatus.OK);
	}
	

}
