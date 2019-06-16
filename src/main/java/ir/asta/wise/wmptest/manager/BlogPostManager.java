package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(BlogPostManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.BlogPostEntity;
import ir.asta.wise.wmptest.dao.BlogPostDao;

@Named("blogPostManager")
public class BlogPostManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<BlogPostEntity, java.lang.Long> {

	/*PROTECTED REGION ID(BlogPostManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public BlogPostManager(BlogPostDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private BlogPostDao getMyDao() {
		return (BlogPostDao) super.getDao();
	}

	/*PROTECTED REGION ID(BlogPostManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
