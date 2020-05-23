package in.co.codeplanet.Model;

import java.util.List;

public class CourseDetails {
	
	private String User_Id;
	private String Course_Id;
	private String Course_Name;
	private String Course_Description;
	private String Course_Fee;
	private String Course_Duration;
	private String Is_Certification;
	private String Created_By;
	private String Created_Date;
	private String Modified_By;
	private String Is_Active;
	private String Lecture_Order;
	private String Course_Rating;
	private String Course_Tags;
	private String Course_Pre_Requisites;
	
	private List<LectureDetails> lectures_list;
	
	public String getLecture_Order() {
		return Lecture_Order;
	}
	public void setLecture_Order(String lecture_Order) {
		Lecture_Order = lecture_Order;
	}
	public String getCourse_Rating() {
		return Course_Rating;
	}
	public void setCourse_Rating(String course_Rating) {
		Course_Rating = course_Rating;
	}
	public String getCourse_Tags() {
		return Course_Tags;
	}
	public void setCourse_Tags(String course_Tags) {
		Course_Tags = course_Tags;
	}
	public String getModified_By() {
		return Modified_By;
	}
	public void setModified_By(String modified_By) {
		Modified_By = modified_By;
	}
	public String Modified_Date;
	
	public String getCreated_By() {
		return Created_By;
	}
	public void setCreated_By(String created_By) {
		Created_By = created_By;
	}
	public String getCreated_Date() {
		return Created_Date;
	}
	public void setCreated_Date(String created_Date) {
		Created_Date = created_Date;
	}
	public String getModified_Date() {
		return Modified_Date;
	}
	public void setModified_Date(String modified_Date) {
		Modified_Date = modified_Date;
	}
	public String getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}
	public String getCourse_Id() {
		return Course_Id;
	}
	public void setCourse_Id(String course_Id) {
		Course_Id = course_Id;
	}
	public String getCourse_Name() {
		return Course_Name;
	}
	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}
	public String getCourse_Description() {
		return Course_Description;
	}
	public void setCourse_Description(String course_Description) {
		Course_Description = course_Description;
	}
	public String getCourse_Fee() {
		return Course_Fee;
	}
	public void setCourse_Fee(String course_Fee) {
		Course_Fee = course_Fee;
	}
	
	public String getCourse_Duration() {
		return Course_Duration;
	}
	public void setCourse_Duration(String course_Duration) {
		Course_Duration = course_Duration;
	}
	public String getIs_Certification() {
		return Is_Certification;
	}
	public void setIs_Certification(String is_Certification) {
		Is_Certification = is_Certification;
	}
	public String getCourse_Pre_Requisites() {
		return Course_Pre_Requisites;
	}
	public void setCourse_Pre_Requisites(String course_Pre_Requisites) {
		Course_Pre_Requisites = course_Pre_Requisites;
	}
	public List<LectureDetails> getLectures_list() {
		return lectures_list;
	}
	public void setLectures_list(List<LectureDetails> lectures_list) {
		this.lectures_list = lectures_list;
	}
	public String getIs_Active() {
		return Is_Active;
	}
	public void setIs_Active(String is_Active) {
		Is_Active = is_Active;
	}
	

}
