    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moove.projeto.moove.programas;
import Conexoes.ConexaoBanco;
import javax.management.timer.TimerMBean;
import com.moove.projeto.moove.modelo.DadosAPI;
import com.moove.projeto.moove.modelo.JfreeChart;
import com.moove.projeto.moove.modelo.JfreeChartDisk;
import com.moove.projeto.moove.modelo.JfreeChartMemoria;
import com.moove.projeto.moove.modelo.JfreeChartTemp;
import java.awt.Color;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class TelaAnalista extends javax.swing.JFrame {
        
    /**
     * Creates new form TelaAnalista
     */
    public TelaAnalista() {
        initComponents();       
        JPconfig.setVisible(false);
        timer1.start();
        timer1.setDelay(5);
        Color cyan = new Color(0,204,204);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LBDISK = new javax.swing.JLabel();
        LBCPU = new javax.swing.JLabel();
        LBRAM = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LBUSER = new javax.swing.JLabel();
        LBTEMP = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        LBram = new javax.swing.JLabel();
        LBtemp = new javax.swing.JLabel();
        LBuser = new javax.swing.JLabel();
        LBdisk = new javax.swing.JLabel();
        LBcpu = new javax.swing.JLabel();
        JPconfig = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CHKtemp = new javax.swing.JCheckBox();
        CHKcpu = new javax.swing.JCheckBox();
        CHKram = new javax.swing.JCheckBox();
        CHKdisk = new javax.swing.JCheckBox();
        LButi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LBChamado1 = new javax.swing.JLabel();
        LBexit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LBConfig = new javax.swing.JLabel();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Função:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 10, 60, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Analista");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 40, 90, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("|");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 20, 20, 40);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        LBDISK.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        LBDISK.setForeground(new java.awt.Color(0, 204, 204));
        LBDISK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBDISK.setText("DISK:");
        LBDISK.setToolTipText("");
        LBDISK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBDISK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBDISKMouseClicked(evt);
            }
        });
        jPanel2.add(LBDISK);
        LBDISK.setBounds(10, 280, 100, 50);

        LBCPU.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        LBCPU.setForeground(new java.awt.Color(0, 204, 204));
        LBCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBCPU.setText("CPU:");
        LBCPU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBCPU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBCPUMouseClicked(evt);
            }
        });
        jPanel2.add(LBCPU);
        LBCPU.setBounds(10, 110, 100, 50);

        LBRAM.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        LBRAM.setForeground(new java.awt.Color(0, 204, 204));
        LBRAM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBRAM.setText("RAM:");
        LBRAM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBRAMMouseClicked(evt);
            }
        });
        jPanel2.add(LBRAM);
        LBRAM.setBounds(0, 190, 120, 60);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.add(jPanel3);
        jPanel3.setBounds(370, 0, 10, 430);

        LBUSER.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        LBUSER.setForeground(new java.awt.Color(0, 204, 204));
        LBUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBUSER.setText("User:");
        jPanel2.add(LBUSER);
        LBUSER.setBounds(10, 30, 100, 70);

        LBTEMP.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        LBTEMP.setForeground(new java.awt.Color(0, 204, 204));
        LBTEMP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBTEMP.setText("Temperatura:");
        LBTEMP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBTEMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBTEMPMouseClicked(evt);
            }
        });
        jPanel2.add(LBTEMP);
        LBTEMP.setBounds(10, 350, 220, 50);

        jSeparator3.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(0, 204, 204));
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(0, 0, 760, 10);

        LBram.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        LBram.setForeground(new java.awt.Color(255, 255, 255));
        LBram.setText("45%");
        jPanel2.add(LBram);
        LBram.setBounds(130, 200, 240, 40);

        LBtemp.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        LBtemp.setForeground(new java.awt.Color(255, 255, 255));
        LBtemp.setText("45%");
        jPanel2.add(LBtemp);
        LBtemp.setBounds(240, 360, 130, 40);

        LBuser.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        LBuser.setForeground(new java.awt.Color(255, 255, 255));
        LBuser.setText("45%");
        jPanel2.add(LBuser);
        LBuser.setBounds(130, 50, 240, 40);

        LBdisk.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        LBdisk.setForeground(new java.awt.Color(255, 255, 255));
        LBdisk.setText("45%");
        jPanel2.add(LBdisk);
        LBdisk.setBounds(130, 280, 240, 50);

        LBcpu.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        LBcpu.setForeground(new java.awt.Color(255, 255, 255));
        LBcpu.setText("45%");
        jPanel2.add(LBcpu);
        LBcpu.setBounds(130, 120, 240, 40);

        JPconfig.setBackground(new java.awt.Color(0, 0, 0));
        JPconfig.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Temperatura:");
        JPconfig.add(jLabel2);
        jLabel2.setBounds(20, 330, 230, 40);

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CPU:");
        JPconfig.add(jLabel16);
        jLabel16.setBounds(20, 50, 120, 40);

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("RAM:");
        JPconfig.add(jLabel17);
        jLabel17.setBounds(20, 140, 120, 40);

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 204, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("DISK:");
        JPconfig.add(jLabel18);
        jLabel18.setBounds(20, 240, 120, 40);

        CHKtemp.setBackground(new java.awt.Color(0, 0, 0));
        CHKtemp.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        CHKtemp.setSelected(true);
        CHKtemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHKtempMouseClicked(evt);
            }
        });
        CHKtemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHKtempActionPerformed(evt);
            }
        });
        JPconfig.add(CHKtemp);
        CHKtemp.setBounds(250, 330, 120, 50);

        CHKcpu.setBackground(new java.awt.Color(0, 0, 0));
        CHKcpu.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        CHKcpu.setSelected(true);
        CHKcpu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHKcpuMouseClicked(evt);
            }
        });
        JPconfig.add(CHKcpu);
        CHKcpu.setBounds(140, 50, 230, 40);

        CHKram.setBackground(new java.awt.Color(0, 0, 0));
        CHKram.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        CHKram.setSelected(true);
        CHKram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHKramMouseClicked(evt);
            }
        });
        JPconfig.add(CHKram);
        CHKram.setBounds(140, 140, 230, 40);

        CHKdisk.setBackground(new java.awt.Color(0, 0, 0));
        CHKdisk.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        CHKdisk.setSelected(true);
        CHKdisk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHKdiskMouseClicked(evt);
            }
        });
        JPconfig.add(CHKdisk);
        CHKdisk.setBounds(140, 240, 230, 40);

        jPanel2.add(JPconfig);
        JPconfig.setBounds(380, 0, 380, 420);

        LButi.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        LButi.setForeground(new java.awt.Color(0, 204, 204));
        LButi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LButi.setText("Utilização");
        LButi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LButi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LButiMouseClicked(evt);
            }
        });
        jPanel2.add(LButi);
        LButi.setBounds(110, 0, 160, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 70, 760, 430);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 67)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Moove");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 0, 220, 70);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dashboard");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(370, 20, 130, 40);

        LBChamado1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        LBChamado1.setForeground(new java.awt.Color(0, 204, 204));
        LBChamado1.setText("Chamado");
        LBChamado1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LBChamado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBChamado1MouseClicked(evt);
            }
        });
        jPanel1.add(LBChamado1);
        LBChamado1.setBounds(500, 20, 110, 40);

        LBexit.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        LBexit.setForeground(new java.awt.Color(255, 0, 0));
        LBexit.setText("Exit");
        LBexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBexitMouseClicked(evt);
            }
        });
        jPanel1.add(LBexit);
        LBexit.setBounds(700, 20, 50, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("|");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 20, 20, 40);

        jSeparator2.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 70, 760, 10);

        LBConfig.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        LBConfig.setForeground(new java.awt.Color(0, 204, 204));
        LBConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBConfig.setText("Config");
        LBConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LBConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBConfigMouseClicked(evt);
            }
        });
        jPanel1.add(LBConfig);
        LBConfig.setBounds(610, 20, 70, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 760, 490);

        setSize(new java.awt.Dimension(762, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LBCPUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBCPUMouseClicked
        // TODO add your handling code here:
        LBCPU.setForeground(Color.WHITE);
        LBRAM.setForeground(Color.cyan);
        LBDISK.setForeground(Color.cyan);
        LBTEMP.setForeground(Color.cyan);
        
        JfreeChart chartzin = new JfreeChart("Grafico CPU", "Dados CPU");
        chartzin.setVisible(true);
    }//GEN-LAST:event_LBCPUMouseClicked

    private void LBRAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBRAMMouseClicked
        // TODO add your handling code here:
        LBRAM.setForeground(Color.WHITE);
        LBDISK.setForeground(Color.cyan);
        LBCPU.setForeground(Color.cyan);
        LBTEMP.setForeground(Color.cyan);
        
        JfreeChartMemoria chartzinMemoria = new JfreeChartMemoria("Grafico Memoria", "Dados Memoria");
        chartzinMemoria.setVisible(true);

    }//GEN-LAST:event_LBRAMMouseClicked

    private void LBexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBexitMouseClicked
        // TODO add your handling code her
        new LoginMoove().setVisible(true);
        dispose();
    }//GEN-LAST:event_LBexitMouseClicked

    private void LBChamado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBChamado1MouseClicked
        // TODO add your handling code here:
        new ChamadoJira().setVisible(true);
    }//GEN-LAST:event_LBChamado1MouseClicked

    private void LBDISKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBDISKMouseClicked
        // TODO add your handling code here:
        LBCPU.setForeground(Color.cyan);
        LBRAM.setForeground(Color.cyan);
        LBDISK.setForeground(Color.WHITE);
        LBTEMP.setForeground(Color.cyan);
        
        JfreeChartDisk chartzinDisk = new JfreeChartDisk("Grafico Disco", "Dados Disco");
        chartzinDisk.setVisible(true);
    }//GEN-LAST:event_LBDISKMouseClicked

    private void LBConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBConfigMouseClicked
        // TODO add your handling code here:
        JPconfig.setVisible(true);

    }//GEN-LAST:event_LBConfigMouseClicked

    private void CHKtempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHKtempActionPerformed
        // TODO add your handling code here:
          if(!CHKtemp.isSelected()){
            LBTEMP.setVisible(false);
            LBtemp.setVisible(false);
        }else{
            LBTEMP.setVisible(true);
            LBtemp.setVisible(true);
        }
    }//GEN-LAST:event_CHKtempActionPerformed

    private void CHKcpuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHKcpuMouseClicked
        // TODO add your handling code here:if(CHKcpu.isSelected()){

        if(!CHKcpu.isSelected()){
            LBcpu.setVisible(false);
            LBCPU.setVisible(false);
        }else{
            LBcpu.setVisible(true);
            LBCPU.setVisible(true);
        }
    }//GEN-LAST:event_CHKcpuMouseClicked

    private void CHKramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHKramMouseClicked
        // TODO add your handling code here:
        if(!CHKram.isSelected()){
            LBram.setVisible(false);
            LBRAM.setVisible(false);
        }else{
            LBram.setVisible(true);
            LBRAM.setVisible(true);
        }
    }//GEN-LAST:event_CHKramMouseClicked

    private void CHKdiskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHKdiskMouseClicked
        // TODO add your handling code here:
        if(!CHKdisk.isSelected()){
            LBdisk.setVisible(false);
            LBDISK.setVisible(false);
        }else{
            LBdisk.setVisible(true);
            LBDISK.setVisible(true);
        }
    }//GEN-LAST:event_CHKdiskMouseClicked

    private void CHKtempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHKtempMouseClicked
        // TODO add your handling code here:
        if(!CHKtemp.isSelected()){
            LBtemp.setVisible(false);
            LBTEMP.setVisible(false);
        }else{
            LBtemp.setVisible(true);
            LBTEMP.setVisible(true);
        }
    }//GEN-LAST:event_CHKtempMouseClicked

    private void LButiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LButiMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_LButiMouseClicked

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        // TODO add your handling code here:
        ConexaoBanco conexaoLocal = new ConexaoBanco();
        List<DadosAPI> dados = conexaoLocal.jdbcTemplate.query
        ("Select * from ohwLeituraWind", new BeanPropertyRowMapper
        (DadosAPI.class));
        for (DadosAPI dado : dados) {
            LBuser.setText(dado.getUser_desktop());
            LBcpu.setText(dado.getCpu_load()+ " %");
            LBram.setText(dado.getMemory_load()+ " %");
            LBtemp.setText(dado.getMedia_temp()+ " °C");
            LBdisk.setText(dado.getDisk_load()+ " %");
        }
        
    }//GEN-LAST:event_timer1OnTime

    private void LBTEMPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBTEMPMouseClicked
        // TODO add your handling code here:
        LBCPU.setForeground(Color.cyan);
        LBRAM.setForeground(Color.cyan);
        LBDISK.setForeground(Color.cyan);
        LBTEMP.setForeground(Color.WHITE);
        
          JfreeChartTemp chartzinTemp = new JfreeChartTemp("Grafico Memoria", "Dados Memoria");
          chartzinTemp.setVisible(true);
        
    }//GEN-LAST:event_LBTEMPMouseClicked

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
            java.util.logging.Logger.getLogger(TelaAnalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAnalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAnalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAnalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAnalista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CHKcpu;
    private javax.swing.JCheckBox CHKdisk;
    private javax.swing.JCheckBox CHKram;
    private javax.swing.JCheckBox CHKtemp;
    private javax.swing.JPanel JPconfig;
    private javax.swing.JLabel LBCPU;
    private javax.swing.JLabel LBChamado1;
    private javax.swing.JLabel LBConfig;
    private javax.swing.JLabel LBDISK;
    private javax.swing.JLabel LBRAM;
    private javax.swing.JLabel LBTEMP;
    private javax.swing.JLabel LBUSER;
    private javax.swing.JLabel LBcpu;
    private javax.swing.JLabel LBdisk;
    private javax.swing.JLabel LBexit;
    private javax.swing.JLabel LBram;
    private javax.swing.JLabel LBtemp;
    private javax.swing.JLabel LBuser;
    private javax.swing.JLabel LButi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}