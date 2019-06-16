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

/*PROTECTED REGION ID(EmployeeEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "TST_Employee")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", doNotUseGetters = true, callSuper = false)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class EmployeeEntity extends AbstractBaseEntity<java.lang.Long>
		implements
			Comparable<EmployeeEntity> {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(EmployeeEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// primary key
	@Id
	@Column(name = "TST_EMPLOYEE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Long id;

	// fields
	@Basic
	@Column(name = "FIRST_NAME", nullable = true, unique = false)
	@Suggestible
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.TEXT)
	private java.lang.String firstName;

	@Basic
	@Column(name = "LAST_NAME", nullable = true, unique = false)
	@Suggestible
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.TEXT)
	private java.lang.String lastName;

	@Basic
	@Column(name = "NATIONAL_CODE", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.Long nationalCode;

	@Basic
	@Column(name = "BIRTHDATE", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.RANGE, editorType = EditorType.DATE)
	private java.util.Date birthdate;

	@Basic
	@Column(name = "GENDER", nullable = true, unique = false)
	@Enumerated(EnumType.STRING)
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.COMBO)
	private ir.asta.wise.wmptest.entities.Gender gender;

	@Transient
	public String getGenderStr() {
		if (gender == null) {
			return null;
		}
		return gender.toString();
	}

	// many to one
	@ManyToOne(targetEntity = ir.asta.wise.wmptest.entities.CompanyEntity.class, optional = false, cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_FIRM", nullable = false)
	@RelationGenDirective(searchable = true, editorType = RelationEditorType.AUTO)
	private ir.asta.wise.wmptest.entities.CompanyEntity firm;

	// collections

	@OneToMany(targetEntity = ir.asta.wise.wmptest.entities.TaskEntity.class, mappedBy = "assignedTo", cascade = {})
	@RelationGenDirective(editorType = RelationEditorType.AUTO)
	private Set<ir.asta.wise.wmptest.entities.TaskEntity> jobs;

	public int compareTo(ir.asta.wise.wmptest.entities.EmployeeEntity obj) {
		if (obj.hashCode() > hashCode())
			return 1;
		else if (obj.hashCode() < hashCode())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return toString(getFirstName(), getLastName());
	}
	@Override
	@Transient
	protected String getToStringTemplate() {
		return "%s %s";
	}
	/**
	 * Don't remove this method
	 * This is related to some Lombok bugs!
	 */
	public java.lang.Long getId() {
		return id;
	}

	/**
	 * Don't remove this method
	 * This is related to some Lombok bugs!
	 */
	public void setId(java.lang.Long id) {
		this.id = id;
	}
	@Transient
	public java.lang.Long getPk() {
		return this.id;
	}
	public void setPk(java.lang.Long pk) {
		this.id = pk;
	}

	/*PROTECTED REGION ID(EmployeeEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
