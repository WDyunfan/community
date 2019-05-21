package com.jd.dao;

import com.jd.pojo.AticlePicture;
import com.jd.pojo.AticlePictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AticlePictureMapper {
    int countByExample(AticlePictureExample example);

    int deleteByExample(AticlePictureExample example);

    int deleteByPrimaryKey(Integer aticlePictureId);

    int insert(AticlePicture record);

    int insertSelective(AticlePicture record);

    List<AticlePicture> selectByExample(AticlePictureExample example);

    AticlePicture selectByPrimaryKey(Integer aticlePictureId);

    int updateByExampleSelective(@Param("record") AticlePicture record, @Param("example") AticlePictureExample example);

    int updateByExample(@Param("record") AticlePicture record, @Param("example") AticlePictureExample example);

    int updateByPrimaryKeySelective(AticlePicture record);

    int updateByPrimaryKey(AticlePicture record);
}