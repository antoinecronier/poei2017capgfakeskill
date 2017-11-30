package com.tactfactory.capfakeskillspring.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tactfactory.capfakeskillspring.managers.interfaces.base.IBaseManager;
import com.tactfactory.capfakeskillspring.models.SkillType;

@RestController
public class SkillTypeApiController {

    @Autowired
    private IBaseManager<SkillType> manager;

    @RequestMapping("/skill/type/bidon")
    public SkillType bidon() {
        return new SkillType(1, "bidon");
    }

    @RequestMapping("/skill_types/")
    public List<SkillType> getAll() {
        return this.manager.getAll();
    }

    @RequestMapping("/skill_types/{id}")
    public SkillType get(@PathVariable Integer id) {
        return this.manager.getById(id);
    }

    @RequestMapping("/skill_types/fill")
    public List<SkillType> fill() {
        for (String name : Arrays.asList("Soft", "Technical", "Super", "Mega", "Ultra")) {
            SkillType type = new SkillType(name);
            this.manager.create(type);
        }

        return this.getAll();
    }
}















