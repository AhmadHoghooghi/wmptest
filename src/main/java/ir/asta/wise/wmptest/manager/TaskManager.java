package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(TaskManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.TaskEntity;
import ir.asta.wise.wmptest.dao.TaskDao;

@Named("taskManager")
public class TaskManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<TaskEntity, java.lang.Long> {

	/*PROTECTED REGION ID(TaskManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public TaskManager(TaskDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private TaskDao getMyDao() {
		return (TaskDao) super.getDao();
	}

	/*PROTECTED REGION ID(TaskManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
