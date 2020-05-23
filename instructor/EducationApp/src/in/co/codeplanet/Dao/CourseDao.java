package in.co.codeplanet.Dao;

import in.co.codeplanet.Model.CourseDetails;
import in.co.codeplanet.Output.Output;

public interface CourseDao {

	Output addCourse(CourseDetails courseDetails);

	Output updateCourse(CourseDetails courseDetails);

	Output deleteCourse(CourseDetails courseDetails);

	Output getCourses(CourseDetails courseDetails);

	Output getCourseData(CourseDetails courseDetails);

	Output getAllCourses(CourseDetails courseDetails);

}
