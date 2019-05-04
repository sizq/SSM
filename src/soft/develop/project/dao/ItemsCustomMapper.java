package soft.develop.project.dao;

import java.util.List;

import soft.develop.project.pojo.ItemsCustom;
import soft.develop.project.pojo.ItemsCustomVo;
public interface ItemsCustomMapper {

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
}
