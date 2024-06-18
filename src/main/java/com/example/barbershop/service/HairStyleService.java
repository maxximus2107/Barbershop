package com.example.barbershop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.barbershop.model.HairStyle;
import com.example.barbershop.repository.HairStyleRepository;

@Service
public class HairStyleService {

	@Autowired
	private HairStyleRepository hairStyleRepository;

	public List<HairStyle> getAllHairStyles() {
		return hairStyleRepository.findAll();
	}
}
