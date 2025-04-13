package Interface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Cadastrar {
    public static void main(String[] args) {
        // Janela principal
        JFrame janela = new JFrame("Cadastro");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);
        janela.setLocationRelativeTo(null); // Centraliza na tela

        // Painel principal com layout automático
        JPanel painel = new JPanel();
        painel.setBackground(Color.WHITE);

        // Componentes da interface
        JLabel titulo = new JLabel("Cadastro");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelEquipe = new JLabel("Equipe:");
        JTextField campoEquipe = new JTextField(20);

        JButton botaoCadastrar = new JButton("Cadastrar");
        JButton botaoVoltar = new JButton("←");

        // Ação do botão Cadastrar
        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeEquipe = campoEquipe.getText().trim();
                if (!nomeEquipe.isEmpty()) {
                    JOptionPane.showMessageDialog(janela, nomeEquipe + " cadastrado com sucesso!");
                    campoEquipe.setText("");
                } else {
                    JOptionPane.showMessageDialog(janela, "Por favor, insira o nome da equipe.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Ação do botão Voltar
        botaoVoltar.addActionListener(e -> janela.dispose());

        // Usando GroupLayout para layout responsivo
        GroupLayout layout = new GroupLayout(painel);
        painel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botaoVoltar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(250)) // empurra o botão para esquerda
            .addComponent(titulo)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelEquipe)
                .addComponent(campoEquipe))
            .addComponent(botaoCadastrar, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(botaoVoltar))
            .addGap(10)
            .addComponent(titulo)
            .addGap(30)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelEquipe)
                .addComponent(campoEquipe))
            .addGap(30)
            .addComponent(botaoCadastrar)
        );

        // Finaliza e exibe
        janela.setContentPane(painel);
        janela.setVisible(true);
    }
}
