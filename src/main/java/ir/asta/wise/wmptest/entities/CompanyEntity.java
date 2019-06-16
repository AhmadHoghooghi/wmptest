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

/*PROTECTED REGION ID(CompanyEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "TST_Company")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", doNotUseGetters = true, callSuper = false)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class CompanyEntity extends AbstractBaseEntity<java.lang.Long>
		implements
			Comparable<CompanyEntity> {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(CompanyEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// primary key
	@Id
	@Column(name = "TST_COMPANY_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Long id;

	// fields
	@Basic
	@Column(name = "TITLE", nullable = true, unique = false)
	@Suggestible
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.String title;

	// collections

	@OneToMany(targetEntity = ir.asta.wise.wmptest.entities.EmployeeEntity.class, mappedBy = "firm", cascade = {})
	@RelationGenDirective(editorType = RelationEditorType.AUTO)
	private Set<ir.asta.wise.wmptest.entities.EmployeeEntity> humanResources;

	public int compareTo(ir.asta.wise.wmptest.entities.CompanyEntity obj) {
		if (obj.hashCode() > hashCode())
			return 1;
		else if (obj.hashCode() < hashCode())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		// TODO toString method of ir.asta.wise.wmptest.entities.CompanyEntity
		return super.toString();
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

	/*PROTECTED REGION ID(CompanyEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
