package view;

import controller.ManagerWindowController;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Product;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class InventoryWindow extends VentaOnline {

    public InventoryWindow() {
        initComponents();
        initRegistrationComboBox();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBAddProduct = new javax.swing.JButton();
        jTPInventory = new javax.swing.JTabbedPane();
        jLProduct = new javax.swing.JLayeredPane();
        jTPProduct = new javax.swing.JTabbedPane();
        jLPAddProduct = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
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
        jBAddProduct1 = new javax.swing.JButton();
        jBExamineImage = new javax.swing.JButton();
        jTFPathImage = new javax.swing.JTextField();
        jBCleanAdd = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLNameProduct1 = new javax.swing.JLabel();
        jTFNameProductConsult = new javax.swing.JTextField();
        jBConsultProduct = new javax.swing.JButton();
        jTFNameConsult = new javax.swing.JTextField();
        jLNameProductConsult = new javax.swing.JLabel();
        jLProviderProductConsult = new javax.swing.JLabel();
        jLCantMaxConsult = new javax.swing.JLabel();
        jLCantMinConsult = new javax.swing.JLabel();
        jLPriceConsult = new javax.swing.JLabel();
        jLCategoryConsult = new javax.swing.JLabel();
        jLPathConsult = new javax.swing.JLabel();
        jLDescripConcult = new javax.swing.JLabel();
        jTFProviderConsult = new javax.swing.JTextField();
        jTFCantMaxConsult = new javax.swing.JTextField();
        jTFCantMinConsult = new javax.swing.JTextField();
        jTFPriceConsult = new javax.swing.JTextField();
        jTFCategoryConsult = new javax.swing.JTextField();
        jTFPathConsult = new javax.swing.JTextField();
        jTFDescripConsult = new javax.swing.JTextField();
        jCleanConsultProduct = new javax.swing.JButton();
        jBCleanProduct = new javax.swing.JButton();
        jLPCategory = new javax.swing.JLayeredPane();
        jLPCategory1 = new javax.swing.JLayeredPane();
        jLTittleProfile2 = new javax.swing.JLabel();
        jTFNameUser2 = new javax.swing.JTextField();
        jBExit2 = new javax.swing.JButton();
        jBClearCategoryList = new javax.swing.JButton();
        jBCleanCategory = new javax.swing.JButton();
        jBConsultCategory = new javax.swing.JButton();
        jLNameCategory = new javax.swing.JLabel();
        jTFNameCategory = new javax.swing.JTextField();
        jBAddCategory = new javax.swing.JButton();

        jBAddProduct.setBackground(new java.awt.Color(255, 255, 255));
        jBAddProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBAddProduct.setText("AGREGAR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTPInventory.setBackground(new java.awt.Color(255, 255, 255));

        jLNameProduct.setText("Nombre");

        jLProvider.setText("Proveedor");

        jLQuantityMax.setText("Cantidad existente");

        jLQuantityMin.setText("Cantidad minima existente");

        jLPrice.setText("Precio");

        jLCategory.setText("Categoria");

        jLDescription.setText("Descripcion");

        jLAddImage.setText("Añadir imagen");

        jCBCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:" }));

        jTADescription.setColumns(20);
        jTADescription.setRows(5);
        jScrollPane1.setViewportView(jTADescription);

        jLImg.setBackground(new java.awt.Color(255, 255, 255));

        jBAddProduct1.setText("AGREGAR");
        jBAddProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddProduct1ActionPerformed(evt);
            }
        });

        jBExamineImage.setText("...");
        jBExamineImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExamineImageActionPerformed(evt);
            }
        });

        jTFPathImage.setEditable(false);

        jBCleanAdd.setText("LIMPIAR");
        jBCleanAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCleanAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCleanAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBAddProduct1))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLAddImage)
                            .addComponent(jLDescription)
                            .addComponent(jLCategory)
                            .addComponent(jLPrice)
                            .addComponent(jLQuantityMin)
                            .addComponent(jLQuantityMax)
                            .addComponent(jLProvider)
                            .addComponent(jLNameProduct))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTFNameProduct, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFProvider, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFQuantityMax, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFQuantityMin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, 192, Short.MAX_VALUE)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jTFPathImage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBExamineImage)))))
                .addGap(34, 34, 34)
                .addComponent(jLImg, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNameProduct)
                    .addComponent(jTFNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProvider)
                    .addComponent(jTFProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuantityMax)
                    .addComponent(jTFQuantityMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuantityMin)
                    .addComponent(jTFQuantityMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPrice)
                    .addComponent(jTFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCategory)
                    .addComponent(jCBCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDescription)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAddImage)
                            .addComponent(jBExamineImage)
                            .addComponent(jTFPathImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAddProduct1)
                            .addComponent(jBCleanAdd)))
                    .addComponent(jLImg, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(jLNameProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLProvider, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLQuantityMax, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLQuantityMin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLAddImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFNameProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFProvider, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFQuantityMax, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFQuantityMin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jCBCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLImg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBAddProduct1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBExamineImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFPathImage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jBCleanAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLPAddProductLayout = new javax.swing.GroupLayout(jLPAddProduct);
        jLPAddProduct.setLayout(jLPAddProductLayout);
        jLPAddProductLayout.setHorizontalGroup(
            jLPAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );
        jLPAddProductLayout.setVerticalGroup(
            jLPAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPAddProductLayout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLPAddProduct.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTPProduct.addTab("AGREGAR", jLPAddProduct);

        jLNameProduct1.setText("Nombre del producto a consultar");

        jBConsultProduct.setText("CONSULTAR");
        jBConsultProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultProductActionPerformed(evt);
            }
        });

        jTFNameConsult.setEditable(false);

        jLNameProductConsult.setText("NOMBRE");

        jLProviderProductConsult.setText("PROVEEDOR");

        jLCantMaxConsult.setText("CANTIDAD EXISTENTE");

        jLCantMinConsult.setText("CANTIDAD MINIMA");

        jLPriceConsult.setText("PRECIO");

        jLCategoryConsult.setText("CATEGORIA");

        jLPathConsult.setText("PATH IMAGEN");

        jLDescripConcult.setText("DESCRIPCION");

        jTFProviderConsult.setEditable(false);

        jTFCantMaxConsult.setEditable(false);

        jTFCantMinConsult.setEditable(false);

        jTFPriceConsult.setEditable(false);

        jTFCategoryConsult.setEditable(false);

        jTFPathConsult.setEditable(false);

        jTFDescripConsult.setEditable(false);

        jCleanConsultProduct.setText("LIMPIAR");
        jCleanConsultProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCleanConsultProductActionPerformed(evt);
            }
        });

        jBCleanProduct.setText("ELIMINAR");
        jBCleanProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCleanProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLNameProduct1)
                    .addComponent(jLNameProductConsult)
                    .addComponent(jLProviderProductConsult)
                    .addComponent(jLCantMaxConsult)
                    .addComponent(jLCantMinConsult)
                    .addComponent(jLPriceConsult)
                    .addComponent(jLCategoryConsult)
                    .addComponent(jLPathConsult)
                    .addComponent(jLDescripConcult))
                .addGap(28, 28, 28)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jCleanConsultProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jBCleanProduct)
                        .addGap(18, 18, 18)
                        .addComponent(jBConsultProduct))
                    .addComponent(jTFNameProductConsult)
                    .addComponent(jTFProviderConsult)
                    .addComponent(jTFCantMaxConsult)
                    .addComponent(jTFCantMinConsult)
                    .addComponent(jTFPriceConsult)
                    .addComponent(jTFCategoryConsult)
                    .addComponent(jTFPathConsult)
                    .addComponent(jTFDescripConsult)
                    .addComponent(jTFNameConsult))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNameProduct1)
                    .addComponent(jTFNameProductConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLNameProductConsult)
                    .addComponent(jTFNameConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLProviderProductConsult)
                    .addComponent(jTFProviderConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCantMaxConsult)
                    .addComponent(jTFCantMaxConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCantMinConsult)
                    .addComponent(jTFCantMinConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPriceConsult)
                    .addComponent(jTFPriceConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCategoryConsult)
                    .addComponent(jTFCategoryConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPathConsult)
                    .addComponent(jTFPathConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLDescripConcult)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTFDescripConsult, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConsultProduct)
                    .addComponent(jCleanConsultProduct)
                    .addComponent(jBCleanProduct))
                .addContainerGap())
        );
        jLayeredPane3.setLayer(jLNameProduct1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFNameProductConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jBConsultProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFNameConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLNameProductConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLProviderProductConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLCantMaxConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLCantMinConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLPriceConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLCategoryConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLPathConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLDescripConcult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFProviderConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFCantMaxConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFCantMinConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFPriceConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFCategoryConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFPathConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTFDescripConsult, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jCleanConsultProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jBCleanProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane3))
        );
        jLayeredPane1.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTPProduct.addTab("GESTIONAR PRODUCTO", jLayeredPane1);

        javax.swing.GroupLayout jLProductLayout = new javax.swing.GroupLayout(jLProduct);
        jLProduct.setLayout(jLProductLayout);
        jLProductLayout.setHorizontalGroup(
            jLProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPProduct)
        );
        jLProductLayout.setVerticalGroup(
            jLProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPProduct)
        );
        jLProduct.setLayer(jTPProduct, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTPInventory.addTab("PRODUCTO", jLProduct);

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

        jBClearCategoryList.setText("ELIMINAR");
        jBClearCategoryList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearCategoryListActionPerformed(evt);
            }
        });

        jBCleanCategory.setText("LIMPIAR");
        jBCleanCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCleanCategoryActionPerformed(evt);
            }
        });

        jBConsultCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        jBConsultCategory.setMaximumSize(new java.awt.Dimension(20, 20));
        jBConsultCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultCategoryActionPerformed(evt);
            }
        });

        jLNameCategory.setText("NOMBRE DE LA CATEGORIA");

        jBAddCategory.setText("AGREGAR");
        jBAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLPCategory1Layout = new javax.swing.GroupLayout(jLPCategory1);
        jLPCategory1.setLayout(jLPCategory1Layout);
        jLPCategory1Layout.setHorizontalGroup(
            jLPCategory1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPCategory1Layout.createSequentialGroup()
                .addGroup(jLPCategory1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLPCategory1Layout.createSequentialGroup()
                        .addGroup(jLPCategory1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLPCategory1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLTittleProfile2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNameUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLPCategory1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLNameCategory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLPCategory1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jLPCategory1Layout.createSequentialGroup()
                                        .addComponent(jBAddCategory)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBCleanCategory)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBClearCategoryList))
                                    .addComponent(jTFNameCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBConsultCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPCategory1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBExit2)))
                .addContainerGap())
        );
        jLPCategory1Layout.setVerticalGroup(
            jLPCategory1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPCategory1Layout.createSequentialGroup()
                .addGroup(jLPCategory1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLPCategory1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jLPCategory1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNameCategory)
                            .addComponent(jTFNameCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPCategory1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBConsultCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(jLPCategory1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBClearCategoryList)
                    .addComponent(jBCleanCategory)
                    .addComponent(jBAddCategory))
                .addGap(41, 41, 41)
                .addGroup(jLPCategory1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTittleProfile2)
                    .addComponent(jTFNameUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jBExit2)
                .addContainerGap())
        );
        jLPCategory1.setLayer(jLTittleProfile2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory1.setLayer(jTFNameUser2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory1.setLayer(jBExit2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory1.setLayer(jBClearCategoryList, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory1.setLayer(jBCleanCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory1.setLayer(jBConsultCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory1.setLayer(jLNameCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory1.setLayer(jTFNameCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory1.setLayer(jBAddCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLPCategoryLayout = new javax.swing.GroupLayout(jLPCategory);
        jLPCategory.setLayout(jLPCategoryLayout);
        jLPCategoryLayout.setHorizontalGroup(
            jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
            .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLPCategory1, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        jLPCategoryLayout.setVerticalGroup(
            jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
            .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLPCategory1))
        );
        jLPCategory.setLayer(jLPCategory1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTPInventory.addTab("CATEGORIA", jLPCategory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPInventory)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPInventory)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCleanAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCleanAddActionPerformed

        jTFNameProduct.setText(null);
        jTFProvider.setText(null);
        jTFQuantityMax.setText(null);
        jTFQuantityMin.setText(null);
        jTFPrice.setText(null);
        jTADescription.setText(null);
        jTFPathImage.setText(null);
    }//GEN-LAST:event_jBCleanAddActionPerformed

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

    private void jBAddProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddProduct1ActionPerformed
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
            !"".equals(PathImage) && !"".equals(Name) && !"".equals(Proveedor)  && !"".equals(Descripcion))
        {
            if(!"Seleccione:".equals(Categoria))
            {
                if(!ManagerWindowController.checkProductName(Name))
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
                JOptionPane.showMessageDialog(this,"Este producto ya se encuentra registrado.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
            }
            else
            JOptionPane.showMessageDialog(this,"Debe seleccionar una categoria.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(this,"Existen campos vacios.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jBAddProduct1ActionPerformed

    private void jBConsultProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultProductActionPerformed
        // ACCION DEL BOTON PARA CONSULTAR PRODUCTO
        String consultar = jTFNameProductConsult.getText();
        String name,proveedor,cantmax,cantmin,image,precio,descrip,categoria;

        if(!"".equals(consultar))
        {
            if(ManagerWindowController.checkProductName(consultar))
            {

                Product lProduct = ManagerWindowController.ConsultProduct(consultar);

                name = lProduct.getNameProduct();
                proveedor = lProduct.getProvider();
                cantmax = lProduct.getQuantityMax();
                cantmin = lProduct.getQuantityMin();
                precio = lProduct.getPrice();
                image = lProduct.getImg();
                descrip = lProduct.getDescription();
                categoria = lProduct.getCategory();

                jTFNameConsult.setText(name);
                jTFProviderConsult.setText(proveedor);
                jTFCantMaxConsult.setText(cantmax);
                jTFCantMinConsult.setText(cantmin);
                jTFPriceConsult.setText(precio);
                jTFPathConsult.setText(image);
                jTFDescripConsult.setText(descrip);
                jTFCategoryConsult.setText(categoria);
            }
            else
            JOptionPane.showMessageDialog(this,"El producto que esta buscando no se encuentra registrado.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(this,"Existen campos vacios.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jBConsultProductActionPerformed

    private void jCleanConsultProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCleanConsultProductActionPerformed
        jTFNameConsult.setText(null);
        jTFProviderConsult.setText(null);
        jTFCantMaxConsult.setText(null);
        jTFCantMinConsult.setText(null);
        jTFPriceConsult.setText(null);
        jTFPathConsult.setText(null);
        jTFDescripConsult.setText(null);
        jTFCategoryConsult.setText(null);
    }//GEN-LAST:event_jCleanConsultProductActionPerformed

    private void jBCleanProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCleanProductActionPerformed
        // TODO add your handling code here:
        String eliminar = jTFNameProductConsult.getText();

        if(!"".equals(eliminar))
        {
            if(ManagerWindowController.checkProductName(eliminar))
            {
                if(ManagerWindowController.CleanProduct(eliminar))
                {
                    JOptionPane.showMessageDialog(this,"Eliminacion exitosa");
                }
            }
            else
            JOptionPane.showMessageDialog(this,"El producto que esta buscando no se encuentra registrado.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(this,"Existen campos vacios.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jBCleanProductActionPerformed

    private void jBExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExit2ActionPerformed
        restoreFatherWindow();

        this.dispose();
    }//GEN-LAST:event_jBExit2ActionPerformed

    private void jBClearCategoryListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearCategoryListActionPerformed
        // ELIMINAR CATEGORIA DE LA LISTA
        String categoria = jTFNameCategory.getText();

        if(!"".equals(categoria))
        {
            if(ManagerWindowController.checkCategory(categoria))
            {
                if(ManagerWindowController.CleanCategory(categoria))
                {
                    JOptionPane.showMessageDialog(this,"Eliminacion exitosa");
                    jTFNameCategory.setText(null);
                    initRegistrationComboBox();
                }
            }
            else
            JOptionPane.showMessageDialog(this,"La categoria que desea eliminar no se encuentra registrado.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(this,"Existen campos vacios.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jBClearCategoryListActionPerformed

    private void jBCleanCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCleanCategoryActionPerformed
        //LIMPIAR EL CAMPO DE CONSULTAR CATEGORIA
        jTFNameCategory.setText(null);
    }//GEN-LAST:event_jBCleanCategoryActionPerformed

    private void jBConsultCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultCategoryActionPerformed
        // CONSULTAR CATEGORIA
        String categoria = jTFNameCategory.getText();
        String nameCategory;

        if(!"".equals(categoria))
        {
            if(!ManagerWindowController.checkUserName(categoria))
            {
                JOptionPane.showMessageDialog(this,"La categoria a consultar si se encuentra registrada.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
            }
            else
            JOptionPane.showMessageDialog(this,"La categoria que esta buscando no se encuentra registrado.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(this,"Existen campos vacios.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jBConsultCategoryActionPerformed

    private void jBAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddCategoryActionPerformed
        // AGREGAR CATEGORIA A LA LISTA
        String categoria = jTFNameCategory.getText();

        if(!"".equals(categoria))
        {
            if(!ManagerWindowController.checkCategory(categoria))
            {
                ManagerWindowController.saveCategoryInXml(categoria);
                JOptionPane.showMessageDialog(this,"Registro exitoso");
                jTFNameCategory.setText(null);
                initRegistrationComboBox();
            }
            else
            JOptionPane.showMessageDialog(this,"La categoria ya se encuentra se encuentra registrado.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(this,"Existen campos vacios.\nIntentelo de nuevo.","Adventencia",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jBAddCategoryActionPerformed

    // Metodo para inicializar el combobox de categoria
    private void initRegistrationComboBox()
    {
        ManagerWindowController.initComboBoxCategory(jCBCategory);
        ManagerWindowController.loadAllCategoryInComboBox();
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
            java.util.logging.Logger.getLogger(InventoryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddCategory;
    private javax.swing.JButton jBAddProduct;
    private javax.swing.JButton jBAddProduct1;
    private javax.swing.JButton jBCleanAdd;
    private javax.swing.JButton jBCleanCategory;
    private javax.swing.JButton jBCleanProduct;
    private javax.swing.JButton jBClearCategoryList;
    private javax.swing.JButton jBConsultCategory;
    private javax.swing.JButton jBConsultProduct;
    private javax.swing.JButton jBExamineImage;
    private javax.swing.JButton jBExit2;
    private javax.swing.JComboBox jCBCategory;
    private javax.swing.JButton jCleanConsultProduct;
    private javax.swing.JLabel jLAddImage;
    private javax.swing.JLabel jLCantMaxConsult;
    private javax.swing.JLabel jLCantMinConsult;
    private javax.swing.JLabel jLCategory;
    private javax.swing.JLabel jLCategoryConsult;
    private javax.swing.JLabel jLDescripConcult;
    private javax.swing.JLabel jLDescription;
    private javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLNameCategory;
    private javax.swing.JLabel jLNameProduct;
    private javax.swing.JLabel jLNameProduct1;
    private javax.swing.JLabel jLNameProductConsult;
    private javax.swing.JLayeredPane jLPAddProduct;
    private javax.swing.JLayeredPane jLPCategory;
    private javax.swing.JLayeredPane jLPCategory1;
    private javax.swing.JLabel jLPathConsult;
    private javax.swing.JLabel jLPrice;
    private javax.swing.JLabel jLPriceConsult;
    private javax.swing.JLayeredPane jLProduct;
    private javax.swing.JLabel jLProvider;
    private javax.swing.JLabel jLProviderProductConsult;
    private javax.swing.JLabel jLQuantityMax;
    private javax.swing.JLabel jLQuantityMin;
    private javax.swing.JLabel jLTittleProfile2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADescription;
    private javax.swing.JTextField jTFCantMaxConsult;
    private javax.swing.JTextField jTFCantMinConsult;
    private javax.swing.JTextField jTFCategoryConsult;
    private javax.swing.JTextField jTFDescripConsult;
    private javax.swing.JTextField jTFNameCategory;
    private javax.swing.JTextField jTFNameConsult;
    private javax.swing.JTextField jTFNameProduct;
    private javax.swing.JTextField jTFNameProductConsult;
    private javax.swing.JTextField jTFNameUser2;
    private javax.swing.JTextField jTFPathConsult;
    private javax.swing.JTextField jTFPathImage;
    private javax.swing.JTextField jTFPrice;
    private javax.swing.JTextField jTFPriceConsult;
    private javax.swing.JTextField jTFProvider;
    private javax.swing.JTextField jTFProviderConsult;
    private javax.swing.JTextField jTFQuantityMax;
    private javax.swing.JTextField jTFQuantityMin;
    private javax.swing.JTabbedPane jTPInventory;
    private javax.swing.JTabbedPane jTPProduct;
    // End of variables declaration//GEN-END:variables
}
