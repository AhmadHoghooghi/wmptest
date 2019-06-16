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

/*PROTECTED REGION ID(BlogPostEntity : Imports) ENABLED START*/

/*PROTECTED REGION END*/

@Entity
@Table(name = "TST_BlogPost")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id", doNotUseGetters = true, callSuper = false)
@EntityGenDirective(menuParent = "root", securityParent = "root")
public class BlogPostEntity extends AbstractBaseEntity<java.lang.Long>
		implements
			Comparable<BlogPostEntity> {
	private static final long serialVersionUID = 1L;

	/*PROTECTED REGION ID(BlogPostEntity Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	// primary key
	@Id
	@Column(name = "TST_BLOGPOST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Long id;

	// fields
	@Basic
	@Column(name = "TITLE", nullable = true, unique = false)
	@Suggestible
	@PropertyGenDirective(searchMethod = SearchMethod.EQUAL, editorType = EditorType.TEXT)
	private java.lang.String title;

	@Basic
	@Column(name = "CONTENT", nullable = true, unique = false)
	@PropertyGenDirective(listable = false, searchMethod = SearchMethod.LIKE, editorType = EditorType.TEXT_AREA)
	private java.lang.String content;

	// collections

	@ManyToMany(targetEntity = ir.asta.wise.wmptest.entities.TagEntity.class, cascade = {})
	@JoinTable(name = "TST_POST_TAG", joinColumns = {@JoinColumn(name = "POSTID")}, inverseJoinColumns = {@JoinColumn(name = "TAGID")})
	@RelationGenDirective(editorType = RelationEditorType.SUGGEST)
	private Set<ir.asta.wise.wmptest.entities.TagEntity> label;

	public int compareTo(ir.asta.wise.wmptest.entities.BlogPostEntity obj) {
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

	/*PROTECTED REGION ID(BlogPostEntity Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
