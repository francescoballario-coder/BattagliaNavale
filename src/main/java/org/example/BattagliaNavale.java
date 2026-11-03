package org.example;
import javax.swing.*;
import java.awt.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class BattagliaNavale extends JFrame {
    private int allyShips = 14;
    private int enemyShips = 14;

    public BattagliaNavale() {
        initComponents();
    }

    private void initComponents() {
        JFrame finestra = new JFrame();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Battaglia Navale");
        setResizable(true);
        setLocationRelativeTo(null);
        setSize(new java.awt.Dimension(500, 500));



        JPanel generalPanel = new JPanel();
        generalPanel.setBackground(new Color(11, 1, 1));
        generalPanel.setLayout(new BorderLayout());
        generalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 180, 124, 255)));
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu command = new JMenu("Comando");

        menuBar.add(command);
        menuBar.setBackground(new Color(11, 1, 1));
        menuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 180, 124, 255)));


        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(1, 2));
        northPanel.setBackground(new Color(11, 1, 1));
        JLabel alliedcells = new JLabel("Celle Alleate : " + allyShips);
        JLabel enemyCells = new JLabel("Celle Nemiche: " + enemyShips);
        alliedcells.setForeground(Color.cyan);
        enemyCells.setForeground(Color.cyan);
        northPanel.add(alliedcells);
        northPanel.add(enemyCells);
        generalPanel.add(northPanel, BorderLayout.NORTH);


        JPanel allyPanel = new JPanel();
        allyPanel.setLayout(new GridLayout(11, 11));
        allyPanel.setBackground(new Color(11, 1, 1));
        allyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 180, 124, 255)));
        generalPanel.add(allyPanel, BorderLayout.WEST);
        JButton[][] alliedMat = new JButton[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                alliedMat[i][j] = new JButton("");


                int finalI1 = i;
                int finalJ1 = j;
                alliedMat[i][j].addActionListener(e ->{
                    alliedMat[finalI1][finalJ1].setBackground(Color.red);
                });
                allyPanel.add(alliedMat[i][j]);
            }
        }


        JPanel enemyPanel = new JPanel();
        enemyPanel.setLayout(new GridLayout(11, 11));
        enemyPanel.setBackground(new Color(11, 1, 1));
        enemyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 180, 124, 255)));
        generalPanel.add(enemyPanel, BorderLayout.EAST);
        JButton[][] enemyMat = new JButton[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                enemyMat[i][j] = new JButton("");


                int finalI2 = i;
                int finalJ2 = j;
                enemyMat[i][j].addActionListener(e ->{
                    enemyMat[finalI2][finalJ2].setBackground(Color.green);
                });
                enemyPanel.add(enemyMat[i][j]);
            }
        }

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());
        JLabel cancelledDeployements = new JLabel(">SCHIERAMENTO ANNULLATO");
        cancelledDeployements.setForeground(Color.cyan);
        southPanel.setBackground(new Color(11, 1, 1));
        southPanel.add(cancelledDeployements);
        generalPanel.add(southPanel, BorderLayout.SOUTH);

        add(generalPanel);
        this.setVisible(true);
    }
}