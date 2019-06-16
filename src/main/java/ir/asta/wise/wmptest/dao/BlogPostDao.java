package ir.asta.wise.wmptest.dao;

import javax.inject.Named;
import org.springframework.stereotype.Repository;

/*PROTECTED REGION ID(BlogPostDAO Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.BlogPostEntity;

@Repository
@Named("blogPostDao")
public class BlogPostDao
		extends
			ir.asta.wise.core.data.jpa.AbstractJpaDao<BlogPostEntity, java.lang.Long> {

	/*PROTECTED REGION ID(BlogPostDAO Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	/*PROTECTED REGION ID(BlogPostDAO Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
