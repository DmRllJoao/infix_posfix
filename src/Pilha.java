
@SuppressWarnings("unchecked")
public class Pilha<T> {
	 private T vetor[];
	    private int tamanho;

	    public Pilha(int amount) {
	        this.vetor = (T[]) new Object[amount];
	        this.tamanho = 0;
	    }
	
	    public void push(T elemento) {
	        increaseCapacity();
	        if (tamanho < vetor.length) {
	            vetor[tamanho] = elemento;
	            tamanho++;
	        } else {
	            throw new RuntimeException("erro ao adicionar elemento fora dos limites vetoriais");
	        }
	    }

	    public T peek(){
	        if(isEmpty()){ return null; }
	        return vetor[tamanho - 1];
	    }

	    public T penult(){
	        if(isEmpty()){ return null; }
	        return vetor[tamanho - 2];
	    }

	    public T pop(){
	        if(isEmpty()){ return null; }
	        return vetor[--tamanho];
	    }

	    public boolean isEmpty(){
	        return tamanho == 0;
	    }
	    
	    public int getTamanho() {
	        return tamanho;
	    }
	    
	    
	    public void increaseCapacity(){
	        if(tamanho == vetor.length){
	            T newVetor[] = (T[]) new Object[tamanho + 1];
	            for(int i = 0; i < vetor.length; i++){
	                newVetor[i] = vetor[i];
	            }
	            vetor = newVetor;
	        }
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();

	        for(int i = 0; i < tamanho-1; i++){
	            sb.append(vetor[i]);
	            sb.append(" ");
	        }

	        if(tamanho > 0){
	            sb.append(vetor[tamanho-1]);
	        }

	        return sb.toString();
	    }
	
	
	
	
	
	
	
}
