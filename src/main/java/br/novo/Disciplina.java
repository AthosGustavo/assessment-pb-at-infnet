package br.novo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Disciplina {
  private UUID id;
  private String codigo;
  private String nome;
  private int cargaHoraria;
  private int numeroCreditos;
  private String descricao;
  private List<Turma> turmas;

  public Disciplina(String codigo, String nome, int cargaHoraria, int numeroCreditos, String descricao) {
    this.id = UUID.randomUUID();
    this.codigo = codigo;
    this.nome = nome;
    this.cargaHoraria = cargaHoraria;
    this.numeroCreditos = numeroCreditos;
    this.descricao = descricao;
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

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  public int getNumeroCreditos() {
    return numeroCreditos;
  }

  public void setNumeroCreditos(int numeroCreditos) {
    this.numeroCreditos = numeroCreditos;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public List<Turma> getTurmas() {
    return turmas;
  }

  public void setTurmas(List<Turma> turmas) {
    this.turmas = turmas;
  }
}