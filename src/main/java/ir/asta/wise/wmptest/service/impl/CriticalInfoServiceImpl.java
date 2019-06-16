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

/*PROTECTED REGION ID(CriticalInfoServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.CriticalInfoEntity;
import ir.asta.wise.wmptest.service.CriticalInfoService;
import ir.asta.wise.wmptest.manager.CriticalInfoManager;

@Named("criticalInfoService")
@MapperEnabled
public class CriticalInfoServiceImpl
		extends
			AbstractCrudService<CriticalInfoEntity, java.lang.String>
		implements
			CriticalInfoService {

	/*PROTECTED REGION ID(CriticalInfoServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public CriticalInfoServiceImpl(CriticalInfoManager manager) {
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
	public CriticalInfoEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public CriticalInfoEntity load(java.lang.String id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.String> saveOrUpdate(
			@Mapper(value = {"*"}) CriticalInfoEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*"}, enrich = false)
	public DataPage<CriticalInfoEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(CriticalInfoServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
