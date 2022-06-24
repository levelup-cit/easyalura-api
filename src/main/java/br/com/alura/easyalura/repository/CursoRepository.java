package br.com.alura.easyalura.repository;

import br.com.alura.easyalura.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
