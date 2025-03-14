import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    // This method will read data from CSV file and return as a list
    public static List<String[]> read(String file) throws IOException {
        String data_row;
        List<String[]> data = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((data_row = br.readLine()) != null){
            String[] dataRecords = data_row.split(",");
            data.add(dataRecords);
        }
        return data;
    }
}
