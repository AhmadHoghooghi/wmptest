package ir.asta.wise.wmptest.dao;

import javax.inject.Named;
import org.springframework.stereotype.Repository;

/*PROTECTED REGION ID(EmployeeDAO Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.EmployeeEntity;

@Repository
@Named("employeeDao")
public class EmployeeDao
		extends
			ir.asta.wise.core.data.jpa.AbstractJpaDao<EmployeeEntity, java.lang.Long> {

	/*PROTECTED REGION ID(EmployeeDAO Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	/*PROTECTED REGION ID(EmployeeDAO Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
