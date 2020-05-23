package in.co.codeplanet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.co.codeplanet.Model.CourseDetails;
import in.co.codeplanet.Output.Output;
import in.co.codeplanet.Service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@PostMapping(value="addcourse")
	public Output addCourse(@RequestBody CourseDetails courseDetails)
	{	
		Output output=courseService.addCourse(courseDetails);
		return output;
	}
	
	@PutMapping(value="updatecourse")
	public Output updateCourse(@RequestBody CourseDetails courseDetails)
	{	
		Output output=courseService.updateCourse(courseDetails);
		return output;
	}
	
	@DeleteMapping(value="deletecourse")
	public Output deleteCourse(@RequestBody CourseDetails courseDetails)
	{	
		Output output=courseService.deleteCourse(courseDetails);
		return output;
	}
	
	@GetMapping(value="getcourses")
	public Output getCourses(CourseDetails courseDetails)
	{	
		Output output=courseService.getCourses(courseDetails);
		return output;
	}
	@GetMapping(value="getallcourses")
	public Output getAllCourses(CourseDetails courseDetails)
	{	
		//getting all active and archive course
		Output output=courseService.getAllCourses(courseDetails);
		return output;
	}
	
	@GetMapping(value="getcoursedata")
	public Output getCourseData(CourseDetails courseDetails)
	{	
		Output output=courseService.getCourseData(courseDetails);
		return output;
	}
}