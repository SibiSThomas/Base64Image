package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
