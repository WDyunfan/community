package com.jd.dao;

import com.jd.pojo.InstantResponse;
import com.jd.pojo.InstantResponseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstantResponseMapper {
    int countByExample(InstantResponseExample example);

    int deleteByExample(InstantResponseExample example);

    int deleteByPrimaryKey(Integer instantResponseId);

    int insert(InstantResponse record);

    int insertSelective(InstantResponse record);

    List<InstantResponse> selectByExample(InstantResponseExample example);

    InstantResponse selectByPrimaryKey(Integer instantResponseId);

    int updateByExampleSelective(@Param("record") InstantResponse record, @Param("example") InstantResponseExample example);

    int updateByExample(@Param("record") InstantResponse record, @Param("example") InstantResponseExample example);

    int updateByPrimaryKeySelective(InstantResponse record);

    int updateByPrimaryKey(InstantResponse record);
}