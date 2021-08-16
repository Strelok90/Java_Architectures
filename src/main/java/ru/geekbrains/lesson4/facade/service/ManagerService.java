package ru.geekbrains.lesson4.facade.service;

import ru.geekbrains.lesson4.facade.factories.ServiceManager;

public interface ManagerService {
    ServiceManager getManagerByName(String name);
}
