package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(StudentService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.StudentEntity;

@Path("/student/")
public interface StudentService
		extends
			EntityRestService<StudentEntity, java.lang.Long> {
	/*PROTECTED REGION ID(StudentService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
