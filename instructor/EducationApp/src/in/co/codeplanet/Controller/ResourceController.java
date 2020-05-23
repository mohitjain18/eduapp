package in.co.codeplanet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.co.codeplanet.Model.ResourceDetails;
import in.co.codeplanet.Output.Output;
import in.co.codeplanet.Service.ResourceService;

@RestController

public class ResourceController {
	@Autowired
	ResourceService resourceService;

	@PostMapping(value = "addresource")
	public Output addResource(@RequestBody ResourceDetails resourceDetails) 
	{
		Output output = resourceService.addResource(resourceDetails);
		return output;
	}
	
	@PutMapping(value="updateresource")
	public Output updateResource(@RequestBody ResourceDetails resourceDetails)
	{	
		Output output=resourceService.updateResource(resourceDetails);
		return output;
	}
	
	@DeleteMapping(value = "deleteresource")
	public Output deleteResource(@RequestBody ResourceDetails resourceDetails) 
	{
		Output output = resourceService.deleteResource(resourceDetails);
		return output;
	}
	
	@GetMapping(value = "getresources")
	public Output getResources(ResourceDetails resourceDetails) 
	{
		Output output = resourceService.getResources(resourceDetails);
		return output;
	}

}
