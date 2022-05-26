package com.company.Commands;

import com.company.Org.ProductCollection;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//парсер должен сканить несколько организаций в xml, для каждой должен создаваться отдельный объект Product и каждый должен добавляться в коллекцию

public class Main {
    public static void main(String[] args) throws IOException, ParserException {
        Scanner sc = new Scanner(System.in);
        ProductCollection collection = new ProductCollection();
        ProductCollection.setFileName(args[0]);
        Parser.fillCollection(ProductCollection.getFileName());

        Receiver receiver = new Receiver();
        receiver.regist(new Exit(), new Info(), new Show(), new Add(), new RemoveById(), new Clear(), new UpdateById(), new RemoveAnyByPrice(), new Help(),
        new FilterContainsName(), new Save(), new ExecuteScript(), new CountGreaterThanManufacturer(), new AddIfMin(), new RemoveLower());
        ArrayList<String> usedCommands = new ArrayList<String>();


        while (true) {
            String command = sc.nextLine();
            if(command.split(" ")[0].equals("history")){
                System.out.println(usedCommands.toString());
                continue;
            }

            receiver.runCommand(command + " a");
            usedCommands.add(command.split(" ")[0]);
            if (usedCommands.size() > 11) usedCommands.remove(0);
        }


    }
}
