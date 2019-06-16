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

/*PROTECTED REGION ID(MessageEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "TST_MSG")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", doNotUseGetters = true, callSuper = false)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class MessageEntity extends AbstractBaseEntity<java.lang.Long>
		implements
			Comparable<MessageEntity>,
			ir.asta.wise.core.datamanagement.AdaptiveDataEntity {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(MessageEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// primary key
	@Id
	@Column(name = "TST_MSG_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Long id;

	// fields
	@Basic
	@Column(name = "SUBJECT_", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.String subject;

	@Basic
	@Column(name = "CONTENT", nullable = true, unique = false)
	@PropertyGenDirective(searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT)
	private java.lang.String content;

	@Basic
	@Column(name = "adaptive_data_xml", length = 10000)
	@Convert(converter = AdaptiveDataConverter.class)
	private DataModel adaptiveDataModel;

	@JsonDeserialize(using = ir.asta.wise.core.remoting.rs.DataModelDeserializer.class)
	public void setAdaptiveDataModel(DataModel adaptiveDataModel) {
		this.adaptiveDataModel = adaptiveDataModel;
	}

	// many to one
	@ManyToOne(targetEntity = ir.asta.wise.wmptest.entities.MessageTypeEntity.class, optional = false, cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_MESSAGEFORMAT", nullable = false)
	@RelationGenDirective(searchable = true, adaptiveType = true, editorType = RelationEditorType.COMBO)
	private ir.asta.wise.wmptest.entities.MessageTypeEntity messageFormat;

	public int compareTo(ir.asta.wise.wmptest.entities.MessageEntity obj) {
		if (obj.hashCode() > hashCode())
			return 1;
		else if (obj.hashCode() < hashCode())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return toString(getSubject());
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

	/*PROTECTED REGION ID(MessageEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
