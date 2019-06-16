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

/*PROTECTED REGION ID(MessageTypeServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.MessageTypeEntity;
import ir.asta.wise.wmptest.service.MessageTypeService;
import ir.asta.wise.wmptest.manager.MessageTypeManager;

@Named("messageTypeService")
@MapperEnabled
public class MessageTypeServiceImpl
		extends
			AbstractCrudService<MessageTypeEntity, java.lang.Long>
		implements
			MessageTypeService {

	/*PROTECTED REGION ID(MessageTypeServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public MessageTypeServiceImpl(MessageTypeManager manager) {
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
	public MessageTypeEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "adaptiveTypeModel"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public MessageTypeEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(@Mapper(value = {"*",
			"adaptiveTypeModel"}) MessageTypeEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*"}, enrich = false)
	public DataPage<MessageTypeEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(MessageTypeServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
