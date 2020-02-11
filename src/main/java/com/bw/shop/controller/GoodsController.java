package com.bw.shop.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.shop.domain.Goods;
import com.bw.shop.service.GoodsService;

@Controller
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Goods> goods = goodsService.selects();
		model.addAttribute("goods", goods);
		return "goods";
	}
}
