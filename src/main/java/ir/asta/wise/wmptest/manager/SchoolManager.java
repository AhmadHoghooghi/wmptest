package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(SchoolManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.SchoolEntity;
import ir.asta.wise.wmptest.dao.SchoolDao;

@Named("schoolManager")
public class SchoolManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<SchoolEntity, java.lang.Long> {

	/*PROTECTED REGION ID(SchoolManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public SchoolManager(SchoolDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private SchoolDao getMyDao() {
		return (SchoolDao) super.getDao();
	}

	/*PROTECTED REGION ID(SchoolManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
