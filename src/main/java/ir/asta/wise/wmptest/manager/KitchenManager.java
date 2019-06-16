package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(KitchenManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.KitchenEntity;
import ir.asta.wise.wmptest.dao.KitchenDao;

@Named("kitchenManager")
public class KitchenManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<KitchenEntity, java.lang.Long> {

	/*PROTECTED REGION ID(KitchenManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public KitchenManager(KitchenDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private KitchenDao getMyDao() {
		return (KitchenDao) super.getDao();
	}

	/*PROTECTED REGION ID(KitchenManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
