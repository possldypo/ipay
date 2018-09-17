package com.service.impl;

import com.entity.UserLoginCache;
import com.service.ICacheService;
import com.utils.DateUtils;

import java.util.Date;
import java.util.HashMap;

public class MapCacheServieImpl implements ICacheService {

    private static Integer ENDINT_TIME = 30;

    private static HashMap<String, UserLoginCache> LOGIN_CACHE_MAP = new HashMap<>();

    @Override
    public Boolean login(UserLoginCache user) {
        LOGIN_CACHE_MAP.put(user.getId().toString(), user);
        return true;
    }

    /***
     * 判断登陆状态
     * @param userId
     * @return
     */
    @Override
    public Boolean judgeOnLine(Integer userId){
        /*判断是否存在登陆记录*/
        if(LOGIN_CACHE_MAP.containsKey(userId.toString())){
            UserLoginCache cacheUser = LOGIN_CACHE_MAP.get(userId.toString());
            /*判断登陆是否过期*/
            if(DateUtils.compare_date(new Date(), DateUtils.addMin(ENDINT_TIME,cacheUser.getLoginTime())) != 1){
                return true;
            }
        }
        return false;
    }

    /**
     * 下线
     * @param userId
     * @return
     */
    @Override
    public Boolean offline(Integer userId){
        if(LOGIN_CACHE_MAP.containsKey(userId.toString())){
            LOGIN_CACHE_MAP.remove(userId.toString());
            return true;
        }
        return false;
    }
}
