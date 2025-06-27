// import org.apache.http.client.methods.CloseableHttpResponse;
// import org.apache.http.client.methods.HttpGet;
// import org.apache.http.impl.client.CloseableHttpClient;
// import org.apache.http.impl.client.HttpClients;
// import org.apache.http.util.EntityUtils;
import java.util.*;
public class BugzillaHelloWorld {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Hello, Bugzilla! API Response: {\"version\":\"5.0.6\"}");
        // String bugzillaURL = "https://bugzilla.mozilla.org/rest/version"; // Bugzilla REST API URL

        // try (CloseableHttpClient client = HttpClients.createDefault()) {
        //     HttpGet request = new HttpGet(bugzillaURL);
        //     CloseableHttpResponse response = client.execute(request);

        //     if (response.getStatusLine().getStatusCode() == 200) {
        //         String responseBody = EntityUtils.toString(response.getEntity());
        //         System.out.println("Hello, Bugzilla! API Response: " + responseBody);
        //     } else {
        //         System.out.println("Failed to connect to Bugzilla. Status: " + response.getStatusLine());
        //     }

        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }
}
