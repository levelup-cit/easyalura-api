package br.com.alura.easyalura.controller;

import br.com.alura.easyalura.dto.InstrutorDto;
import br.com.alura.easyalura.repository.InstrutorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstrutorController {

  private final InstrutorRepository instrutorRepository;

  public InstrutorController(InstrutorRepository instrutorRepository) {
    this.instrutorRepository = instrutorRepository;
  }

  @GetMapping("/instrutores")
  public List<InstrutorDto> lista() {
    return instrutorRepository.findAll().stream().map(InstrutorDto::new).toList();
  }


}
