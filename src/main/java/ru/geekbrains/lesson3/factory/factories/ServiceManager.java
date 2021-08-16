package ru.geekbrains.lesson3.factory.factories;

import ru.geekbrains.lesson3.factory.document.Document;
import ru.geekbrains.lesson3.factory.document.Order;

public class ServiceManager extends Manager{

    public ServiceManager() {
            super.department = "service";
    }

    @Override
    public Document createDocument() {
        return new Order();
    }
}
