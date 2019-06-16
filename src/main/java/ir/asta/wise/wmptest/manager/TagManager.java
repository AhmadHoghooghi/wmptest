package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(TagManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.TagEntity;
import ir.asta.wise.wmptest.dao.TagDao;

@Named("tagManager")
public class TagManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<TagEntity, java.lang.Long> {

	/*PROTECTED REGION ID(TagManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public TagManager(TagDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private TagDao getMyDao() {
		return (TagDao) super.getDao();
	}

	/*PROTECTED REGION ID(TagManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
