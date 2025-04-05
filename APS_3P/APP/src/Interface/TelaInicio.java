package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaInicio extends JFrame {

    public static void main(String[] args) {
        // Janela principal
        JFrame janela = new JFrame("Flash Snake");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);
        janela.setLocationRelativeTo(null); // Centraliza na tela

        // Painel principal
        JPanel painel = new JPanel();
        painel.setBackground(Color.WHITE);

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menuEquipes = new JMenu("Equipes");
        JMenuItem itemCadastro = new JMenuItem("Cadastros");
        JMenuItem itemRanking = new JMenuItem("Rankings");

        menuEquipes.add(itemCadastro);
        menuEquipes.add(itemRanking);
        menuBar.add(menuEquipes);
        janela.setJMenuBar(menuBar);

        // Botões
        JButton botaoCadastrar = new JButton("Cadastrar");
        JButton botaoIniciar = new JButton("Iniciar");

        botaoCadastrar.setBackground(Color.LIGHT_GRAY);
        botaoIniciar.setBackground(Color.LIGHT_GRAY);

        botaoCadastrar.addActionListener(e -> System.out.println("Cadastrar clicado"));
        botaoIniciar.addActionListener(e -> System.out.println("Iniciar clicado"));

        // Layout responsivo
        GroupLayout layout = new GroupLayout(painel);
        painel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botaoCadastrar, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                .addComponent(botaoIniciar, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGap(100) // espaço acima dos botões
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botaoCadastrar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addComponent(botaoIniciar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        );

        // Aplicando painel à janela
        janela.setContentPane(painel);
        janela.setVisible(true);
    }
}
