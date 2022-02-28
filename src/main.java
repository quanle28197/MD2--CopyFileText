import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> source = new ArrayList<>();
        List<String> destination = new ArrayList<>();
        try {
            readFileSource(source);
            ShowElementInArray(source);
            source.add("1\tTui\tHa Noi\n");
            source.add("2\tbui\tBa Noi\n");
            source.add("3\tUui\tTa Noi\n");
            createFileDestination(source, "source.txt");

            destination.addAll(source);
            createFileDestination(destination, "detanation.txt");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileSource(List<String> source) throws IOException {
        FileReader fileReaderSource = new FileReader("source.txt");
        BufferedReader bufferedSource = new BufferedReader(fileReaderSource);
        String line;
        while  ((line = bufferedSource.readLine()) != null) {
            source.add(line);
        }
        bufferedSource.close();
    }

    private static void createFileDestination(List<String> destination, String path) throws IOException {
        FileWriter fileDestination = new FileWriter(path);
        for (String e: destination) {
            fileDestination.write(e);
        }
        fileDestination.close();
    }

    private static void ShowElementInArray(List<String> source) {
        for (String e: source) {
            System.out.println(e);
        }
    }
}
