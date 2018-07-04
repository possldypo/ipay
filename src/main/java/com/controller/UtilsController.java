package com.controller;

import com.common.ResponseData;
import com.service.IUtilsService;
import com.vo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/utils")
public class UtilsController extends BaseController {

    @Autowired
    private IUtilsService utilsService;

    @RequestMapping(value = "/utilPage")
    public String topPge() {
        return "utilPage";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public ResponseData list(Page page){
        return new ResponseData().success(utilsService.loadUtilList(page));
    }

}
