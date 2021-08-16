package ru.geekbrains.lesson5.strategy.service;

import ru.geekbrains.lesson5.strategy.document.Order;
import ru.geekbrains.lesson5.strategy.factories.Manager;

import java.util.List;

public interface OrderService {
        Order getOrderById(Long id);
        List<Order> getOrderByManager(Manager manager);
}
