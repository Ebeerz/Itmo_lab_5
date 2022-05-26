package com.company.Commands;

public class UpdateById implements Command{
    @Override
    public String execute(Object arg) {
        Receiver receiver = new Receiver();
        receiver.runCommand("remove_by_id " + (String)arg + " a");
        receiver.runCommand("add " + (String) arg + " a");
        System.out.println("Элемент с id: " + (String)arg + " был обновлен");
        return null;
    }

    @Override
    public String getName() {
        return "update_by_id";
    }

    @Override
    public String getDescription() {
        return "Обновить элемент по заданному id";
    }
}
