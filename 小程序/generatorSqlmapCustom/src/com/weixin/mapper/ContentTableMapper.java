package com.weixin.mapper;

import com.weixin.pojo.ContentTable;
import com.weixin.pojo.ContentTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentTableMapper {
    int countByExample(ContentTableExample example);

    int deleteByExample(ContentTableExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(ContentTable record);

    int insertSelective(ContentTable record);

    List<ContentTable> selectByExample(ContentTableExample example);

    ContentTable selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") ContentTable record, @Param("example") ContentTableExample example);

    int updateByExample(@Param("record") ContentTable record, @Param("example") ContentTableExample example);

    int updateByPrimaryKeySelective(ContentTable record);

    int updateByPrimaryKey(ContentTable record);
}