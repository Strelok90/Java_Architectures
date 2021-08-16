package ru.geekbrains.lesson5.strategy.document;

public interface Document {
    Document copy ();
    void edit();
    void save();
}
