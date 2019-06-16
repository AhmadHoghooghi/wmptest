package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(KitchenService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.KitchenEntity;

@Path("/kitchen/")
public interface KitchenService
		extends
			EntityRestService<KitchenEntity, java.lang.Long> {
	/*PROTECTED REGION ID(KitchenService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
