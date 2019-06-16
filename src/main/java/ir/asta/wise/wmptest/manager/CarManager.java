package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(CarManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.CarEntity;
import ir.asta.wise.wmptest.dao.CarDao;

@Named("carManager")
public class CarManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<CarEntity, java.lang.Long> {

	/*PROTECTED REGION ID(CarManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public CarManager(CarDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private CarDao getMyDao() {
		return (CarDao) super.getDao();
	}

	/*PROTECTED REGION ID(CarManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
