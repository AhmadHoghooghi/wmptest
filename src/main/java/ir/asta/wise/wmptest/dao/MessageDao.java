package ir.asta.wise.wmptest.dao;

import javax.inject.Named;
import org.springframework.stereotype.Repository;

/*PROTECTED REGION ID(MessageDAO Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.MessageEntity;

@Repository
@Named("messageDao")
public class MessageDao
		extends
			ir.asta.wise.core.data.jpa.AbstractJpaDao<MessageEntity, java.lang.Long> {

	/*PROTECTED REGION ID(MessageDAO Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	/*PROTECTED REGION ID(MessageDAO Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
