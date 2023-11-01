//Introdução sobre listas
package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		//Instanciando uma lista por classe (única forma de criar uma lista)
		List<String> list = new ArrayList<String>();
		
		System.out.println("-----------------------------------------------------------");
		
		//Add itens a lista
		list.add("Fulano");
		list.add("Ciclano");
		list.add("Beltrano");
		list.add("ADffdfasd");
		list.add("YTReter");
		list.add("Yewrwtrfg");
		list.add("!#$EFDSFG");
		list.add("fasdfke");
		list.add("%¨$FDGFdaf");
		list.add("Pdfsadfsd");
		list.add("Qfcdsfs");
		list.add("Bdfsdf");
		list.add("POEORQWEr");
		
		
		list.add(1, "Agregado");
		
		//Removendo da lista
		//list.remove(0);
		
		System.out.println("Tamanho da lista anterior: " + list.size());
		
		for (String x : list)
			System.out.println(x);
		
		System.out.println("-----------------------------------------------------------");
		
		//Predicativo/Lambda
		list.removeIf(x -> x.charAt(0) == 'S');
		
		for (String x : list)
			System.out.println(x);
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Index of Fulano: " + list.indexOf("Fulano"));
		System.out.println("Index of Fulano: " + list.indexOf("Marco"));
		
		System.out.println("-----------------------------------------------------------");
		
		//Filtrar itens da lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		
		System.out.println("Filtro por nomes começamdo com a letra B: ");
		for (String x : result)
			System.out.println(x);
		
		System.out.println("-----------------------------------------------------------");
		
		//Filtrar o primeiro da lista
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		System.out.println("O primeiro da lista começando com a letra B é: " + name);
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Tamanho da lista atual: " + list.size());
	}

}
