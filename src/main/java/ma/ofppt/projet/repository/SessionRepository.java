package ma.ofppt.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ofppt.projet.entity.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
