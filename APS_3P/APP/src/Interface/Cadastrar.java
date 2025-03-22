package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastrar {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastros");
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar a janela
        janela.setBounds(0,0,330,480); // tamanho da tela
        janela.setVisible(true); // tornar a tela visivel

        JLabel Title = new JLabel("Cadastro",2);
        Title.setBounds(130,-40,200,200);

        JLabel TextNome = new JLabel("Equipe:",2);
        TextNome.setBounds(10,100,120,60);

        JTextField NameEquipe = new JTextField();
        NameEquipe.setBounds(70,120,200,30);

        JButton Confirme = new JButton("Cadastrar");
        Confirme.setBounds(70,190,200,40);

        JButton exit = new JButton("←");
        exit.setBounds(0,0,50,25);
        exit.setBackground(Color.white);

        Confirme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Confir = NameEquipe.getText();
                System.out.printf("%s Cadastrado! ",Confir);
                System.out.println(" ");
                NameEquipe.setText("");
            }
        });

        janela.add(TextNome);
        janela.add(NameEquipe);
        janela.add(Confirme);
        janela.add(exit);
        janela.add(Title);

    }
}
