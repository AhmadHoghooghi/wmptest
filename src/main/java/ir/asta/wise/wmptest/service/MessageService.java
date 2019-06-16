package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(MessageService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.MessageEntity;

@Path("/message/")
public interface MessageService
		extends
			EntityRestService<MessageEntity, java.lang.Long> {
	/*PROTECTED REGION ID(MessageService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
