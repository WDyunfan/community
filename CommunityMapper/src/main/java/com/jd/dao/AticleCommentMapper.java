package com.jd.dao;

import com.jd.pojo.AticleComment;
import com.jd.pojo.AticleCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AticleCommentMapper {
    int countByExample(AticleCommentExample example);

    int deleteByExample(AticleCommentExample example);

    int deleteByPrimaryKey(Integer aticleCommentId);

    int insert(AticleComment record);

    int insertSelective(AticleComment record);

    List<AticleComment> selectByExample(AticleCommentExample example);

    AticleComment selectByPrimaryKey(Integer aticleCommentId);

    int updateByExampleSelective(@Param("record") AticleComment record, @Param("example") AticleCommentExample example);

    int updateByExample(@Param("record") AticleComment record, @Param("example") AticleCommentExample example);

    int updateByPrimaryKeySelective(AticleComment record);

    int updateByPrimaryKey(AticleComment record);
}