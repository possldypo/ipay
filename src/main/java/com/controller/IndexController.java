package com.controller;

import com.common.ResponseData;
import com.service.IItemService;
import com.vo.Page;
import com.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;


@Controller
public class  IndexController extends BaseController{

    @Autowired
    private IItemService iItemService;


    @RequestMapping(value = {"/index", "/", "/Index", "/home", "/Home"})
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/regist")
    @ResponseBody
    public ResponseData regist(@Valid UserVO userVO, BindingResult result){
        if(result.hasErrors()){
            return new ResponseData().failed(result.getFieldError().toString());
        }
        return null;
    }

    @RequestMapping
    @ResponseBody
    public ResponseData login(String userName,String password){
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/loadList")
    public ResponseData loadList(Page page){
        return new ResponseData().success(iItemService.loadListByPage(page));
    }
}
