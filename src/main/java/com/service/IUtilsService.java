package com.service;

import com.entity.Utils;
import com.vo.Page;

import java.util.List;

public interface IUtilsService {

    List<Utils> loadUtilList(Page page);
}
