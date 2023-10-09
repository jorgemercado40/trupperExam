package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Compras;

public interface ComprasRepository extends JpaRepository< Compras, Long > {

}
