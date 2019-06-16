package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(FieldValidationManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.FieldValidationEntity;
import ir.asta.wise.wmptest.dao.FieldValidationDao;

@Named("fieldValidationManager")
public class FieldValidationManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<FieldValidationEntity, java.lang.Long> {

	/*PROTECTED REGION ID(FieldValidationManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public FieldValidationManager(FieldValidationDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private FieldValidationDao getMyDao() {
		return (FieldValidationDao) super.getDao();
	}

	/*PROTECTED REGION ID(FieldValidationManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
