/*
 * Copyright 2005-2016 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.shopxx.controller.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.shopxx.service.PluginService;

/**
 * Controller - 支付插件
 * 
 * @author SHOP++ Team
 * @version 5.0
 */
@Controller("adminPaymentPluginController")
@RequestMapping("/admin/payment_plugin")
public class PaymentPluginController extends BaseController {

	@Resource(name = "pluginServiceImpl")
	private PluginService pluginService;

	/**
	 * 列表
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(ModelMap model) {
		model.addAttribute("paymentPlugins", pluginService.getPaymentPlugins());
		return "/admin/payment_plugin/list";
	}

}