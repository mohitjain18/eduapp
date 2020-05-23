package in.co.codeplanet.Service;

import in.co.codeplanet.Model.LectureDetails;
import in.co.codeplanet.Output.Output;

public interface LectureService {

	Output addLecture(LectureDetails l);

	Output updateLecture(LectureDetails l);

	Output deleteLecture(LectureDetails l);

	Output getLectures(LectureDetails l);

}
