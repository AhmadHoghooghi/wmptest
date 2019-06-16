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

/*PROTECTED REGION ID(MessageServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.MessageEntity;
import ir.asta.wise.wmptest.service.MessageService;
import ir.asta.wise.wmptest.manager.MessageManager;

@Named("messageService")
@MapperEnabled
public class MessageServiceImpl
		extends
			AbstractCrudService<MessageEntity, java.lang.Long>
		implements
			MessageService {

	/*PROTECTED REGION ID(MessageServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public MessageServiceImpl(MessageManager manager) {
		super.setManager(manager);
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	@Include(url = "messageType/allOptions", responsePath = "options.messageFormat", enabled = "${param['options'] != 'false'}")
	public Map<String, Object> searchDefault() {
		return super.searchDefault();
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	@Include(url = "messageType/allOptions", responsePath = "options.messageFormat", enabled = "${param['options'] != 'false'}")
	public MessageEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "messageFormat.pk", "messageFormat.toStr",
			"adaptiveDataModel"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	@Include(url = "messageType/allOptions", responsePath = "options.messageFormat", enabled = "${param['options'] != 'false'}")
	public MessageEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(
			@Mapper(value = {"*", "messageFormat.pk", "messageFormat.toStr",
					"adaptiveDataModel"}, exclude = {"adaptiveDataXML"}) MessageEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.messageFormat.toStr"}, enrich = false)
	public DataPage<MessageEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(MessageServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
