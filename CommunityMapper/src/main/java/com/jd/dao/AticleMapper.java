package com.jd.dao;

import com.jd.pojo.Aticle;
import com.jd.pojo.AticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AticleMapper {
    int countByExample(AticleExample example);

    int deleteByExample(AticleExample example);

    int deleteByPrimaryKey(Integer aticleId);

    int insert(Aticle record);

    int insertSelective(Aticle record);

    List<Aticle> selectByExample(AticleExample example);

    Aticle selectByPrimaryKey(Integer aticleId);

    int updateByExampleSelective(@Param("record") Aticle record, @Param("example") AticleExample example);

    int updateByExample(@Param("record") Aticle record, @Param("example") AticleExample example);

    int updateByPrimaryKeySelective(Aticle record);

    int updateByPrimaryKey(Aticle record);
}