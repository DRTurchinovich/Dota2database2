package Dota2.HeroDataBase.percistance.repository;

import Dota2.HeroDataBase.percistance.entity.Root;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RootRepository extends JpaRepository<Root, Long> {

}
