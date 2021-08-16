package ru.geekbrains.lesson4.facade;


import ru.geekbrains.lesson4.facade.document.Document;
import ru.geekbrains.lesson4.facade.document.Order;
import ru.geekbrains.lesson4.facade.facade.ManagerOrderService;
import ru.geekbrains.lesson4.facade.factories.Manager;
import ru.geekbrains.lesson4.facade.factories.ServiceManager;

import java.util.List;

public class App {
    private static Manager manager;
    private static Document document;
    private static ManagerOrderService mos;

    public static void main(String[] args) {
        manager = new ServiceManager("Ivan");
        document = manager.createDocument();
        List<Order> orders = mos.getManagerOrder(manager.getName());
    }
}
