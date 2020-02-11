package com.bw.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.shop.dao.GoodsMapper;
import com.bw.shop.domain.Goods;
import com.bw.shop.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> selects() {
		return goodsMapper.selects();
	}

}
