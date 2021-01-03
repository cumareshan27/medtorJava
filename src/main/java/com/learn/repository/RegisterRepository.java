package com.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<registerUser, Long>  {

}
