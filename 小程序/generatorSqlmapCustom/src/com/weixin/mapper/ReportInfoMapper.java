package com.weixin.mapper;

import com.weixin.pojo.ReportInfo;
import com.weixin.pojo.ReportInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportInfoMapper {
    int countByExample(ReportInfoExample example);

    int deleteByExample(ReportInfoExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(ReportInfo record);

    int insertSelective(ReportInfo record);

    List<ReportInfo> selectByExample(ReportInfoExample example);

    ReportInfo selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") ReportInfo record, @Param("example") ReportInfoExample example);

    int updateByExample(@Param("record") ReportInfo record, @Param("example") ReportInfoExample example);

    int updateByPrimaryKeySelective(ReportInfo record);

    int updateByPrimaryKey(ReportInfo record);
}