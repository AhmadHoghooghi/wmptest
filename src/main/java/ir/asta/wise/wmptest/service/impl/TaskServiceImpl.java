package ir.asta.wise.wmptest.service.impl;
import java.util.Map;

import ir.asta.wise.core.crud.*;
import ir.asta.wise.core.datamanagement.*;
import ir.asta.wise.core.remoting.rs.Include;
import ir.asta.wise.core.remoting.rs.Includes;
import ir.asta.wise.core.util.beancopier.Mapper;
import ir.asta.wise.core.util.beancopier.MapperEnabled;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/*PROTECTED REGION ID(TaskServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.TaskEntity;
import ir.asta.wise.wmptest.service.TaskService;
import ir.asta.wise.wmptest.manager.TaskManager;

@Named("taskService")
@MapperEnabled
public class TaskServiceImpl
		extends
			AbstractCrudService<TaskEntity, java.lang.Long>
		implements
			TaskService {

	/*PROTECTED REGION ID(TaskServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public TaskServiceImpl(TaskManager manager) {
		super.setManager(manager);
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	public Map<String, Object> searchDefault() {
		return super.searchDefault();
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	public TaskEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "assignedTo.pk", "assignedTo.toStr"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public TaskEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(@Mapper(value = {"*",
			"assignedTo.pk"}) TaskEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.assignedTo.toStr"}, enrich = false)
	public DataPage<TaskEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(TaskServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
