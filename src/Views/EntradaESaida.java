package Views;

import java.util.List;

import javax.swing.JOptionPane;
import Models.Aluno;
import Models.Exercicio;
import Models.Funcionario;
import Models.Treino;

public class EntradaESaida {
	
	public static String solicitarTexto(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public static float solicitarFloat(String msg) {
		return Float.parseFloat(JOptionPane.showInputDialog(msg));
	}
	
	public static int solicitarInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static void exibirTexto(Object obj, String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
	
	
	public static String exibirExercicios(List<Exercicio> e) {
		String detalhes="";
		
		for(Exercicio exercicio : e) {
			detalhes+="Nome do Exercício: "+exercicio.getNome()+"\n";
			detalhes+="Séries e repetições: "+exercicio.getSerie()+"\n";
		}
		
		return detalhes;
	}
	
	public static String exibirNomeTreino(List<Treino> t) {
		String detalhes="";
		for( Treino treino : t) {
			detalhes+=treino.getNomeTreino()+"\n";
		}
		
		return detalhes;
	}
	
	public static String exibirTreino(List<Treino> t) {
		String detalhes="";
		for( Treino treino : t) {
			detalhes+=treino.getNomeTreino()+"\n";
			detalhes+="Foco: "+treino.getFoco()+"\n";
			detalhes+=exibirExercicios(treino.getTreino());
		}
		
		return detalhes;
	}
	
	public static String exibirAluno(String nome) {
		String detalhes = "Aluno: " + nome +"\n";
		
		return detalhes;
	}
	
	public static String exibirAluno(Aluno a) {
		String detalhes="Informações do aluno: \n";
		detalhes+="Nome completo: "+a.getNome()+"\n";
		detalhes+="Telefone: "+a.getTelefone()+"\n";
		detalhes+="E-mail: "+a.getEmail()+"\n";
		detalhes+="IMC: "+a.getImc()+"\n";
		detalhes+="Plano: "+a.getPlano()+"\n";
		detalhes+="Treino do aluno:\n"+exibirNomeTreino(a.getTreinos());
		
		return detalhes;
	}
	
	public static String exibirFuncionario(String nome) {
		String detalhes="Funcionário: " + nome + "\n";

		return detalhes;
	}
	
	public static String exibirFuncionario(Funcionario f) {
		String detalhes="Informações do funcionário: \n";
		detalhes+="Nome completo: "+f.getNome()+"\n";
		detalhes+="Telefone: "+f.getTelefone()+"\n";
		detalhes+="E-mail: "+f.getEmail()+"\n";
		detalhes+="Salário: R$"+String.format("%.2f", f.getSalario())+"\n";
		detalhes+="Cargo: "+f.getCargo()+"\n";
		
		return detalhes;
	}

	

	

	
}
