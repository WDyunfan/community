package com.jd.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jd.pojo.Forumresponse;
import com.jd.pojo.ForumresponseExample;

public interface ForumresponseService {

	
	int countByExample(ForumresponseExample example);

    boolean deleteByExample(ForumresponseExample example);

    boolean deleteByPrimaryKey(Integer forumresponseId);

    boolean insert(Forumresponse record);

    boolean insertSelective(Forumresponse record);

    List<Forumresponse> selectByExample(ForumresponseExample example);

    Forumresponse selectByPrimaryKey(Integer forumresponseId);

    boolean updateByExampleSelective(@Param("record") Forumresponse record, @Param("example") ForumresponseExample example);

    boolean updateByExample(@Param("record") Forumresponse record, @Param("example") ForumresponseExample example);

    boolean updateByPrimaryKeySelective(Forumresponse record);

    boolean updateByPrimaryKey(Forumresponse record);

}
