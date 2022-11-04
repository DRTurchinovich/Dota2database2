package Dota2.HeroDataBase.Controller;

import Dota2.HeroDataBase.percistance.entity.Root;
import Dota2.HeroDataBase.service.ParsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("/hero")
public class HeroController {
    @Autowired
    ParsingService parsingService;


    @GetMapping(value = "/getData")
    public @ResponseBody Root getData () throws IOException, InterruptedException {
//        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://www.dota2.com/datafeed/herodata?language=english&hero_id=94"))
//                .build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        String body = response.body();
//        Root root = new Gson().fromJson(body, Root.class);
//
//        System.out.println(root);
//        System.out.println(root.getResult().data.heroes.get(0).toString());

        Root root = parsingService.getRoot();
        return root;
    }
}
