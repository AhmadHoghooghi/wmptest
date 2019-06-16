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

/*PROTECTED REGION ID(CarEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "TST_CAR")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", doNotUseGetters = true, callSuper = false)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class CarEntity extends AbstractBaseEntity<java.lang.Long>
		implements
			Comparable<CarEntity> {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(CarEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// primary key
	@Id
	@Column(name = "TST_CAR_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Long id;

	// fields
	@Basic
	@Column(name = "BRAND", nullable = true, unique = false)
	@Suggestible
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.TEXT)
	private java.lang.String brand;

	@Basic
	@Column(name = "MODEL", nullable = true, unique = false)
	@Suggestible
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.TEXT)
	private java.lang.String model;

	@Basic
	@Column(name = "BODY_SERIAL", nullable = true, unique = false)
	@Suggestible
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.TEXT)
	private java.lang.String bodySerial;

	@RelationGenDirective(oneToOne = true, editorType = RelationEditorType.COMBO)
	@ManyToOne
	@JoinColumn(name = "FK_THRUST", nullable = true, unique = true)
	private ir.asta.wise.wmptest.entities.EngineEntity thrust;

	public int compareTo(ir.asta.wise.wmptest.entities.CarEntity obj) {
		if (obj.hashCode() > hashCode())
			return 1;
		else if (obj.hashCode() < hashCode())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return toString(getBrand(), getModel());
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

	/*PROTECTED REGION ID(CarEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
