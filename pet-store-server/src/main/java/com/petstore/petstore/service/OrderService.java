package com.petstore.petstore.service;

import com.petstore.petstore.dto.OrderDTO;
import com.petstore.petstore.mapper.OrderMapper;
import com.petstore.petstore.model.Order;
import com.petstore.petstore.model.OrderItem;
import com.petstore.petstore.model.Product;
import com.petstore.petstore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderMapper orderMapper;

    @Transactional
    public OrderDTO addOrder(OrderDTO orderDTO) {
        Order order = orderMapper.dtoToEntity(orderDTO);
        order = orderRepository.save(order);
        for (OrderItem item: order.getOrderItems()) {
            Product p = item.getProduct();
            productService.decreaseQuantity(p.getId(), item.getAmount());
        }
        return orderMapper.entityToDto(order);
    }

    public List<OrderDTO> getOrders() {
        return orderMapper.entitiesToDtos(orderRepository.findAll());
    }
}
