package in.co.codeplanet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.codeplanet.Dao.ResourceDao;
import in.co.codeplanet.Model.ResourceDetails;
import in.co.codeplanet.Output.Output;

@Service
public class ResourceServiceImpl implements ResourceService{
	@Autowired
	ResourceDao resourceDao;

	@Override
	public Output addResource(ResourceDetails resourceDetails) {
		return resourceDao.addResource(resourceDetails);
	}

	@Override
	public Output updateResource(ResourceDetails resourceDetails) {
		return resourceDao.updateResource(resourceDetails);
	}

	@Override
	public Output deleteResource(ResourceDetails resourceDetails) {
		return resourceDao.deleteResource(resourceDetails);
	}

	@Override
	public Output getResources(ResourceDetails resourceDetails) {
		return resourceDao.getResources(resourceDetails);
	}
	
}
