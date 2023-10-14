import java.util.Stack;

public class Pila {

    private Stack<Character> pila;

    public Pila() {
        pila = new Stack<Character>();
    }
    public void insertar(Character dato){
        pila.push(dato);
    }
    public Character eliminar() throws Exception {
        if (pila.isEmpty())
            throw new Exception("Pila vacia");
        return pila.pop();
    }
    public boolean esVacia(){
        return pila.isEmpty();
    }
    public String invertirPalabra (String input){
        for (char palabra:input.toCharArray()) {
            insertar(palabra);
        }
        StringBuilder resultado= new StringBuilder();
        while (!esVacia()){
            try{
                resultado.append(eliminar());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
       return resultado.toString();
    }

    @Override
    public String toString() {
        StringBuilder resultado= new StringBuilder("==Pila==\n");
        for (int i= pila.size()-1 ; i>=0; i--){
        resultado.append(pila.get(i));
    }
return resultado.toString();
    }
}