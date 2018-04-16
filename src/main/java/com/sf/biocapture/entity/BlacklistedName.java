package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.sf.biocapture.entity.base.BaseEntityPK;


@Audited
@Entity
@Table(name="blacklisted_name")
public class BlacklistedName extends BaseEntityPK{

	private static final long serialVersionUID = 6699275784656763035L;
	
	@Column(name = "NAME_", nullable = false, unique = true)
    private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
