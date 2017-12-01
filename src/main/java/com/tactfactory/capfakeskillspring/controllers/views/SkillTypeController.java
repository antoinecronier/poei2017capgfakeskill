package com.tactfactory.capfakeskillspring.controllers.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tactfactory.capfakeskillspring.controllers.base.BaseController;
import com.tactfactory.capfakeskillspring.models.SkillType;

@Controller
@RequestMapping(SkillTypeController.BASE_URL)
public class SkillTypeController extends BaseController<SkillType> {

	public static final String BASE_URL = "/skilltype";

	protected SkillTypeController() {
		super(SkillType.class);
	}

	@GetMapping("/send")
	public String sendSkillType(){
		return "coucou";
	}
}
