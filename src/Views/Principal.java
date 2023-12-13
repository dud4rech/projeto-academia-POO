package Views;

import javax.swing.JOptionPane;

import Models.*;

    public class Principal {
    	 
        public static int exibirMenuPrincipal() {
            int opcao = EntradaESaida.solicitarInt("Menu:\n"
                    + "1 - Criar cadastro\n"
                    + "2 - Alterar cadastro\n"
                    + "3 - Remover cadastro\n"
                    + "4 - Exibir cadastros\n"
                    + "5 - Acessar treinos\n"
                    + "0 - Sair\n");

            return opcao;
        }

        public static void main(String[] args) {
            Academia academia = new Academia();
            
        	
        	Aluno aluno1 = new Aluno();
        	Aluno aluno2 = new Aluno();
        	Aluno aluno3 = new Aluno();
        	
        	Funcionario funcionario1 = new Funcionario();
        	Funcionario funcionario2 = new Funcionario();
        	
        	Treino treinoA = new Treino();
        	Treino treinoB = new Treino();
        	
        	Exercicio exercicio1 = new Exercicio();
        	Exercicio exercicio2 = new Exercicio();
        	Exercicio exercicio3 = new Exercicio();
        	Exercicio exercicio4 = new Exercicio();
        	Exercicio exercicio5 = new Exercicio();
        	
        	Exercicio exercicio6 = new Exercicio();
        	Exercicio exercicio7 = new Exercicio();
        	Exercicio exercicio8 = new Exercicio();
        	Exercicio exercicio9 = new Exercicio();
        	Exercicio exercicio10 = new Exercicio();
        	
        	//inicializando
        	aluno1.setNome("Mariana Lima");
        	aluno1.setEmail("marianarwlima@gmail.com");
        	aluno1.setTelefone("47 98807-5091");
        	aluno1.setImc(22);
        	aluno1.setPlano("Basic");
        	
        	aluno2.setNome("Ana Beatriz Martins");
        	aluno2.setEmail("anabeatrizmartins@gmail.com");
        	aluno2.setTelefone("47 98859-6269");
        	aluno2.setImc(17);
        	aluno2.setPlano("Gold");
        	
        	aluno3.setNome("Eduarda Stipp");
        	aluno3.setEmail("eduardastipp@gmail.com");
        	aluno3.setTelefone("47 99685-4738");
        	aluno3.setImc(18);
        	aluno3.setPlano("Basic");
        	
        	funcionario1.setNome("Gabriel Pereira");
        	funcionario1.setEmail("gabrielpereira@gmail.com");
        	funcionario1.setTelefone("47 99634-5522");
        	funcionario1.setSalario(1600);
        	funcionario1.setCargo("Personal Trainer");

        	funcionario2.setNome("André Schmitz");
        	funcionario2.setEmail("andreschmitz@gmail.com");
        	funcionario2.setTelefone("47 99109-6542");
        	funcionario2.setSalario(2560);
        	funcionario2.setCargo("Encarregado Administrativo");
        	
        	exercicio1.setNome("Leg Press");
        	exercicio1.setSerie("3x12");
        	
        	exercicio2.setNome("Supino Reto");
        	exercicio2.setSerie("3x12");
        	
        	exercicio3.setNome("Remada na máquina");
        	exercicio3.setSerie("3x12");
        	
        	exercicio4.setNome("Desenvolvimento");
      
        	exercicio4.setSerie("3x12");
        	
        	exercicio5.setNome("Abdominal no solo");
        	exercicio5.setSerie("3x12");
        	
        	treinoA.setNomeTreino("Treino A");
        	treinoA.setFoco("Treino de Adaptação 1");
        	treinoA.setTreino(exercicio1);
        	treinoA.setTreino(exercicio2);
        	treinoA.setTreino(exercicio3);
        	treinoA.setTreino(exercicio4);
        	treinoA.setTreino(exercicio5);
        	
        	exercicio6.setNome("Agachamento");
        	exercicio6.setSerie("3x12");
        	
        	exercicio7.setNome("Mesa Flexora");
        	exercicio7.setSerie("3x12");
        	
        	exercicio8.setNome("Cadeira Adutora");
        	exercicio8.setSerie("3x12");
        	
        	exercicio9.setNome("Cadeira Abdutora");
        	exercicio9.setSerie("3x12");
        	
        	exercicio10.setNome("Panturrilha Sentado");
        	exercicio10.setSerie("3x12");
        	
        	treinoB.setNomeTreino("Treino B");
        	treinoB.setFoco("Treino de adaptação 2");
        	treinoB.setTreino(exercicio6);
        	treinoB.setTreino(exercicio7);
        	treinoB.setTreino(exercicio8);
        	treinoB.setTreino(exercicio9);
        	treinoB.setTreino(exercicio10);
        	
        	aluno1.setTreino(treinoA);
        	aluno2.setTreino(treinoB);
        	aluno3.setTreino(treinoB);
        	
        	academia.cadastrarAluno(aluno1);
        	academia.cadastrarAluno(aluno2);
        	academia.cadastrarAluno(aluno3);
        	academia.cadastrarFuncionario(funcionario1);
        	academia.cadastrarFuncionario(funcionario2);
        
        	
        	String detalhes = "Faça o login: ";
        	String[] opcoes = {"Admin", "Personal"};
        	String user = "";
        	int menuLogin = JOptionPane.showOptionDialog(null, detalhes, "Login", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
             
        	if(menuLogin == 1) {
        		user = "personal";
        	}
        	
            int menu = -1;
            
            while (menu != 0) {
                menu = exibirMenuPrincipal();

                switch (menu) {
                    case 1:
                    	criarCadastro(academia, user);
                        break;
                    case 2:
                        alterarCadastros(academia, user);
                        break;
                    case 3:
                        removerCadastros(academia, user);
                        break;
                    case 4:
                    	consultarCadastros(academia, user);
                        break;
                    case 5:
                    	consultarTreinos(academia);
                        break;
                    case 0:
                        EntradaESaida.exibirTexto(null, "Saindo do sistema. Até logo!");
                        break;
                    default:
                        EntradaESaida.exibirTexto(null, "Opção inválida. Digite novamente");
                        break;
                }
            }   
        }
        
        public static void criarCadastro(Academia academia, String user) {
            int escolhaCadastro = -1;
            while (escolhaCadastro != 0) {
                escolhaCadastro = EntradaESaida.solicitarInt("Você deseja:\n"
                        + "1 - Cadastrar aluno\n"
                        + "2 - Cadastrar funcionário\n"
                        + "0 - Voltar ao menu\n");

                switch (escolhaCadastro) {
                    case 1:
                        cadastrarAluno(academia);
                        break;
                    case 2:
                    	if(user.equals("personal")) {
                    		EntradaESaida.exibirTexto(null, "Acesso negado");
                    		break;
                    	} else {
                    		cadastrarFuncionario(academia);
                    	}
                        
                        break;
                    case 0:
                        return;
                    default:
                        EntradaESaida.exibirTexto(null, "Opção inválida. Digite novamente");
                        break;
                }
            }
        }

        public static void cadastrarAluno(Academia academia) {
            int quant = EntradaESaida.solicitarInt("Digite a quantidade de alunos que deseja cadastrar:");
            for (int i = 0; i < quant; i++) {
                Aluno aluno = new Aluno();
                aluno.setNome(EntradaESaida.solicitarTexto("Digite o nome do aluno:\n"));
                aluno.setTelefone(EntradaESaida.solicitarTexto("Digite o telefone do aluno:\n"));
                aluno.setEmail(EntradaESaida.solicitarTexto("Digite o email do aluno\n"));
                aluno.setImc(EntradaESaida.solicitarFloat("Digite o IMC do aluno\n"));

                String detalhes = "Digite o plano escolhido pelo aluno:\n";
        	    String[] opcoes = {"Basic", "Gold"};
        	    int plano = JOptionPane.showOptionDialog(null, detalhes, "Plano", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
             
                if (plano == 0) {
                    aluno.setPlano("Basic");
                } else {
                    aluno.setPlano("Gold");
                }

                int quantTreinos = EntradaESaida.solicitarInt("Quantos treinos deseja cadastrar?");
                for (int j = 0; j < quantTreinos; j++) {
                	aluno.setTreino(academia.alterarTreino());
                }
                academia.cadastrarAluno(aluno);
            }
        }

        public static void cadastrarFuncionario(Academia academia) {
            int quant = EntradaESaida.solicitarInt("Digite a quantidade de funcionários que deseja cadastrar:");
            for (int i = 0; i < quant; i++) {
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(EntradaESaida.solicitarTexto("Digite o nome do funcionário:\n"));
                funcionario.setTelefone(EntradaESaida.solicitarTexto("Digite o telefone do funcionário:\n"));
                funcionario.setEmail(EntradaESaida.solicitarTexto("Digite o email do funcionário\n"));
                funcionario.setSalario(EntradaESaida.solicitarFloat("Digite o salário do funcionário\n"));
                funcionario.setCargo(EntradaESaida.solicitarTexto("Digite o cargo do funcionário"));

                academia.cadastrarFuncionario(funcionario);
            }
        }
        
        public static void alterarCadastros(Academia academia, String user) {
            int escolhaExibicao = -1;
            while (escolhaExibicao != 0) {
                escolhaExibicao = EntradaESaida.solicitarInt("Você deseja:\n"
                        + "1 - Alterar cadastro de alunos\n"
                        + "2 - Alterar cadastro de funcionários\n"
                        + "0 - Voltar ao menu\n");

                switch (escolhaExibicao) {
                    case 1:
                        alterarAluno(academia);
                        break;
                    case 2:
                    	if(user.equals("personal")) {
                    		EntradaESaida.exibirTexto(null, "Acesso negado");
                    		break;
                    	} else {
                    		alterarFuncionario(academia);
                    	}
                        break;
                    case 0:
                        return; 
                    default:
                        EntradaESaida.exibirTexto(null, "Opção inválida. Digite novamente");
                        break;
                }
            }
        }

    public static void alterarAluno(Academia academia) {
    	
   	String detalhes = "";
    	
        if (academia.quantListaAlunos() == 0) {
            EntradaESaida.exibirTexto(null, "Nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < academia.quantListaAlunos(); i++) {
                detalhes += EntradaESaida.exibirAluno(academia.getAlunos().get(i).getNome());
            }
            JOptionPane.showMessageDialog(null, detalhes);
            String nome = EntradaESaida.solicitarTexto("Digite o nome do aluno que deseja alterar o cadastro:");
            Aluno alunoAlterar = academia.encontrarAluno(nome);
            
            if (alunoAlterar == null) {
            	EntradaESaida.exibirTexto(null, "Aluno não encontrado.");
            	return;
            }
            
            int menuTerciario;
            do {
            	menuTerciario = EntradaESaida.solicitarInt("Você deseja:\n"
            			+ "1 - Alterar informações pessoais\n"
            			+ "2 - Alterar o plano\n"
            			+ "0 - Voltar ao menu\n");
            	
            	switch (menuTerciario) {
            	case 1:
            		String novoNome = EntradaESaida.solicitarTexto("Informe o novo nome:\n");
            		academia.alterarNome(alunoAlterar, novoNome);
            		
            		String novoTelefone = EntradaESaida.solicitarTexto("Informe o novo telefone:\n");
            		academia.alterarTelefone(alunoAlterar, novoTelefone);
            		
            		String novoEmail = EntradaESaida.solicitarTexto("Informe o novo e-mail:\n");
            		academia.alterarEmail(alunoAlterar, novoEmail);
            		
            		float novoImc = EntradaESaida.solicitarFloat("Informe o novo IMC:\n");
            		academia.alterarImc(alunoAlterar, novoImc);
            		break;
            	case 2:
                String detalhesAlterar = "Informe o novo plano:\n";
        	    String[] opcoes = {"Basic", "Gold"};
        	    int plano = JOptionPane.showOptionDialog(null, detalhesAlterar, "Plano", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
             
                if (plano == 0) {
                    alunoAlterar.setPlano("Basic");
                } else if(plano == 1) {
                    alunoAlterar.setPlano("Gold");
                } else {
            		EntradaESaida.exibirTexto(null, "Opção de plano inválida. O plano será mantido.");
            	}
            		break;
            	case 0:
            		break;
            	default:
            		EntradaESaida.exibirTexto(null, "Opção inválida. Digite novamente");
            		break;
            	}
            } while (menuTerciario != 0);
        }  
    }

    public static void alterarFuncionario(Academia academia) {
    	String detalhes = "";
    	
        if (academia.quantListaFuncionarios() == 0) {
            EntradaESaida.exibirTexto(null, "Nenhum funcionário cadastrado.");
        } else {
            for (int i = 0; i < academia.quantListaFuncionarios(); i++) {
                detalhes += EntradaESaida.exibirFuncionario(academia.getFuncionarios().get(i).getNome());
            }
            JOptionPane.showMessageDialog(null, detalhes);
	        String nome = EntradaESaida.solicitarTexto("Digite o nome do funcionário que deseja alterar o cadastro:");
	        Funcionario funcionarioAlterar = academia.encontrarFuncionario(nome);
	        
	        if (funcionarioAlterar == null) {
	            EntradaESaida.exibirTexto(null, "Funcionário não encontrado.");
	            return;
	        }
	
	        int menuTerciario;
	        do {
	            menuTerciario = EntradaESaida.solicitarInt("Você deseja:\n"
	                    + "1 - Alterar informações pessoais\n"
	                    + "2 - Alterar o salário\n"
	                    + "3 - Alterar cargo\n"
	                    + "0 - Voltar ao menu\n");
	
	            switch (menuTerciario) {
	                case 1:
	                	String novoNome = EntradaESaida.solicitarTexto("Informe o novo nome:\n");
	            		academia.alterarNome(funcionarioAlterar, novoNome);
	            		
	            		String novoTelefone = EntradaESaida.solicitarTexto("Informe o novo telefone:\n");
	            		academia.alterarTelefone(funcionarioAlterar, novoTelefone);
	            		
	            		String novoEmail = EntradaESaida.solicitarTexto("Informe o novo e-mail:\n");
	            		academia.alterarEmail(funcionarioAlterar, novoEmail);
	            		break;
	                case 2:
	                	float novoSalario = EntradaESaida.solicitarFloat("Informe o novo salário:\n");
	            		academia.alterarSalario(funcionarioAlterar, novoSalario);
	            		break;
	                case 3:
	                	String novoCargo = EntradaESaida.solicitarTexto("Informe o novo cargo:\n");
	            		academia.alterarCargo(funcionarioAlterar, novoCargo);
	            		break;
	                case 0:
	                    break;
	                default:
	                    EntradaESaida.exibirTexto(null, "Opção inválida. Digite novamente");
	                    break;
	            }
	        } while (menuTerciario != 0);
        }
    }
    
    public static void removerCadastros(Academia academia, String user) {
        int escolhaExibicao = -1;
        while (escolhaExibicao != 0) {
            escolhaExibicao = EntradaESaida.solicitarInt("Você deseja:\n"
                    + "1 - Remover o cadastro de alunos\n"
                    + "2 - Remover o cadastro de funcionários\n"
                    + "0 - Voltar ao menu\n");

            switch (escolhaExibicao) {
                case 1:
                    removerAluno(academia);
                    break;
                case 2:
                	if(user.equals("personal")) {
                		EntradaESaida.exibirTexto(null, "Acesso negado");
                		break;
                	} else {
                		removerFuncionario(academia);
                	}
                    break;
                case 0:
                    return; 
                default:
                    EntradaESaida.exibirTexto(null, "Opção inválida. Digite novamente");
                    break;
            }
        }
    }
    
    public static void removerAluno(Academia academia) {
        String detalhes = "";
    	
        if (academia.quantListaAlunos() == 0) {
            EntradaESaida.exibirTexto(null, "Nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < academia.quantListaAlunos(); i++) {
                detalhes += EntradaESaida.exibirAluno(academia.getAlunos().get(i).getNome());
            }
        }
        
        JOptionPane.showMessageDialog(null, detalhes);

        String nome = EntradaESaida.solicitarTexto("Digite o nome do aluno que deseja remover:");
        Aluno alunoARemover = academia.encontrarAluno(nome);

        if (alunoARemover != null) {
            academia.removerAluno(alunoARemover);
            EntradaESaida.exibirTexto(null, "Aluno removido com sucesso!");
        } else {
            EntradaESaida.exibirTexto(null, "Aluno não encontrado.");
        }
    }

    public static void removerFuncionario(Academia academia) {
        String detalhes = "";
    	
        if (academia.quantListaAlunos() == 0) {
            EntradaESaida.exibirTexto(null, "Nenhum funcionário cadastrado.");
        } else {
            for (int i = 0; i < academia.quantListaFuncionarios(); i++) {
                detalhes += EntradaESaida.exibirFuncionario(academia.getFuncionarios().get(i).getNome());
            }
        }

        JOptionPane.showMessageDialog(null, detalhes);

        String nome = EntradaESaida.solicitarTexto("Digite o nome do funcionário que deseja remover:");
        Funcionario funcionarioARemover = academia.encontrarFuncionario(nome);

        if (funcionarioARemover != null) {
            academia.removerFuncionario(funcionarioARemover);
            EntradaESaida.exibirTexto(null, "Funcionário removido com sucesso!");
        } else {
            EntradaESaida.exibirTexto(null, "Funcionário não encontrado.");
        }
    }
    
    public static void removerTreino(Academia academia) {
  	String detalhes = "";
    	
        if (academia.quantListaAlunos() == 0) {
            EntradaESaida.exibirTexto(null, "Nenhum aluno com treino cadastrado.");
        } else {
            for (int i = 0; i < academia.quantListaAlunos(); i++) {
                detalhes += EntradaESaida.exibirAluno(academia.getAlunos().get(i).getNome());
            }
            JOptionPane.showMessageDialog(null, detalhes);

            academia.encontrarAluno(JOptionPane.showInputDialog("Digite o nome do aluno que deseja excluir o treino:")).removeTreino();
        }
    }
    
    
    public static void consultarCadastros(Academia academia, String user) {
        int escolhaExibicao = -1;
        while (escolhaExibicao != 0) {
            escolhaExibicao = EntradaESaida.solicitarInt("Você deseja:\n"
                    + "1 - Consultar alunos\n"
                    + "2 - Consultar funcionários\n"
                    + "0 - Voltar ao menu\n");

            switch (escolhaExibicao) {
                case 1:
                    exibirAlunos(academia);
                    break;
                case 2:
                	if(user.equals("personal")) {
                		EntradaESaida.exibirTexto(null, "Acesso negado");
                		break;
                	} else {
                		exibirFuncionarios(academia);
                	}
                    break;
                case 0:
                    return; 
                default:
                    EntradaESaida.exibirTexto(null, "Opção inválida. Digite novamente");
                    break;
            }
        }
    }
    
    public static void exibirAlunos(Academia academia) {
    	String detalhes = "";
    	
        if (academia.quantListaAlunos() == 0) {
            EntradaESaida.exibirTexto(null, "Nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < academia.quantListaAlunos(); i++) {
                detalhes += EntradaESaida.exibirAluno(academia.getAlunos().get(i).getNome());
            }
        }
        
        JOptionPane.showMessageDialog(null, detalhes);
        Aluno aluno = academia.encontrarAluno(EntradaESaida.solicitarTexto("Qual aluno você deseja consultar os detalhes?\n"));
        detalhes = EntradaESaida.exibirAluno(aluno);
        
        String[] opcoes = {"Ver treinos", "Continuar"};
        int opcao = JOptionPane.showOptionDialog(null, detalhes, "Informações do Aluno", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
        if(opcao == 0) {
        	if(aluno.estaVazia()) {
        		JOptionPane.showMessageDialog(null, "Nenhum treino cadastrado!");
        	} else {
            	JOptionPane.showMessageDialog(null, EntradaESaida.exibirTreino(aluno.getTreinos()));
        	}
        }
    }
    
    public static void exibirFuncionarios(Academia academia) {
    	String detalhes = "";
    	
        if (academia.quantListaFuncionarios() == 0) {
            EntradaESaida.exibirTexto(null, "Nenhum funcionário cadastrado.");
        } else {
            for (int i = 0; i < academia.quantListaFuncionarios(); i++) {
                detalhes += EntradaESaida.exibirFuncionario(academia.getFuncionarios().get(i).getNome());
            }
        }
        
        JOptionPane.showMessageDialog(null, detalhes);
        detalhes = EntradaESaida.exibirFuncionario(academia.encontrarFuncionario(EntradaESaida.solicitarTexto("Qual funcionário você deseja consultar os detalhes?\n")));
        JOptionPane.showMessageDialog(null, detalhes);
    }
    
    public static void adicionarTreino(Academia academia) {
    	
       	String detalhes = "";
        	
            if (academia.quantListaAlunos() == 0) {
                EntradaESaida.exibirTexto(null, "Nenhum aluno cadastrado.");
            } else {
                for (int i = 0; i < academia.quantListaAlunos(); i++) {
                    detalhes += EntradaESaida.exibirAluno(academia.getAlunos().get(i).getNome());
                }
                JOptionPane.showMessageDialog(null, detalhes);
                String nome = EntradaESaida.solicitarTexto("Digite o nome do aluno que deseja adicionar o treino:");
                Aluno alunoAdicionar = academia.encontrarAluno(nome);
                
                if (alunoAdicionar == null) {
                	EntradaESaida.exibirTexto(null, "Aluno não encontrado.");
                	return;
                } else {
                     academia.encontrarAluno(nome).setTreino(academia.alterarTreino());
                 	EntradaESaida.exibirTexto(null, "Treino adicionado!");
                     return;
                }
            }
         }  


    
    public static void consultarTreinos(Academia academia) {
    	int escolhaCadastro = -1;
        while (escolhaCadastro != 0) {
            escolhaCadastro = EntradaESaida.solicitarInt("Você deseja:\n"
                    + "1 - Adicionar novo treino\n"
                    + "2 - Excluir treino existente\n"
                    + "0 - Voltar ao menu\n");

            switch (escolhaCadastro) {
                case 1:
                    adicionarTreino(academia);
                    break;
                case 2:
                    removerTreino(academia);
                    break;
                case 0:
                    return;
                default:
                    EntradaESaida.exibirTexto(null, "Opção inválida. Digite novamente");
                    break;
            }
        }
    }
}