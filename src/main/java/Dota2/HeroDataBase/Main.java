package Dota2.HeroDataBase;

import Dota2.HeroDataBase.HeroDescription.RootDTO;
import Dota2.HeroDataBase.HttpConfig.Client;
import Dota2.HeroDataBase.percistance.repository.RootRepository;
import Dota2.HeroDataBase.service.ParsingService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(Main.class, args);


	}

}


