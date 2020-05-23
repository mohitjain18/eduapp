package in.co.codeplanet.Service;

import in.co.codeplanet.Model.ResourceDetails;
import in.co.codeplanet.Output.Output;

public interface ResourceService {

	Output addResource(ResourceDetails resourceDetails);

	Output updateResource(ResourceDetails resourceDetails);

	Output deleteResource(ResourceDetails resourceDetails);

		Output getResources(ResourceDetails resourceDetails);


}
