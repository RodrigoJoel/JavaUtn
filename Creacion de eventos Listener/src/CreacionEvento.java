import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreacionEvento extends JFrame {
    private JPanel panel;
    private JTextField cajaTexto;
    private JButton boton;
    private JLabel saludo;
    private JTextArea areaTexto;

    public CreacionEvento(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Creacion de Eventos");

        iniciarComponentes();
        setBounds(50,50,500,500);
        setLocationRelativeTo(null);//aparece en el medio de la pantalla


    }

    private void iniciarComponentes() {
        crearPanel();
        Etiqueta();
        cajaDeTexto();
  //      Boton();
        colocarAreasDeTexto();
    }

    private void crearPanel(){
        panel = new JPanel();//Creacion del Panel
        panel.setLayout(null);
        this.add(panel);//agregamos el panel a la ventana
    }
    private void Etiqueta(){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("TECLEE SU NOMBRE: ");
        etiqueta.setBounds(30,10,200,30);
        panel.add(etiqueta);
    }

    private void cajaDeTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(50,50,200,30);
        panel.add(cajaTexto);
        eventosDelTeclado();
    }

    private void colocarAreasDeTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(300,40,150,250);
        panel.add(areaTexto);
    }
    private void Boton() {
        boton = new JButton();
        boton.setText("¡¡Pulsa para guardar!!");
        boton.setBounds(10, 300, 160, 30);
        boton.setFont(new Font("algerian", Font.ITALIC, 10));
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("algerian", Font.ITALIC, 20));
        panel.add(saludo);

     //  oyenteDeAccion();
        oyenteDeRaton();
    }

    private void oyenteDeAccion(){
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola " + cajaTexto.getText());
            }
        };
        boton.addActionListener(oyenteDeAccion);
    }
    private void oyenteDeRaton(){
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                areaTexto.append("mouseClicked\n");
            }
            @Override
            public void mousePressed(MouseEvent e) {
                areaTexto.append("mousePressed\n");
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                areaTexto.append("mouseReleased\n");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                areaTexto.append("mouseEntered\n");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                areaTexto.append("mouseExited\n");
            }
        };
        boton.addMouseListener(oyenteDeRaton);
    }

    private void eventosDelTeclado(){
        KeyListener eventoTeclado = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
           //    areaTexto.append("keyTyped\n");
            }
            @Override
            public void keyPressed(KeyEvent e) {
           //     areaTexto.append("keyPressed\n");
            }
            @Override
            public void keyReleased(KeyEvent e) {
           //     areaTexto.append("keyReleased\n");
                if (e.getKeyChar() == 'p'){
                    areaTexto.append("Letra p\n");
                }
                if (e.getKeyChar()=='\n'){
                    areaTexto.append("Enter\n");
                }
                if (e.getKeyChar()==' '){
                    areaTexto.append("Espacio\n");
                }
            }
        };
        cajaTexto.addKeyListener(eventoTeclado);
    }

}
