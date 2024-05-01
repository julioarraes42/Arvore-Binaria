package programa;

public class ArvoreBinaria {
	
	public No noRaiz;
	
	public ArvoreBinaria() {
		this.noRaiz = null;
	}
	
	public void inserirNo(No no, int valor) {
		if(this.noRaiz == null) {
			this.noRaiz = new No(valor);
		}else if(valor < no.valor){
			if(no.menor == null) {
				no.menor = new No(valor);
			}
			else {
				no = no.menor;
				inserirNo(no, valor);
			}
		}else if(valor > no.valor) {
			if(no.maior == null) {
				no.maior = new No(valor);
			}else {
				no = no.maior;
				inserirNo(no, valor);
			}
		}
	}
	
	public void imprimirEmOrdem(No no) {
		if(no != null) {
			if(no.menor != null) {
				imprimirEmOrdem(no.menor);
			}
			System.out.print(no.valor);
			if(no.maior != null) {
				imprimirEmOrdem(no.maior);
			}
		}
	}
	
	public void imprimirPreOrdem(No no) {
		if(no != null) {
			System.out.print(no.valor);
			if(no.menor != null) {
				imprimirPreOrdem(no.menor);
			}
			if(no.maior != null) {
				imprimirPreOrdem(no.maior);
			}
		}
	}
	
	public void imprimirPosOrdem(No no) {
		if(no != null) {
			if(no.menor != null) {
				imprimirPosOrdem(no.menor);
			}
			if(no.maior != null) {
				imprimirPosOrdem(no.maior);
			}
			System.out.print(no.valor);
		}
	}

	public No excluirNo(No raiz, int valor) {
		if (raiz == null)
			return raiz;
		if (valor < raiz.valor)
			raiz.menor = excluirNo(raiz.menor, valor);
		else if (valor > raiz.valor)
			raiz.maior = excluirNo(raiz.maior, valor);
		else {
			if (raiz.menor == null)
				return raiz.maior;
			else if (raiz.maior == null)
				return raiz.menor;
			raiz.valor = encontrarMenorValor(raiz.maior);
			raiz.maior = excluirNo(raiz.maior, raiz.valor);
		}
		return raiz;
	}

	int encontrarMenorValor(No no) {
		int menorValor = no.valor;
		while (no.menor != null) {
			menorValor = no.menor.valor;
			no = no.menor;
		}
		return menorValor;
	}
	
	

}
