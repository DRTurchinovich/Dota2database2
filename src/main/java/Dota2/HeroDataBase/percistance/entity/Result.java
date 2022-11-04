package Dota2.HeroDataBase.percistance.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Configuration
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "data_id", referencedColumnName = "id")
    public Data data;

    public int status;

    @OneToOne(mappedBy = "result", cascade=CascadeType.ALL)
    private Root root;

}
