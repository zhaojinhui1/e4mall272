package cn.e4mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e4mall.mapper.TbItemMapper;
import cn.e4mall.pojo.TbItem;
import cn.e4mall.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Override
	public TbItem findItemById(long id) {
		return tbItemMapper.selectByPrimaryKey(id);
	}

}
