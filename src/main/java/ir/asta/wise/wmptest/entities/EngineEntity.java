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

/*PROTECTED REGION ID(EngineEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "TST_Engine")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", doNotUseGetters = true, callSuper = false)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class EngineEntity extends AbstractBaseEntity<java.lang.Long>
		implements
			Comparable<EngineEntity> {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(EngineEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// primary key
	@Id
	@Column(name = "TST_ENGINE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Long id;

	// fields
	@Basic
	@Column(name = "SERIAL_", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.TEXT)
	private java.lang.String serial;

	@Basic
	@Column(name = "POWER", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.AUTO)
	private java.lang.Double power;

	@RelationGenDirective(oneToOne = true, editorType = RelationEditorType.SUGGEST)
	@OneToMany(mappedBy = "thrust")
	@JsonIgnore
	private Set<ir.asta.wise.wmptest.entities.CarEntity> containerList;

	public void setContainer(ir.asta.wise.wmptest.entities.CarEntity container) {
		if(container == null) return;
		if(this.containerList == null) this.containerList = new HashSet<>();
		this.containerList.clear();
		this.containerList.add(container);
	}
	public ir.asta.wise.wmptest.entities.CarEntity getContainer() {
		if (containerList == null)
			return null;
		Iterator<ir.asta.wise.wmptest.entities.CarEntity> itr = containerList
				.iterator();
		if (itr.hasNext()) {
			return itr.next();
		}
		return null;
	}

	public int compareTo(ir.asta.wise.wmptest.entities.EngineEntity obj) {
		if (obj.hashCode() > hashCode())
			return 1;
		else if (obj.hashCode() < hashCode())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return toString(getSerial());
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

	/*PROTECTED REGION ID(EngineEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
