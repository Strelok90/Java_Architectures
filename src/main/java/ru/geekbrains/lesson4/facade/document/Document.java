package ru.geekbrains.lesson4.facade.document;

public interface Document {
    Document copy ();
    void edit();
    void save();
}
