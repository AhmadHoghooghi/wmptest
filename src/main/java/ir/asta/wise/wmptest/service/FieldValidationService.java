package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(FieldValidationService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.FieldValidationEntity;

@Path("/fieldValidation/")
public interface FieldValidationService
		extends
			EntityRestService<FieldValidationEntity, java.lang.Long> {
	/*PROTECTED REGION ID(FieldValidationService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
