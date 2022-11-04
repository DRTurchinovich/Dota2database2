package Dota2.HeroDataBase.percistance.repository;

import Dota2.HeroDataBase.percistance.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
}
