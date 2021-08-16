package ru.geekbrains.lesson5.strategy.service;

import ru.geekbrains.lesson5.strategy.factories.ServiceManager;

public interface ManagerService {
    ServiceManager getManagerByName(String name);
}
