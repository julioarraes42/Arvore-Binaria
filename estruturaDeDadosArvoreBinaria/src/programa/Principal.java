package programa;

public class Principal {
	
	public static void main(String[] args) {
		ArvoreBinaria lista = new ArvoreBinaria();
		
		lista.inserirNo(lista.noRaiz, 5);
		lista.inserirNo(lista.noRaiz, 3);
		lista.inserirNo(lista.noRaiz, 8);
		lista.inserirNo(lista.noRaiz, 1);
		lista.inserirNo(lista.noRaiz, 4);
		lista.inserirNo(lista.noRaiz, 7);
		lista.inserirNo(lista.noRaiz, 9);
		lista.inserirNo(lista.noRaiz, 2);
		lista.inserirNo(lista.noRaiz, 6);
		
		lista.imprimirEmOrdem(lista.noRaiz);
		System.out.println();
		lista.imprimirPreOrdem(lista.noRaiz);
		System.out.println();
		lista.imprimirPosOrdem(lista.noRaiz);
	}

}
