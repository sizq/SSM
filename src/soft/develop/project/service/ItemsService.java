package soft.develop.project.service;

import java.util.List;

import soft.develop.project.pojo.ItemsCustom;
import soft.develop.project.pojo.ItemsCustomVo;


public interface ItemsService {

	/**
	 * 
	 * @Title: queryItemsList
	 * @Description: 根据条件查询商品信息
	 * @param itemsCustomVo 封装页面传递条件
	 * @return
	 * @return List<ItemsCustom>
	 * @throws
	 */
	public List<ItemsCustom> queryItemsList(ItemsCustomVo itemsCustomVo);
	
	/**
	 * 
	 * @Title: queryItemsById
	 * @Description: 根据主键查询
	 * @param id
	 * @return
	 * @return ItemsCustom
	 * @throws
	 */
	public ItemsCustom queryItemsById(Integer id);
	
	/**
	 * 
	 * @Title: updateItems
	 * @Description: 商品的更新
	 * @param itemsCustom
	 * @return void
	 * @throws
	 */
	public void updateItems(ItemsCustom itemsCustom);
}
