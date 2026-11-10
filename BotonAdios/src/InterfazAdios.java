import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazAdios extends JFrame {

    public InterfazAdios() {
        // Configuración básica de la ventana
        setTitle("Interfaz Gráfica - Botón Adiós");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usando diseño absoluto para posicionar componentes fácilmente

        // --- CÓDIGO ORIGINAL ---

        // 1. Etiqueta uno (Nombre)
        JLabel lblNombre = new JLabel("Ingresa tu nombre:");
        lblNombre.setBounds(30, 30, 150, 25);
        add(lblNombre);

        // 2. Espacio donde ingresa texto el usuario (Nombre)
        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(180, 30, 160, 25);
        add(txtNombre);

        // 3. Botón uno
        JButton btnHola = new JButton("Saludar (Hola)");
        btnHola.setBounds(30, 70, 310, 30);
        add(btnHola);

        // --- CÓDIGO QUE DEBEN AGREGAR ---

        // 4. Etiqueta en la que se pide el seudónimo
        JLabel lblPseudonimo = new JLabel("Ingresa tu pseudónimo:");
        lblPseudonimo.setBounds(30, 130, 150, 25);
        add(lblPseudonimo);

        // 5. Segundo espacio donde ingresa texto por el usuario (Pseudónimo)
        JTextField txtPseudonimo = new JTextField();
        txtPseudonimo.setBounds(180, 130, 160, 25);
        add(txtPseudonimo);

        // 6. Segundo botón
        JButton btnAdios = new JButton("Despedir (Adiós)");
        btnAdios.setBounds(30, 170, 310, 30);
        add(btnAdios);

        // --- ACCIONES DE LOS BOTONES ---

        // Resultado del primer botón: = hola + nombre ingresado
        btnHola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                JOptionPane.showMessageDialog(null, "¡Hola " + nombre + "!");
            }
        });

        // Resultado del segundo botón: = adiós + pseudonimo ingresado
        btnAdios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pseudonimo = txtPseudonimo.getText();
                JOptionPane.showMessageDialog(null, "¡Adiós " + pseudonimo + "!");
            }
        });
    }

    public static void main(String[] args) {
        // Ejecutar la interfaz gráfica en el hilo de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazAdios().setVisible(true);
            }
        });
    }
}