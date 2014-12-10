package view;

import controller.ManagerWindowController;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class ManagerWindow extends VentaOnline {
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form ManagerWindow
     */
    public ManagerWindow() {
        initComponents();
        
        //SE CREAN LAS COLUMNAS DE NUESTRA TABLA...
        model.addColumn("Cant Existencia");
        model.addColumn("Nombre");
        model.addColumn("Categoria");
        model.addColumn("Proveedor");
        model.addColumn("Precio");
        //this.jTTableProduct.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPManagerWindow = new javax.swing.JTabbedPane();
        jLPCategory = new javax.swing.JLayeredPane();
        jTBTools2 = new javax.swing.JToolBar();
        jBAddCategory = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jBRemoveCategory = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jBConsultCategory = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jBModifyCategory = new javax.swing.JButton();
        jLTittleProfile2 = new javax.swing.JLabel();
        jTFNameUser2 = new javax.swing.JTextField();
        jBExit2 = new javax.swing.JButton();
        jLPUsers = new javax.swing.JLayeredPane();
        jLMessage2 = new javax.swing.JLabel();
        jLMessage1 = new javax.swing.JLabel();
        jLTittleProfile3 = new javax.swing.JLabel();
        jTFNameUser3 = new javax.swing.JTextField();
        jTBTools3 = new javax.swing.JToolBar();
        jBAddUser = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jBRemoveUser = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        jBConsultUser = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jBModifyProfileUser = new javax.swing.JButton();
        jBExit3 = new javax.swing.JButton();
        jLPProduct = new javax.swing.JLayeredPane();
        jTPProduct = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLNameProduct = new javax.swing.JLabel();
        jLProvider = new javax.swing.JLabel();
        jLQuantityMax = new javax.swing.JLabel();
        jLQuantityMin = new javax.swing.JLabel();
        jLPrice = new javax.swing.JLabel();
        jLCategory = new javax.swing.JLabel();
        jLDescription = new javax.swing.JLabel();
        jLAddImage = new javax.swing.JLabel();
        jTFNameProduct = new javax.swing.JTextField();
        jTFProvider = new javax.swing.JTextField();
        jTFQuantityMax = new javax.swing.JTextField();
        jTFQuantityMin = new javax.swing.JTextField();
        jTFPrice = new javax.swing.JTextField();
        jCBCategory = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescription = new javax.swing.JTextArea();
        jLImg = new javax.swing.JLabel();
        jBAddProduct = new javax.swing.JButton();
        jBExamineImage = new javax.swing.JButton();
        jTFPathImage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTPManagerWindow.setBackground(new java.awt.Color(255, 255, 255));

        jTBTools2.setBackground(new java.awt.Color(255, 255, 255));
        jTBTools2.setRollover(true);

        jBAddCategory.setBackground(new java.awt.Color(255, 255, 255));
        jBAddCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBAddCategory.setText("AGREGAR");
        jBAddCategory.setFocusable(false);
        jBAddCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAddCategory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBTools2.add(jBAddCategory);

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setMaximumSize(new java.awt.Dimension(5, 20));
        jTBTools2.add(jSeparator6);

        jBRemoveCategory.setBackground(new java.awt.Color(255, 255, 255));
        jBRemoveCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBRemoveCategory.setText("ELIMINAR");
        jBRemoveCategory.setFocusable(false);
        jBRemoveCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBRemoveCategory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBTools2.add(jBRemoveCategory);

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setMaximumSize(new java.awt.Dimension(5, 20));
        jTBTools2.add(jSeparator7);

        jBConsultCategory.setBackground(new java.awt.Color(255, 255, 255));
        jBConsultCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBConsultCategory.setText("BUSCAR");
        jBConsultCategory.setFocusable(false);
        jBConsultCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBConsultCategory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBTools2.add(jBConsultCategory);

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setMaximumSize(new java.awt.Dimension(5, 20));
        jTBTools2.add(jSeparator8);

        jBModifyCategory.setBackground(new java.awt.Color(255, 255, 255));
        jBModifyCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBModifyCategory.setText("MODIFICAR CATEGORIA");
        jBModifyCategory.setFocusable(false);
        jBModifyCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBModifyCategory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBTools2.add(jBModifyCategory);

        jLTittleProfile2.setBackground(new java.awt.Color(255, 255, 255));
        jLTittleProfile2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLTittleProfile2.setText("ADMINISTRADOR:");

        jTFNameUser2.setEditable(false);
        jTFNameUser2.setBackground(new java.awt.Color(255, 255, 255));
        jTFNameUser2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jBExit2.setBackground(new java.awt.Color(255, 255, 255));
        jBExit2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBExit2.setText("SALIR");
        jBExit2.setToolTipText("");
        jBExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLPCategoryLayout = new javax.swing.GroupLayout(jLPCategory);
        jLPCategory.setLayout(jLPCategoryLayout);
        jLPCategoryLayout.setHorizontalGroup(
            jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTBTools2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLPCategoryLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLTittleProfile2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNameUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(456, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBExit2)
                .addContainerGap())
        );
        jLPCategoryLayout.setVerticalGroup(
            jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTBTools2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTittleProfile2)
                    .addComponent(jTFNameUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jBExit2)
                .addContainerGap())
        );
        jLPCategory.setLayer(jTBTools2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jLTittleProfile2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jTFNameUser2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jBExit2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTPManagerWindow.addTab("    CATEGORIA     ", jLPCategory);

        jLPUsers.setBackground(new java.awt.Color(255, 255, 255));
        jLPUsers.setMaximumSize(new java.awt.Dimension(10, 10));

        jLMessage2.setBackground(new java.awt.Color(255, 255, 255));
        jLMessage2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLMessage2.setText("POR ESO ATIENDELO BIEN Y SERAS RECOMPENSADO....");

        jLMessage1.setBackground(new java.awt.Color(255, 255, 255));
        jLMessage1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLMessage1.setText("BRINDAR UN BUEN SERVICIO AL CLIENTE ES LO PRIMORDIAL");

        jLTittleProfile3.setBackground(new java.awt.Color(255, 255, 255));
        jLTittleProfile3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLTittleProfile3.setText("ADMINISTRADOR:");

        jTFNameUser3.setEditable(false);
        jTFNameUser3.setBackground(new java.awt.Color(255, 255, 255));

        jTBTools3.setBackground(new java.awt.Color(255, 255, 255));
        jTBTools3.setRollover(true);

        jBAddUser.setBackground(new java.awt.Color(255, 255, 255));
        jBAddUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBAddUser.setText("AGREGAR");
        jBAddUser.setFocusable(false);
        jBAddUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAddUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddUserActionPerformed(evt);
            }
        });
        jTBTools3.add(jBAddUser);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setMaximumSize(new java.awt.Dimension(5, 20));
        jSeparator1.setMinimumSize(new java.awt.Dimension(10, 10));
        jTBTools3.add(jSeparator1);

        jBRemoveUser.setBackground(new java.awt.Color(255, 255, 255));
        jBRemoveUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBRemoveUser.setText("ELIMINAR");
        jBRemoveUser.setFocusable(false);
        jBRemoveUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBRemoveUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBTools3.add(jBRemoveUser);

        jSeparator.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator.setMaximumSize(new java.awt.Dimension(5, 20));
        jTBTools3.add(jSeparator);

        jBConsultUser.setBackground(new java.awt.Color(255, 255, 255));
        jBConsultUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBConsultUser.setText("BUSCAR");
        jBConsultUser.setFocusable(false);
        jBConsultUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBConsultUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBTools3.add(jBConsultUser);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMaximumSize(new java.awt.Dimension(5, 20));
        jTBTools3.add(jSeparator2);

        jBModifyProfileUser.setBackground(new java.awt.Color(255, 255, 255));
        jBModifyProfileUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBModifyProfileUser.setText("MODIFICAR PERFIL");
        jBModifyProfileUser.setFocusable(false);
        jBModifyProfileUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBModifyProfileUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBTools3.add(jBModifyProfileUser);

        jBExit3.setBackground(new java.awt.Color(255, 255, 255));
        jBExit3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBExit3.setText("SALIR");
        jBExit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExit3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLPUsersLayout = new javax.swing.GroupLayout(jLPUsers);
        jLPUsers.setLayout(jLPUsersLayout);
        jLPUsersLayout.setHorizontalGroup(
            jLPUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPUsersLayout.createSequentialGroup()
                .addGroup(jLPUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBTools3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPUsersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jLPUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBExit3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLMessage2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLPUsersLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jLPUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLPUsersLayout.createSequentialGroup()
                                .addComponent(jLTittleProfile3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNameUser3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 315, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLPUsersLayout.setVerticalGroup(
            jLPUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTBTools3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addGroup(jLPUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTittleProfile3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNameUser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMessage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMessage2)
                .addGap(11, 11, 11)
                .addComponent(jBExit3)
                .addContainerGap())
        );
        jLPUsers.setLayer(jLMessage2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPUsers.setLayer(jLMessage1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPUsers.setLayer(jLTittleProfile3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPUsers.setLayer(jTFNameUser3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPUsers.setLayer(jTBTools3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPUsers.setLayer(jBExit3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTPManagerWindow.addTab("     USUARIO    ", jLPUsers);

        jLPProduct.setBackground(new java.awt.Color(255, 0, 0));

        jLNameProduct.setText("Nombre");

        jLProvider.setText("Proveedor");

        jLQuantityMax.setText("Cantidad existente");

        jLQuantityMin.setText("Cantidad minima existente");

        jLPrice.setText("Precio");

        jLCategory.setText("Categoria");

        jLDescription.setText("Descripcion");

        jLAddImage.setText("Añadir imagen");

        jCBCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "zapatos", "ropa", "telefonos" }));

        jTADescription.setColumns(20);
        jTADescription.setRows(5);
        jScrollPane1.setViewportView(jTADescription);

        jLImg.setBackground(new java.awt.Color(255, 255, 255));

        jBAddProduct.setText("AGREGAR");
        jBAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddProductActionPerformed(evt);
            }
        });

        jBExamineImage.setText("...");
        jBExamineImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExamineImageActionPerformed(evt);
            }
        });

        jTFPathImage.setEditable(false);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBAddProduct)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLAddImage)
                            .addComponent(jLDescription)
                            .addComponent(jLCategory)
                            .addComponent(jLPrice)
                            .addComponent(jLQuantityMin)
                            .addComponent(jLQuantityMax)
                            .addComponent(jLProvider)
                            .addComponent(jLNameProduct))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNameProduct, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFProvider, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFQuantityMax, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFQuantityMin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTFPathImage, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBExamineImage)))))
                .addGap(34, 34, 34)
                .addComponent(jLImg, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNameProduct)
                    .addComponent(jTFNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProvider)
                    .addComponent(jTFProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuantityMax)
                    .addComponent(jTFQuantityMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuantityMin)
                    .addComponent(jTFQuantityMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPrice)
                    .addComponent(jTFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCategory)
                    .addComponent(jCBCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDescription)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAddImage)
                            .addComponent(jBExamineImage)
                            .addComponent(jTFPathImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(jBAddProduct))
                    .addComponent(jLImg, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jLNameProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLProvider, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLQuantityMax, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLQuantityMin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLAddImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFNameProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFProvider, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFQuantityMax, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFQuantityMin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jCBCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLImg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBAddProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBExamineImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTFPathImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTPProduct.addTab("     AGREGAR   ", jLayeredPane1);

        javax.swing.GroupLayout jLPProductLayout = new javax.swing.GroupLayout(jLPProduct);
        jLPProduct.setLayout(jLPProductLayout);
        jLPProductLayout.setHorizontalGroup(
            jLPProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPProductLayout.createSequentialGroup()
                .addComponent(jTPProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLPProductLayout.setVerticalGroup(
            jLPProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPProduct)
        );
        jLPProduct.setLayer(jTPProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTPManagerWindow.addTab("     PRODUCTO     ", jLPProduct);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPManagerWindow)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPManagerWindow)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddUserActionPerformed
        
        RegisterWindow registerWindow = new RegisterWindow();
        registerWindow.setVisible(true);

        registerWindow.setFatherWindow(this, true);  
    }//GEN-LAST:event_jBAddUserActionPerformed

    private void jBExit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExit3ActionPerformed
        restoreFatherWindow();

        this.dispose();
    }//GEN-LAST:event_jBExit3ActionPerformed

    private void jBExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExit2ActionPerformed
        restoreFatherWindow();

        this.dispose();
    }//GEN-LAST:event_jBExit2ActionPerformed

    private void jBAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddProductActionPerformed
        //ACCION DEL BOTON AGREGAR PRODUCTO
        int cantidadMin = -1;
        int cantidadMax = -1;
        float precio      = -1;
        String PathImage = "";
         PathImage     = jTFPathImage.getText();
            String Name = jTFNameProduct.getText();  
            String Proveedor = jTFProvider.getText(); 
            String Descripcion = jTADescription.getText(); 
            String Categoria = jCBCategory.getSelectedItem().toString();
            

        if (!"".equals(jTFQuantityMax.getText()) && !"".equals(jTFQuantityMin.getText()) && !"".equals(jTFPrice.getText()) &&
        !"".equals(PathImage) && !"".equals(Name) && !"".equals(Proveedor)  && 
            !"".equals(Descripcion) && !"".equals(Categoria))
        {
            
            try
            {
                cantidadMax   = Integer.parseInt(jTFQuantityMax.getText());
                cantidadMin   = Integer.parseInt(jTFQuantityMin.getText());
                precio        = Float.parseFloat(jTFPrice.getText());
                
                if((cantidadMax > 0) && (cantidadMin > 0) && (precio > 0))
                {
                    ManagerWindowController.saveProductsInXml(Name, Proveedor, Integer.toString(cantidadMax),  Integer.toString(cantidadMin),  Float.toString(precio), PathImage, Descripcion, Categoria);
                    JOptionPane.showMessageDialog(this,"Registro exitoso");
                    restoreFatherWindow();

                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(this,"Cantidades o precio invalido.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);


            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this,"Las cantidades o precio no contienen el formato correcto.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);    

            }
        }
        else
                JOptionPane.showMessageDialog(this,"Existen campos vacios.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
                
        
    }//GEN-LAST:event_jBAddProductActionPerformed

    private void jBExamineImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExamineImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select Image");
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileFilter(new FileNameExtensionFilter("jpg, png, gif", "jpg", "png", "gif"));
        int sel = chooser.showOpenDialog(this);
        if (sel == JFileChooser.APPROVE_OPTION)
        {
            File f = chooser.getSelectedFile();
            ImageIcon image=new ImageIcon(chooser.getSelectedFile().getPath());

            if ((image.getIconHeight()>100) || (image.getIconWidth()>100))
            {
                ImageIcon imageScalada = new ImageIcon(image.getImage().getScaledInstance(295, 202, 600));
            
                jLImg.setIcon(imageScalada);
            }
            else
                jLImg.setIcon(image);

            String pathImg = f.getAbsolutePath();
            jTFPathImage.setText(pathImg);
        }
    }//GEN-LAST:event_jBExamineImageActionPerformed

    public static void NameUser(String name, String lastName){

    }
    /*
    private void initComponentsProduct()
    {
     
        ManagerWindowController.initOutletsProductRegistration(jTFNameProduct, jTFProvider, jTFQuantityMax, jTFQuantityMin, jTFPrice, jTFPathImage, jTADescription, jCBCategory);
        ManagerWindowController.saveProductsInXml();
        ManagerWindowController.clearAllOutletsProduct(jTFNameProduct, jTFProvider, jTFQuantityMax, jTFQuantityMin, jTFPrice, jTFPathImage, jTADescription);
    }
    */
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
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddCategory;
    private javax.swing.JButton jBAddProduct;
    private javax.swing.JButton jBAddUser;
    private javax.swing.JButton jBConsultCategory;
    private javax.swing.JButton jBConsultUser;
    private javax.swing.JButton jBExamineImage;
    private javax.swing.JButton jBExit2;
    private javax.swing.JButton jBExit3;
    private javax.swing.JButton jBModifyCategory;
    private javax.swing.JButton jBModifyProfileUser;
    private javax.swing.JButton jBRemoveCategory;
    private javax.swing.JButton jBRemoveUser;
    private javax.swing.JComboBox jCBCategory;
    private javax.swing.JLabel jLAddImage;
    private javax.swing.JLabel jLCategory;
    private javax.swing.JLabel jLDescription;
    private javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLMessage1;
    private javax.swing.JLabel jLMessage2;
    private javax.swing.JLabel jLNameProduct;
    private javax.swing.JLayeredPane jLPCategory;
    private javax.swing.JLayeredPane jLPProduct;
    private javax.swing.JLayeredPane jLPUsers;
    private javax.swing.JLabel jLPrice;
    private javax.swing.JLabel jLProvider;
    private javax.swing.JLabel jLQuantityMax;
    private javax.swing.JLabel jLQuantityMin;
    private javax.swing.JLabel jLTittleProfile2;
    private javax.swing.JLabel jLTittleProfile3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextArea jTADescription;
    private javax.swing.JToolBar jTBTools2;
    private javax.swing.JToolBar jTBTools3;
    private javax.swing.JTextField jTFNameProduct;
    private javax.swing.JTextField jTFNameUser2;
    private javax.swing.JTextField jTFNameUser3;
    private javax.swing.JTextField jTFPathImage;
    private javax.swing.JTextField jTFPrice;
    private javax.swing.JTextField jTFProvider;
    private javax.swing.JTextField jTFQuantityMax;
    private javax.swing.JTextField jTFQuantityMin;
    private javax.swing.JTabbedPane jTPManagerWindow;
    private javax.swing.JTabbedPane jTPProduct;
    // End of variables declaration//GEN-END:variables


}
