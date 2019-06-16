package ir.asta.wise.wmptest.entities;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import ir.asta.wise.core.validation.constraints.*;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import org.hibernate.envers.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.gfaces.facelet.DataModel;
import ir.asta.wise.core.data.annotation.*;
import ir.asta.wise.core.datamanagement.*;
import ir.asta.wise.core.data.jpa.*;

import lombok.*;

/*PROTECTED REGION ID(TeacherEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "TST_teacher")
@Data
@Builder(builderMethodName = "buildTeacherEntity")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class TeacherEntity extends ir.asta.wise.wmptest.entities.EmployeeEntity {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(TeacherEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// fields
	@Basic
	@Column(name = "GRADE", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.AUTO)
	private java.lang.Long grade;

	public int compareTo(ir.asta.wise.wmptest.entities.TeacherEntity obj) {
		if (obj.hashCode() > hashCode())
			return 1;
		else if (obj.hashCode() < hashCode())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		// TODO toString method of ir.asta.wise.wmptest.entities.TeacherEntity
		return super.toString();
	}

	/*PROTECTED REGION ID(TeacherEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
