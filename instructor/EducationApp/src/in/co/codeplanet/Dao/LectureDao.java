package in.co.codeplanet.Dao;

import in.co.codeplanet.Model.LectureDetails;
import in.co.codeplanet.Output.Output;

public interface LectureDao {

	Output addLecture(LectureDetails lectureDetails);

	Output updateLecture(LectureDetails lectureDetails);

	Output deleteLecture(LectureDetails lectureDetails);

	Output getLectures(LectureDetails lectureDetails);

}
