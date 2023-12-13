package Models;

import java.util.ArrayList;
import java.util.List;
import Models.Aluno;
import Models.Funcionario;
import Models.Treino;
import Models.Pessoa;
import Views.EntradaESaida;

public class Academia {

    private List<Aluno> alunos = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Treino> treinos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }
    
    public void removerTreino(Treino treino) {
        treinos.remove(treino);
    }

    public void alterarNome(Pessoa pessoa, String novoNome) {
        pessoa.setNome(novoNome);
    }
    
    public void alterarTelefone(Pessoa pessoa, String novoTelefone) {
        pessoa.setTelefone(novoTelefone);
    }
    
    public void alterarEmail(Pessoa pessoa, String novoEmail) {
        pessoa.setEmail(novoEmail);
    }
    
    public void alterarImc(Aluno aluno, float novoIMC) {
        aluno.setImc(novoIMC);
    }
    
    public void alterarPlano(Aluno aluno, String novoPlano) {
        aluno.setPlano(novoPlano);
    }

    public Treino alterarTreino() {    	
 
        	Treino t = new Treino();
            Exercicio exercicio;
        	t.setNomeTreino(EntradaESaida.solicitarTexto("Digite o nome do treino:\n"));
        	t.setFoco(EntradaESaida.solicitarTexto("Insira o foco do treino:\n"));
            int quantExercicios = EntradaESaida.solicitarInt("Quantos exercícios deseja cadastrar para este treino?\n");
            for(int k = 0; k < quantExercicios; k++) {
            	exercicio = new Exercicio();
            	exercicio.setNome(EntradaESaida.solicitarTexto("Digite o nome do exercício:\n"));
            	exercicio.setSerie(EntradaESaida.solicitarTexto("Insira a quantidade de séries e repetições do exercício:\n"));
            	t.setTreino(exercicio);
            	
            }
       
        return t;
    }
    
    public void alterarSalario(Funcionario funcionario, float novoSalario) {
        funcionario.setSalario(novoSalario);
    }
    
    public void alterarCargo(Funcionario funcionario, String novoCargo) {
        funcionario.setCargo(novoCargo);
    }

	public Aluno encontrarAluno(String nome) {
		for(Aluno aluno : alunos) {
			if (aluno.getNome().equals(nome)) {
	            return aluno;
	        }
	    }
	    return null; 
	}

	public Funcionario encontrarFuncionario(String nome) {
		for(Funcionario funcionario : funcionarios) {
			if (funcionario.getNome().equals(nome)) {
	            return funcionario;
	        }
	    }
	    return null; 
	}

	public int quantListaAlunos() {
		return alunos.size();
	}
	
	public int quantListaFuncionarios() {
		return funcionarios.size();
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}	

