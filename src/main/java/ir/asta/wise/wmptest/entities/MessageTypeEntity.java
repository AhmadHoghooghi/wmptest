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

/*PROTECTED REGION ID(MessageTypeEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "TST_MSG_Type")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", doNotUseGetters = true, callSuper = false)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class MessageTypeEntity extends AbstractBaseEntity<java.lang.Long>
		implements
			Comparable<MessageTypeEntity>,
			ir.asta.wise.core.datamanagement.AdaptiveTypeEntity {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(MessageTypeEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// primary key
	@Id
	@Column(name = "TST_MSG_TYPE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Long id;

	// fields
	@Basic
	@Column(name = "TITLE", nullable = true, unique = false)
	@Suggestible
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.String title;

	@Basic
	@Column(name = "ADAPTIVE_TYPE_XML", length = 10000)
	@Convert(converter = AdaptiveTypeConverter.class)
	private DataModel adaptiveTypeModel;

	@JsonDeserialize(using = ir.asta.wise.core.remoting.rs.DataModelDeserializer.class)
	public void setAdaptiveTypeModel(DataModel adaptiveTypeModel) {
		this.adaptiveTypeModel = adaptiveTypeModel;
	}

	// collections

	@OneToMany(targetEntity = ir.asta.wise.wmptest.entities.MessageEntity.class, mappedBy = "messageFormat", cascade = {})
	@RelationGenDirective(viewable = false, listable = false, editorType = RelationEditorType.AUTO)
	private Set<ir.asta.wise.wmptest.entities.MessageEntity> message;

	public int compareTo(ir.asta.wise.wmptest.entities.MessageTypeEntity obj) {
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

	/*PROTECTED REGION ID(MessageTypeEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
