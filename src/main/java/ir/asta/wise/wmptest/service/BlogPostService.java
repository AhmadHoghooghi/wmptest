package ir.asta.wise.wmptest.service;
import ir.asta.wise.core.datamanagement.EntityRestService;
import javax.ws.rs.Path;

/*PROTECTED REGION ID(BlogPostService Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.BlogPostEntity;

@Path("/blogPost/")
public interface BlogPostService
		extends
			EntityRestService<BlogPostEntity, java.lang.Long> {
	/*PROTECTED REGION ID(BlogPostService Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
