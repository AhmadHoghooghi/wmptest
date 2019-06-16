package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(StringIdentifierManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.StringIdentifierEntity;
import ir.asta.wise.wmptest.dao.StringIdentifierDao;

@Named("stringIdentifierManager")
public class StringIdentifierManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<StringIdentifierEntity, java.lang.String> {

	/*PROTECTED REGION ID(StringIdentifierManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public StringIdentifierManager(StringIdentifierDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private StringIdentifierDao getMyDao() {
		return (StringIdentifierDao) super.getDao();
	}

	/*PROTECTED REGION ID(StringIdentifierManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
