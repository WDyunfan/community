package com.jd.dao;

import com.jd.pojo.AticleResponse;
import com.jd.pojo.AticleResponseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AticleResponseMapper {
    int countByExample(AticleResponseExample example);

    int deleteByExample(AticleResponseExample example);

    int deleteByPrimaryKey(Integer aticleResponseId);

    int insert(AticleResponse record);

    int insertSelective(AticleResponse record);

    List<AticleResponse> selectByExample(AticleResponseExample example);

    AticleResponse selectByPrimaryKey(Integer aticleResponseId);

    int updateByExampleSelective(@Param("record") AticleResponse record, @Param("example") AticleResponseExample example);

    int updateByExample(@Param("record") AticleResponse record, @Param("example") AticleResponseExample example);

    int updateByPrimaryKeySelective(AticleResponse record);

    int updateByPrimaryKey(AticleResponse record);
}