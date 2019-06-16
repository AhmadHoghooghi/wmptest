package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(EngineService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.EngineEntity;

@Path("/engine/")
public interface EngineService
		extends
			EntityRestService<EngineEntity, java.lang.Long> {
	/*PROTECTED REGION ID(EngineService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
