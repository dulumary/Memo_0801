package com.marondal.memo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marondal.memo.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
