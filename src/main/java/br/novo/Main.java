package br.novo;

public class Main {
  public static void main(String[] args) {
    // Criar instâncias de Professor
    Professor professor1 = new Professor("Ricador", "Endereço 1", "1111-1111", "Doutor", "Efetivo", "Curriculo 1");
    Professor professor2 = new Professor("Wanessa", "Endereço 2", "2222-2222", "Mestre", "Temporário", "Curriculo 2");
    Professor professor3 = new Professor("Athos", "Endereço 3", "3333-3333", "Especialista", "Efetivo", "Curriculo 3");

    // Criar instâncias de Disciplina
    Disciplina disciplina1 = new Disciplina("D1", "Estrutura de Dados", 60, 4, "Disciplina de Estrutura de Dados");
    Disciplina disciplina2 = new Disciplina("D2", "Redes", 60, 4, "Disciplina de Redes");
    Disciplina disciplina3 = new Disciplina("D3", "Docker", 60, 4, "Disciplina de Docker");

    // Criar instâncias de Aluno
    Aluno aluno1 = new Aluno("Vicent", "Rua de tras");
    Aluno aluno2 = new Aluno("Tony", "Rua da frente");
    Aluno aluno3 = new Aluno("Lucas", "Rua da esquerda");

    // Criar instâncias de Turma
    Turma turma1 = new Turma("08:00 - 10:00", "Sala 101", 30);
    Turma turma2 = new Turma("10:00 - 12:00", "Sala 102", 30);
    Turma turma3 = new Turma("14:00 - 16:00", "Sala 103", 30);

    turma1.adicionarProfessor(professor1);
    turma1.adicionarDisciplina(disciplina1);

    turma2.adicionarProfessor(professor2);
    turma2.adicionarDisciplina(disciplina2);

    turma3.adicionarProfessor(professor3);
    turma3.adicionarDisciplina(disciplina3);

    turma1.adicionarAluno(aluno1);
    turma2.adicionarAluno(aluno2);
    turma3.adicionarAluno(aluno3);

//    System.out.println(turma1.gerarPauta());
//    System.out.println("Número de alunos: " + turma1.getAlunos().size());
//
//    System.out.println(turma2.gerarPauta());
//    System.out.println("Número de alunos: " + turma2.getAlunos().size());
//
//    System.out.println(turma3.gerarPauta());
//    System.out.println("Número de alunos: " + turma3.getAlunos().size());

    System.out.println(turma1.gerarPauta());
  }
}