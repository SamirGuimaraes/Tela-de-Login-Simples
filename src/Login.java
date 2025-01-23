import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class Login extends JFrame{
    final private Font fonte = new Font("Arial", Font.BOLD, 18);

    public Login(){

        JLabel lbUsuario = new JLabel("Usuário");
        lbUsuario.setFont(fonte);

        JTextField tfUsuario = new JTextField(15);
        tfUsuario.setFont(fonte);

        JLabel lbSenha = new JLabel("Senha");
        lbSenha.setFont(fonte);

        JPasswordField jpSenha = new JPasswordField(15);
        jpSenha.setFont(fonte);

        JLabel lbMensagemTopo = new JLabel("Informe seu nome de usuário e senha", SwingConstants.CENTER);
        lbMensagemTopo.setFont(fonte);



        JButton jbCadastro = new JButton("Cadastrar");
        jbCadastro.setFont(fonte);
        jbCadastro.setBackground(new Color(191,191,191));
        jbCadastro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = tfUsuario.getText();
                char[] senha = jpSenha.getPassword();
                if (usuario.isEmpty() || (senha.length == 0)){
                    Object[] incompleto = {"Cadastrar Novamente","Sair"};
                    int escolha = JOptionPane.showOptionDialog(jbCadastro, "Usuário ou Senha incompleto \nSelecione se deseja cadastrar novamente ou sair", "Login Incompleto", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, incompleto, "Cadastrar Novamente");
                
                    if (escolha == 0)
                        new Login();
                    else
                        System.exit(1);
                }
                else{
                    Object[] opcoes = {"Cadastrar Novamente", "Sair"};
                    int escolha = JOptionPane.showOptionDialog(jbCadastro, "Cadastro completo \nSelecione se deseja cadastrar novamente ou sair", "Login Completo", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, "Ok");
                
                    if (escolha == 0)
                        new Login();
                    else
                        System.exit(1);
                } 
            }
            
        });

        JButton jbLimpar = new JButton("Limpar");
        jbLimpar.setFont(fonte);
        jbLimpar.setBackground(new Color(191,191,191));
        jbLimpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfUsuario.setText("");
                jpSenha.setText("");
            }
            
        });

        JPanel panelUsuario = new JPanel();
        panelUsuario.add(lbUsuario);
        panelUsuario.add(tfUsuario);
        panelUsuario.setBackground(new Color(191,191,191));

        JPanel panelSenha = new JPanel();
        panelSenha.add(lbSenha);
        panelSenha.add(jpSenha);
        panelSenha.setBackground(new Color(191,191,191));

        JPanel panelBotoes = new JPanel();
        panelBotoes.add(jbCadastro);
        panelBotoes.add(jbLimpar);

        JPanel panelDados = new JPanel();
        panelDados.setLayout(new GridLayout(3,1,5,5));
        panelDados.setBackground(new Color(191,191,191));
        panelDados.add(lbMensagemTopo);
        panelDados.add(panelUsuario);
        panelDados.add(panelSenha);
        panelDados.setBorder(new EmptyBorder(10,0,10,0));

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(new Color(211,211,211));
        panelPrincipal.add(panelDados, BorderLayout.CENTER);
        panelPrincipal.add(panelBotoes, BorderLayout.SOUTH);

        add(panelPrincipal);

        setTitle("Login");
        setSize(400,350);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Login();
    }
}
