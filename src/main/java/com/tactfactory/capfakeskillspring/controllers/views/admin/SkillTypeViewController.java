package com.tactfactory.capfakeskillspring.controllers.views.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tactfactory.capfakeskillspring.controllers.base.ViewBaseController;
import com.tactfactory.capfakeskillspring.models.SkillType;

@Controller
@RequestMapping(SkillTypeViewController.BASE_URL)
public class SkillTypeViewController extends ViewBaseController<SkillType> {

	public static final String BASE_URL = "/admin/skilltype";

	public final static String ROUTE_BASE = "skilltype";
	public final static String ROUTE_REDIRECT = "admin/skilltype";
	public final static String PATH_BASE = "base";

	public final static String index = "index";

	protected final static String PATH_INDEX = PATH_BASE + PATH + index;

	protected final static String ROUTE_INDEX = index;

	protected SkillTypeViewController() {
		super(SkillType.class, BASE_URL);

		this.basePage = index;
		this.createRedirect = REDIRECT + this.basePath + PATH + ROUTE_INDEX;
		this.deleteRedirect = REDIRECT + this.basePath + PATH + ROUTE_INDEX;
		this.updateRedirect = REDIRECT + this.basePath + PATH + ROUTE_INDEX;
		this.showRedirect = REDIRECT + this.basePath + PATH + ROUTE_INDEX;
		this.listRedirect = REDIRECT + this.basePath + PATH + ROUTE_INDEX;
	}

}
