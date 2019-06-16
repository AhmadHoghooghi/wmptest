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

/*PROTECTED REGION ID(TeacherServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.TeacherEntity;
import ir.asta.wise.wmptest.service.TeacherService;
import ir.asta.wise.wmptest.manager.TeacherManager;

@Named("teacherService")
@MapperEnabled
public class TeacherServiceImpl
		extends
			AbstractCrudService<TeacherEntity, java.lang.Long>
		implements
			TeacherService {

	/*PROTECTED REGION ID(TeacherServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public TeacherServiceImpl(TeacherManager manager) {
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
	public TeacherEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "firm.pk", "firm.toStr"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public TeacherEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(@Mapper(value = {"*",
			"firm.pk"}) TeacherEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.firm.toStr", "items.jobs.toStr"}, enrich = false)
	public DataPage<TeacherEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(TeacherServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
