package ru.geekbrains.lesson4.facade.facade;

import ru.geekbrains.lesson4.facade.document.Order;

import java.util.List;

public interface ManagerOrder {
    List<Order> getManagerOrder(String name);
}
