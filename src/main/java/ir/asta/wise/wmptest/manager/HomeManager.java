package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(HomeManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.HomeEntity;
import ir.asta.wise.wmptest.dao.HomeDao;

@Named("homeManager")
public class HomeManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<HomeEntity, java.lang.Long> {

	/*PROTECTED REGION ID(HomeManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public HomeManager(HomeDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private HomeDao getMyDao() {
		return (HomeDao) super.getDao();
	}

	/*PROTECTED REGION ID(HomeManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
