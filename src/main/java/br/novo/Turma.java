package br.novo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Turma {
  private UUID id;
  private String horario;
  private String local;
  private int capacidade;
  private List<Aluno> alunos;
  private Professor professor;
  private Disciplina disciplina;

  public Turma(String horario, String local, int capacidade) {
    this.id = UUID.randomUUID();
    this.horario = horario;
    this.local = local;
    this.capacidade = capacidade;
    this.alunos = new ArrayList<>();
  }

  public String adicionarAluno(Aluno aluno) {
    if (alunos.size() < capacidade) {
      alunos.add(aluno);
      return "Aluno adicionado com sucesso.";
    } else {
      return "Turma está cheia.";
    }
  }

  public void adicionarProfessor(Professor professor) {
    this.professor = professor;
  }

  public void adicionarDisciplina(Disciplina disciplina) {
    this.disciplina = disciplina;
  }

  public boolean abrirTurma() {
    return alunos.size() > 1;
  }

  public String gerarPauta() {
    StringBuilder pauta = new StringBuilder();
    pauta.append("ID da Turma: ").append(id).append("\n");
    pauta.append("Horário: ").append(horario).append("\n");
    pauta.append("Local: ").append(local).append("\n");
    pauta.append("Capacidade: ").append(capacidade).append("\n");
    pauta.append("Número de Alunos: ").append(alunos.size()).append("\n");
    if (professor != null) {
      pauta.append("Professor: ").append(professor.getNome()).append("\n");
    }
    if (disciplina != null) {
      pauta.append("Disciplina: ").append(disciplina.getNome()).append("\n");
    }
    return pauta.toString();
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public List<Aluno> getAlunos() {
    return alunos;
  }

  public void setAlunos(List<Aluno> alunos) {
    this.alunos = alunos;
  }

  public Professor getProfessor() {
    return professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public Disciplina getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(Disciplina disciplina) {
    this.disciplina = disciplina;
  }
}