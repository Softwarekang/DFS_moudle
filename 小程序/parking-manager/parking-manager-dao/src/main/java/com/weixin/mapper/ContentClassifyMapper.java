package com.weixin.mapper;

import com.weixin.pojo.ContentClassify;
import com.weixin.pojo.ContentClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentClassifyMapper {
    int countByExample(ContentClassifyExample example);

    int deleteByExample(ContentClassifyExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(ContentClassify record);

    int insertSelective(ContentClassify record);

    List<ContentClassify> selectByExample(ContentClassifyExample example);

    ContentClassify selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") ContentClassify record, @Param("example") ContentClassifyExample example);

    int updateByExample(@Param("record") ContentClassify record, @Param("example") ContentClassifyExample example);

    int updateByPrimaryKeySelective(ContentClassify record);

    int updateByPrimaryKey(ContentClassify record);
}