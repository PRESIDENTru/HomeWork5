package com.company;

public class CreatePersonException extends Exception{

    public CreatePersonException() {
        super("Ошибка! Невозможно создать персонажа с таким именем!");
    }
}
