package ru.geekbrains.lesson3.factory.document;

public interface Document {
    Document copy ();
    void edit();
    void save();
}
