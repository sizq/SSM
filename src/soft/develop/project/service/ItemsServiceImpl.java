package soft.develop.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import soft.develop.project.dao.ItemsCustomMapper;
import soft.develop.project.dao.ItemsMapper;
import soft.develop.project.pojo.Items;
import soft.develop.project.pojo.ItemsCustom;
import soft.develop.project.pojo.ItemsCustomVo;

@Service
public class ItemsServiceImpl implements ItemsService {
	
	@Resource
	private ItemsCustomMapper itemsCustomMapper;
	
	@Resource
	private ItemsMapper itemsMapper;

	
	public List<ItemsCustom> queryItemsList(ItemsCustomVo itemsCustomVo) {
		List<ItemsCustom> list = itemsCustomMapper.queryItemsList(itemsCustomVo);
		return list;
	}


	public ItemsCustom queryItemsById(Integer id) {
		Items items = itemsMapper.selectByPrimaryKey(id);
		ItemsCustom itemsCustom = new ItemsCustom();
		// 将对象的属性复制到目标对象的属性上（对象的属性一致）
		BeanUtils.copyProperties(items, itemsCustom);
		return itemsCustom;
	}

	
	public void updateItems(ItemsCustom itemsCustom) {
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
	}

}
