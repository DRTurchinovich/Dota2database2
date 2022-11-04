package Dota2.HeroDataBase.HeroDescription;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BonuseDTO {
    public String name;
    public double value;
    public int operation;
}
