/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import controleur.Controle;
import controleur.Global;
/*import static controleur.Global.CHAT;
import static controleur.Global.SEPARE;
import static controleur.Global.TIRE;*/
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


/**
 *
 * @author Administrateur
 */
public class Arene extends JFrame implements Global {

    private boolean client;
    private Controle controle;
    
    /**
     * Creates new form Arene
     */
    public Arene(String typejeu, Controle controle) {
        super();
        if ("client".equals(typejeu)) client=true; else client=false;
        this.controle = controle;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }
    
    public void ajoutMur(JLabel objet)
    {
        jpnMurs.add(objet);
        jpnMurs.repaint();
        
    }

    public void ajoutPanelMurs(JPanel objet)
    {
        jpnMurs.add(objet);
        jpnMurs.repaint();
        getContentPane().requestFocus();
    }

    public JPanel getJpnMurs() {
        return jpnMurs;
    }
    
    public void ajoutJoueur(JLabel objet)
    {
        jpnJeu.add(objet);
        jpnJeu.repaint();
       
    }
    
     public void ajoutModifJoueur(int num, JLabel unlabel)
    {
        try
        {
            jpnJeu.remove(num);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            
        }
        jpnJeu.add(unlabel, num);
        jpnJeu.repaint();
    }
    
    public void ajoutChat(String unephrase)
    {
        txtChat.setText(unephrase + "\r\n" + txtChat.getText());
    }
    
    public void remplaceChat(String letexte)
    {
        txtChat.setText(letexte);
    }

    public JTextArea getTxtChat() {
        return txtChat;
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnJeu = new javax.swing.JPanel();
        jpnMurs = new javax.swing.JPanel();
        lblFond = new javax.swing.JLabel();
        txtSaisie = new javax.swing.JTextField();
        jspChat = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arène");
        setBounds(0,0,L_ARENE,H_ARENE+H_CHAT);
        setMinimumSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jpnJeu.setOpaque(false);
        jpnJeu.setLayout(null);
        getContentPane().add(jpnJeu);
        jpnJeu.setBounds(400, 20, 0, 0);
        jpnJeu.setBounds(0,0,L_ARENE,H_ARENE);

        jpnMurs.setOpaque(false);
        jpnMurs.setLayout(null);
        getContentPane().add(jpnMurs);
        jpnMurs.setBounds(250, 140, 220, 70);
        jpnMurs.setBounds(0,0,L_ARENE,H_ARENE);

        lblFond.setIcon(new ImageIcon(FONDARENE));
        lblFond.setToolTipText("");
        getContentPane().add(lblFond);
        lblFond.setBounds(50, 50, 0, 0);
        lblFond.setBounds(0,0,L_ARENE,H_ARENE);

        if (client==true)
        {
            getContentPane().addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    MainPane_KeyPressed(evt);
                }
            });
            txtSaisie.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    txtSaisieKeyPressed(evt);
                }
            });
            getContentPane().add(txtSaisie);
            txtSaisie.setBounds(80, 280, 400, 20);
            txtSaisie.setBounds(2,H_ARENE + MARGE, L_ARENE-2*MARGE, H_SAISIE);
        }

        jspChat.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspChat.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtChat.setColumns(20);
        txtChat.setRows(5);
        jspChat.setViewportView(txtChat);
        jspChat.setBounds(MARGE, H_ARENE+H_SAISIE+2*MARGE, L_ARENE-3*MARGE, H_CHAT-H_SAISIE-8*MARGE);

        getContentPane().add(jspChat);
        jspChat.setBounds(80, 330, 400, 80);
        jspChat.setBounds(MARGE, H_ARENE+H_SAISIE+2*MARGE,L_ARENE-3*MARGE,H_CHAT-H_SAISIE-8*MARGE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaisieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaisieKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            System.out.println(txtSaisie.getText());
            controle.EvenementVue(this, CHAT + SEPARE + txtSaisie.getText());
            txtSaisie.setText("");
            getContentPane().requestFocus();
        }
    }//GEN-LAST:event_txtSaisieKeyPressed

     private void MainPane_KeyPressed(java.awt.event.KeyEvent evt) {                                     
         int valeur = -1;
         switch (evt.getKeyCode())
         {
             case KeyEvent.VK_SPACE : valeur = TIRE; break;
             case KeyEvent.VK_LEFT : valeur = GAUCHE; break;
             case KeyEvent.VK_DOWN : valeur = BAS; break;
             case KeyEvent.VK_RIGHT : valeur = DROITE; break;
             case KeyEvent.VK_UP : valeur = HAUT; break;
         }
         if (valeur != -1) controle.EvenementVue(this, ACTION+SEPARE+valeur);
         
    }  
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpnJeu;
    private javax.swing.JPanel jpnMurs;
    private javax.swing.JScrollPane jspChat;
    private javax.swing.JLabel lblFond;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextField txtSaisie;
    // End of variables declaration//GEN-END:variables
}