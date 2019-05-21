package com.jd.dao;

import com.jd.pojo.InstantMessage;
import com.jd.pojo.InstantMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstantMessageMapper {
    int countByExample(InstantMessageExample example);

    int deleteByExample(InstantMessageExample example);

    int deleteByPrimaryKey(Integer instantMessageId);

    int insert(InstantMessage record);

    int insertSelective(InstantMessage record);

    List<InstantMessage> selectByExample(InstantMessageExample example);

    InstantMessage selectByPrimaryKey(Integer instantMessageId);

    int updateByExampleSelective(@Param("record") InstantMessage record, @Param("example") InstantMessageExample example);

    int updateByExample(@Param("record") InstantMessage record, @Param("example") InstantMessageExample example);

    int updateByPrimaryKeySelective(InstantMessage record);

    int updateByPrimaryKey(InstantMessage record);
}