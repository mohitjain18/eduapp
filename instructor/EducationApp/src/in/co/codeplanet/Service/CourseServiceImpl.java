package in.co.codeplanet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.codeplanet.Dao.CourseDao;
import in.co.codeplanet.Model.CourseDetails;
import in.co.codeplanet.Output.Output;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseDao courseDao;

	public Output addCourse(CourseDetails courseDetails) {	
		return courseDao.addCourse(courseDetails);
	}

	@Override
	public Output updateCourse(CourseDetails courseDetails) {
		return courseDao.updateCourse(courseDetails);
	}

	@Override
	public Output deleteCourse(CourseDetails courseDetails) {
		return courseDao.deleteCourse(courseDetails);
	}

	@Override
	public Output getCourses(CourseDetails courseDetails) {
		return courseDao.getCourses(courseDetails);
	}

	@Override
	public Output getCourseData(CourseDetails courseDetails) {
		return courseDao.getCourseData(courseDetails);
	}

	@Override
	public Output getAllCourses(CourseDetails courseDetails) {
		return courseDao.getAllCourses(courseDetails);
	}

}
