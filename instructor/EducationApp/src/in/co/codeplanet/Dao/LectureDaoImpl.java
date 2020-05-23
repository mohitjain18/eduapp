package in.co.codeplanet.Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import in.co.codeplanet.Model.LectureDetails;
import in.co.codeplanet.Output.Output;

@Repository
public class LectureDaoImpl implements LectureDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Output addLecture(LectureDetails lectureDetails) {
		Output output = new Output();
		Dictionary<Object, Object> errors = new Hashtable<Object, Object>();
		Dictionary<Object, Object> data = new Hashtable<Object, Object>();
		List<Object> dataList = new ArrayList<Object>();
		final String procedureCall = "{call Lecture(?,?,?,?,?,?,?)}";
		Connection connection = null;
		try {
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "addLecture");
			callableSt.setString(2, lectureDetails.getLecture_Name());
			callableSt.setString(3, lectureDetails.getLecture_Description());
			callableSt.setInt(4, 0);
			callableSt.setInt(5, Integer.parseInt(lectureDetails.getUser_Id()));
			callableSt.setInt(6, Integer.parseInt(lectureDetails.getCourse_Id()));
			callableSt.setString(7, null);
			
			if(callableSt.execute())
			{
				ResultSet resultSet=callableSt.getResultSet();
				resultSet.next();
				
				if(resultSet.getInt("Status")==-1)
					errors.put("Message", "No Such User exists");
				else
					errors.put("Message", "No Such Course exists");
				
				dataList.add(errors);
				output.setStatus(false);
				output.setError(dataList);
			}
			else{
				
				data.put("Message", "Lecture Added Successfully");
				dataList.add(data);
				output.setData(dataList);
				output.setStatus(true);
			}
			connection.commit();
		} 
		catch (Exception e1) {
			errors.put("Message", "Error in Connecting to Database");
			dataList.add(errors);
			output.setStatus(false);
			output.setError(dataList);
			e1.printStackTrace();
		}

		return output;
	}

	@Override
	public Output updateLecture(LectureDetails lectureDetails) {
		Output output = new Output();
		Dictionary<Object, Object> errors = new Hashtable<Object, Object>();
		Dictionary<Object, Object> data = new Hashtable<Object, Object>();
		List<Object> dataList = new ArrayList<Object>();

		final String procedureCall = "{call Lecture(?,?,?,?,?,?,?)}";
		Connection connection = null;
		try {
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "updateLecture");
			callableSt.setString(2, lectureDetails.getLecture_Name());
			callableSt.setString(3, lectureDetails.getLecture_Description());
			callableSt.setInt(4, Integer.parseInt(lectureDetails.getLecture_Id()));
			callableSt.setInt(5, Integer.parseInt(lectureDetails.getUser_Id()));
			callableSt.setInt(6, Integer.parseInt(lectureDetails.getCourse_Id()));
			callableSt.setString(7, lectureDetails.getResource_Order());
			
			if(callableSt.execute())
			{
				ResultSet resultSet=callableSt.getResultSet();
				resultSet.next();
				
				if(resultSet.getInt("Status")==-1)
					errors.put("Message", "No Such User exists");
				else if(resultSet.getInt("Status")==-2)
					errors.put("Message", "No Such Course exists");
				else 
					errors.put("Message", "No Such Lecture exists in the Course");
					
				dataList.add(errors);
				output.setStatus(false);
				output.setError(dataList);
			}
			else{
				data.put("Message", "Lecture Updated Successfully");
				dataList.add(data);
				output.setData(dataList);
				output.setStatus(true);
			}
			connection.commit();
		} 
		catch (Exception e1) {
			errors.put("Message", "Error in Connecting to Database");
			dataList.add(errors);
			output.setStatus(false);
			output.setError(dataList);
			e1.printStackTrace();
		}
		return output;
	}

	@Override
	public Output deleteLecture(LectureDetails lectureDetails) {
		Output output = new Output();
		Dictionary<Object, Object> errors = new Hashtable<Object, Object>();
		Dictionary<Object, Object> data = new Hashtable<Object, Object>();
		List<Object> dataList = new ArrayList<Object>();

		final String procedureCall = "{call Lecture(?,?,?,?,?,?,?)}";
		Connection connection = null;
		try {
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "deleteLecture");
			callableSt.setString(2, null);
			callableSt.setString(3, null);
			callableSt.setInt(4, Integer.parseInt(lectureDetails.getLecture_Id()));
			callableSt.setInt(5, Integer.parseInt(lectureDetails.getUser_Id()));
			callableSt.setInt(6, Integer.parseInt(lectureDetails.getCourse_Id()));
			callableSt.setString(7, null);
			if(callableSt.execute())
			{
				ResultSet resultSet=callableSt.getResultSet();
				resultSet.next();
				
				if(resultSet.getInt("Status")==-1)
					errors.put("Message", "No Such User exists");
				else if(resultSet.getInt("Status")==-2)
					errors.put("Message", "No Such Course exists");
				else
					errors.put("Message", "No Such Lecture exists in the Course");
				
				dataList.add(errors);
				output.setStatus(false);
				output.setError(dataList);
			}
			else {
				data.put("Message", "Lecture Deleted Successfully");
				dataList.add(data);
				output.setData(dataList);
				output.setStatus(true);
			}
			connection.commit();
		} 
		catch (Exception e1) {
			errors.put("Message", "Error in Connecting to database");
			dataList.add(errors);
			output.setStatus(false);
			output.setError(dataList);
			e1.printStackTrace();
		}

		return output;
	}

	@Override
	public Output getLectures(LectureDetails lectureDetails) {
		Output output = new Output();
		Dictionary<Object, Object> errors = new Hashtable<Object, Object>();
		Dictionary<Object, Object> data = new Hashtable<Object, Object>();
		List<Object> dataList = new ArrayList<Object>();

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
			callableSt.setInt(5, Integer.parseInt(lectureDetails.getUser_Id()));
			callableSt.setInt(6, Integer.parseInt(lectureDetails.getCourse_Id()));
			callableSt.setString(7, null);
			ResultSet resultSet= callableSt.executeQuery();
			connection.commit();
			if(resultSet.next())
			{
				int status=resultSet.getInt("Status");
				if(status==1)
				{
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
						Lecture_Details.setCourse_Id(lectureDetails.getCourse_Id());
						dataList.add(Lecture_Details);
					}while(resultSet.next());
					
					output.setStatus(true);
					output.setData(dataList);
				}
				else 
				{
					if(status==-1)
						errors.put("Message", "No Such User exists");
					else
						errors.put("Message", "No Such Course exists");
					dataList.add(errors);
					output.setStatus(false);
					output.setError(dataList);
				}
			}
			else {
				errors.put("Message", "No Lectures Available in the Course");
				dataList.add(errors);
				output.setStatus(false);
				output.setError(dataList);
			}

		} catch (Exception e1) {
			errors.put("Message", "Error in Connecting to Database");
			dataList.add(errors);
			output.setStatus(false);
			output.setError(dataList);
			e1.printStackTrace();
		}
		return output;
	}
}
