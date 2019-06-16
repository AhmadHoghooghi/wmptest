package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(FileContainerService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.FileContainerEntity;

@Path("/fileContainer/")
public interface FileContainerService
		extends
			EntityRestService<FileContainerEntity, java.lang.Long> {
	/*PROTECTED REGION ID(FileContainerService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
