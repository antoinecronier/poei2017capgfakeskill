package com.tactfactory.capfakeskillspring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.tactfactory.capfakeskillspring.models.base.BaseEntity;

@Entity
@Table(
    name = "skilltype",
    uniqueConstraints=@UniqueConstraint(columnNames="name")
)
public class SkillType extends BaseEntity {

    @Column(length=150, unique=true)
    @NotNull
    @Length(min=3, max=150)
    private String name;

    public SkillType() {
    }
    public SkillType(String name) {
        this.setName(name);
    }
    public SkillType(Long id, String name) {
        super(id);
        this.setName(name);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
