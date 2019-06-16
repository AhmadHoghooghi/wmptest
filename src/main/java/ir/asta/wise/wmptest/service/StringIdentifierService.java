package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(StringIdentifierService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.StringIdentifierEntity;

@Path("/stringIdentifier/")
public interface StringIdentifierService
		extends
			EntityRestService<StringIdentifierEntity, java.lang.String> {
	/*PROTECTED REGION ID(StringIdentifierService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
