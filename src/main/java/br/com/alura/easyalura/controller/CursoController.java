package br.com.alura.easyalura.controller;

import br.com.alura.easyalura.dto.CursoDto;
import br.com.alura.easyalura.repository.CursoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CursoController {

  private final CursoRepository cursoRepository;

  public CursoController(CursoRepository cursoRepository) {
    this.cursoRepository = cursoRepository;
  }

  @GetMapping("/cursos")
  public List<CursoDto> lista() {
    return cursoRepository.findAll().stream().map(CursoDto::new).toList();
  }

}
