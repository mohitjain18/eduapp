package in.co.codeplanet.Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.co.codeplanet.Model.CourseDetails;
import in.co.codeplanet.Model.LectureDetails;
import in.co.codeplanet.Model.ResourceDetails;
import in.co.codeplanet.Output.Output;

@Repository
public class CourseDaoImpl implements CourseDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Output addCourse(CourseDetails courseDetails) {
		Output output=new Output();
		Dictionary<Object,Object> errors=new Hashtable<Object,Object>();
		Dictionary<Object,Object> data=new Hashtable<Object,Object>();
		List<Object> dataList=new ArrayList<Object>();
		
		final String procedureCall = "{call Course(?,?,?,?,?,?,?,?,?,?,?,?)}";
		Connection connection = null;
		try
		{
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "addCourse");
			callableSt.setString(2, courseDetails.getCourse_Name());
			callableSt.setString(3, courseDetails.getCourse_Description());
			callableSt.setString(4, courseDetails.getCourse_Fee());
			callableSt.setString(5, courseDetails.getCourse_Duration());
			callableSt.setInt(6, Integer.parseInt(courseDetails.getIs_Certification()));
			callableSt.setString(7, null);
			callableSt.setFloat(8, 0.0f);
			callableSt.setString(9, courseDetails.getCourse_Tags());
			callableSt.setString(10, courseDetails.getCourse_Pre_Requisites());
			callableSt.setInt(11, 0);
			callableSt.setInt(12, Integer.parseInt(courseDetails.getUser_Id()));
			
			if(callableSt.executeUpdate()>0)
			{
				data.put("Message", "Course ADD Successfull...");
				dataList.add(data);
				output.setData(dataList);
				output.setStatus(true);
			}
			else {
				errors.put("Message", "User Not Exist");
				dataList.add(errors);
				output.setStatus(false);
				output.setError(dataList);
			}
			connection.commit();
		}	
		catch(Exception e1) {
			errors.put("Message", "Error in Connecting to Database");
			dataList.add(errors);
			output.setStatus(false);
			output.setError(dataList);
			e1.printStackTrace();			
		}
		return output;
	}

	@Override
	public Output updateCourse(CourseDetails courseDetails) {
		Output output=new Output();
		Dictionary<Object,Object> errors=new Hashtable<Object,Object>();
		Dictionary<Object,Object> data=new Hashtable<Object,Object>();
		List<Object> dataList=new ArrayList<Object>();
		
		final String procedureCall = "{call Course(?,?,?,?,?,?,?,?,?,?,?,?)}";
		Connection connection = null;
		try
		{
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "updateCourse");
			callableSt.setString(2, courseDetails.getCourse_Name());
			callableSt.setString(3, courseDetails.getCourse_Description());
			callableSt.setString(4, courseDetails.getCourse_Fee());
			callableSt.setString(5, courseDetails.getCourse_Duration());
			callableSt.setInt(6, Integer.parseInt(courseDetails.getIs_Certification()));
			callableSt.setString(7, courseDetails.getLecture_Order());
			callableSt.setFloat(8, 0.0f);
			callableSt.setString(9, courseDetails.getCourse_Tags());
			callableSt.setString(10, courseDetails.getCourse_Pre_Requisites());
			callableSt.setInt(11, Integer.parseInt(courseDetails.getCourse_Id()));
			callableSt.setInt(12, Integer.parseInt(courseDetails.getUser_Id()));			
			
			if(callableSt.execute())
			{
				errors.put("Message", "No Such User Exists");
				dataList.add(errors);
				output.setStatus(false);
				output.setError(dataList);
			}
			else
			{
				if(callableSt.getUpdateCount()>0)
				{
					data.put("Message", "Course Updated Successfully!!!");
					dataList.add(data);
					output.setData(dataList);
					output.setStatus(true);
				}
				else {
					errors.put("Message", "No Such Course exists");
					dataList.add(errors);
					output.setStatus(false);
					output.setError(dataList);
				}
			}	
			connection.commit();
		}		
		catch(Exception e1) {
			errors.put("Message", "Error in connecting to Database");
			dataList.add(errors);
			output.setStatus(false);
			output.setError(dataList);
			e1.printStackTrace();			
		}
		
		return output;
	}

	@Override
	public Output deleteCourse(CourseDetails courseDetails) {
		Output output=new Output();
		Dictionary<Object,Object> errors=new Hashtable<Object,Object>();
		Dictionary<Object,Object> data=new Hashtable<Object,Object>();
		List<Object> dataList=new ArrayList<Object>();
		
		final String procedureCall = "{call Course(?,?,?,?,?,?,?,?,?,?,?,?)}";
		Connection connection = null;
		try
		{
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "deleteCourse");
			callableSt.setString(2, null);
			callableSt.setString(3, null);
			callableSt.setString(4, null);
			callableSt.setString(5, null);
			callableSt.setInt(6, 0);
			callableSt.setString(7, null);
			callableSt.setFloat(8, 0.0f);
			callableSt.setString(9, null);
			callableSt.setString(10, null);
			callableSt.setInt(11, Integer.parseInt(courseDetails.getCourse_Id()));
			callableSt.setInt(12, Integer.parseInt(courseDetails.getUser_Id()));
			
			if(callableSt.execute())
			{
				ResultSet resultSet=callableSt.getResultSet();
				resultSet.next();
				
				if(resultSet.getInt("status")==-1)
					errors.put("Message", "No Such User Exists");
				else 
					errors.put("Message", "No Such Course Exists");
					
				dataList.add(errors);
				output.setStatus(false);
				output.setError(dataList);
			}
			else
			{
				data.put("Message", "Course Deleted Successfully.!!!");
				dataList.add(data);
				output.setData(dataList);
				output.setStatus(true);
			}	
			connection.commit();
		}		
	 catch(Exception e1) {
			errors.put("Message", "Error in connecting to Database");
			dataList.add(errors);
			output.setStatus(false);
			output.setError(dataList);
			e1.printStackTrace();			
		}
		return output;
	}

	
	@Override
	public Output getCourses(CourseDetails courseDetails) {
		Output output=new Output();
		Dictionary<Object,Object> errors=new Hashtable<Object,Object>();
		Dictionary<Object,Object> data=new Hashtable<Object,Object>();
		List<Object> dataList=new ArrayList<Object>();
		
		final String procedureCall = "{call Course(?,?,?,?,?,?,?,?,?,?,?,?)}";
		Connection connection = null;
		try
		{
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "getCourses");
			callableSt.setString(2, null);
			callableSt.setString(3, null);
			callableSt.setString(4, null);
			callableSt.setString(5, null);
			callableSt.setInt(6, 0);
			callableSt.setString(7, null);
			callableSt.setFloat(8, 0.0f);
			callableSt.setString(9, null);
			callableSt.setString(10, null);
			callableSt.setInt(11, 0);
			callableSt.setInt(12, Integer.parseInt(courseDetails.getUser_Id()));
			
			ResultSet resultSet= callableSt.executeQuery();
			connection.commit();
			if(resultSet.next())
			{
				if(resultSet.getInt("Status")==1)
				{
					do { 
						CourseDetails Course_Details = new CourseDetails();
						Course_Details.setCourse_Id(resultSet.getString("Course_Id"));
						Course_Details.setCourse_Name(resultSet.getString("Course_Name"));
						Course_Details.setCourse_Description(resultSet.getString("Course_Description"));
						Course_Details.setCourse_Duration(resultSet.getString("Course_Duration"));
						Course_Details.setCourse_Fee(resultSet.getString("Course_Fee"));
						Course_Details.setIs_Certification(resultSet.getString("Is_Certification_Course"));
						Course_Details.setCreated_By(resultSet.getString("Created_By"));
						Course_Details.setCreated_Date(resultSet.getString("Created_Date"));
						Course_Details.setModified_By(resultSet.getString("Modified_By"));
						Course_Details.setModified_Date(resultSet.getString("Modified_Date"));
						
						Course_Details.setCourse_Pre_Requisites(resultSet.getString("Course_Pre_Requisites"));
						Course_Details.setLecture_Order(resultSet.getString("Lecture_Order"));
						Course_Details.setCourse_Tags(resultSet.getString("Course_Tags"));
						Course_Details.setCourse_Rating(resultSet.getString("Course_Rating"));
						dataList.add(Course_Details);
					}while(resultSet.next());
					
					output.setData(dataList);
					output.setStatus(true);
				}
				else {
					errors.put("Message", "No Such User Exists");
					dataList.add(errors);
					output.setData(dataList);
					output.setStatus(false);
				}
			}
			else {
				errors.put("Message", "EMPTY!! No Course Available Add an new Course");
				dataList.add(errors);
				output.setData(dataList);
				output.setStatus(false);
			}
		}
		catch(Exception e1) {
			errors.put("Message", "Error in connecting to Database");
			dataList.add(errors);
			output.setStatus(false);
			output.setError(dataList);
			e1.printStackTrace();			
		}
		return output;
	}

	@Override
	public Output getCourseData(CourseDetails courseDetails) {

		Output output=new Output();
		Dictionary<Object,Object> errors=new Hashtable<Object,Object>();
		Dictionary<Object,Object> data=new Hashtable<Object,Object>();
		List<Object> dataList=new ArrayList<Object>();
		
		final String procedureCall = "{call Course(?,?,?,?,?,?,?,?,?,?,?,?)}";
		Connection connection = null;
		try
		{
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "getCourseInfo");
			callableSt.setString(2, null);
			callableSt.setString(3, null);
			callableSt.setString(4, null);
			callableSt.setString(5, null);
			callableSt.setInt(6, 0);
			callableSt.setString(7, null);
			callableSt.setFloat(8, 0.0f);
			callableSt.setString(9, null);
			callableSt.setString(10, null);
			callableSt.setInt(11, Integer.parseInt(courseDetails.getCourse_Id()));
			callableSt.setInt(12, 0);
			
			ResultSet resultSet= callableSt.executeQuery();
			connection.commit();
			
			if(resultSet.next())
			{
				courseDetails.setCourse_Name(resultSet.getString("Course_Name"));
				courseDetails.setCourse_Description(resultSet.getString("Course_Description"));
				courseDetails.setCourse_Duration(resultSet.getString("Course_Duration"));
				courseDetails.setCourse_Fee(resultSet.getString("Course_Fee"));
				courseDetails.setIs_Certification(resultSet.getString("Is_Certification_Course"));
				courseDetails.setCreated_By(resultSet.getString("Created_By"));
				courseDetails.setCreated_Date(resultSet.getString("Created_Date"));
				courseDetails.setModified_By(resultSet.getString("Modified_By"));
				courseDetails.setModified_Date(resultSet.getString("Modified_Date"));
				
				courseDetails.setCourse_Pre_Requisites(resultSet.getString("Course_Pre_Requisites"));
				courseDetails.setLecture_Order(resultSet.getString("Lecture_Order"));
				courseDetails.setCourse_Tags(resultSet.getString("Course_Tags"));
				courseDetails.setCourse_Rating(resultSet.getString("Course_Rating"));
				
				//////////////////////////////////////lectures///////////////////////////////////
				courseDetails.setLectures_list(getLectures(courseDetails));
				if(courseDetails.getLectures_list()!=null)
				{
					//there may be some lectures for that resources are not present
					//and they are also not returned by the query
					List<ResourceDetails> resource_Details_list=getResourcesOfLectures(courseDetails);
					if(resource_Details_list!=null)
					{
						putResourcesInLectures(courseDetails,resource_Details_list);
					}
				}
				dataList.add(courseDetails);
				output.setData(dataList);
				output.setStatus(true);
			}
			else {
				errors.put("Message", "No Such Course Exists");
				dataList.add(errors);
				output.setData(dataList);
				output.setStatus(false);
			}
			connection.close();
		}
		catch(Exception e1) {
			errors.put("Message", "Error in connecting to Database");
			dataList.add(errors);
			output.setStatus(false);
			output.setError(dataList);
			e1.printStackTrace();			
		}
		
		return output;

	}

	public void putResourcesInLectures(CourseDetails courseDetails,List<ResourceDetails> resource_Details_list)
	{
		ListIterator<ResourceDetails> listIterator=resource_Details_list.listIterator();
		ResourceDetails temp_ResourceDetails=listIterator.next();
		List<ResourceDetails> temp_list;
		
		
		for(LectureDetails lectureDetails:courseDetails.getLectures_list())
		{
			if(lectureDetails.getLecture_Id().equals(temp_ResourceDetails.getLecture_Id()))
			{
				temp_list=new ArrayList<ResourceDetails>();
				temp_list.add(temp_ResourceDetails);
				while(listIterator.hasNext())
				{
					temp_ResourceDetails=listIterator.next();
					if(lectureDetails.getLecture_Id().equals(temp_ResourceDetails.getLecture_Id()))
						temp_list.add(temp_ResourceDetails);
					else
						break;
				}
				lectureDetails.setResource_details_list(temp_list);
			}
		}
	}
	public List<ResourceDetails> getResourcesOfLectures(CourseDetails courseDetails)
	{
		final String procedureCall = "{call Course(?,?,?,?,?,?,?,?,?,?,?,?)}";
		Connection connection = null;
		try
		{
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "getResourcesOfLectures");
			callableSt.setString(2, null);
			callableSt.setString(3, null);
			callableSt.setString(4, null);
			callableSt.setString(5, null);
			callableSt.setInt(6, 0);
			callableSt.setString(7, null);
			callableSt.setFloat(8, 0.0f);
			callableSt.setString(9, null);
			callableSt.setString(10, null);
			callableSt.setInt(11, Integer.parseInt(courseDetails.getCourse_Id()));
			callableSt.setInt(12, 0);
			
			ResultSet resultSet= callableSt.executeQuery();
			connection.commit();
			
			if(resultSet.next())
			{
				List<ResourceDetails> list=new ArrayList<ResourceDetails>();
				do {
					ResourceDetails Resource_Details = new ResourceDetails();
					Resource_Details.setResource_Id(resultSet.getString("Resource_Id"));
					Resource_Details.setResource_Type_Id(resultSet.getString("Fk_Resource_Type_Id"));
					Resource_Details.setResource_Title(resultSet.getString("Resource_Title"));
					Resource_Details.setResource_Url(resultSet.getString("Resource_Url"));
					Resource_Details.setResource_Length(resultSet.getString("Resource_Length"));
					Resource_Details.setCreated_By(resultSet.getString("Created_By"));
					Resource_Details.setCreated_Date(resultSet.getString("Created_Date"));
					Resource_Details.setModified_By(resultSet.getString("Modified_By"));
					Resource_Details.setModified_Date(resultSet.getString("Modified_Date"));
					Resource_Details.setResource_Name(resultSet.getString("Resource_Name"));
					Resource_Details.setResource_Type(resultSet.getString("Resource_Type_Title"));
					Resource_Details.setLecture_Id(resultSet.getString("Fk_Lecture_Id"));
					Resource_Details.setCourse_Id(courseDetails.getCourse_Id());
					list.add(Resource_Details);
				}while(resultSet.next());
				
				return list;
			}
			connection.close();
		}
		catch(Exception e1) {
			
			e1.printStackTrace();			
		}

		return null;
	}
	public List<LectureDetails> getLectures(CourseDetails courseDetails)
	{
		final String procedureCall = "{call Lecture(?,?,?,?,?,?,?)}";
		Connection connection = null;
		try {
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "getLectures");
			callableSt.setString(2, null);
			callableSt.setString(3, null);
			callableSt.setInt(4, 0);
			callableSt.setInt(5, Integer.parseInt(courseDetails.getCreated_By()));
			callableSt.setInt(6, Integer.parseInt(courseDetails.getCourse_Id()));
			callableSt.setString(7, null);
			ResultSet resultSet= callableSt.executeQuery();
			connection.commit();
			if(resultSet.next())
			{
				if(resultSet.getInt("Status")==1)
				{
					List<LectureDetails> list=new ArrayList<LectureDetails>();
					do {
						LectureDetails Lecture_Details = new LectureDetails();
						Lecture_Details.setLecture_Id(resultSet.getString("Lecture_Id"));
						Lecture_Details.setLecture_Name(resultSet.getString("Lecture_Name"));
						Lecture_Details.setLecture_Description(resultSet.getString("Lecture_Description"));
						Lecture_Details.setCreated_By(resultSet.getString("Created_By"));
						Lecture_Details.setCreated_Date(resultSet.getString("Created_Date"));
						Lecture_Details.setModified_By(resultSet.getString("Modified_By"));
						Lecture_Details.setModified_Date(resultSet.getString("Modified_Date"));
						Lecture_Details.setResource_Order(resultSet.getString("Resource_Order"));
						Lecture_Details.setCourse_Id(courseDetails.getCourse_Id());
						list.add(Lecture_Details);
					}while(resultSet.next());
					
					return list;
				}
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	return null;
	
	}

	@Override
	public Output getAllCourses(CourseDetails courseDetails) {
		Output output=new Output();
		Dictionary<Object,Object> errors=new Hashtable<Object,Object>();
		Dictionary<Object,Object> data=new Hashtable<Object,Object>();
		List<Object> dataList=new ArrayList<Object>();
		
		final String procedureCall = "{call Course(?,?,?,?,?,?,?,?,?,?,?,?)}";
		Connection connection = null;
		try
		{
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "getAllCourses");
			callableSt.setString(2, null);
			callableSt.setString(3, null);
			callableSt.setString(4, null);
			callableSt.setString(5, null);
			callableSt.setInt(6, 0);
			callableSt.setString(7, null);
			callableSt.setFloat(8, 0.0f);
			callableSt.setString(9, null);
			callableSt.setString(10, null);
			callableSt.setInt(11, 0);
			callableSt.setInt(12, Integer.parseInt(courseDetails.getUser_Id()));
			
			ResultSet resultSet= callableSt.executeQuery();
			connection.commit();
			if(resultSet.next())
			{
				if(resultSet.getInt("Status")==1)
				{
					do { 
						CourseDetails Course_Details = new CourseDetails();
						Course_Details.setCourse_Id(resultSet.getString("Course_Id"));
						Course_Details.setCourse_Name(resultSet.getString("Course_Name"));
						Course_Details.setCourse_Description(resultSet.getString("Course_Description"));
						Course_Details.setCourse_Duration(resultSet.getString("Course_Duration"));
						Course_Details.setCourse_Fee(resultSet.getString("Course_Fee"));
						Course_Details.setIs_Certification(resultSet.getString("Is_Certification_Course"));
						Course_Details.setCreated_By(resultSet.getString("Created_By"));
						Course_Details.setCreated_Date(resultSet.getString("Created_Date"));
						Course_Details.setModified_By(resultSet.getString("Modified_By"));
						Course_Details.setModified_Date(resultSet.getString("Modified_Date"));
						Course_Details.setIs_Active(resultSet.getString("Is_Active"));
						Course_Details.setCourse_Pre_Requisites(resultSet.getString("Course_Pre_Requisites"));
						Course_Details.setLecture_Order(resultSet.getString("Lecture_Order"));
						Course_Details.setCourse_Tags(resultSet.getString("Course_Tags"));
						Course_Details.setCourse_Rating(resultSet.getString("Course_Rating"));
						dataList.add(Course_Details);
					}while(resultSet.next());
					
					output.setData(dataList);
					output.setStatus(true);
				}
				else {
					errors.put("Message", "No Such User Exists");
					dataList.add(errors);
					output.setData(dataList);
					output.setStatus(false);
				}
			}
			else {
				errors.put("Message", "EMPTY!! No Course Available Add an new Course");
				dataList.add(errors);
				output.setData(dataList);
				output.setStatus(false);
			}
		}
		catch(Exception e1) {
			errors.put("Message", "Error in connecting to Database");
			dataList.add(errors);
			output.setStatus(false);
			output.setError(dataList);
			e1.printStackTrace();			
		}
		return output;

	}
}