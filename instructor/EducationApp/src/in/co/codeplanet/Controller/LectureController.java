package in.co.codeplanet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.co.codeplanet.Model.LectureDetails;
import in.co.codeplanet.Output.Output;
import in.co.codeplanet.Service.LectureService;

@RestController
public class LectureController {

	@Autowired
	LectureService lectureService;

	@PostMapping(value = "addlecture")
	public Output addLecture(@RequestBody LectureDetails lectureDetails) {
		Output output = lectureService.addLecture(lectureDetails);
		return output;
	}

	@PutMapping(value = "updatelecture")
	public Output updateLecture(@RequestBody LectureDetails lectureDetails) {
		Output output = lectureService.updateLecture(lectureDetails);
		return output;
	}

	@DeleteMapping(value = "deletelecture")
	public Output deleteLecture(@RequestBody LectureDetails lectureDetails) {
		Output output = lectureService.deleteLecture(lectureDetails);
		return output;
	}

	@GetMapping(value = "getlectures")
	public Output getLectures(LectureDetails lectureDetails) {
		Output output = lectureService.getLectures(lectureDetails);
		return output;
	}
	

}