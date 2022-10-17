
import java.awt.Color;
import java.awt.Component;
import java.util.Random;

public class game extends javax.swing.JFrame {

    private int player1Wins, player2Wins;
    private String p1Shape, p2Shape;
    private String choice;
    private Random random;
    private Color p1color;
    private Color p2color;
    public game() {
        initComponents();
        player1Wins = 0;
        player2Wins = 0;
        p1Shape = "";
        p2Shape = "";
        choice = "XO";
        p1color=Color.MAGENTA;
        p2color=Color.ORANGE;
        random = new Random();
        gridpannel.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        startPannel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        multiplayerButton = new javax.swing.JButton();
        gamePannel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        player1Field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        player2Field = new javax.swing.JTextField();
        continueButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        gridpannel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        indx0 = new javax.swing.JLabel();
        indx1 = new javax.swing.JLabel();
        indx2 = new javax.swing.JLabel();
        indx3 = new javax.swing.JLabel();
        indx4 = new javax.swing.JLabel();
        indx5 = new javax.swing.JLabel();
        indx6 = new javax.swing.JLabel();
        indx7 = new javax.swing.JLabel();
        indx8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        player1Label = new javax.swing.JLabel();
        p1ShapeLabel = new javax.swing.JLabel();
        p1WinLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        player2Label = new javax.swing.JLabel();
        p2ShapeLabel = new javax.swing.JLabel();
        p2WinLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        replayButton = new javax.swing.JButton();
        winMessageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe ");

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        startPannel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe.jpg"))); // NOI18N

        multiplayerButton.setBackground(new java.awt.Color(255, 255, 255));
        multiplayerButton.setFont(new java.awt.Font("Lucida Bright", 1, 30)); // NOI18N
        multiplayerButton.setForeground(new java.awt.Color(0, 102, 153));
        multiplayerButton.setText("Start Game");
        multiplayerButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        multiplayerButton.setBorderPainted(false);
        multiplayerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplayerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiplayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplayerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startPannelLayout = new javax.swing.GroupLayout(startPannel);
        startPannel.setLayout(startPannelLayout);
        startPannelLayout.setHorizontalGroup(
            startPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPannelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(startPannelLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(multiplayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        startPannelLayout.setVerticalGroup(
            startPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPannelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(multiplayerButton)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLayeredPane1.add(startPannel, "card2");

        gamePannel.setBackground(new java.awt.Color(255, 255, 255));
        gamePannel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Multiplayer", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Perpetua Titling MT", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText("Player 1");

        player1Field.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        player1Field.setForeground(new java.awt.Color(204, 0, 0));
        player1Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player1Field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 153));
        jLabel3.setText("Player 2");

        player2Field.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        player2Field.setForeground(new java.awt.Color(204, 0, 0));
        player2Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player2Field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        continueButton.setBackground(new java.awt.Color(255, 255, 255));
        continueButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        continueButton.setForeground(new java.awt.Color(153, 0, 153));
        continueButton.setText("CONTINUE");
        continueButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        continueButton.setBorderPainted(false);
        continueButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        refreshButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(153, 0, 153));
        refreshButton.setText("REFRESH");
        refreshButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        refreshButton.setBorderPainted(false);
        refreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(player1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(player2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(continueButton, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(player1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(continueButton, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(player2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridpannel.setBackground(new java.awt.Color(255, 255, 255));
        gridpannel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        indx0.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        indx0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indx0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indx0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indx0MouseClicked(evt);
            }
        });

        indx1.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        indx1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indx1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indx1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indx1MouseClicked(evt);
            }
        });

        indx2.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        indx2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indx2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indx2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indx2MouseClicked(evt);
            }
        });

        indx3.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        indx3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indx3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indx3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indx3MouseClicked(evt);
            }
        });

        indx4.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        indx4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indx4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indx4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indx4MouseClicked(evt);
            }
        });

        indx5.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        indx5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indx5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indx5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indx5MouseClicked(evt);
            }
        });

        indx6.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        indx6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indx6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indx6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indx6MouseClicked(evt);
            }
        });

        indx7.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        indx7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indx7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indx7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indx7MouseClicked(evt);
            }
        });

        indx8.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        indx8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indx8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indx8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indx8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout gridpannelLayout = new javax.swing.GroupLayout(gridpannel);
        gridpannel.setLayout(gridpannelLayout);
        gridpannelLayout.setHorizontalGroup(
            gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridpannelLayout.createSequentialGroup()
                .addGroup(gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indx0, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indx3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, gridpannelLayout.createSequentialGroup()
                        .addComponent(indx6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gridpannelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indx4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indx1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indx7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indx2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gridpannelLayout.createSequentialGroup()
                        .addGroup(gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(gridpannelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(indx5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(gridpannelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indx8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        gridpannelLayout.setVerticalGroup(
            gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridpannelLayout.createSequentialGroup()
                .addGroup(gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gridpannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gridpannelLayout.createSequentialGroup()
                                .addComponent(indx1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(indx4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gridpannelLayout.createSequentialGroup()
                                .addGroup(gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gridpannelLayout.createSequentialGroup()
                                        .addComponent(indx0, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(gridpannelLayout.createSequentialGroup()
                                        .addComponent(indx2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gridpannelLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(indx3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(gridpannelLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(indx5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gridpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indx6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(indx7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(indx8, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                .addGap(0, 0, 0))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        player1Label.setBackground(new java.awt.Color(255, 255, 255));
        player1Label.setFont(new java.awt.Font("Lucida Bright", 0, 30)); // NOI18N
        player1Label.setForeground(new java.awt.Color(204, 0, 153));
        player1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        p1ShapeLabel.setBackground(new java.awt.Color(255, 255, 255));
        p1ShapeLabel.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        p1ShapeLabel.setForeground(java.awt.Color.magenta);
        p1ShapeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        p1WinLabel.setFont(new java.awt.Font("Lucida Bright", 0, 30)); // NOI18N
        p1WinLabel.setForeground(new java.awt.Color(204, 0, 204));
        p1WinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p1ShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(player1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p1WinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1ShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p1WinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        player2Label.setBackground(new java.awt.Color(255, 255, 255));
        player2Label.setFont(new java.awt.Font("Lucida Bright", 0, 30)); // NOI18N
        player2Label.setForeground(new java.awt.Color(204, 0, 153));
        player2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        p2ShapeLabel.setBackground(new java.awt.Color(255, 255, 255));
        p2ShapeLabel.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        p2ShapeLabel.setForeground(java.awt.Color.orange);
        p2ShapeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        p2WinLabel.setFont(new java.awt.Font("Lucida Bright", 0, 30)); // NOI18N
        p2WinLabel.setForeground(new java.awt.Color(204, 0, 204));
        p2WinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(p2WinLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p2ShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p2ShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2WinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 0, 153));
        backButton.setText("BACK");
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        replayButton.setBackground(new java.awt.Color(255, 255, 255));
        replayButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        replayButton.setForeground(new java.awt.Color(153, 0, 153));
        replayButton.setText("REPLAY");
        replayButton.setBorder(null);
        replayButton.setBorderPainted(false);
        replayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        replayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replayButtonActionPerformed(evt);
            }
        });

        winMessageLabel.setBackground(new java.awt.Color(255, 255, 255));
        winMessageLabel.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        winMessageLabel.setForeground(new java.awt.Color(38, 175, 10));
        winMessageLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout gamePannelLayout = new javax.swing.GroupLayout(gamePannel);
        gamePannel.setLayout(gamePannelLayout);
        gamePannelLayout.setHorizontalGroup(
            gamePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(gamePannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePannelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(winMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(replayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gamePannelLayout.createSequentialGroup()
                        .addComponent(gridpannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(gamePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        gamePannelLayout.setVerticalGroup(
            gamePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePannelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(gamePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gridpannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gamePannelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(gamePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(replayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(winMessageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLayeredPane1.add(gamePannel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
boolean p1chance = true;
    boolean p2chance = false;
    boolean gamestatus = true;

    public void clearall() {
        indx0.setText("");
        indx1.setText("");
        indx2.setText("");
        indx3.setText("");
        indx4.setText("");
        indx5.setText("");
        indx6.setText("");
        indx7.setText("");
        indx8.setText("");
        p1Shape = "";
        p2Shape = "";
    }
    public void resetcolor(){
        
    }
    public void bgwhite(){
        indx0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        indx1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        indx2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        indx3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        indx4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        indx5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        indx6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        indx7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        indx8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }

    public void tictactoe() {
        String c0 = indx0.getText();
        String c1 = indx1.getText();
        String c2 = indx2.getText();
        String c3 = indx3.getText();
        String c4 = indx4.getText();
        String c5 = indx5.getText();
        String c6 = indx6.getText();
        String c7 = indx7.getText();
        String c8 = indx8.getText();

        if ((c0 + c1 + c2).equals("XXX") || (c0 + c1 + c2).equals("OOO")) {
            indx0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            if (c0 == p1Shape) {
                winMessageLabel.setText(player1Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player1Wins += 1;
                p1WinLabel.setText("Wins : " + player1Wins);
                gamestatus = false;
                

            } else if (c0 == p2Shape) {
                winMessageLabel.setText(player2Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player2Wins += 1;
                p2WinLabel.setText("Wins : " + player2Wins);
                gamestatus = false;
            }
        }
        else if ((c0 + c3 + c6).equals("XXX") || (c0 + c3 + c6).equals("OOO")) {
            indx0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            if (c0 == p1Shape) {
                winMessageLabel.setText(player1Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player1Wins += 1;
                p1WinLabel.setText("Wins : " + player1Wins);
                gamestatus = false;
                

            } else if (c0 == p2Shape) {
                winMessageLabel.setText(player2Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player2Wins += 1;
                p2WinLabel.setText("Wins : " + player2Wins);
                gamestatus = false;
            }
        }
        else if ((c0 + c4 + c8).equals("XXX") || (c0 + c4 + c8).equals("OOO")) {
            indx0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            if (c0 == p1Shape) {
                winMessageLabel.setText(player1Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player1Wins += 1;
                p1WinLabel.setText("Wins : " + player1Wins);
                gamestatus = false;
                

            } else if (c0 == p2Shape) {
                winMessageLabel.setText(player2Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player2Wins += 1;
                p2WinLabel.setText("Wins : " + player2Wins);
                gamestatus = false;
            }
        }
        else if ((c1 + c4 + c7).equals("XXX") || (c1 + c4 + c7).equals("OOO")) {
            indx1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            if (c1 == p1Shape) {
                winMessageLabel.setText(player1Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player1Wins += 1;
                p1WinLabel.setText("Wins : " + player1Wins);
                gamestatus = false;
                

            } else if (c1 == p2Shape) {
                winMessageLabel.setText(player2Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player2Wins += 1;
                p2WinLabel.setText("Wins : " + player2Wins);
                gamestatus = false;
            }
        }
        else if ((c2 + c5 + c8).equals("XXX") || (c2 + c5 + c8).equals("OOO")) {
            indx2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            if (c2 == p1Shape) {
                winMessageLabel.setText(player1Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player1Wins += 1;
                p1WinLabel.setText("Wins : " + player1Wins);
                gamestatus = false;
                

            } else if (c2 == p2Shape) {
                winMessageLabel.setText(player2Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player2Wins += 1;
                p2WinLabel.setText("Wins : " + player2Wins);
                gamestatus = false;
            }
        }
        else if ((c2 + c4 + c6).equals("XXX") || (c2 + c4 + c6).equals("OOO")) {
            indx2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            if (c2 == p1Shape) {
                winMessageLabel.setText(player1Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player1Wins += 1;
                p1WinLabel.setText("Wins : " + player1Wins);
                gamestatus = false;
                

            } else if (c2 == p2Shape) {
                winMessageLabel.setText(player2Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player2Wins += 1;
                p2WinLabel.setText("Wins : " + player2Wins);
                gamestatus = false;
            }
        }
        else if ((c3 + c4 + c5).equals("XXX") || (c3 + c4 + c5).equals("OOO")) {
            indx3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            if (c3 == p1Shape) {
                winMessageLabel.setText(player1Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player1Wins += 1;
                p1WinLabel.setText("Wins : " + player1Wins);
                gamestatus = false;
                

            } else if (c3 == p2Shape) {
                winMessageLabel.setText(player2Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player2Wins += 1;
                p2WinLabel.setText("Wins : " + player2Wins);
                gamestatus = false;
            }
        }
        else if ((c6 + c7 + c8).equals("XXX") || (c6 + c7 + c8).equals("OOO")) {
            indx6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            indx8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,234,72), 4));
            if (c6 == p1Shape) {
                winMessageLabel.setText(player1Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player1Wins += 1;
                p1WinLabel.setText("Wins : " + player1Wins);
                gamestatus = false;
                

            } else if (c6 == p2Shape) {
                winMessageLabel.setText(player2Field.getText() + " wins the game ");
                for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
                }
                player2Wins += 1;
                p2WinLabel.setText("Wins : " + player2Wins);
                gamestatus = false;
            }
        }
        else if((c0+c1+c2+c3+c3+c4+c5+c6+c7+c8).length() ==10){
            indx0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));
        indx1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));
        indx2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));
        indx3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));
        indx4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));
        indx5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));
        indx6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));
        indx7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));
        indx8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));
            for (Component cp : gridpannel.getComponents()) {
                    cp.setEnabled(false);
            }
            winMessageLabel.setText(" No one wins the game !! ");
            gamestatus = false;
        }
    }
    private void multiplayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplayerButtonActionPerformed
        // TODO add your handling code here:
        startPannel.setVisible(false);
        new toast("Game is starting", 687, 480);
        gamePannel.setVisible(true);
    }//GEN-LAST:event_multiplayerButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        gamePannel.setVisible(false);
        new toast("Exiting game", 687, 650);
        startPannel.setVisible(true);
        player1Wins = 0;
        player2Wins = 0;
        player1Field.setEnabled(true);
        player2Field.setEnabled(true);
        continueButton.setEnabled(true);
        player1Field.setText("");
        player2Field.setText("");
        player1Label.setText("");
        player2Label.setText("");
        p1WinLabel.setText("");
        p2WinLabel.setText("");
        p1ShapeLabel.setText("");
        p2ShapeLabel.setText("");
        clearall();
        p1chance = true;
        p2chance = false;
        gamestatus = true;
        for (Component cp : gridpannel.getComponents()) {
            cp.setEnabled(true);
        }
        bgwhite();
        winMessageLabel.setText("");
    }//GEN-LAST:event_backButtonActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        // TODO add your handling code here:
        p1chance = true;
        p2chance = false;
        gamestatus = true;
        String p1Name = player1Field.getText();
        String p2Name = player2Field.getText();
        gridpannel.setEnabled(true);
        player1Field.setEnabled(false);
        player2Field.setEnabled(false);
        continueButton.setEnabled(false);

        player1Label.setText(p1Name);
        player2Label.setText(p2Name);

        p1WinLabel.setText("Wins : " + player1Wins);
        p2WinLabel.setText("Wins : " + player2Wins);

        String ch = Character.toString(choice.charAt(random.nextInt(choice.length())));
        if (ch.equals("X")) {
            p1Shape = ch;
            p2Shape = "O";
            p1ShapeLabel.setText(p1Shape);
            p2ShapeLabel.setText(p2Shape);
        } else if (ch.equals("O")) {
            p1Shape = ch;
            p2Shape = "X";
            p1ShapeLabel.setText(p1Shape);
            p2ShapeLabel.setText(p2Shape);
        }
        for (Component cp : gridpannel.getComponents()) {
            cp.setEnabled(true);
        }

        bgwhite();
    }//GEN-LAST:event_continueButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        p1chance = true;
        p2chance = false;
        gamestatus = true;
        for (Component cp : gridpannel.getComponents()) {
            cp.setEnabled(true);
        }
        player1Wins = 0;
        player2Wins = 0;
        gridpannel.setEnabled(false);
        player1Field.setEnabled(true);
        player2Field.setEnabled(true);
        continueButton.setEnabled(true);
        player1Field.setText("");
        player2Field.setText("");
        player1Label.setText("");
        player2Label.setText("");
        p1WinLabel.setText("");
        p2WinLabel.setText("");
        p1ShapeLabel.setText("");
        p2ShapeLabel.setText("");
        clearall();
        bgwhite();
        winMessageLabel.setText("");
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void indx0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indx0MouseClicked
        // TODO add your handling code here:
        if (!"".equals(indx0.getText()) || gamestatus == false) {
            evt.consume();
        } else if (p1chance) {
            indx0.setText(p1Shape);
            indx0.setForeground(p1color);
            p1chance = false;
            p2chance = true;
            tictactoe();
        } else if (p2chance) {
            indx0.setText(p2Shape);
            indx0.setForeground(p2color);
            p1chance = true;
            p2chance = false;
            tictactoe();
        }
    }//GEN-LAST:event_indx0MouseClicked

    private void indx1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indx1MouseClicked
        // TODO add your handling code here:
        if (!"".equals(indx1.getText()) || gamestatus == false) {
            evt.consume();
        } else if (p1chance) {
            indx1.setText(p1Shape);
            indx1.setForeground(p1color);
            p1chance = false;
            p2chance = true;
            tictactoe();
        } else if (p2chance) {
            indx1.setText(p2Shape);
            indx1.setForeground(p2color);
            p1chance = true;
            p2chance = false;
            tictactoe();
        }
    }//GEN-LAST:event_indx1MouseClicked

    private void indx2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indx2MouseClicked
        // TODO add your handling code here:
        if (!"".equals(indx2.getText()) || gamestatus == false) {
            evt.consume();
        } else if (p1chance) {
            indx2.setText(p1Shape);
            indx2.setForeground(p1color);
            p1chance = false;
            p2chance = true;
            tictactoe();
        } else if (p2chance) {
            indx2.setText(p2Shape);
            indx2.setForeground(p2color);
            p1chance = true;
            p2chance = false;
            tictactoe();
        }
    }//GEN-LAST:event_indx2MouseClicked

    private void indx3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indx3MouseClicked
        // TODO add your handling code here:
        if (!"".equals(indx3.getText()) || gamestatus == false) {
            evt.consume();
        } else if (p1chance) {
            indx3.setText(p1Shape);
            indx3.setForeground(p1color);
            p1chance = false;
            p2chance = true;
            tictactoe();
        } else if (p2chance) {
            indx3.setText(p2Shape);
            indx3.setForeground(p2color);
            p1chance = true;
            p2chance = false;
            tictactoe();
        }
    }//GEN-LAST:event_indx3MouseClicked

    private void indx4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indx4MouseClicked
        // TODO add your handling code here:
        if (!"".equals(indx4.getText()) || gamestatus == false) {
            evt.consume();
        } else if (p1chance) {
            indx4.setText(p1Shape);
            indx4.setForeground(p1color);
            p1chance = false;
            p2chance = true;
            tictactoe();
        } else if (p2chance) {
            indx4.setText(p2Shape);
            indx4.setForeground(p2color);
            p1chance = true;
            p2chance = false;
            tictactoe();
        }
    }//GEN-LAST:event_indx4MouseClicked

    private void indx5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indx5MouseClicked
        // TODO add your handling code here:
        if (!"".equals(indx5.getText()) || gamestatus == false) {
            evt.consume();
        } else if (p1chance) {
            indx5.setText(p1Shape);
            indx5.setForeground(p1color);
            p1chance = false;
            p2chance = true;
            tictactoe();
        } else if (p2chance) {
            indx5.setText(p2Shape);
            indx5.setForeground(p2color);
            p1chance = true;
            p2chance = false;
            tictactoe();
        }
    }//GEN-LAST:event_indx5MouseClicked

    private void indx6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indx6MouseClicked
        // TODO add your handling code here:
        if (!"".equals(indx6.getText()) || gamestatus == false) {
            evt.consume();
        } else if (p1chance) {
            indx6.setText(p1Shape);
            indx6.setForeground(p1color);
            p1chance = false;
            p2chance = true;
            tictactoe();
        } else if (p2chance) {
            indx6.setText(p2Shape);
            indx6.setForeground(p2color);
            p1chance = true;
            p2chance = false;
            tictactoe();
        }
    }//GEN-LAST:event_indx6MouseClicked

    private void indx7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indx7MouseClicked
        // TODO add your handling code here:
        if (!"".equals(indx7.getText()) || gamestatus == false) {
            evt.consume();
        } else if (p1chance) {
            indx7.setText(p1Shape);
            indx7.setForeground(p1color);
            p1chance = false;
            p2chance = true;
            tictactoe();
        } else if (p2chance) {
            indx7.setText(p2Shape);
            indx7.setForeground(p2color);
            p1chance = true;
            p2chance = false;
            tictactoe();
        }
    }//GEN-LAST:event_indx7MouseClicked

    private void indx8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indx8MouseClicked
        // TODO add your handling code here:
        if (!"".equals(indx8.getText()) || gamestatus == false) {
            evt.consume();
        } else if (p1chance) {
            indx8.setText(p1Shape);
            indx8.setForeground(p1color);
            p1chance = false;
            p2chance = true;
            tictactoe();
        } else if (p2chance) {
            indx8.setText(p2Shape);
            indx8.setForeground(p2color);
            p1chance = true;
            p2chance = false;
            tictactoe();
        }
    }//GEN-LAST:event_indx8MouseClicked

    private void replayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replayButtonActionPerformed
        // TODO add your handling code here:
        clearall();
        p1chance = true;
        p2chance = false;
        gamestatus = true;
        for (Component cp : gridpannel.getComponents()) {
            cp.setEnabled(true);
        }
        p1WinLabel.setText("Wins : " + player1Wins);
        p2WinLabel.setText("Wins : " + player2Wins);
        String ch = Character.toString(choice.charAt(random.nextInt(choice.length())));
        if (ch.equals("X")) {
            p1Shape = ch;
            p2Shape = "O";
            p1ShapeLabel.setText(p1Shape);
            p2ShapeLabel.setText(p2Shape);
        } else if (ch.equals("O")) {
            p1Shape = ch;
            p2Shape = "X";
            p1ShapeLabel.setText(p1Shape);
            p2ShapeLabel.setText(p2Shape);
        }
        bgwhite();
        winMessageLabel.setText("");
    }//GEN-LAST:event_replayButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JPanel gamePannel;
    private javax.swing.JPanel gridpannel;
    private javax.swing.JLabel indx0;
    private javax.swing.JLabel indx1;
    private javax.swing.JLabel indx2;
    private javax.swing.JLabel indx3;
    private javax.swing.JLabel indx4;
    private javax.swing.JLabel indx5;
    private javax.swing.JLabel indx6;
    private javax.swing.JLabel indx7;
    private javax.swing.JLabel indx8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton multiplayerButton;
    private javax.swing.JLabel p1ShapeLabel;
    private javax.swing.JLabel p1WinLabel;
    private javax.swing.JLabel p2ShapeLabel;
    private javax.swing.JLabel p2WinLabel;
    private javax.swing.JTextField player1Field;
    private javax.swing.JLabel player1Label;
    private javax.swing.JTextField player2Field;
    private javax.swing.JLabel player2Label;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton replayButton;
    private javax.swing.JPanel startPannel;
    private javax.swing.JLabel winMessageLabel;
    // End of variables declaration//GEN-END:variables
}
