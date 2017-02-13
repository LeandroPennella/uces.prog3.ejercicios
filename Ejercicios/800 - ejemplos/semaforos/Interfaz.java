package semaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Bron
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }
    /**
     * Creamos un nuevo objeto Gestion para reanudar y parar el sistema.
     */
    public Gestion gestion = new Gestion();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        detener = new javax.swing.JButton();
        reanudar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PEC2L : Lectores y Escritores de Libros");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("PEC2L : Lectores y Escritores de Libros");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Lectores que actualmente están leyendo el Libro:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Escritores que actualmente están escribiendo el Libro:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Contenido del Libro:");

        jTextField1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Libro terminado:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        detener.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        detener.setText("DETENER");
        detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detenerActionPerformed(evt);
            }
        });

        reanudar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        reanudar.setText("REANUDAR");
        reanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reanudarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 169, Short.MAX_VALUE)
                .addComponent(reanudar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(detener, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detener, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reanudar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-730)/2, (screenSize.height-616)/2, 730, 616);
    }// </editor-fold>//GEN-END:initComponents

    private void reanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reanudarActionPerformed

        /*
         * En este botón de reanudar, procedemos a habilitar el botón detener y
         * a deshabilitar el botón reanudar (que ya ha sido pulsado). A
         * continuación, reanudamos el sistema llamando a "gestión"
         */

        detener.setEnabled(true);
        reanudar.setEnabled(false);
        gestion.reanudar();
    }//GEN-LAST:event_reanudarActionPerformed

    private void detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detenerActionPerformed

        /*
         * En este botón de reanudar, procedemos a habilitar el botón detener y
         * a deshabilitar el botón reanudar (que ya ha sido pulsado). A
         * continuación, reanudamos el sistema llamando a "gestión"
         */

        reanudar.setEnabled(true);
        detener.setEnabled(false);
        gestion.detener();
    }//GEN-LAST:event_detenerActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton detener;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public javax.swing.JButton reanudar;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {

        /*
         * Programa principal y el que ejecuta todos los hilos concurrentemente.
         */

        java.awt.EventQueue.invokeLater(new Runnable() {

            //@Override
            public void run() {

                /*
                 * Creamos nuevos objetos de la interfaz y del libro y ajustamos la interfaz
                 * 
                 * Creamos el semáforo y se lo pasamos a libro
                 */

                Interfaz interfaz = new Interfaz();
                interfaz.setVisible(true);
                interfaz.reanudar.setEnabled(false);
                Semaphore semaforo = new Semaphore (15, true);

                Libro libro = new Libro(interfaz, semaforo );

                /*
                 * Creamos los hilos con los datos pedidos
                 */

                for (int i = 20; i < 35; i++) {
                    Lector l1 = new Lector(i, libro, interfaz.gestion);
                    l1.start();
                }
                for (int i = 0; i < 10; i++) {
                    Escritor e1 = new Escritor(i, libro, interfaz.gestion);
                    e1.start();
                }
            }
        });
    }

    public void meterDatos(int i, String datos) {

        /*
         * Esta clase introduce los datos en el jTextField, recibimos un número
         * de otra clase para saber dónde debemos introducir la información.
         * Gracias al switch podremos introducir fácilmente los datos en el
         * jTextField correcto. Al ser void, no devuelve nada.
         */

        switch (i) {
            case 1: {
                jTextField1.setText(datos);
                break;
            }
            case 2: {
                jTextField2.setText(datos);
                break;
            }
            case 3: {
                jTextField3.setText(datos);
                break;
            }
            case 4: {
                jTextArea1.setText(datos);
                break;
            }
        }
    }

    public String leerDatos(int i) {

        /*
         * Esta clase devuelve un String con el contenido del jTextField.
         * Dependiendo del número pasado por parámetro leeremos un jTextField u
         * otro. Si no se corresponde con ninguno, devolvemos cadena vacía.
         */

        switch (i) {
            case 1:
                return jTextField1.getText();
            case 2:
                return jTextField2.getText();
            case 3:
                return jTextField3.getText();
            case 4:
                return jTextArea1.getText();
            default:
                return "";
        }
    }
}