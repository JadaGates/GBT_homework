package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class helloController {

    @GetMapping("/hello")
    public String hello(){
        
        String getRespose = getRequest();

        return getRespose;
    }
    
    private String getRequest(){
        //String url = "http://localhost:8081/hello";
        String url = "http://bob:8081/hello";
        try {
            URL bobApi = new URL(url);
            HttpURLConnection bobApiRequst = (HttpURLConnection) bobApi.openConnection();

            //添加请求头
            bobApiRequst.setRequestMethod("GET");
            int responseCode = bobApiRequst.getResponseCode();

            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(bobApiRequst.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = bufferedReader.readLine()) != null) {
                response.append(inputLine);
            }
            bufferedReader.close();
            return response.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }
}