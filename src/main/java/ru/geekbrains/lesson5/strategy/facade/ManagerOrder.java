package ru.geekbrains.lesson5.strategy.facade;


import ru.geekbrains.lesson5.strategy.document.Order;

import java.util.List;

public interface ManagerOrder {
    List<Order> getManagerOrder(String name);
}
