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

	public No excluirNo(No no, int valor) {
		if (no == null)
			return no;
		if (valor < no.valor)
			no.menor = excluirNo(no.menor, valor);
		else if (valor > no.valor)
			no.maior = excluirNo(no.maior, valor);
		else {
			if (no.menor == null)
				return no.maior;
			else if (no.maior == null)
				return no.menor;
			no.valor = encontrarMenorValor(no.maior);
			no.maior = excluirNo(no.maior, no.valor);
		}
		return no;
	}

	public int encontrarMenorValor(No no) {
		int menorValor = no.valor;
		while (no.menor != null) {
			menorValor = no.menor.valor;
			no = no.menor;
		}
		return menorValor;
	}

	public void buscarValor(No no, int valor) {
		if(no != null) {
			if(valor == no.valor) 
				System.out.println("existe");
			else if(valor < no.valor) 
				buscarValor(no.menor, valor);
			else if(valor > no.valor)
				buscarValor(no.maior, valor);
		}else
			System.out.println("Nao existe");
	}
	
	public int contarAltura(No no) {
		int valorMenor = 0;
		int valorMaior = 0;
		if(no == null)
			return 0;
		if(no.menor != null) 
			valorMenor = contarAltura(no.menor);
		if(no.maior != null)
			valorMaior = contarAltura(no.maior);
		if(no.menor == null && no.maior == null) {
			return 1;
		}
		
		if(no.valor == noRaiz.valor) {
			if(valorMenor > valorMaior) {
				return valorMenor;
			}else
				return valorMaior;
		}else if(valorMenor > valorMaior) {
			return valorMenor + 1;
		}else
			return valorMaior + 1;
		
	}
	
	

}
