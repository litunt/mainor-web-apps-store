package com.petstore.petstore.mapper;

import com.petstore.petstore.dto.OrderItemDTO;
import com.petstore.petstore.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderItemMapper {

    @Autowired
    private ProductMapper productMapper;

    public List<OrderItem> dtosToEntities(List<OrderItemDTO> dtos) {
        return dtos.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

    public List<OrderItemDTO> entitiesToDtos(List<OrderItem> orderItems) {
        return orderItems.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    private OrderItemDTO entityToDto(OrderItem orderItem) {
        OrderItemDTO dto = new OrderItemDTO();
        dto.setId(orderItem.getId());
        dto.setAmount(orderItem.getAmount());
        dto.setProduct(productMapper.entityToDto(orderItem.getProduct()));
        return dto;
    }

    private OrderItem dtoToEntity(OrderItemDTO dto) {
        OrderItem entity = new OrderItem();
        entity.setId(dto.getId());
        entity.setAmount(dto.getAmount());
        entity.setProduct(productMapper.dtoToEntity(dto.getProduct()));
        return entity;
    }
}
