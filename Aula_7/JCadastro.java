package Aula_7;

import javax.swing.*;
import java.awt.*;

public class JCadastro {
    private JFrame jCadastroPF = new JFrame();
    private JLabel lNome = new JLabel();
    private JLabel lCpf = new JLabel();
    private Font fonte = new Font("SansSerif", Font.BOLD, 20);
    private JTextField jtfNome = new JTextField();
    private JTextField jtfCpf = new JTextField();

    public JCadastro() {
        jCadastroPF.setTitle("Cadastro Cliente Pessoa Física");
        jCadastroPF.setSize(500, 200);
        jCadastroPF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jCadastroPF.setLocationRelativeTo(null);
        jCadastroPF.setVisible(true);
        jCadastroPF.setLayout(null);

        lNome.setText("Nome:");
        lNome.setBounds(10, 10, 90, 20);
        lNome.setForeground(Color.BLACK);
        lNome.setFont(fonte);

        jCadastroPF.add(lNome);

        lCpf.setText("CPF:");
        lCpf.setBounds(10, 65, 90, 20);
        lCpf.setForeground(Color.BLACK);
        lCpf.setFont(fonte);

        jCadastroPF.add(lCpf);

        jtfNome.setToolTipText("Nome Cliente");
        jtfNome.setBounds(10, 35, 430, 20);

        jCadastroPF.add(jtfNome);

        jtfCpf.setToolTipText("Nome Cliente");
        jtfCpf.setBounds(10, 90, 430, 20);

        jCadastroPF.add(jtfCpf);

        jCadastroPF.setVisible(true);
    }
}