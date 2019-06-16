package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(SchoolService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.SchoolEntity;

@Path("/school/")
public interface SchoolService
		extends
			EntityRestService<SchoolEntity, java.lang.Long> {
	/*PROTECTED REGION ID(SchoolService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
