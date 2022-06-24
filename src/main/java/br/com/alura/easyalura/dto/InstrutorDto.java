package br.com.alura.easyalura.dto;


import br.com.alura.easyalura.model.Instrutor;

public class InstrutorDto {

  private Long id;

  private String nome;

  private String descricao;

  private String linkedinUrl;

  public InstrutorDto(Instrutor instrutor) {
    this.id = instrutor.getId();
    this.nome = instrutor.getNome();
    this.descricao = instrutor.getDescricao();
    this.linkedinUrl = instrutor.getLinkedinUrl();
  }

  public Long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public String getLinkedinUrl() {
    return linkedinUrl;
  }
}
