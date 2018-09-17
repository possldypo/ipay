package com.service;

import com.entity.Item;
import com.vo.Page;

import java.util.List;

public interface IItemService {

    List<Item> loadListByPage(Page page);
}
