package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(EmployeeService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.EmployeeEntity;

@Path("/employee/")
public interface EmployeeService
		extends
			EntityRestService<EmployeeEntity, java.lang.Long> {
	/*PROTECTED REGION ID(EmployeeService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
