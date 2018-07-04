package com.dao;

import com.entity.Utils;
import com.entity.UtilsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UtilsMapper {
    int countByExample(UtilsExample example);

    int deleteByExample(UtilsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Utils record);

    int insertSelective(Utils record);

    List<Utils> selectByExample(UtilsExample example);

    Utils selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Utils record, @Param("example") UtilsExample example);

    int updateByExample(@Param("record") Utils record, @Param("example") UtilsExample example);

    int updateByPrimaryKeySelective(Utils record);

    int updateByPrimaryKey(Utils record);

    @Select("select * from utils where status = 'valid' limit #{start},#{limit}")
    List<Utils> selectList(Integer limit, Integer start);
}