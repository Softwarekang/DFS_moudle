package com.weixin.mapper;

import com.weixin.pojo.StallInfo;
import com.weixin.pojo.StallInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StallInfoMapper {
    int countByExample(StallInfoExample example);

    int deleteByExample(StallInfoExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(StallInfo record);

    int insertSelective(StallInfo record);

    List<StallInfo> selectByExample(StallInfoExample example);

    StallInfo selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") StallInfo record, @Param("example") StallInfoExample example);

    int updateByExample(@Param("record") StallInfo record, @Param("example") StallInfoExample example);

    int updateByPrimaryKeySelective(StallInfo record);

    int updateByPrimaryKey(StallInfo record);
}