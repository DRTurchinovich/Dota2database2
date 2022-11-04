package Dota2.HeroDataBase.service;

import Dota2.HeroDataBase.HeroDescription.ResultDTO;
import Dota2.HeroDataBase.HeroDescription.RootDTO;
import Dota2.HeroDataBase.HttpConfig.Client;
import Dota2.HeroDataBase.percistance.entity.Root;
import Dota2.HeroDataBase.percistance.repository.RootRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;
import java.io.IOException;

@Service
public class ParsingService {
    @Autowired
    Client client;
    @Autowired
    RootRepository rootRepository;

//    @Autowired
//    public ParsingService(Client client, RootRepository rootRepository) {
//
//        this.client = client;
//        this.rootRepository = rootRepository;
//    }

    @Transient
    public Root getRoot() {
        String body = null;
        try {
            body = client.getBody();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(body);

        Root root = new Gson().fromJson(body, Root.class);
        System.out.println(root.getResult().getData().getHeroes());
        rootRepository.save(root);


//        System.out.println(root);
//        System.out.println(root.getResult().data.heroes.get(0).toString());


//        RootDTO rootDto = new Gson().fromJson(body, RootDTO.class);
//        Root root = new Root();
//        root.setResult(rootDto.getResult());
//        ResultDTO resultDto = rootDto.getResult();


//        rootRepository.save();
//        System.out.println(rootDto);
//        System.out.println(rootDto.getResult().data.heroes.get(0).toString());

        return root;

    }
}
