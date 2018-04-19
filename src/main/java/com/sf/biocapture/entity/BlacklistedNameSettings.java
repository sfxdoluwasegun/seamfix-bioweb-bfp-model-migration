package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.sf.biocapture.entity.base.BaseEntityPK;


/**
 * @author DAWUZI
 *
 */

@Audited
@Entity
@Table(name="blacklisted_name_settings")
public class BlacklistedNameSettings extends BaseEntityPK {

	private static final long serialVersionUID = -713793090572804405L;

	@Column(nullable = true)
	private String description ;
	
	@Column(name = "name_", nullable = false, unique = true)
	private String name ;
	
	@Column(nullable = false)
	private String value ;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
