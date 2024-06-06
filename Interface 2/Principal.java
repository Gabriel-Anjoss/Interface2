import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



public class Principal extends JFrame {
      
     JTextField nome,idade;
     JButton enviar,limpar,sair;
     JLabel texto,txtNome,txtIdade,txtSexo,txtInteresse,txtEstado,txtCredito;
     
     JRadioButton masculino,feminino;
     ButtonGroup grupo;
     
     JCheckBox Automoveis,Avioes,Barcos;
     
     JComboBox estado;
     String estadoscivis[] =  {"Solteiro (a)","Casado (a)","Divorciado (a)", "Viúvo (a)"};
     String Sex="",Interess="";
     
     
    public Principal (){
          super("Atividade-Formulário");
          setSize(600,500);
          setResizable(false);
          setLayout(null);
          Container tela = getContentPane();
          

          texto = new JLabel ("Informe seus dados para que o cadastro seja realizado:");
          texto.setBounds(40,10,200,20);
          
          nome = new JTextField(50);
          txtNome = new JLabel("Nome:");
          txtNome.setBounds(40,50,200,20);
          nome.setBounds(100,50,200,20);

          idade = new JTextField(3);
          txtIdade = new JLabel("Idade:");
          txtIdade.setBounds(40,100,200,20);          
          idade.setBounds(100,100,200,20);    

          txtSexo = new JLabel("Sexo:");
          txtSexo.setBounds(40,150,200,20);
          masculino.setBounds(100,150,100,20);
          feminino.setBounds(200,150,100,20);

          txtInteresse= new JLabel("Interesses:");
          txtInteresse.setBounds(40,200,200,20);
          Automoveis.setBounds(40,230,200,20);
          Avioes.setBounds(40,260,200,20);
          Barcos.setBounds(40,290,200,20);

          txtEstado= new JLabel("Estado Civil:");
          txtEstado.setBounds(40,340,200,20);
          estado.setBounds(120,341,200,20);

          txtCredito = new JLabel("Gabriel Anjos | 2º DS/AMS");
          txtCredito.setBounds(220,440,200,20);

          enviar = new JButton("Enviar");
          enviar.setMnemonic(KeyEvent.VK_E);
          enviar.setBounds(180,390,80,20);
          enviar.requestFocus();
          
          limpar = new JButton("Limpar");
          limpar.setMnemonic(KeyEvent.VK_L);
          limpar.setBounds(260,390,80,20);

          sair = new JButton("Sair");
          sair.setBounds(340,390,80,20);

          estado = new JComboBox(estadoscivis);
          estado.setMaximumRowCount(4);
          
          masculino = new JRadioButton("Masculino");
          feminino = new JRadioButton("Feminino");
          grupo = new ButtonGroup();
          
          grupo.add(masculino);
          grupo.add(feminino);
          
          Automoveis = new JCheckBox("Automoveis");
          Avioes = new JCheckBox("Aviões");
          Barcos = new JCheckBox("Barcos");
          

            masculino.addActionListener((ActionEvent e) -> {
                            Sex = "Masculino";
                 });
            
            feminino.addActionListener((ActionEvent e) -> {
                            Sex = "Feminino";
                 });
          
            

             Automoveis.addActionListener((ActionEvent e) -> {
                             Interess = "Automóveis";
                 });
            
             Avioes.addActionListener((ActionEvent e) -> {
                               Interess = "Aviões";
                 });
              
             Barcos.addActionListener((ActionEvent e) -> {
                               Interess = "Barcos";
                 });
            
          
          
          
          enviar.addActionListener((ActionEvent e ) -> {
             
                JOptionPane.showMessageDialog(null,"Você Cadastrou os seguintes dados: \n"
                        + "Nome: " +nome.getText() +"\n"
                        + "Idade: " +idade.getText() +"\n"
                        + "Sexo: " +Sex +"\n"
                        + "Interesses: " + Interess+"\n"
                        +"Estado Civil: " +estado.getSelectedItem().toString()
                        
                        ,"Resultado",JOptionPane.INFORMATION_MESSAGE,null);
          
          }
          );
          
          
          
          limpar.addActionListener((ActionEvent e) -> {
                nome.setText("");
                idade.setText("");
            });
          
           sair.addActionListener((ActionEvent e) -> {
                 int opcao;
               Object[] botoes = {"Sim","Não"};
               opcao = JOptionPane.showOptionDialog(null,"Nunca é um Adeus","Já vai tarde?",
                               JOptionPane.YES_NO_OPTION,
                               JOptionPane.QUESTION_MESSAGE,
                               null,botoes,botoes[0]);
                               if (opcao==JOptionPane.YES_OPTION)
                                   System.exit(0);
            });
          
           
           
           //Adicionado
           tela.add(texto);
           tela.add(txtNome);
           tela.add(txtIdade);
           tela.add(txtSexo);
           tela.add(txtInteresse);
           tela.add(txtEstado);
           tela.add(txtCredito);
           
           tela.add(nome);
           tela.add(idade);
           
           tela.add(masculino);
           tela.add(feminino);
           
           tela.add(Automoveis);
           tela.add(Avioes);
           tela.add(Barcos);
           
           
           tela.add(estado);
           
           tela.add(enviar);
           tela.add(limpar);
           tela.add(sair);
           
          //Final
          setLocationRelativeTo(null);
          setVisible(true);
    }
    
    
    public static void main (String [] args){
          Principal app = new Principal();
          app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}