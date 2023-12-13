package Models;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Views.EntradaESaida;

public class Aluno extends Pessoa {

    private float imc;
    private String plano; 
    private List<Treino> treino = new ArrayList<Treino>();
    
    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
    
	public void setTreino(Treino treino) {
		this.treino.add(treino);
	}
	public List<Treino> getTreinos() {
		return this.treino;
	}
	
	public boolean estaVazia() {
		return this.treino.isEmpty();
	}
	
	public Treino encontrarTreino() {
		String treinoBuscado = JOptionPane.showInputDialog("Digite o treino que deseja buscar: \n");
		
		if(treino.size() == 0) {
			return null;
		} else {
			for(Treino t : treino) {
				if (t.getNomeTreino().equals(treinoBuscado)) {
		            return t;
		        }
		    }
			JOptionPane.showMessageDialog(null, "Treino não cadastrado para o aluno "+this.getNome());
		    return null; 
		}
		}
		
	public void removeTreino() {
		if(treino.size() == 0) {
			JOptionPane.showMessageDialog(null, "Nenhum treino cadastrado!");
			return;
		}
		JOptionPane.showMessageDialog(null, EntradaESaida.exibirNomeTreino(treino));
		Treino treinoARemover = encontrarTreino();
		if(treinoARemover != null) {	
			for(int i = 0; i < treino.size(); i++) {
				if(treino.get(i).equals(treinoARemover)) {
					treino.remove(i);
					JOptionPane.showMessageDialog(null, "Treino removido com sucesso!");
				}
			}
		}
	}
	
}
