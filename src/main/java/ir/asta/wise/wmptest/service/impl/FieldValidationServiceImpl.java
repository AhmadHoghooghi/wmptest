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

/*PROTECTED REGION ID(FieldValidationServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.FieldValidationEntity;
import ir.asta.wise.wmptest.service.FieldValidationService;
import ir.asta.wise.wmptest.manager.FieldValidationManager;

@Named("fieldValidationService")
@MapperEnabled
public class FieldValidationServiceImpl
		extends
			AbstractCrudService<FieldValidationEntity, java.lang.Long>
		implements
			FieldValidationService {

	/*PROTECTED REGION ID(FieldValidationServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public FieldValidationServiceImpl(FieldValidationManager manager) {
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
	public FieldValidationEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public FieldValidationEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(
			@Mapper(value = {"*"}) FieldValidationEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*"}, enrich = false)
	public DataPage<FieldValidationEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(FieldValidationServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
