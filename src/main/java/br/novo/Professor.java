package br.novo;

import java.util.ArrayList;
import java.util.List;

public class Professor {
  private String nome;
  private String endereco;
  private String telefone;
  private String titulo;
  private String formaContratacao;
  private String curriculo;
  private List<Turma> turmas;

  public Professor(String nome, String endereco, String telefone, String titulo, String formaContratacao, String curriculo) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.titulo = titulo;
    this.formaContratacao = formaContratacao;
    this.curriculo = curriculo;
    this.turmas = new ArrayList<>();
  }

  public void adicionarTurma(Turma turma) {
    this.turmas.add(turma);
  }

  public String exibirTurmas() {
    StringBuilder turmasStr = new StringBuilder();
    for (Turma turma : turmas) {
      turmasStr.append(turma.toString()).append("\n");
    }
    return turmasStr.toString();
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

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getFormaContratacao() {
    return formaContratacao;
  }

  public void setFormaContratacao(String formaContratacao) {
    this.formaContratacao = formaContratacao;
  }

  public String getCurriculo() {
    return curriculo;
  }

  public void setCurriculo(String curriculo) {
    this.curriculo = curriculo;
  }

  public List<Turma> getTurmas() {
    return turmas;
  }

  public void setTurmas(List<Turma> turmas) {
    this.turmas = turmas;
  }
}