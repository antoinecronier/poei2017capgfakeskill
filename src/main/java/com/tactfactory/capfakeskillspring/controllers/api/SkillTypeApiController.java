package com.tactfactory.capfakeskillspring.controllers.api;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tactfactory.capfakeskillspring.managers.interfaces.base.IBaseManager;
import com.tactfactory.capfakeskillspring.models.SkillType;

/**
 * Use next curl request to retreive datas on API mode
 * curl admin:admin@127.0.0.1:1213/skill_types/
 * @author tactfactory
 *
 */
@RestController
@RequestMapping("/skill_types")
public class SkillTypeApiController {

    @Autowired
    private IBaseManager<SkillType> manager;

    @RequestMapping(value={"/",""}, method=RequestMethod.GET)
    public List<SkillType> getAll() {
        return this.manager.getAll();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public SkillType get(@PathVariable Long id, HttpServletResponse response) {
        SkillType entity = this.manager.getById(id);

        if (entity == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }

        return entity;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public SkillType delete(@PathVariable Long id) {
        SkillType type = this.manager.getById(id);

        if (type != null) {
            this.manager.delete(type);
        }

        return type;
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public SkillType create(@RequestParam String name) {
        SkillType entity = new SkillType();

        entity.setName(name);

        this.manager.create(entity);

        return entity;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public SkillType update(HttpServletResponse response, @PathVariable Long id, @RequestParam String name) {
        SkillType entity = this.manager.getById(id);

        if (entity == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        } else if(name != null && !name.equals(entity.getName())) {
            entity.setName(name);

            this.manager.update(entity);
        } else {
            response.setStatus(418);
        }

        return entity;
    }
}
