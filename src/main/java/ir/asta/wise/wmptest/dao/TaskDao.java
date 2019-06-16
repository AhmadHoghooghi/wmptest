package ir.asta.wise.wmptest.dao;

import javax.inject.Named;
import org.springframework.stereotype.Repository;

/*PROTECTED REGION ID(TaskDAO Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.TaskEntity;

@Repository
@Named("taskDao")
public class TaskDao
		extends
			ir.asta.wise.core.data.jpa.AbstractJpaDao<TaskEntity, java.lang.Long> {

	/*PROTECTED REGION ID(TaskDAO Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	/*PROTECTED REGION ID(TaskDAO Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
