package com.codingworld.springbootkafkaconsumer.repo;

import com.codingworld.springbootkafkaconsumer.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCRUD extends CrudRepository<User,Integer> {

}
