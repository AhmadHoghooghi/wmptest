package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(MessageTypeManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.MessageTypeEntity;
import ir.asta.wise.wmptest.dao.MessageTypeDao;

@Named("messageTypeManager")
public class MessageTypeManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<MessageTypeEntity, java.lang.Long>
		implements
			ir.asta.wise.core.aom2.AdaptiveTypeRepository<java.lang.Long> {

	/*PROTECTED REGION ID(MessageTypeManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public MessageTypeManager(MessageTypeDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private MessageTypeDao getMyDao() {
		return (MessageTypeDao) super.getDao();
	}

	/*PROTECTED REGION ID(MessageTypeManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
