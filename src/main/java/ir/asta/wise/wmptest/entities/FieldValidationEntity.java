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

/*PROTECTED REGION ID(FieldValidationEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "TST_Validations")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", doNotUseGetters = true, callSuper = false)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class FieldValidationEntity extends AbstractBaseEntity<java.lang.Long>
		implements
			Comparable<FieldValidationEntity> {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(FieldValidationEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// primary key
	@Id
	@Column(name = "TST_VALIDATIONS_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Long id;

	// fields
	@Basic
	@Column(name = "TITLE", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.String title;

	@Basic
	@Column(name = "LENGTH_FIELD", nullable = true, unique = false)
	@Size(min = 5, max = 10)
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.String lengthField;

	@Basic
	@Column(name = "EMAIL", nullable = true, unique = false)
	@Email
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.String email;

	@Basic
	@Column(name = "NON_NUM_FIELD", nullable = true, unique = false)
	@NonNumeric
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.String nonNumField;

	@Basic
	@Column(name = "PATTERN_FIELD", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.String patternField;

	@Basic
	@Column(name = "MINMAX_FILED", nullable = true, unique = false)
	@Min(5)
	@Max(10)
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.AUTO)
	private java.lang.Long minmaxFiled;

	@Basic
	@Column(name = "DOUBLE_FIELD", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.AUTO)
	private java.lang.Double doubleField;

	public int compareTo(ir.asta.wise.wmptest.entities.FieldValidationEntity obj) {
		if (obj.hashCode() > hashCode())
			return 1;
		else if (obj.hashCode() < hashCode())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return toString(getTitle());
	}
	@Override
	@Transient
	protected String getToStringTemplate() {
		return "%s";
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

	/*PROTECTED REGION ID(FieldValidationEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
