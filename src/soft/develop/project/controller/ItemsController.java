package soft.develop.project.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import soft.develop.project.pojo.ItemsCustom;
import soft.develop.project.pojo.ItemsCustomVo;
import soft.develop.project.service.ItemsService;

@Controller
@RequestMapping("/items") // 分类管理controller
public class ItemsController {
	
	@Resource
	private ItemsService itemsService;
	
	/**
	 * 
	 * @Title: queryItems
	 * @Description: 根据条件查询商品信息
	 * @return
	 * @return ModelAndView
	 * @throws
	 */
	@RequestMapping(value = "/queryItems.action", method={RequestMethod.POST, RequestMethod.GET})
	public ModelAndView queryItems(ItemsCustomVo itemsCustomVo, Model model){
		List<ItemsCustom> itemsList = itemsService.queryItemsList(itemsCustomVo);
		ModelAndView modelAndView = new ModelAndView();
		// 设置数据
		modelAndView.addObject("itemsList", itemsList);
		// 指定视图地址
		modelAndView.setViewName("items/itemsList");
//		model.addAttribute("name", itemsCustomVo.getItemsCustom().getName());
		return modelAndView;
	}
	
	/**
	 * 
	 * @Title: editItems
	 * @Description: 商品编辑
	 * @param id
	 * @param model
	 * @return
	 * @return String
	 * @throws
	 */
	@RequestMapping("/editItems.action")
	public String editItems(Integer id, Model model){
		ItemsCustom itemsCustom = itemsService.queryItemsById(id);
		// model对象：实现数据的回显。   作用：与Request作用一致。
		model.addAttribute("itemsCustom", itemsCustom);
		return "items/editItems";
	}
	
	/**
	 * 
	 * @Title: updateItems
	 * @Description: 更新操作
	 * @param itemsCustom
	 * @return
	 * @return String
	 * @throws
	 */
	@RequestMapping("/updateItems.action")
	public String updateItems(ItemsCustom itemsCustom){
		// 完成更新操作
		itemsService.updateItems(itemsCustom);
		return "sucess";
	}

}
