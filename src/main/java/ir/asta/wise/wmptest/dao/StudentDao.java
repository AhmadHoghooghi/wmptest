package ir.asta.wise.wmptest.dao;

import javax.inject.Named;
import org.springframework.stereotype.Repository;

/*PROTECTED REGION ID(StudentDAO Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.StudentEntity;

@Repository
@Named("studentDao")
public class StudentDao
		extends
			ir.asta.wise.core.data.jpa.AbstractJpaDao<StudentEntity, java.lang.Long> {

	/*PROTECTED REGION ID(StudentDAO Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	/*PROTECTED REGION ID(StudentDAO Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
