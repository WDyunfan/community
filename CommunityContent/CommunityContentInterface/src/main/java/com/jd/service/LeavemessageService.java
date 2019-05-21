package com.jd.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jd.pojo.Leavemessage;
import com.jd.pojo.LeavemessageExample;

public interface LeavemessageService {

	int countByExample(LeavemessageExample example);

    boolean deleteByExample(LeavemessageExample example);

    boolean deleteByPrimaryKey(Integer leavemessageId);

    boolean insert(Leavemessage record);

    boolean insertSelective(Leavemessage record);

    List<Leavemessage> selectByExample(LeavemessageExample example);

    Leavemessage selectByPrimaryKey(Integer leavemessageId);

    boolean updateByExampleSelective(@Param("record") Leavemessage record, @Param("example") LeavemessageExample example);

    boolean updateByExample(@Param("record") Leavemessage record, @Param("example") LeavemessageExample example);

    boolean updateByPrimaryKeySelective(Leavemessage record);

    boolean updateByPrimaryKey(Leavemessage record);
}
