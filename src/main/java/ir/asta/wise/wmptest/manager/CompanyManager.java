package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(CompanyManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.CompanyEntity;
import ir.asta.wise.wmptest.dao.CompanyDao;

@Named("companyManager")
public class CompanyManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<CompanyEntity, java.lang.Long> {

	/*PROTECTED REGION ID(CompanyManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public CompanyManager(CompanyDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private CompanyDao getMyDao() {
		return (CompanyDao) super.getDao();
	}

	/*PROTECTED REGION ID(CompanyManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
