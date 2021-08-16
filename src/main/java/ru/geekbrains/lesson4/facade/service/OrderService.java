package ru.geekbrains.lesson4.facade.service;

import ru.geekbrains.lesson4.facade.document.Order;
import ru.geekbrains.lesson4.facade.factories.Manager;

import java.util.List;

public interface OrderService {
        Order getOrderById(Long id);
        List<Order> getOrderByManager(Manager manager);
}
