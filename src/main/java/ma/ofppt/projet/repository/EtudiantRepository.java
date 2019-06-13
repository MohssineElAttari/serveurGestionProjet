package ma.ofppt.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ofppt.projet.entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

}
