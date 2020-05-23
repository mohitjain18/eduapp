package in.co.codeplanet.Dao;

import in.co.codeplanet.Model.ResourceDetails;
import in.co.codeplanet.Output.Output;

public interface ResourceDao {

	Output addResource(ResourceDetails resourceDetails);

	Output updateResource(ResourceDetails resourceDetails);

	Output deleteResource(ResourceDetails resourceDetails);

	Output getResources(ResourceDetails resourceDetails);

}
