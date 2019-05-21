package com.jd.dao;

import com.jd.pojo.Forumresponse;
import com.jd.pojo.ForumresponseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForumresponseMapper {
    int countByExample(ForumresponseExample example);

    int deleteByExample(ForumresponseExample example);

    int deleteByPrimaryKey(Integer forumresponseId);

    int insert(Forumresponse record);

    int insertSelective(Forumresponse record);

    List<Forumresponse> selectByExample(ForumresponseExample example);

    Forumresponse selectByPrimaryKey(Integer forumresponseId);

    int updateByExampleSelective(@Param("record") Forumresponse record, @Param("example") ForumresponseExample example);

    int updateByExample(@Param("record") Forumresponse record, @Param("example") ForumresponseExample example);

    int updateByPrimaryKeySelective(Forumresponse record);

    int updateByPrimaryKey(Forumresponse record);
}