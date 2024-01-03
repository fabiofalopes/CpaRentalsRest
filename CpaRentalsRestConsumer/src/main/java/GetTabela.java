import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class GetTabela {

    public static void main(String[] args) {
        try {
            // Update the URL to include the path and query parameters
            URL url = new URL("http://localhost:8080/CpaRentalsRestUtility/rest/getDailyOcupationTable");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            // Set the expected content type of the response
            conn.setRequestProperty("Content-Type", "application/json");

            Scanner scanner = new Scanner(conn.getInputStream());
            String response;

            if (conn.getResponseCode() != 200) {
                scanner = new Scanner(conn.getErrorStream());
                response = "Error From Server \n\n";
            } else {
                scanner = new Scanner(conn.getInputStream());
                response = "Response From Server \n\n";
            }

            scanner.useDelimiter("\\Z");
            System.out.println(response + scanner.next());
            scanner.close();
            conn.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}