package com.jd.dao;

import com.jd.pojo.InstantComment;
import com.jd.pojo.InstantCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstantCommentMapper {
    int countByExample(InstantCommentExample example);

    int deleteByExample(InstantCommentExample example);

    int deleteByPrimaryKey(Integer instantCommentId);

    int insert(InstantComment record);

    int insertSelective(InstantComment record);

    List<InstantComment> selectByExample(InstantCommentExample example);

    InstantComment selectByPrimaryKey(Integer instantCommentId);

    int updateByExampleSelective(@Param("record") InstantComment record, @Param("example") InstantCommentExample example);

    int updateByExample(@Param("record") InstantComment record, @Param("example") InstantCommentExample example);

    int updateByPrimaryKeySelective(InstantComment record);

    int updateByPrimaryKey(InstantComment record);
}