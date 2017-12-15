package com.tactfactory.capfakeskillspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tactfactory.capfakeskillspring.dao.SkillTypeDAO;
import com.tactfactory.capfakeskillspring.dao.UserDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.base.IBaseDAO;
import com.tactfactory.capfakeskillspring.managers.SkillTypeManager;
import com.tactfactory.capfakeskillspring.managers.UserManager;
import com.tactfactory.capfakeskillspring.managers.interfaces.base.IBaseManager;
import com.tactfactory.capfakeskillspring.models.SkillType;
import com.tactfactory.capfakeskillspring.models.User;

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
	public IBaseManager<User> getUserManager(){
		return new UserManager();
	}

	@Bean
	public IBaseDAO<SkillType> getSkillTypeDAO(){
		return new SkillTypeDAO();
	}

	@Bean
	public IBaseDAO<User> getUserDAO(){
		return new UserDAO();
	}
}
