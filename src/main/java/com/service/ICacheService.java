package com.service;

import com.entity.UserLoginCache;

public interface ICacheService {

    Boolean login(UserLoginCache user);

    Boolean judgeOnLine(Integer userId);

    Boolean offline(Integer userId);
}
