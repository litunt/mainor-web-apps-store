package com.petstore.petstore.controller;

import com.petstore.petstore.dto.OrderDTO;
import com.petstore.petstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderDTO addOrder(@RequestBody OrderDTO order) {
        return orderService.addOrder(order);
    }

    @GetMapping
    public List<OrderDTO> getOrders() {
        return orderService.getOrders();
    }
}
