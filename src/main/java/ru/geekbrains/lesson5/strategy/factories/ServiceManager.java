package ru.geekbrains.lesson5.strategy.factories;

import ru.geekbrains.lesson5.strategy.document.Document;
import ru.geekbrains.lesson5.strategy.document.Order;

public class ServiceManager extends Manager {

    public ServiceManager(String name) {
            super.department = "service";
    }

    @Override
    public Document createDocument() {
        return new Order();
    }
}
