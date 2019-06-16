package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(HomeService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.HomeEntity;

@Path("/home/")
public interface HomeService
		extends
			EntityRestService<HomeEntity, java.lang.Long> {
	/*PROTECTED REGION ID(HomeService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
