package ru.geekbrains.lesson5.strategy.facade;

import ru.geekbrains.lesson5.strategy.document.Order;
import ru.geekbrains.lesson5.strategy.factories.Manager;
import ru.geekbrains.lesson5.strategy.service.ManagerService;
import ru.geekbrains.lesson5.strategy.service.OrderService;

import java.util.List;

public class ManagerOrderService implements ManagerOrder {
    private OrderService orderService;
    private ManagerService managerService;

    @Override
    public List<Order> getManagerOrder(String name) {
        Manager manager = managerService.getManagerByName(name);
        return orderService.getOrderByManager(manager);
    }
}
