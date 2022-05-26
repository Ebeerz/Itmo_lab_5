package com.company.Commands;

public class Exit implements Command{


    @Override
    public String execute(Object o) {
        System.out.println("Выход из приложения...");
        System.exit(0);
        return null;
    }

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public String getDescription() {
        return "Завершение работы";
    }
}
