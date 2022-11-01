


public class Conversor {
	public static Pilha<String> conversor(String expression){
        String infix[] = expression.split("\\s");

        return parse(infix);
    }
	
	private static Pilha<String> parse(String infix[]){
        Pilha<String> pilha = new Pilha<>(200);
        Pilha<String> postfix = new Pilha<>(200);

        for(String elemento : infix){
            switch (elemento) {
                case "(":
                    pilha.push(elemento);
                    break;
                case ")":
                    String next;
                    while (!(next = pilha.pop()).equals("("))
                        postfix.push(next);
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    while(!pilha.isEmpty() && precendece(pilha.peek()) >= precendece(elemento))
                        postfix.push(pilha.pop());
                    pilha.push(elemento);
                    break;
                default:
                    postfix.push(elemento);
            }
        }

        while(!pilha.isEmpty())
            postfix.push(pilha.pop());
        
        return postfix;
    }

    private static Integer precendece(String operadores){
        switch (operadores) {
            case "^":
                return 3;
            case "*":
            case "/":
                return 2;
            case "+":
            case "-":
                return 1;
            default:
                return 0;
        }
    }






}
