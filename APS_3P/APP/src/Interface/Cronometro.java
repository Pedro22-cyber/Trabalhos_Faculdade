package Interface;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cronometro extends JFrame implements ActionListener {
    private JLabel tempoLabel;
    private JButton iniciar, parar, resetar;

    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;

    private Timer timer;

    public Cronometro() {
        setTitle("Cronômetro");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        tempoLabel = new JLabel(formatarTempo(horas, minutos, segundos), SwingConstants.CENTER);
        tempoLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(tempoLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        iniciar = new JButton("Iniciar");
        iniciar.addActionListener(this);
        buttonPanel.add(iniciar);

        parar = new JButton("Parar");
        parar.addActionListener(this);
        buttonPanel.add(parar);

        resetar = new JButton("Resetar");
        resetar.addActionListener(this);
        buttonPanel.add(resetar);

        add(buttonPanel, BorderLayout.SOUTH);

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incrementarTempo();
            }
        });
    }

    private String formatarTempo(int horas, int minutos, int segundos) {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    private void incrementarTempo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
            }
        }
        tempoLabel.setText(formatarTempo(horas, minutos, segundos));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == iniciar) {
            if (!timer.isRunning()) {
                timer.start();
            }
        } else if (e.getSource() == parar) {
            if (timer.isRunning()) {
                timer.stop();
            }
        } else if (e.getSource() == resetar) {
            timer.stop();
            segundos = 0;
            minutos = 0;
            horas = 0;
            tempoLabel.setText(formatarTempo(horas, minutos, segundos));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Cronometro cronometro = new Cronometro();
            cronometro.setVisible(true);
        });
    }
}
