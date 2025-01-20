package com.example.react.demo.repository;

import com.example.react.demo.UserClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserClass,Long> {




}
