import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class twolists {
    public static void main(String[] args) throws IOException{
        var Names = new ArrayList<String>();
        var Numbers = new ArrayList<Integer>();
        var fileName = "namesGDP.txt";
        var filepath = Paths.get(fileName);
        var allLines = Files.readAllLines(filepath);

        System.out.println(filepath);

    }
}
