package br.com.alura.easyalura;

import br.com.alura.easyalura.controller.CursoController;
import br.com.alura.easyalura.model.Curso;
import br.com.alura.easyalura.repository.CursoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CursoController.class)
class CursoControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private CursoRepository cursoRepository;

  @Test
  void listagem() throws Exception {
    when(cursoRepository.findAll())
        .thenReturn(List.of(
            new Curso("Spring Boot", "Spring Boot", "/spring-boot", 10),
            new Curso("JPA", "JPA", "/jpa", 8)));

    mockMvc.perform(get("/cursos"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.length()").value(2))
        .andExpect(jsonPath("$[0].titulo").value("Spring Boot"))
        .andExpect(jsonPath("$[1].titulo").value("JPA"));
  }


}
