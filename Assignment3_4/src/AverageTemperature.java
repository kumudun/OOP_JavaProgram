import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AverageTemperature {
    private final static String FILENAME = "/mnt/data/3e136fc2-f017-4f4f-a9a6-86dc1aceab19.csv";

    public static void main(String[] args) {
        BufferedReader reader = null;
        String line;
        String[] columnNames = new String[0];
        boolean header = true;
        int ulkoTaloIndex = -1;

        double sumTemperature = 0;
        int count = 0;

        try {
            reader = new BufferedReader(new FileReader(FILENAME));

            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";");

                if (header) {
                    columnNames = columns;
                    // Find the index of "UlkoTalo" column
                    for (int i = 0; i < columnNames.length; i++) {
                        if (columnNames[i].equalsIgnoreCase("UlkoTalo")) {
                            ulkoTaloIndex = i;
                            break;
                        }
                    }
                    if (ulkoTaloIndex == -1) {
                        System.err.println("Column 'UlkoTalo' not found.");
                        return;
                    }
                    header = false;
                } else {
                    // Parse date to check if it's 01.01.2023
                    String dateStr = columns[0].split(" ")[0]; // assuming first column is DateTime
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                    LocalDate date = LocalDate.parse(dateStr, formatter);

                    if (date.equals(LocalDate.of(2023, 1, 1))) {
                        // Replace comma with dot for decimal parsing
                        String tempStr = columns[ulkoTaloIndex].replace(',', '.');
                        double temp = Double.parseDouble(tempStr);
                        sumTemperature += temp;
                        count++;
                    }
                }
            }

            if (count > 0) {
                double average = sumTemperature / count;
                System.out.println("Average temperature for 01.01.2023: " + average + " °C");
            } else {
                System.out.println("No data found for 01.01.2023");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.err.println("Error closing file: " + FILENAME);
            }
        }
    }
}

