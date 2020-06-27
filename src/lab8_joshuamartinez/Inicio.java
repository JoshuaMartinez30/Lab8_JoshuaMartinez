/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_joshuamartinez;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author joshu
 */
public class Inicio extends javax.swing.JFrame {

    Thread tiempo = new Thread() {
        public void run() {
            try {
                for (seg = 1; seg <= 100; seg++) {
                    jp_carga.setValue(seg);
                    tiempo.sleep(50);
                    if (seg == 100) {
                        i = 100;
                    }
                }

            } catch (Exception e) {
            }
        }

    };
    int seg, num = 0, i;
    ArrayList<SeresVivos> lista = new ArrayList();
    AdminBarra ab;
    File fichero = null;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        ab = new AdminBarra(jp_carga);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_Agregar = new javax.swing.JDialog();
        cboRaza = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_Planeta = new javax.swing.JTextField();
        tf_Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpi_Poder = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        tf_Año = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        JD_Modificar = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        tf_Nombre1 = new javax.swing.JTextField();
        jpi_Poder1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_Año1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        cboRaza1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_Planeta1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JD_Eliminar = new javax.swing.JDialog();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        JD_Abrir = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jta_Listar = new javax.swing.JTextArea();
        btnAbrir = new javax.swing.JButton();
        jp_carga = new javax.swing.JProgressBar();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_CrearUniverso = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_Agregar = new javax.swing.JMenuItem();
        jmi_Modificar = new javax.swing.JMenuItem();
        jmi_Eliminar = new javax.swing.JMenuItem();
        jmi_Abrir = new javax.swing.JMenuItem();
        jmi_Salir = new javax.swing.JMenuItem();

        JD_Agregar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "amanto" }));
        JD_Agregar.getContentPane().add(cboRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 106, 170, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Raza");
        JD_Agregar.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 109, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Planeta");
        JD_Agregar.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 43, -1, -1));
        JD_Agregar.getContentPane().add(tf_Planeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 40, 170, -1));
        JD_Agregar.getContentPane().add(tf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 40, 164, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        JD_Agregar.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 43, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Poder");
        JD_Agregar.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 109, -1, -1));

        jpi_Poder.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        JD_Agregar.getContentPane().add(jpi_Poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 106, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Años");
        JD_Agregar.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 186, -1, -1));
        JD_Agregar.getContentPane().add(tf_Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 183, 164, -1));

        btnAgregar.setText("Crear");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        JD_Agregar.getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 273, 89, 35));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Fondo.png"))); // NOI18N
        JD_Agregar.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 800, 480));

        JD_Modificar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Nombre");
        JD_Modificar.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        JD_Modificar.getContentPane().add(tf_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 164, -1));

        jpi_Poder1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        JD_Modificar.getContentPane().add(jpi_Poder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Poder");
        JD_Modificar.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Año");
        JD_Modificar.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        JD_Modificar.getContentPane().add(tf_Año1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 164, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Poder", "Año", "Planeta", "Raza"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        JD_Modificar.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 713, 200));

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        JD_Modificar.getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 117, 41));

        cboRaza1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "amanto" }));
        JD_Modificar.getContentPane().add(cboRaza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 170, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Raza");
        JD_Modificar.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Planeta");
        JD_Modificar.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));
        JD_Modificar.getContentPane().add(tf_Planeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 170, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/ddc153674b18090dd27b4ed0ccf7da3b.jpg"))); // NOI18N
        JD_Modificar.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 660));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Poder", "Año", "Planeta", "Raza"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/anime-gintama-tsukuyo-gintama-wallpaper-preview.jpg"))); // NOI18N

        javax.swing.GroupLayout JD_EliminarLayout = new javax.swing.GroupLayout(JD_Eliminar.getContentPane());
        JD_Eliminar.getContentPane().setLayout(JD_EliminarLayout);
        JD_EliminarLayout.setHorizontalGroup(
            JD_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_EliminarLayout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(JD_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JD_EliminarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(JD_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JD_EliminarLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        JD_EliminarLayout.setVerticalGroup(
            JD_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_EliminarLayout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(JD_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JD_EliminarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(JD_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JD_EliminarLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel15))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JD_Abrir.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jta_Listar.setColumns(20);
        jta_Listar.setRows(5);
        jScrollPane3.setViewportView(jta_Listar);

        JD_Abrir.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 514, 327));

        btnAbrir.setText("Abrir");
        btnAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirMouseClicked(evt);
            }
        });
        JD_Abrir.getContentPane().add(btnAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 79, 40));

        jp_carga.setStringPainted(true);
        JD_Abrir.getContentPane().add(jp_carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 56, 514, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Fondo.png"))); // NOI18N
        JD_Abrir.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Anime");

        jmi_CrearUniverso.setText("Guardar o Crear Universo");
        jmi_CrearUniverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_CrearUniversoActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_CrearUniverso);

        jMenu2.setText("Seres Vivos");

        jmi_Agregar.setText("Crear");
        jmi_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AgregarActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_Agregar);

        jmi_Modificar.setText("Modificar");
        jmi_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ModificarActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_Modificar);

        jmi_Eliminar.setText("Eliminar");
        jmi_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_EliminarActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_Eliminar);

        jMenu1.add(jMenu2);

        jmi_Abrir.setText("Abrir");
        jmi_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Abrir);

        jmi_Salir.setText("Salir");
        jmi_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_SalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ModificarActionPerformed
        JD_Modificar.setModal(true);
        JD_Modificar.pack();
        JD_Modificar.setLocationRelativeTo(null);
        JD_Modificar.setVisible(true);
    }//GEN-LAST:event_jmi_ModificarActionPerformed

    private void jmi_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmi_SalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre, planeta, raza;
        int poder, año;
        if (tf_Nombre.getText().isEmpty() || tf_Año.getText().isEmpty() || tf_Planeta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(JD_Agregar, "Por favor, llene los campos vacios");
        } else {
            try {
                nombre = tf_Nombre.getText();
                poder = Integer.parseInt(jpi_Poder.getValue().toString());
                año = Integer.parseInt(tf_Año.getText());
                planeta = tf_Planeta.getText();
                raza = cboRaza.getSelectedItem().toString();
                SeresVivos s = new SeresVivos(nombre, poder, año, planeta, raza);
                lista.add(s);
                tf_Nombre.setText("");
                tf_Planeta.setText("");
                tf_Año.setText("");
                cboRaza.setSelectedIndex(0);
                jpi_Poder.setValue(0);
                JOptionPane.showMessageDialog(JD_Agregar, "Se agrego correctamente");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(JD_Agregar, "Error, no se creo");
            }
        }
        mostrar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int seleccion = jTable1.getSelectedRow();
        tf_Nombre1.setText(jTable1.getValueAt(seleccion, 0).toString());
        tf_Año1.setText(jTable1.getValueAt(seleccion, 2).toString());
        tf_Planeta1.setText(jTable1.getValueAt(seleccion, 3).toString());
        cboRaza1.setSelectedItem(jTable1.getValueAt(seleccion, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        int i = jTable1.getSelectedRow();
        if (tf_Nombre1.getText().isEmpty() || tf_Año1.getText().isEmpty() || tf_Planeta1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(JD_Agregar, "Por favor, llene los campos vacios");
        } else {
            Universo u = new Universo();
            u.adminUniverso(fichero.getPath());
            u.cargarArchivo();
            u.getSeres().get(i).setNombre(tf_Nombre1.getText());
            u.getSeres().get(i).setPoder(Integer.parseInt(jpi_Poder1.getValue().toString()));
            u.getSeres().get(i).setAño(Integer.parseInt(tf_Año1.getText()));
            u.getSeres().get(i).setPlaneta(tf_Planeta1.getText());
            u.getSeres().get(i).setRaza(cboRaza1.getSelectedItem().toString());
            lista.get(i).setNombre(tf_Nombre1.getText());
            lista.get(i).setPoder(Integer.parseInt(jpi_Poder1.getValue().toString()));
            lista.get(i).setAño(Integer.parseInt(tf_Año1.getText()));
            lista.get(i).setPlaneta(tf_Planeta1.getText());
            lista.get(i).setRaza(cboRaza1.getSelectedItem().toString());
            try {
                u.escribirArchivo();
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            tf_Nombre1.setText("");
            jpi_Poder1.setValue(0);
            tf_Año1.setText("");
            tf_Planeta1.setText("");
            cboRaza1.setSelectedIndex(0);
        }
        mostrar();
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Universo u = new Universo();
        u.adminUniverso(fichero.getPath());
        u.cargarArchivo();
        int i = jTable2.getSelectedRow();
        u.getSeres().remove(i);
        lista.remove(i);
        try {
            u.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(JD_Eliminar, "Eliminado correctamente");
        mostrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirMouseClicked
        if (num == 0) {
            Tiempo();
            num++;
        } else if (num == 1 && i == 100) {
            limpiar();
            lista.clear();
            Abrir();
        } else {
            JOptionPane.showMessageDialog(JD_Abrir, "Espere que termine de cargar");
        }
    }//GEN-LAST:event_btnAbrirMouseClicked

    private void jmi_CrearUniversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CrearUniversoActionPerformed
        String nombre;
        nombre = JOptionPane.showInputDialog(this, "1. Guardar en Universo Existente\n"
                + "2. Crear nuevo Universo");
        int num = Integer.parseInt(nombre);
        if (num == 1) {
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No ah creado ningun ser vivo");
            } else {
                String nombre1, file = "";
                nombre1 = JOptionPane.showInputDialog(this, "Ingrese Nombre del Universo");
                File archivo = null;
                FileWriter fw = null;
                BufferedWriter bw = null;
                try {
                    file += "./" + nombre1 + ".txt";
                    archivo = new File(file);
                    fw = new FileWriter(archivo, true);
                    bw = new BufferedWriter(fw);
                    for (int i = 0; i < lista.size(); i++) {
                        bw.write(lista.get(i).getNombre() + ";");
                        bw.write(lista.get(i).getPoder() + ";");
                        bw.write(lista.get(i).getAño() + ";");
                        bw.write(lista.get(i).getPlaneta() + ";");
                        bw.write(lista.get(i).getRaza() + "\n");
                    }
                    bw.flush();
                    lista.removeAll(lista);
                    JOptionPane.showMessageDialog(this, "Se guardo correctamente");
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error, No se guardo ");
                }
                try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (num == 2) {
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay seres vivos creados, no se puede crear Universo");
            } else {
                try {
                    JFileChooser fc = new JFileChooser();
                    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de texto", "txt");
                    fc.addChoosableFileFilter(filtro);
                    int seleccion = fc.showSaveDialog(this);
                    if (seleccion == JFileChooser.APPROVE_OPTION) {
                        try {
                            fichero = null;
                            if (fc.getFileFilter().getDescription().equals("Archivo de texto")) {
                                fichero = new File(fc.getSelectedFile().getPath());
                            } else {
                                fichero = fc.getSelectedFile();
                            }
                            Universo u = new Universo();
                            u.adminUniverso(fichero + ".txt");
                            u.cargarArchivo();
                            for (SeresVivos sv : lista) {
                                u.getSeres().add(sv);
                            }
                            u.escribirArchivo();
                            lista.clear();
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception e) {
                }
            }
        }
        limpiar();
    }//GEN-LAST:event_jmi_CrearUniversoActionPerformed

    private void jmi_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AgregarActionPerformed
        JD_Agregar.setModal(true);
        JD_Agregar.pack();
        JD_Agregar.setLocationRelativeTo(null);
        JD_Agregar.setVisible(true);
    }//GEN-LAST:event_jmi_AgregarActionPerformed

    private void jmi_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AbrirActionPerformed
        JD_Abrir.setModal(true);
        JD_Abrir.pack();
        JD_Abrir.setLocationRelativeTo(null);
        JD_Abrir.setVisible(true);
        jta_Listar.setText("");

    }//GEN-LAST:event_jmi_AbrirActionPerformed

    private void jmi_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_EliminarActionPerformed
        JD_Eliminar.setModal(true);
        JD_Eliminar.pack();
        JD_Eliminar.setLocationRelativeTo(null);
        JD_Eliminar.setVisible(true);
    }//GEN-LAST:event_jmi_EliminarActionPerformed
    public void mostrar() {
        String Matriz[][] = new String[lista.size()][5];
        for (int i = 0; i < lista.size(); i++) {
            Matriz[i][0] = lista.get(i).getNombre();
            Matriz[i][1] = Integer.toString(lista.get(i).getPoder());
            Matriz[i][2] = Integer.toString(lista.get(i).getAño());
            Matriz[i][3] = lista.get(i).getPlaneta();
            Matriz[i][4] = lista.get(i).getRaza();
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                Matriz,
                new String[]{
                    "Nombre", "Poder", "Año", "Planeta", "Raza"
                }
        ));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                Matriz,
                new String[]{
                    "Nombre", "Poder", "Año", "Planeta", "Raza"
                }
        ));
    }

    public void Abrir() {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int seleccion = fc.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            FileReader fr = null;
            try {
                fichero = fc.getSelectedFile();
                jta_Listar.setText("");
                if (fichero.isFile()) {
                    fr = new FileReader(fichero);
                    BufferedReader br = new BufferedReader(fr);
                    String linea = "";
                    while ((linea = br.readLine()) != null) {
                        jta_Listar.append(linea);
                        jta_Listar.append("\n");
                    }

                }
                Universo un = new Universo();
                un.adminUniverso(fichero.getPath());
                un.cargarArchivo();
                for (SeresVivos sv : un.getSeres()) {
                    lista.add(sv);
                }
            } catch (Exception e) {
            }
        }
        mostrar();
    }

    public void Tiempo() {
        tiempo.start();
    }

    public void limpiar() {
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Poder", "Año", "Planeta", "Raza"
                }
        ));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Poder", "Año", "Planeta", "Raza"
                }
        ));
    }

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JD_Abrir;
    private javax.swing.JDialog JD_Agregar;
    private javax.swing.JDialog JD_Eliminar;
    private javax.swing.JDialog JD_Modificar;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cboRaza;
    private javax.swing.JComboBox<String> cboRaza1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuItem jmi_Abrir;
    private javax.swing.JMenuItem jmi_Agregar;
    private javax.swing.JMenuItem jmi_CrearUniverso;
    private javax.swing.JMenuItem jmi_Eliminar;
    private javax.swing.JMenuItem jmi_Modificar;
    private javax.swing.JMenuItem jmi_Salir;
    private javax.swing.JProgressBar jp_carga;
    private javax.swing.JSpinner jpi_Poder;
    private javax.swing.JSpinner jpi_Poder1;
    private javax.swing.JTextArea jta_Listar;
    private javax.swing.JTextField tf_Año;
    private javax.swing.JTextField tf_Año1;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Nombre1;
    private javax.swing.JTextField tf_Planeta;
    private javax.swing.JTextField tf_Planeta1;
    // End of variables declaration//GEN-END:variables
}
