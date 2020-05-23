package in.co.codeplanet.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.codeplanet.Model.CourseDetails;
import in.co.codeplanet.Model.UserDetails;
import in.co.codeplanet.Output.Output;
import in.co.codeplanet.Output.SignInOutput;
import in.co.codeplanet.Service.SignInService;

@RestController
public class SignInController {
	
	
	@Autowired
	
	SignInService signInService;
	
	@RequestMapping(value = "/")
	public String welcome() {
		return "Welcome";
	}
	
	@PostMapping(value = "sign-up")
	public SignInOutput userSignUp(@RequestBody UserDetails userDetails) {
		
		SignInOutput signUpStatus = signInService.userSignUp(userDetails);
		
		return signUpStatus;
	}
	
	@PostMapping(value = "sign-in")
	public SignInOutput userSignIn(@RequestBody UserDetails userDetails) {
		
		SignInOutput userData = signInService.userSignIn(userDetails);
		
		return userData;
	}
	@PutMapping(value="update-user")
	public SignInOutput updateUser(@RequestBody UserDetails userDetails)
	{	
		SignInOutput userUpdateStatus=signInService.updateUser(userDetails);
		return userUpdateStatus;
	}
	@PutMapping(value="change-password")
	public SignInOutput changePassword(@RequestBody UserDetails userDetails)
	{	
		//For this Method
		//in userDetails model class password->old_password & New_Password->newPassword
		SignInOutput changePasswordStatus=signInService.changePassword(userDetails);
		return changePasswordStatus;
	}

}
