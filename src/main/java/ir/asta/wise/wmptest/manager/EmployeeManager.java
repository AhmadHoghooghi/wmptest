package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(EmployeeManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.EmployeeEntity;
import ir.asta.wise.wmptest.dao.EmployeeDao;

@Named("employeeManager")
public class EmployeeManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<EmployeeEntity, java.lang.Long> {

	/*PROTECTED REGION ID(EmployeeManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public EmployeeManager(EmployeeDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private EmployeeDao getMyDao() {
		return (EmployeeDao) super.getDao();
	}

	/*PROTECTED REGION ID(EmployeeManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
