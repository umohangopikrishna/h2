package com.hello.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.model.Modelist;

public interface Repolist extends JpaRepository<Modelist,String> {

}
