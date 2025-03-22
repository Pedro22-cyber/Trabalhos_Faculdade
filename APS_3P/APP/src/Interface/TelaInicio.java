package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicio extends JFrame {
    public static void main(String[] args) {

        //definicoes da tela
        JFrame janela = new JFrame("Flash Snake");
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar a janela
        janela.setBounds(0,0,330,480); // tamanho da tela
        janela.setVisible(true); // tornar a tela visivel
        janela.setBackground(Color.getHSBColor(199,190,189));

        //Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menuEquipes = new JMenu("Equipes");
        JMenuItem Cadastros = new JMenuItem("Cadastros");
        JMenuItem Rankings = new JMenuItem("Rankings");

        // definicoes dos butoes
        JButton b1 = new JButton("Cadastrar");
        JButton b2 = new JButton("Iniciar");

        //tamaho do butao
        b1.setBounds(5,200,150,50);
        b2.setBounds(160,200,150,50);

        //cor
        b1.setBackground(Color.gray);
        b2.setBackground(Color.gray);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Eu odeio JAVA!!!");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Eu odeio JAVA!!!");
            }
        });

        janela.add(b1);
        janela.add(b2);
        janela.setJMenuBar(menuBar);
        menuBar.add(menuEquipes);
        menuEquipes.add(Cadastros);
        menuEquipes.add(Rankings);

    }

}
