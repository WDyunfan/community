package com.jd.dao;

import com.jd.pojo.InstantPicture;
import com.jd.pojo.InstantPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstantPictureMapper {
    int countByExample(InstantPictureExample example);

    int deleteByExample(InstantPictureExample example);

    int deleteByPrimaryKey(Integer instantPictureId);

    int insert(InstantPicture record);

    int insertSelective(InstantPicture record);

    List<InstantPicture> selectByExample(InstantPictureExample example);

    InstantPicture selectByPrimaryKey(Integer instantPictureId);

    int updateByExampleSelective(@Param("record") InstantPicture record, @Param("example") InstantPictureExample example);

    int updateByExample(@Param("record") InstantPicture record, @Param("example") InstantPictureExample example);

    int updateByPrimaryKeySelective(InstantPicture record);

    int updateByPrimaryKey(InstantPicture record);
}