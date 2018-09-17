package com.service.impl;

import com.dao.ItemMapper;
import com.entity.Item;
import com.service.IItemService;
import com.vo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements IItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> loadListByPage(Page page) {
        Page.setDefault(page);
        return itemMapper.selectList(page.getLimit(),page.getLimit() * (page.getCurrent() -1));
    }
}
