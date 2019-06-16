package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(MessageManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.MessageEntity;
import ir.asta.wise.wmptest.dao.MessageDao;

@Named("messageManager")
public class MessageManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<MessageEntity, java.lang.Long> {

	/*PROTECTED REGION ID(MessageManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public MessageManager(MessageDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private MessageDao getMyDao() {
		return (MessageDao) super.getDao();
	}

	/*PROTECTED REGION ID(MessageManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
