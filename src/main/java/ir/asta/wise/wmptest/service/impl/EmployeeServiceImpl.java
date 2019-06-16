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

/*PROTECTED REGION ID(EmployeeServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.EmployeeEntity;
import ir.asta.wise.wmptest.service.EmployeeService;
import ir.asta.wise.wmptest.manager.EmployeeManager;

@Named("employeeService")
@MapperEnabled
public class EmployeeServiceImpl
		extends
			AbstractCrudService<EmployeeEntity, java.lang.Long>
		implements
			EmployeeService {

	/*PROTECTED REGION ID(EmployeeServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public EmployeeServiceImpl(EmployeeManager manager) {
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
	public EmployeeEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "firm.pk", "firm.toStr"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public EmployeeEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(@Mapper(value = {"*",
			"firm.pk"}) EmployeeEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.firm.toStr", "items.jobs.toStr"}, enrich = false)
	public DataPage<EmployeeEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(EmployeeServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
