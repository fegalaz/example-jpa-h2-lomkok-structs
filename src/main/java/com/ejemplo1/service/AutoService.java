package com.ejemplo1.service;

import java.util.List;

import com.ejemplo1.dto.AutoDTO;

public interface AutoService {

	AutoDTO createAuto(AutoDTO autoReq);

	List<AutoDTO> findAllAutos();

	AutoDTO findById(Integer id);
}
