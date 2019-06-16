package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(StudentManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.StudentEntity;
import ir.asta.wise.wmptest.dao.StudentDao;

@Named("studentManager")
public class StudentManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<StudentEntity, java.lang.Long> {

	/*PROTECTED REGION ID(StudentManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public StudentManager(StudentDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private StudentDao getMyDao() {
		return (StudentDao) super.getDao();
	}

	/*PROTECTED REGION ID(StudentManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
