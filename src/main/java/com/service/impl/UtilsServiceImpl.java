package com.service.impl;

import com.dao.UtilsMapper;
import com.entity.Utils;
import com.service.IUtilsService;
import com.vo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("utilsService")
public class UtilsServiceImpl implements IUtilsService {

    @Autowired
    private UtilsMapper utilsMapper;

    @Override
    public List<Utils> loadUtilList(Page page) {
        Page.setDefault(page);
        return utilsMapper.selectList(page.getLimit(), page.getLimit() * (page.getCurrent() - 1));
    }
}
