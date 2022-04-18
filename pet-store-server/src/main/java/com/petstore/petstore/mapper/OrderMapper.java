package com.petstore.petstore.mapper;

import com.petstore.petstore.dto.OrderDTO;
import com.petstore.petstore.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderMapper {

    @Autowired
    private OrderItemMapper orderItemMapper;

    public Order dtoToEntity(OrderDTO dto) {
        Order order = new Order();
        order.setId(dto.getId());
        order.setCreatedAt(dto.getCreatedAt());
        order.setUserEmail(dto.getUserEmail());
        order.setOrderItems(orderItemMapper.dtosToEntities(dto.getOrderItems()));
        return order;
    }

    public List<OrderDTO> entitiesToDtos(List<Order> orders) {
        return orders.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public OrderDTO entityToDto(Order order) {
        OrderDTO dto = new OrderDTO();
        dto.setId(order.getId());
        dto.setUserEmail(order.getUserEmail());
        dto.setCreatedAt(order.getCreatedAt());
        dto.setOrderItems(orderItemMapper.entitiesToDtos(order.getOrderItems()));
        return dto;
    }
}
