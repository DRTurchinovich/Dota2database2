package Dota2.HeroDataBase.HeroDescription;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResultDTO {
    public DataDTO data;
    public int status;

}
