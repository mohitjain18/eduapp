package in.co.codeplanet.Service;

import in.co.codeplanet.Model.CourseDetails;
import in.co.codeplanet.Output.Output;

public interface CourseService {

	Output addCourse(CourseDetails c);

	Output updateCourse(CourseDetails c);

	Output deleteCourse(CourseDetails c);

	Output getCourses(CourseDetails c);

	Output getCourseData(CourseDetails courseDetails);

	Output getAllCourses(CourseDetails courseDetails);

}
