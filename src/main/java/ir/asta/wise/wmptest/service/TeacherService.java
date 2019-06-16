package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(TeacherService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.TeacherEntity;

@Path("/teacher/")
public interface TeacherService
		extends
			EntityRestService<TeacherEntity, java.lang.Long> {
	/*PROTECTED REGION ID(TeacherService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
