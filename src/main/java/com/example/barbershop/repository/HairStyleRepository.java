package com.example.barbershop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.barbershop.model.HairStyle;

public interface HairStyleRepository extends JpaRepository<HairStyle, Long> {

	List<HairStyle> findAll();

	
}
