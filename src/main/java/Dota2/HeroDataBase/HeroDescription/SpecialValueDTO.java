package Dota2.HeroDataBase.HeroDescription;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SpecialValueDTO {
    public String name;
    public ArrayList<Double> values_float;
    public boolean is_percentage;
    public String heading_loc;
    public ArrayList<BonuseDTO> bonuses;
}
