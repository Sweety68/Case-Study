package com.mobile.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mobile.entity.Mobile;

public interface MobileDao extends CrudRepository<Mobile, Integer>{

	
}
