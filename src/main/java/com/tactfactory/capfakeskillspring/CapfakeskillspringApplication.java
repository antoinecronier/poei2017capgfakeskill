package com.tactfactory.capfakeskillspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tactfactory.capfakeskillspring.dao.SkillTypeDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.base.IBaseDAO;
import com.tactfactory.capfakeskillspring.managers.SkillTypeManager;
import com.tactfactory.capfakeskillspring.managers.interfaces.base.IBaseManager;
import com.tactfactory.capfakeskillspring.models.SkillType;

@SpringBootApplication
public class CapfakeskillspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapfakeskillspringApplication.class, args);
	}

	@Bean
	public IBaseManager<SkillType> getSkillTypeManager(){
		return new SkillTypeManager();
	}

	@Bean
	public IBaseDAO<SkillType> getSkillTypeDAO(){
		return new SkillTypeDAO();
	}
}
