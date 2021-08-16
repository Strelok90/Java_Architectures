package ru.geekbrains.lesson3.factory.factories;

import ru.geekbrains.lesson3.factory.document.Document;

public abstract class Manager {
    protected String name;
    protected String department;

    public String getDepartment() {
        return department;
    }

    public abstract Document createDocument();
}
