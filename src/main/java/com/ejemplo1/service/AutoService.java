package com.ejemplo1.service;

import java.util.List;

import com.ejemplo1.dto.request.AutoReq;
import com.ejemplo1.dto.respond.AutoDTO;

public interface AutoService {

	AutoDTO createAuto(AutoReq autoReq);

	List<AutoDTO> findAllAutos();

	AutoDTO findById(Integer id);
}
