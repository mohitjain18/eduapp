package in.co.codeplanet.Model;

import java.util.List;

public class LectureDetails {
	private String Lecture_Id;
	private String Lecture_Name;
	private String Lecture_Description;
	private String Course_Id;
	private String User_Id;
	private String Created_By;
	private String Created_Date;
	private String Modified_By;
	private String Modified_Date;
	private String Resource_Order;
	
	private List<ResourceDetails> resource_details_list ;
	
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
	public String getModified_By() {
		return Modified_By;
	}
	public void setModified_By(String modified_By) {
		Modified_By = modified_By;
	}
	public String getModified_Date() {
		return Modified_Date;
	}
	public void setModified_Date(String modified_Date) {
		Modified_Date = modified_Date;
	}
	public String getCourse_Id() {
		return Course_Id;
	}
	public void setCourse_Id(String course_Id) {
		Course_Id = course_Id;
	}
	public String getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}
	public String getLecture_Id() {
		return Lecture_Id;
	}
	public void setLecture_Id(String lecture_Id) {
		Lecture_Id = lecture_Id;
	}
	public String getLecture_Name() {
		return Lecture_Name;
	}
	public void setLecture_Name(String lecture_Name) {
		Lecture_Name = lecture_Name;
	}
	public String getLecture_Description() {
		return Lecture_Description;
	}
	public void setLecture_Description(String lecture_Description) {
		Lecture_Description = lecture_Description;
	}
	public String getResource_Order() {
		return Resource_Order;
	}
	public void setResource_Order(String resource_Order) {
		Resource_Order = resource_Order;
	}
	public List<ResourceDetails> getResource_details_list() {
		return resource_details_list;
	}
	public void setResource_details_list(List<ResourceDetails> resource_details_list) {
		this.resource_details_list = resource_details_list;
	}
	
}
