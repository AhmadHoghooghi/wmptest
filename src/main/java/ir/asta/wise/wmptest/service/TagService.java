package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(TagService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.TagEntity;

@Path("/tag/")
public interface TagService
		extends
			EntityRestService<TagEntity, java.lang.Long> {
	/*PROTECTED REGION ID(TagService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
