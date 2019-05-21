package com.jd.dao;

import com.jd.pojo.Leavemessage;
import com.jd.pojo.LeavemessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeavemessageMapper {
    int countByExample(LeavemessageExample example);

    int deleteByExample(LeavemessageExample example);

    int deleteByPrimaryKey(Integer leavemessageId);

    int insert(Leavemessage record);

    int insertSelective(Leavemessage record);

    List<Leavemessage> selectByExample(LeavemessageExample example);

    Leavemessage selectByPrimaryKey(Integer leavemessageId);

    int updateByExampleSelective(@Param("record") Leavemessage record, @Param("example") LeavemessageExample example);

    int updateByExample(@Param("record") Leavemessage record, @Param("example") LeavemessageExample example);

    int updateByPrimaryKeySelective(Leavemessage record);

    int updateByPrimaryKey(Leavemessage record);
}