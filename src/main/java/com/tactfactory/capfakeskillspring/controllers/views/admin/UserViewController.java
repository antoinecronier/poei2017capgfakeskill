package com.tactfactory.capfakeskillspring.controllers.views.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tactfactory.capfakeskillspring.controllers.base.ViewBaseController;
import com.tactfactory.capfakeskillspring.models.User;

@Controller
@RequestMapping(UserViewController.BASE_URL)
public class UserViewController extends ViewBaseController<User> {

	public static final String BASE_URL = "/admin/user";

	public final static String ROUTE_BASE = "user";
	public final static String ROUTE_REDIRECT = "admin/user";
	public final static String PATH_BASE = "base";

	public final static String index = "";

	protected final static String PATH_INDEX = PATH_BASE + PATH + index;

	protected final static String ROUTE_INDEX = index;

	protected UserViewController() {
		super(User.class, BASE_URL);

		this.basePage = index;
		this.createRedirect = REDIRECT + this.basePath + PATH + ROUTE_INDEX;
		this.deleteRedirect = REDIRECT + this.basePath + PATH + ROUTE_INDEX;
		this.updateRedirect = REDIRECT + this.basePath + PATH + ROUTE_INDEX;
		this.showRedirect = REDIRECT + this.basePath + PATH + ROUTE_INDEX;
		this.listRedirect = REDIRECT + this.basePath + PATH + ROUTE_INDEX;
	}

}
