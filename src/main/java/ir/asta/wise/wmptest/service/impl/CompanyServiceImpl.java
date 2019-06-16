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

/*PROTECTED REGION ID(CompanyServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.CompanyEntity;
import ir.asta.wise.wmptest.service.CompanyService;
import ir.asta.wise.wmptest.manager.CompanyManager;

@Named("companyService")
@MapperEnabled
public class CompanyServiceImpl
		extends
			AbstractCrudService<CompanyEntity, java.lang.Long>
		implements
			CompanyService {

	/*PROTECTED REGION ID(CompanyServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public CompanyServiceImpl(CompanyManager manager) {
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
	public CompanyEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public CompanyEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(
			@Mapper(value = {"*"}) CompanyEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.humanResources.toStr"}, enrich = false)
	public DataPage<CompanyEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(CompanyServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
