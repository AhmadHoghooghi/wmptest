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

/*PROTECTED REGION ID(StudentServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.StudentEntity;
import ir.asta.wise.wmptest.service.StudentService;
import ir.asta.wise.wmptest.manager.StudentManager;

@Named("studentService")
@MapperEnabled
public class StudentServiceImpl
		extends
			AbstractCrudService<StudentEntity, java.lang.Long>
		implements
			StudentService {

	/*PROTECTED REGION ID(StudentServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public StudentServiceImpl(StudentManager manager) {
		super.setManager(manager);
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	@Include(url = "school/allOptions", responsePath = "options.school", enabled = "${param['options'] != 'false'}")
	public Map<String, Object> searchDefault() {
		return super.searchDefault();
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	@Include(url = "school/allOptions", responsePath = "options.school", enabled = "${param['options'] != 'false'}")
	public StudentEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "school.pk", "school.toStr"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	@Include(url = "school/allOptions", responsePath = "options.school", enabled = "${param['options'] != 'false'}")
	public StudentEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(@Mapper(value = {"*",
			"school.pk", "school.toStr"}) StudentEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.school.toStr"}, enrich = false)
	public DataPage<StudentEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(StudentServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
