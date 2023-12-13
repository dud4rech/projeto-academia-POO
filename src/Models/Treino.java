package Models;

import java.util.ArrayList;
import java.util.List;

public class Treino {
	
	private String nomeTreino;
	private List<Exercicio> treino = new ArrayList<Exercicio>();
	private String foco;
	
	public List<Exercicio> getTreino() {
		return treino;
	}
	public void setTreino(Exercicio treino) {
		this.treino.add(treino);
	}
	public String getFoco() {
		return foco;
	}
	public void setFoco(String foco) {
		this.foco = foco;
	}
	public String getNomeTreino() {
		return nomeTreino;
	}
	public void setNomeTreino(String nomeTreino) {
		this.nomeTreino = nomeTreino;
	}
}
