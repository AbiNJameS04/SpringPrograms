package com.ust.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.demo.entity.Emp;

public interface ERepository extends JpaRepository<Emp, Integer> {

}
