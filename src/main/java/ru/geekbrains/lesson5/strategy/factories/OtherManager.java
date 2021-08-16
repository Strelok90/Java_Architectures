package ru.geekbrains.lesson5.strategy.factories;

import ru.geekbrains.lesson5.strategy.document.Document;
import ru.geekbrains.lesson5.strategy.document.OtherDocument;

public class OtherManager extends Manager {

    public OtherManager() {
        super.department = "other";
    }


    @Override
    public Document createDocument() {
        return new OtherDocument();
    }
}
