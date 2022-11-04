package Dota2.HeroDataBase.percistance.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Component
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "hero")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long id;


    @ManyToOne
    @JoinColumn(name="data")
    private Data data;

    public String name;
    public double order_id;
    public String name_loc;
    public String bio_loc;
    public String hype_loc;
    public String npe_desc_loc;
    public double str_base;
    public double str_gain;
    public double agi_base;
    public double agi_gain;
    public double int_base;
    public double int_gain;
    public double primary_attr;
    public double complexity;
    public double attack_capability;

    @ElementCollection
    public List<Integer> role_levels;

    public double damage_min;
    public double damage_max;
    public double attack_rate;
    public double attack_range;
    public double projectile_speed;
    public double armor;
    public double magic_resistance;
    public double movement_speed;
    public double turn_rate;
    public double sight_range_day;
    public double sight_range_night;
    public double max_health;
    public double health_regen;
    public double max_mana;
    public double mana_regen;

//    @OneToMany(mappedBy = "hero")
//    public List<Ability> abilities;
//
//    @OneToMany(mappedBy = "hero")
//    public List<Talent> talents;
}
