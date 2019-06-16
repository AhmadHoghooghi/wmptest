package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(TaskService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.TaskEntity;

@Path("/task/")
public interface TaskService
		extends
			EntityRestService<TaskEntity, java.lang.Long> {
	/*PROTECTED REGION ID(TaskService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
