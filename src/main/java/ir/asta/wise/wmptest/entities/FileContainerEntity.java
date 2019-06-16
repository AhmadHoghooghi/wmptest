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

/*PROTECTED REGION ID(FileContainerEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "TST_filecontainer")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", doNotUseGetters = true, callSuper = false)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class FileContainerEntity extends AbstractBaseEntity<java.lang.Long>
		implements
			Comparable<FileContainerEntity> {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(FileContainerEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// primary key
	@Id
	@Column(name = "TST_FILECONTAINER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Long id;

	// fields
	@Basic
	@Column(name = "FILE_", nullable = true, unique = false)
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "fileName", column = @Column(name = "file_FileName")),
			@AttributeOverride(name = "contentType", column = @Column(name = "file_ContentType")),
			@AttributeOverride(name = "content", column = @Column(name = "file_Content"))})
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.FILE)
	private ir.asta.wise.core.datamanagement.FileComponent file;

	public int compareTo(ir.asta.wise.wmptest.entities.FileContainerEntity obj) {
		if (obj.hashCode() > hashCode())
			return 1;
		else if (obj.hashCode() < hashCode())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		// TODO toString method of ir.asta.wise.wmptest.entities.FileContainerEntity
		return super.toString();
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

	/*PROTECTED REGION ID(FileContainerEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
