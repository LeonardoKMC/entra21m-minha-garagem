
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Leonardo KMC
 */
public class JFrameInicial extends JFrame implements JFrameComportamentosInterface{
    private JButton jButtonListaCarro;
    private JButton jButtonCadastroCarro;
    private JButton jButtonListaCategorias;
    private JButton jButtonListaAvioes;

    
    public JFrameInicial(){
        criarTela();
        criarComponentes();
        definirLocalizacao();
        adicionarOnClick();
        adicionarComponentes();
    }
    
    
    @Override
    public void criarTela() {
        setSize(600,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    @Override
    public void criarComponentes() {
        jButtonListaCarro = new JButton("Lista de Carros");
        jButtonCadastroCarro = new JButton("Cadastro de Carros");
        jButtonListaCategorias = new JButton("Lista de Categorias");
        jButtonListaAvioes = new JButton("Lista Aviões");
    }

    @Override
    public void definirLocalizacao() {
        jButtonListaCarro.setBounds(10,10,200,35);
        jButtonCadastroCarro.setBounds(10, 55, 200, 35);
        jButtonListaCategorias.setBounds(10, 100, 200, 35);
        jButtonListaAvioes.setBounds(10, 145, 200, 35);
    }

    @Override
    public void adicionarComponentes() {
        add(jButtonListaCarro);
        add(jButtonCadastroCarro);
        add(jButtonListaCategorias);
        add(jButtonListaAvioes);
    }

    @Override
    public void adicionarOnClick() {
        jButtonListaCarro.addActionListener((ActionEvent e) -> {
            JFrameListaCarros lista = new JFrameListaCarros();
        });
        jButtonCadastroCarro.addActionListener((ActionEvent e) -> {
            new JFrameCadastroCarro().setVisible(true);
        });
        jButtonListaCategorias.addActionListener((ActionEvent e) -> {
            new JFrameListaCategorias().setVisible(true);
        });
        
        jButtonListaAvioes.addActionListener((ActionEvent e) -> {
             new JFrameListaAvioes().setVisible(true);
        });
    }
    
}
