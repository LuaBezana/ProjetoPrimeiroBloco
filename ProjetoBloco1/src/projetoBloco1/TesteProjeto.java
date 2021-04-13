package projetoBloco1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TesteProjeto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//instanciando objetos
		Filmes filmes = new Filmes();
		Series series = new Series();
		Musicas musicas = new Musicas();
		Jogos jogos = new Jogos();
		AtividadesFisicas atividadesFisicas = new AtividadesFisicas();
		Livros livros = new Livros();
		Listas lista = null;
		
		System.out.println("Bem vinde ao nosso menu! Vamos tirar o seu t�dio nessa pandemia :D");

		System.out.println("\nInsira um NickName: ");
		String nome = scanner.nextLine();
		nome = nome.toUpperCase(); //caps lock

		Usuario usuario = new Usuario(nome);
		
		//menu
		int continuar = 1;
		while (continuar == 1) {
			System.out.println("\n__________________________________________________________"
			+"\nOi " + usuario.getNome() 
			+ ", informe o c�digo da sess�o desejada:"
			+ "\n1- Assistir filmes" 
			+ "\n2- Assistir s�ries" 
			+ "\n3- Ouvir m�sica" 
			+ "\n4- Jogar jogos"
			+ "\n5- Praticar atividades f�sicas" + "\n6- Ler um livro"
			+ "\n__________________________________________________________");
			int opcao = scanner.nextInt();
			switch (opcao) { //lista recebe op��o escolhida
			case 1:
				lista = filmes;
				break;
			case 2:
				lista = series;
				break;
			case 3:
				lista = musicas;
				break;
			case 4:
				lista = jogos;
				break;
			case 5:
				lista = atividadesFisicas;
				break;
			case 6:
				lista = livros;
				break;
			default: {
				System.out.println("Op��o inv�lida");
				lista = null;
				break;
			}
			}

			if (lista != null) { //entra apenas se a lista tiver op��o v�lida
				lista.listaGeneros();
				int genero = scanner.nextInt();
				switch (genero) {
				case 1:
					System.out.println("\nSugest�es:\n" + lista.lista1()); //sugest�es
					break;
				case 2:
					System.out.println("\nSugest�es:\n" + lista.lista2());
					break;
				case 3:
					System.out.println("\nSugest�es:\n" + lista.lista3());
					break;
				case 4:
					System.out.println("\nSugest�es:\n" + lista.lista4());
					break;
				case 5:
					System.out.println("\nSugest�es:\n" + lista.lista5());
					break;
				case 6:
					System.out.println("\nSugest�es:\n" + lista.lista6());
					break;
				default:
					System.out.println("\nOp��o inv�lida");
					break;
				}

			}
			System.out.println("\n" + usuario.getNome() + ", deseja fazer outra atividade?" 
					+ "\n0- N�o."
					+ "\n1- Sim! Me mostre as op��es!");
			continuar = scanner.nextInt();
			while (continuar != 0 && continuar != 1) { //illegalArgumentExc se usu�rio digitar errado
				try {
					if (continuar != 0 && continuar != 1) {
						throw new IllegalArgumentException();
					}
				} catch (IllegalArgumentException e) {
					System.out.println("Voc� digitou um valor inv�lido. Por favor, digite novamente.");
					System.out.println("\n" + usuario.getNome() + ", deseja fazer outra atividade?" 
					+ "\n0- N�o."
					+ "\n1- Sim! Me mostre as op��es!");
					continuar = scanner.nextInt(); //informar op��o v�lida
				}
			}
		}
		System.out.println("\n" + usuario.getNome() + ", obrigade! At� mais");
	}

}