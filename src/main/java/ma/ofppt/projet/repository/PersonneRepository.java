package ma.ofppt.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ofppt.projet.entity.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long>{

}
