package com.show.blog.demo.infrastructure.dao;


import com.show.blog.demo.domain.model.entity.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloDao extends JpaRepository<Hello,Integer> {
}
