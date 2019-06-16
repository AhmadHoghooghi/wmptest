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

/*PROTECTED REGION ID(KitchenServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.KitchenEntity;
import ir.asta.wise.wmptest.service.KitchenService;
import ir.asta.wise.wmptest.manager.KitchenManager;

@Named("kitchenService")
@MapperEnabled
public class KitchenServiceImpl
		extends
			AbstractCrudService<KitchenEntity, java.lang.Long>
		implements
			KitchenService {

	/*PROTECTED REGION ID(KitchenServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public KitchenServiceImpl(KitchenManager manager) {
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
	public KitchenEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "home.pk", "home.toStr"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public KitchenEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(@Mapper(value = {"*",
			"home.pk"}) KitchenEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.home.toStr"}, enrich = false)
	public DataPage<KitchenEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(KitchenServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
