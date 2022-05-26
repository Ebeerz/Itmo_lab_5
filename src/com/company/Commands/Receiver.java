package com.company.Commands;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Receiver {

    private static Map<String, Command> commandList = new HashMap<>();
    private static Map<String, String> commandDescriptionList = new HashMap<>();


    public static Map<String, String> getCommandDescriptionList() {
        return commandDescriptionList;
    }

    public void regist(Command... commands) {
        for (Command command : commands) {
            Receiver.commandList.put(command.getName(), command);
            Receiver.commandDescriptionList.put(command.getName(), command.getDescription());
        }
    }


    public void runCommand(String command) {
        String[] nameAndArgument = command.split(" ");
        String name = nameAndArgument[0];
        String arg = nameAndArgument[1];
        if (commandList.get(name) == null) {
            System.out.println("Такой команды не существует");
        }
        else if (nameAndArgument.length > 3){
            System.out.println("Неверный формат ввода");
            return;
        }
        else {
            try{
                commandList.get(name).execute(arg);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


}


