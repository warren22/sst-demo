package com.lnspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnspace.model.User;

/**
 * 数据库接口映射类
 * @author warren
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername( String username );
}
