package br.com.alura.easyalura.repository;

import br.com.alura.easyalura.model.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {
}
