package projetoBloco1;

import java.util.ArrayList;
import java.util.List;

public class AtividadesFisicas extends Listas{

	public AtividadesFisicas() {}

	@Override
	public void listaGeneros() {
		System.out.println("\n__________________________________________________________");
		System.out.println("\nDigite o c�digo da Atividade desejada:"
				+ "\n1- Dan�a"
				+ "\n2- Aer�bicos"
				+ "\n3- Yoga"
				+ "\n4- Medita��o"
				+ "\n5- Funcional"
				+ "\n6- Para Crian�as"
				+ "\n__________________________________________________________");
	}

	@Override
	public List<String> lista1() {
		List<String> listaDanca = new ArrayList<String>();
		listaDanca.add("Irtylo Santos - YouTube");
		listaDanca.add("Playdance - YouTube");
		listaDanca.add("Dance Tutorial - YouTube");
		
		return listaDanca;
	}

	@Override
	public List<String> lista2() {
		List<String> listaAerobicos = new ArrayList<String>();
		listaAerobicos.add("Exercicio em casa - YouTube");
		listaAerobicos.add("Carol Borba - YouTube");
		listaAerobicos.add("Calistenia Brasil - YouTube");
		
		return listaAerobicos;
	}

	@Override
	public List<String> lista3() {
		List<String> listaYoga = new ArrayList<String>();
		listaYoga.add("Yoga em casa - YouTube");
		listaYoga.add("Pri Leite Yoga - YouTube");
		listaYoga.add("Fernanda Yoga - YouTube");
		return listaYoga;
	}

	@Override
	public List<String> lista4() {
		List<String> listaMeditacao = new ArrayList<String>();
		listaMeditacao.add("Camila Zen YouTube");
		listaMeditacao.add("Yoga para voc� YouTube");
		listaMeditacao.add("Poetoterapia - YouTube");
		return listaMeditacao;
	}

	@Override
	public List<String> lista5() {
		List<String> listaFuncional = new ArrayList<String>();
		listaFuncional.add("Carol Borba - YouTube");
		listaFuncional.add("Thiago Pugliesi - YouTube");
		listaFuncional.add("Boa Forma - YouTube");
		return listaFuncional;
	}

	@Override
	public List<String> lista6() {
		List<String> listaParaCriancas = new ArrayList<String>();
		listaParaCriancas.add("Robson Furlan - Gin�stica Infantil YouTube");
		listaParaCriancas.add("Viva Saud�vel YouTube");
		listaParaCriancas.add("Eu Incentivo A Sa�de - YouTube");
		return listaParaCriancas;		
	}

}