package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(TeacherManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.TeacherEntity;
import ir.asta.wise.wmptest.dao.TeacherDao;

@Named("teacherManager")
public class TeacherManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<TeacherEntity, java.lang.Long> {

	/*PROTECTED REGION ID(TeacherManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public TeacherManager(TeacherDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private TeacherDao getMyDao() {
		return (TeacherDao) super.getDao();
	}

	/*PROTECTED REGION ID(TeacherManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
