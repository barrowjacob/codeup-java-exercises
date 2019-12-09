package Sand.FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroceryApp {

    final static String folder = "data";
    final static String nameFile = "groceries.txt";

    public static void main(String[] args) {

        Path dataDirectory = Paths.get(folder);
        Path dataFile = Paths.get(folder, nameFile);
        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
        Path filePath = Paths.get("data", "groceries.txt");
        try {
            Files.write(filePath, groceryList);
            Files.write(
                    filePath,
                    Arrays.asList("eggs"), // list with one item
                    StandardOpenOption.APPEND
            );

            Path groceriesPath = Paths.get("data", "groceries.txt");
            List<String> groceryListLines = Files.readAllLines(groceriesPath);
            for (int i = 0; i < groceryListLines.size(); i += 1) {
                System.out.println((i + 1) + ": " + groceryListLines.get(i));
            }

            //update line
            List<String> tempList = new ArrayList<>();
            for (String grocery : groceryListLines) {
                if (grocery.equals("milk")) {
                    tempList.add("cream");
                    continue;
                }
                tempList.add(grocery);
            }


            Files.write(filePath, tempList);
            groceryListLines = Files.readAllLines(groceriesPath);
            for (int i = 0; i < groceryListLines.size(); i += 1) {
                System.out.println((i + 1) + ": " + groceryListLines.get(i));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }



        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
