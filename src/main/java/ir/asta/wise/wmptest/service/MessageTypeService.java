package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(MessageTypeService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.MessageTypeEntity;

@Path("/messageType/")
public interface MessageTypeService
		extends
			EntityRestService<MessageTypeEntity, java.lang.Long> {
	/*PROTECTED REGION ID(MessageTypeService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
