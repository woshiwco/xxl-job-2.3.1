package com.xxl.job.executor.dao;

import com.xxl.job.executor.entity.User;
import org.springframework.stereotype.Repository;

/**
* @author 10753
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-12-09 01:09:59
* @Entity generator.domain.User
*/
@Repository
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
