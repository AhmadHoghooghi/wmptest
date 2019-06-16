package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(CriticalInfoManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.CriticalInfoEntity;
import ir.asta.wise.wmptest.dao.CriticalInfoDao;

@Named("criticalInfoManager")
public class CriticalInfoManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<CriticalInfoEntity, java.lang.String> {

	/*PROTECTED REGION ID(CriticalInfoManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public CriticalInfoManager(CriticalInfoDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private CriticalInfoDao getMyDao() {
		return (CriticalInfoDao) super.getDao();
	}

	/*PROTECTED REGION ID(CriticalInfoManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
