package com.jd.service;

import com.jd.pojo.Forum;
import com.jd.pojo.ForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForumService {
    int countByExample(ForumExample example);

    boolean deleteByExample(ForumExample example);

    boolean deleteByPrimaryKey(Integer forumId);

    boolean insert(Forum record);

    boolean insertSelective(Forum record);

    List<Forum> selectByExample(ForumExample example);

    Forum selectByPrimaryKey(Integer forumId);

    boolean updateByExampleSelective(@Param("record") Forum record, @Param("example") ForumExample example);

    boolean updateByExample(@Param("record") Forum record, @Param("example") ForumExample example);

    boolean updateByPrimaryKeySelective(Forum record);

    boolean updateByPrimaryKey(Forum record);
}