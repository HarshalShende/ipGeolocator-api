import com.google.gson.Gson;
import com.ipgeolocation.api.IpApi;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    private static OkHttpClient client = new OkHttpClient();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("[>] Enter the ip or domain name : ");
        String requestedIp = scanner.nextLine();

        System.out.print((char)27 + "[34m"+"\n          Geolocation API"+(char)27+"[0m");

        System.out.println();

        int ch=186;//186,187
        for(int i=0;i<7;i++) {

            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print((char) 27+"[34m"+(char)ch +"     "+(char)27+"[0m");

        }

    String str = getApiData(requestedIp);

        System.out.println(str);

    }

    public static String getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String getApiData(String request) {

        String json = null;

                try {

            json = getJSON("https://www.freegeoip.net/json/"+request);
                } catch (Exception e1) {

                    e1.printStackTrace();
                }

        Gson gson = new Gson();
        IpApi ipApi = gson.fromJson(json,IpApi.class);

        return ipApi.toString();
    }
}
