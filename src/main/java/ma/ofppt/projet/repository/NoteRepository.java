package ma.ofppt.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ofppt.projet.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Long>{

}
