/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moove.projeto.moove.modelo;

import Conexoes.ConexaoBanco;
import Conexoes.ConexaoBancoAzure;
import com.moove.projeto.moove.programas.TelaAnalista;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Aluno
 */

  
public class JfreeChartTemp extends JFrame {
    ConexaoBanco conexaoLocal = new ConexaoBanco();
    ConexaoBancoAzure conexaoAzure = new ConexaoBancoAzure();
    public JfreeChartTemp( String applicationTitle , String chartTitle) {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "ID","DADOS",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
      setLocationRelativeTo(null);
      setSize(490, 410);
   }

   private DefaultCategoryDataset createDataset() {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      ArrayList<Integer> listaId = new ArrayList<>();
      ArrayList<Double> listaValores = new ArrayList<>();
      List<DadosAPI> listdados = conexaoLocal.jdbcTemplate.query
      ("select media_temp, id from ohwLeituraWind order by id limit 10", new BeanPropertyRowMapper(DadosAPI.class));
       for (DadosAPI listdado : listdados) {
           listaId.add(listdado.getId());
           listaValores.add(Double.parseDouble(listdado.getMedia_temp()));
           //JOptionPane.showMessageDialog(null, listdado.getCpu_load());
      }
            Collections.reverse(listaId);
            Collections.reverse(listaValores);
            for (int i = 0; i < listaId.size(); i++) {
                dataset.addValue(listaValores.get(i), "Leituras", listaId.get(i));
            }
      return dataset;
   }
   
   public static void main( String[ ] args ) {
      JfreeChart chart = new JfreeChart(
         "Dados Temperatura" ,
         "Porcentagem de uso da Temperatura"
         );

      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
      
   }
}
