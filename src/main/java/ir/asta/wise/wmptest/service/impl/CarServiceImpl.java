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

/*PROTECTED REGION ID(CarServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.CarEntity;
import ir.asta.wise.wmptest.service.CarService;
import ir.asta.wise.wmptest.manager.CarManager;

@Named("carService")
@MapperEnabled
public class CarServiceImpl
		extends
			AbstractCrudService<CarEntity, java.lang.Long>
		implements
			CarService {

	/*PROTECTED REGION ID(CarServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public CarServiceImpl(CarManager manager) {
		super.setManager(manager);
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	@Include(url = "engine/allOptions", responsePath = "options.thrust", enabled = "${param['options'] != 'false'}")
	public Map<String, Object> searchDefault() {
		return super.searchDefault();
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	@Include(url = "engine/allOptions", responsePath = "options.thrust", enabled = "${param['options'] != 'false'}")
	public CarEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "thrust.pk", "thrust.toStr"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	@Include(url = "engine/allOptions", responsePath = "options.thrust", enabled = "${param['options'] != 'false'}")
	public CarEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(@Mapper(value = {"*",
			"thrust.pk", "thrust.toStr"}) CarEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.thrust.toStr"}, enrich = false)
	public DataPage<CarEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(CarServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
