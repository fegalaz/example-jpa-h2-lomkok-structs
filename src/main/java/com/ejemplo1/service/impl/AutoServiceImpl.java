package com.ejemplo1.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo1.dto.AutoDTO;
import com.ejemplo1.mapper.AutoMapper;
import com.ejemplo1.repository.AutoRepository;
import com.ejemplo1.repository.entities.AutoModel;
import com.ejemplo1.service.AutoService;

@Service
public class AutoServiceImpl implements AutoService {

	@Autowired
	private AutoRepository repo;

	public AutoDTO createAuto(AutoDTO autoReq) {
		AutoModel model = new AutoModel();
		BeanUtils.copyProperties(autoReq, model);
		model = repo.save(model);
		return AutoMapper.MAPPER.entityToDTO(model);
	}

	public List<AutoDTO> findAllAutos() {

		List<AutoModel> responds = repo.findAll();

		return responds.stream().map(AutoMapper.MAPPER::entityToDTO).collect(Collectors.toList());

	}

	public AutoDTO findById(Integer id) {
		Optional<AutoModel> opt = repo.findById(id);

		// AutoModel model = opt.orElse(null) // Opción 1
		AutoModel model = opt.orElse(new AutoModel());// Opción 2

		return AutoMapper.MAPPER.entityToDTO(model);
	}
}