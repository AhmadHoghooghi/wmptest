package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(CarService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.CarEntity;

@Path("/car/")
public interface CarService
		extends
			EntityRestService<CarEntity, java.lang.Long> {
	/*PROTECTED REGION ID(CarService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
