package br.com.alura.easyalura.model;

import javax.persistence.*;

@Entity
@Table(name="instrutores")
public class Instrutor {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  private String descricao;

  private String linkedinUrl;


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
