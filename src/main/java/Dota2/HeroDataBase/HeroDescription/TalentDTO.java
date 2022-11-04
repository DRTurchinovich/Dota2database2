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
public class TalentDTO {
    public int id;
    public String name;
    public String name_loc;
    public String desc_loc;
    public String lore_loc;
    public ArrayList<Object> notes_loc;
    public String shard_loc;
    public String scepter_loc;
    public int type;
    public String behavior;
    public int target_team;
    public int target_type;
    public int flags;
    public int damage;
    public int immunity;
    public int dispellable;
    public int max_level;
    public ArrayList<Integer> cast_ranges;
    public ArrayList<Integer> cast_points;
    public ArrayList<Integer> channel_times;
    public ArrayList<Integer> cooldowns;
    public ArrayList<Integer> durations;
    public ArrayList<Integer> damages;
    public ArrayList<Integer> mana_costs;
    public ArrayList<Object> gold_costs;
    public ArrayList<SpecialValueDTO> special_values;
    public boolean is_item;
    public boolean ability_has_scepter;
    public boolean ability_has_shard;
    public boolean ability_is_granted_by_scepter;
    public boolean ability_is_granted_by_shard;
    public int item_cost;
    public int item_initial_charges;
    public Object item_neutral_tier;
    public int item_stock_max;
    public int item_stock_time;
    public int item_quality;
}
