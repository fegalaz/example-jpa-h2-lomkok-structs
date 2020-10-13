package com.ejemplo1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import com.ejemplo1.dto.AutoDTO;
import com.ejemplo1.repository.entities.AutoModel;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AutoMapper {

	public static final AutoMapper MAPPER = Mappers.getMapper(AutoMapper.class);
	
	AutoDTO entityToDTO(AutoModel model);
}
