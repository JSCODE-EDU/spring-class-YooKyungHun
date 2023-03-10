import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class GetData {
    public static void main(String[] args) throws IOException {
        APIKEY apikey = new APIKEY();

        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B190021/branchinfo/brcode"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + apikey); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("krnBrm","UTF-8") + "=" + URLEncoder.encode("부천", "UTF-8")); /*부점코드를 조회하고자 하는 부점의 한글명*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb);
    }
}