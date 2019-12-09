package Sand.FileIO;
//"nio" is the new "io"
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ClassroomImpl {
        //paths should be static (and final, if you'd like) because they shouldn't move
        //using "/data" tried to access /user and you don't have permission
        //the folder you create is going to be relative to the project, if you don't specify absolute path
        //thus, "data" was created directly underneath the codeup-java-exercises folder
    final static String dir = "data";
        //creating arbitrary file
    final static String fileName = "data/classroom.txt";



        //make sure you set up exceptions as needed
    public static void main(String[] args) {

            //it's useful to set path as a variable
        Path path = Paths.get(dir);
        Path filePath = Paths.get(fileName);
            //this allwows you to see name, etc.
            //lots of functionality with 'Path' variable

            //you can do '!' or "notExists" in this example
        if (!Files.exists(path)){
            try {
                    //this is filled with what you're trying to do
                    //using the createDirectories makes the directory and file
                    //if you don't create a folder first ((use either createDirectories, or manually create the folder)), the following won't work
                Files.createDirectory(path);
                Files.createFile(filePath);
            } catch (IOException e) {
                //this is what happens if there is an exception
                e.printStackTrace();
            }


            List<String> instructors = new ArrayList<>();
            instructors.add("Fer");
            instructors.add("Sophie");
            instructors.add("David");

                //because you're using IO ('write'), you need a try/catch just in case you don't have permission, etc.
            try {
                Files.write(filePath, instructors, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                    //creating variable so that you can see and access whatever is in the file
                List<String> lines = Files.readAllLines(filePath);
                for (String line: lines) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
