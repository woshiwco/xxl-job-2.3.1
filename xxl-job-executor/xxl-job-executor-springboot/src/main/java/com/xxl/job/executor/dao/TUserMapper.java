package com.xxl.job.executor.dao;

import com.xxl.job.executor.entity.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author 10753
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-12-09 02:06:36
* @Entity generator.domain.TUser
*/
@Repository
public interface TUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

}
