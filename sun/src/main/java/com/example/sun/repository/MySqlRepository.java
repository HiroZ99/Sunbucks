package com.example.sun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sun.model.Menus;

public interface MySqlRepository extends JpaRepository<Menus,Integer>{
}