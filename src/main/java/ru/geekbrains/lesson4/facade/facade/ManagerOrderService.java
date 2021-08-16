package ru.geekbrains.lesson4.facade.facade;

import ru.geekbrains.lesson4.facade.document.Order;
import ru.geekbrains.lesson4.facade.factories.Manager;
import ru.geekbrains.lesson4.facade.service.ManagerService;
import ru.geekbrains.lesson4.facade.service.OrderService;

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
