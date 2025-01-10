package org.example.sellatestfeature;

//import org.asynchttpclient.Response;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v111.network.Network;

import java.util.Optional;

public class NetworkLogActivity {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver", "A:\\Abhay\\Ashok It Automation\\Java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeDriver driver= new ChromeDriver();
        //log file

        DevTools devTools=driver.getDevTools();
        devTools.createSession();
      //  devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));

        //Event will be fired
     //   devTools.addListener(Network.responseReceived(), response -> {
       //        Response res= (Response) response.getResponse();
            //System.out.println(res.getUrl());
       //     response.getResponse().getStatus();
       // });
    }
}
