package br.novo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Aluno {
  private UUID id;
  private String matricula;
  private String nome;
  private String endereco;
  private List<Turma> turmas;

  public Aluno(String nome, String endereco) {
    this.id = UUID.randomUUID();
    this.nome = nome;
    this.endereco = endereco;
    this.turmas = new ArrayList<>();
    gerarMatricula();
  }

  private void gerarMatricula() {
    this.matricula = UUID.randomUUID().toString();
  }

  public void adicionarTurma(Turma turma) {
    this.turmas.add(turma);
  }

  public void exibirTurmas() {
    for (Turma turma : turmas) {
      System.out.println(turma);
    }
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public List<Turma> getTurmas() {
    return turmas;
  }

  public void setTurmas(List<Turma> turmas) {
    this.turmas = turmas;
  }
}