package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(CompanyService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.CompanyEntity;

@Path("/company/")
public interface CompanyService
		extends
			EntityRestService<CompanyEntity, java.lang.Long> {
	/*PROTECTED REGION ID(CompanyService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
