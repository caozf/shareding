package com.zhumeng.spring_boot_mybatis_sharding_jdbc.mapper;

import java.util.List;

import com.zhumeng.spring_boot_mybatis_sharding_jdbc.model.UserEntity;

public interface  User1Mapper {

	  List<UserEntity> getAll();

	    void update(UserEntity user);
	    
	    void insert(UserEntity user);

		List<UserEntity> findByParams(UserEntity user);
}
