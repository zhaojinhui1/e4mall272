package cn.e4mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.e4mall.pojo.TbItem;
import cn.e4mall.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/Item/id/{id}")
	public TbItem findItemById(@PathVariable long id){
		TbItem item = itemService.findItemById(id);
		System.out.println(item);
		return item;
	}
}
