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
import in.co.codeplanet.Model.ResourceDetails;
import in.co.codeplanet.Output.Output;

@Repository
public class ResourceDaoImpl implements ResourceDao{
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Output addResource(ResourceDetails resourceDetails) {
		Output output = new Output();
		Dictionary<Object, Object> errors = new Hashtable<Object, Object>();
		Dictionary<Object, Object> data = new Hashtable<Object, Object>();
		List<Object> dataList = new ArrayList<Object>();

		final String procedureCall = "{call Resource(?,?,?,?,?,?,?,?,?,?,?)}";
		Connection connection = null;
		try {
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "addResource");
			callableSt.setInt(2, Integer.parseInt(resourceDetails.getUser_Id()));
			callableSt.setInt(3, Integer.parseInt(resourceDetails.getCourse_Id()));
			callableSt.setInt(4, Integer.parseInt(resourceDetails.getLecture_Id()));
			callableSt.setInt(5, 0);
			callableSt.setString(6, resourceDetails.getResource_Name());
			callableSt.setString(7, resourceDetails.getResource_Title());
			callableSt.setInt(8, Integer.parseInt(resourceDetails.getResource_Type_Id()));
			callableSt.setString(9, resourceDetails.getResource_Url());
			callableSt.setString(10, resourceDetails.getResource_Length());
			callableSt.setString(11, null);
			boolean isSelectQuery=callableSt.execute();
			connection.commit();
			
			if(isSelectQuery)
			{
				ResultSet resultSet=callableSt.getResultSet();
				resultSet.next();
				int status =resultSet.getInt("Status");
				if(status==-1)
					errors.put("Message", "No Such User Exists");
				else if(status==-2)
					errors.put("Message", "No Such Course Exists");
				else
					errors.put("Message", "No Such Lecture Exists In the Course");
				
				dataList.add(errors);
				output.setStatus(false);
				output.setError(dataList);
			}
			else
			{
				data.put("Message", "Resourse added Successfully...");
				dataList.add(data);
				output.setData(dataList);
				output.setStatus(true);
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

	@Override
	public Output updateResource(ResourceDetails resourceDetails) {
		Output output = new Output();
		Dictionary<Object, Object> errors = new Hashtable<Object, Object>();
		Dictionary<Object, Object> data = new Hashtable<Object, Object>();
		List<Object> dataList = new ArrayList<Object>();

		final String procedureCall = "{call Resource(?,?,?,?,?,?,?,?,?,?,?)}";
		Connection connection = null;
		try {
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "updateResource");
			callableSt.setInt(2, Integer.parseInt(resourceDetails.getUser_Id()));
			callableSt.setInt(3, Integer.parseInt(resourceDetails.getCourse_Id()));
			callableSt.setInt(4, Integer.parseInt(resourceDetails.getLecture_Id()));
			callableSt.setInt(5, Integer.parseInt(resourceDetails.getResource_Id()));
			callableSt.setString(6, resourceDetails.getResource_Name());
			callableSt.setString(7, null);
			callableSt.setInt(8, 0);
			callableSt.setString(9, null);
			callableSt.setString(10, null);
			callableSt.setString(11, null);
			
			boolean isSelectQuery = callableSt.execute();
			connection.commit();
			
			if(isSelectQuery)
			{
				ResultSet resultSet=callableSt.getResultSet();
				resultSet.next();
				int status =resultSet.getInt("Status");
				
				if(status==-1)
					errors.put("Message", "No Such User Exist");
				else if(status==-2)
					errors.put("Message", "No Such Course Exists");
				else
					errors.put("Message", "No Such Lecture Exists in Course");
				
				dataList.add(errors);
				output.setStatus(false);
				output.setError(dataList);
			}
			else
			{
				if(callableSt.getUpdateCount()>0)
				{
					data.put("Message", "Resourse Updated Successfully...");
					dataList.add(data);
					output.setData(dataList);
					output.setStatus(true);
				}
				else {
					errors.put("Message", "No Such Resource Exists in the Lecture");
					dataList.add(errors);
					output.setStatus(false);
					output.setError(dataList);
				}
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

	@Override
	public Output deleteResource(ResourceDetails resourceDetails) {
		Output output = new Output();
		Dictionary<Object, Object> errors = new Hashtable<Object, Object>();
		Dictionary<Object, Object> data = new Hashtable<Object, Object>();
		List<Object> dataList = new ArrayList<Object>();

		final String procedureCall = "{call Resource(?,?,?,?,?,?,?,?,?,?,?)}";
		Connection connection = null;
		try {
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "deleteResource");
			callableSt.setInt(2, Integer.parseInt(resourceDetails.getUser_Id()));
			callableSt.setInt(3, Integer.parseInt(resourceDetails.getCourse_Id()));
			callableSt.setInt(4, Integer.parseInt(resourceDetails.getLecture_Id()));
			callableSt.setInt(5, Integer.parseInt(resourceDetails.getResource_Id()));
			callableSt.setString(6, null);
			callableSt.setString(7, null);
			callableSt.setInt(8, 0);
			callableSt.setString(9, null);
			callableSt.setString(10, null);
			callableSt.setString(11, resourceDetails.getResource_Order());
			
			boolean isSelectQuery = callableSt.execute();
			connection.commit();
			
			if(isSelectQuery)
			{
				ResultSet resultSet=callableSt.getResultSet();
				resultSet.next();
				int status =resultSet.getInt("Status");
				
				if(status==-1)
					errors.put("Message", "No Such User Exist");
				else if(status==-2)
					errors.put("Message", "No Such Course Exists");
				else
					errors.put("Message", "No Such Lecture Exists in Course");
				
				dataList.add(errors);
				output.setStatus(false);
				output.setError(dataList);
			}
			else
			{
				if(callableSt.getUpdateCount()>0)
				{
					data.put("Message", "Resourse deleted Successfully...");
					dataList.add(data);
					output.setData(dataList);
					output.setStatus(true);
				}
				else {
					errors.put("Message", "No Such Resource Exists in Lecture Of Course");
					dataList.add(errors);
					output.setStatus(false);
					output.setError(dataList);
				}
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

	
	@Override
	public Output getResources(ResourceDetails resourceDetails) {
		Output output = new Output();
		Dictionary<Object, Object> errors = new Hashtable<Object, Object>();
		Dictionary<Object, Object> data = new Hashtable<Object, Object>();
		List<Object> dataList = new ArrayList<Object>();

		final String procedureCall = "{call Resource(?,?,?,?,?,?,?,?,?,?,?)}";
		Connection connection = null;
		try {
			connection = jdbcTemplate.getDataSource().getConnection();
			connection.setAutoCommit(false);
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "getResources");
			callableSt.setInt(2, Integer.parseInt(resourceDetails.getUser_Id()));
			callableSt.setInt(3, Integer.parseInt(resourceDetails.getCourse_Id()));
			callableSt.setInt(4, Integer.parseInt(resourceDetails.getLecture_Id()));
			callableSt.setInt(5, 0);
			callableSt.setString(6, null);
			callableSt.setString(7, null);
			callableSt.setInt(8, 0);
			callableSt.setString(9, null);
			callableSt.setString(10, null);
			callableSt.setString(11, null);
			
			ResultSet resultSet= callableSt.executeQuery();
			connection.commit();
			if(resultSet.next())
			{
				int status=resultSet.getInt("Status");
				if(status==1)
				{
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
						Resource_Details.setCourse_Id(resourceDetails.getCourse_Id());
						Resource_Details.setLecture_Id(resourceDetails.getLecture_Id());
						dataList.add(Resource_Details);
					}while(resultSet.next());
					
					output.setStatus(true);
					output.setData(dataList);
				}
				else 
				{
					if(status==-1)
						errors.put("Message", "No Such User exists");
					else if(status==-2)
						errors.put("Message", "No Such Course exists");
					else
						errors.put("Message", "No Such Lecture Exists in the course");
					dataList.add(errors);
					output.setStatus(false);
					output.setError(dataList);
				}
			}
			else {
				errors.put("Message", "No Resources Available in the Lecture");
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
