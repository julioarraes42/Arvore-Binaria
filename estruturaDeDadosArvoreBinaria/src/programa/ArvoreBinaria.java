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
	
	

}
