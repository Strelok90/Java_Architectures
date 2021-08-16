package ru.geekbrains.lesson3.factory;


import ru.geekbrains.lesson3.factory.document.Document;
import ru.geekbrains.lesson3.factory.factories.Manager;

public class App {
    private static Manager manager;
    private static Document document;

    public static void main(String[] args) {
        document = manager.createDocument();
    }
}
