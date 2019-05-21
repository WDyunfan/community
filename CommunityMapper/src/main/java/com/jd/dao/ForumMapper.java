package com.jd.dao;

import com.jd.pojo.Forum;
import com.jd.pojo.ForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForumMapper {
    int countByExample(ForumExample example);

    int deleteByExample(ForumExample example);

    int deleteByPrimaryKey(Integer forumId);

    int insert(Forum record);

    int insertSelective(Forum record);

    List<Forum> selectByExample(ForumExample example);

    Forum selectByPrimaryKey(Integer forumId);

    int updateByExampleSelective(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByExample(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByPrimaryKeySelective(Forum record);

    int updateByPrimaryKey(Forum record);
}