package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(CriticalInfoService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.CriticalInfoEntity;

@Path("/criticalInfo/")
public interface CriticalInfoService
		extends
			EntityRestService<CriticalInfoEntity, java.lang.String> {
	/*PROTECTED REGION ID(CriticalInfoService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
