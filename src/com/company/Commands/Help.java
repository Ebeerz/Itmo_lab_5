package com.company.Commands;

import java.util.Map;

public class Help implements Command{
    @Override
    public String execute(Object o) {
        Map<String,String> commandDescriptionList = Receiver.getCommandDescriptionList();
        for(Map.Entry<String, String> pair : commandDescriptionList.entrySet())
        {
            String value = pair.getKey() + " -> " +  pair.getValue();
            System.out.println(value);
        }
        return null;
    }

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescription() {
        return "Справка по коммандам";
    }
}
