package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(EngineManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.EngineEntity;
import ir.asta.wise.wmptest.dao.EngineDao;

@Named("engineManager")
public class EngineManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<EngineEntity, java.lang.Long> {

	/*PROTECTED REGION ID(EngineManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public EngineManager(EngineDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private EngineDao getMyDao() {
		return (EngineDao) super.getDao();
	}

	/*PROTECTED REGION ID(EngineManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
