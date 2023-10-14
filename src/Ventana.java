import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextField txtIngresar;
    private JButton btnInvertir;
    private JTextArea txtResultado;
    private Pila pila;

    public Ventana() {
        pila = new Pila();
        btnInvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palabra= txtIngresar.getText();
               String palabraInvertida = pila.invertirPalabra(palabra);
                txtResultado.setText("Palabra invertida: " + palabraInvertida + "\n" + pila.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
