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

/*PROTECTED REGION ID(StringIdentifierServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.StringIdentifierEntity;
import ir.asta.wise.wmptest.service.StringIdentifierService;
import ir.asta.wise.wmptest.manager.StringIdentifierManager;

@Named("stringIdentifierService")
@MapperEnabled
public class StringIdentifierServiceImpl
		extends
			AbstractCrudService<StringIdentifierEntity, java.lang.String>
		implements
			StringIdentifierService {

	/*PROTECTED REGION ID(StringIdentifierServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public StringIdentifierServiceImpl(StringIdentifierManager manager) {
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
	public StringIdentifierEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public StringIdentifierEntity load(java.lang.String id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.String> saveOrUpdate(
			@Mapper(value = {"*"}) StringIdentifierEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*"}, enrich = false)
	public DataPage<StringIdentifierEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(StringIdentifierServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
