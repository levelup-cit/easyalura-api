package br.com.alura.easyalura.dto;

import br.com.alura.easyalura.model.Curso;

import java.time.LocalDate;

public class CursoDto {

  private Long id;

  private String titulo;

  private String descricao;

  private String slug;

  private int cargaHoraria;

  private LocalDate dataCriacao;

  private LocalDate dataAtualizacao;

  public CursoDto(Curso curso) {
    this.id = curso.getId();
    this.titulo = curso.getTitulo();
    this.descricao = curso.getDescricao();
    this.slug = curso.getSlug();
    this.cargaHoraria = curso.getCargaHoraria();
    this.dataCriacao = curso.getDataCriacao();
    this.dataAtualizacao = curso.getDataAtualizacao();
  }

  public Long getId() {
    return id;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public String getSlug() {
    return slug;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public LocalDate getDataCriacao() {
    return dataCriacao;
  }

  public LocalDate getDataAtualizacao() {
    return dataAtualizacao;
  }
}
