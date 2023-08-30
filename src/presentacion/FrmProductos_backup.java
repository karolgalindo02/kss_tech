/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;
import negocio.productoControl;
/**
 *
 * @author Santiago
 */
public class FrmProductos_backup extends javax.swing.JInternalFrame {

    private final productoControl CONTROL;
    public FrmProductos_backup() {
        initComponents();
        this.CONTROL=new productoControl();
        this.Listar("");
    }

    //creacion del metodo listar
    private void Listar(String texto){
        tablaListado.setModel(this.CONTROL.listar(texto));
        totalregistro.setText("Mostrando " + this.CONTROL.totalMostrados() + " de un total de " + this.CONTROL.total() + " Registros");

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        totalregistro = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaListado = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        contrag1 = new javax.swing.JLabel();
        codigouss4 = new javax.swing.JTextField();
        codigousg2 = new javax.swing.JLabel();
        eliminar3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        codigouss5 = new javax.swing.JTextField();
        codigouss6 = new javax.swing.JTextField();
        Correog3 = new javax.swing.JLabel();
        Categoria1 = new javax.swing.JComboBox<>();
        codigousg3 = new javax.swing.JLabel();
        codigouss7 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        eliminar1 = new javax.swing.JButton();
        modificar2 = new javax.swing.JButton();
        guardar1 = new javax.swing.JButton();
        registro3 = new javax.swing.JLabel();
        primer_registro1 = new javax.swing.JButton();
        registro1 = new javax.swing.JButton();
        Correog4 = new javax.swing.JLabel();
        n_registro1 = new javax.swing.JLabel();
        mod1 = new javax.swing.JLabel();
        guardar4 = new javax.swing.JLabel();
        guardar5 = new javax.swing.JLabel();
        modificar3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Productos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/Villa_Home_Icon_UIA.png"))); // NOI18N
        jButton4.setText("Inicio");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 120, 30));

        jButton7.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/Cart_Icon_UIA.png"))); // NOI18N
        jButton7.setText("Tienda");
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 120, 30));

        jButton8.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/profile-circle.png"))); // NOI18N
        jButton8.setText("Login");
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 120, 30));

        jButton9.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/call.png"))); // NOI18N
        jButton9.setText("Contactenos");
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 120, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo.jpg"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Vector2.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -10, 1330, 180));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 52, 52));
        jLabel5.setText("Consulta productos");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 250, 40));

        totalregistro.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        totalregistro.setForeground(new java.awt.Color(102, 102, 102));
        totalregistro.setText("Registro");
        jPanel4.add(totalregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 370, -1));

        nombre.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        nombre.setText("Nombre");
        jPanel4.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 320, 30));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img4/buscar.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 90, 120, -1));

        jLabel10.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Busque los productos del inventario");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 270, -1));

        tablaListado.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N
        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cantidad", "Producto", "Precio", "Categoria", "Descripción", "Estado", "Usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaListado);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 560, 100));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel4.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 610, 430));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Form2.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 1020, 530));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1100, 720));

        jTabbedPane1.addTab("Busqueda", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 52, 52));
        jLabel6.setText("Registre los productos");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 250, 40));

        contrag1.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        contrag1.setText("Descripción*");
        jPanel5.add(contrag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        codigouss4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigouss4ActionPerformed(evt);
            }
        });
        jPanel5.add(codigouss4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 160, 30));

        codigousg2.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        codigousg2.setText("IVA*");
        jPanel5.add(codigousg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        eliminar3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        eliminar3.setText("Eliminar");
        jPanel5.add(eliminar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Complete la información de los productos");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 270, -1));

        codigouss5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigouss5ActionPerformed(evt);
            }
        });
        jPanel5.add(codigouss5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 160, 30));

        codigouss6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigouss6ActionPerformed(evt);
            }
        });
        jPanel5.add(codigouss6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 160, 30));

        Correog3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        Correog3.setText("Precio*");
        jPanel5.add(Correog3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        Categoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnología", "Ferretería" }));
        Categoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Categoria1ActionPerformed(evt);
            }
        });
        jPanel5.add(Categoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 160, 30));

        codigousg3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        codigousg3.setText("referencia Producto*");
        jPanel5.add(codigousg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        codigouss7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigouss7ActionPerformed(evt);
            }
        });
        jPanel5.add(codigouss7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 30));

        jTable2.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Producto", "Categoria", "Marca", "Descripción", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 560, 80));

        eliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img3/eliminar.png"))); // NOI18N
        eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar1ActionPerformed(evt);
            }
        });
        jPanel5.add(eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 80, 70));

        modificar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img4/actualizar.png"))); // NOI18N
        modificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar2ActionPerformed(evt);
            }
        });
        jPanel5.add(modificar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 90, 80));

        guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img3/guardar.png"))); // NOI18N
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });
        jPanel5.add(guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 80, 80));

        registro3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        registro3.setText("Registro");
        jPanel5.add(registro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        primer_registro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img3/primer_registro.png"))); // NOI18N
        primer_registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primer_registro1ActionPerformed(evt);
            }
        });
        jPanel5.add(primer_registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 80, 80));

        registro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img3/registro.png"))); // NOI18N
        registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro1ActionPerformed(evt);
            }
        });
        jPanel5.add(registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 60, 70));

        Correog4.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        Correog4.setText("Categoria*");
        jPanel5.add(Correog4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        n_registro1.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        n_registro1.setText("Nuevo Registro");
        jPanel5.add(n_registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        mod1.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        mod1.setText("Modificar");
        jPanel5.add(mod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        guardar4.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        guardar4.setText("Actualizar");
        jPanel5.add(guardar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        guardar5.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 12)); // NOI18N
        guardar5.setText("Guardar");
        jPanel5.add(guardar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        modificar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img3/modificar.png"))); // NOI18N
        modificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar3ActionPerformed(evt);
            }
        });
        jPanel5.add(modificar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 90, 70));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 610, 430));

        jButton3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/Villa_Home_Icon_UIA.png"))); // NOI18N
        jButton3.setText("Inicio");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 120, 30));

        jButton2.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/Cart_Icon_UIA.png"))); // NOI18N
        jButton2.setText("Tienda");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 120, 30));

        jButton5.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/profile-circle.png"))); // NOI18N
        jButton5.setText("Login");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 120, 30));

        jButton6.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/call.png"))); // NOI18N
        jButton6.setText("Contactenos");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Form2.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 1020, 530));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Vector2.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -20, 1200, 180));

        jTabbedPane1.addTab("Inventario", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void modificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar3ActionPerformed

    private void registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registro1ActionPerformed

    private void primer_registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primer_registro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primer_registro1ActionPerformed

    private void guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardar1ActionPerformed

    private void modificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar2ActionPerformed

    private void eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar1ActionPerformed

    private void codigouss7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigouss7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigouss7ActionPerformed

    private void Categoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Categoria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Categoria1ActionPerformed

    private void codigouss6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigouss6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigouss6ActionPerformed

    private void codigouss4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigouss4ActionPerformed

    }//GEN-LAST:event_codigouss4ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        this.listar(txtBuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void codigouss5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigouss5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigouss5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Categoria1;
    private javax.swing.JLabel Correog3;
    private javax.swing.JLabel Correog4;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel codigousg2;
    private javax.swing.JLabel codigousg3;
    private javax.swing.JTextField codigouss4;
    private javax.swing.JTextField codigouss5;
    private javax.swing.JTextField codigouss6;
    private javax.swing.JTextField codigouss7;
    private javax.swing.JLabel contrag1;
    private javax.swing.JButton eliminar1;
    private javax.swing.JLabel eliminar3;
    private javax.swing.JButton guardar1;
    private javax.swing.JLabel guardar4;
    private javax.swing.JLabel guardar5;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel mod1;
    private javax.swing.JButton modificar2;
    private javax.swing.JButton modificar3;
    private javax.swing.JLabel n_registro1;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton primer_registro1;
    private javax.swing.JButton registro1;
    private javax.swing.JLabel registro3;
    private javax.swing.JTable tablaListado;
    private javax.swing.JLabel totalregistro;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void listar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
