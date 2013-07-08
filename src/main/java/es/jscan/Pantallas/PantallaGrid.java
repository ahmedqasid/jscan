package es.jscan.Pantallas;

import com.itextpdf.text.pdf.PdfReader;
import es.jscan.utilidades.TablaSinEditarCol;
import es.jscan.utilidades.Utilidades;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.xml.ws.Action;

/**
 * @author julian.collado
 */
public class PantallaGrid extends javax.swing.JDialog {

    public static PantallaPrincipal ventanapadre = null;
    public String titulo = "GUARDADOS / PENDIENTES DE ENVÍO / ENVIADOS";
    public String botonpulsado = "guardados";
    public String loteseleccionado = "";

    public PantallaGrid(PantallaPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ventanapadre = parent;
        setLocationRelativeTo(ventanapadre);
        asignarIconos();
        cargarLotes();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        menuBorrar = new javax.swing.JMenuItem();
        scrollGrid = new javax.swing.JScrollPane();
        gridDatos = new javax.swing.JTable();
        botonLotes = new javax.swing.JButton();
        botonEnviados = new javax.swing.JButton();
        botonPendientes = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();

        menuBorrar.setText("Borrar Filas");
        menuBorrar.setToolTipText("Borrar las Filas Seleccionadas");
        menuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBorrarActionPerformed(evt);
            }
        });
        popupMenu.add(menuBorrar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estado de los lotes digitalizados");
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setModal(true);
        setName("tabla"); // NOI18N

        scrollGrid.setMinimumSize(new java.awt.Dimension(122, 730));
        scrollGrid.setPreferredSize(new java.awt.Dimension(1022, 730));

        gridDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gridDatos.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        gridDatos.setMinimumSize(new java.awt.Dimension(1022, 700));
        gridDatos.setPreferredSize(new java.awt.Dimension(1022, 700));
        gridDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridDatosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gridDatosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gridDatosMouseReleased(evt);
            }
        });
        scrollGrid.setViewportView(gridDatos);

        botonLotes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonLotes.setText("GUARDADOS");
        botonLotes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLotesActionPerformed(evt);
            }
        });

        botonEnviados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonEnviados.setText("ENVIADOS");
        botonEnviados.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonEnviados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviadosActionPerformed(evt);
            }
        });

        botonPendientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonPendientes.setText("PENDIENTES  DE  ENVIAR");
        botonPendientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPendientesActionPerformed(evt);
            }
        });

        panelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(botonPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(botonEnviados, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scrollGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonEnviados, botonLotes, botonPendientes});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botonLotes)
                    .addComponent(botonPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEnviados, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonEnviados, botonLotes, botonPendientes});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLotesActionPerformed
        cargarLotes();
        botonpulsado = "guardados";
    }//GEN-LAST:event_botonLotesActionPerformed

    private void botonPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPendientesActionPerformed
        cargarPendientes();
        botonpulsado = "pendientes";
    }//GEN-LAST:event_botonPendientesActionPerformed

    private void botonEnviadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviadosActionPerformed
        cargarEnviados();
        botonpulsado = "enviados";
    }//GEN-LAST:event_botonEnviadosActionPerformed

    private void gridDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridDatosMouseClicked
        if (evt.getClickCount() == 2) {
            Utilidades.escribeLog("Doble click en el lote: " + gridDatos.getModel().getValueAt(gridDatos.getSelectedRow(), 0).toString());
            if (botonpulsado.equals("guardados")) {
                ventanapadre.lote = gridDatos.getModel().getValueAt(gridDatos.getSelectedRow(), 0).toString();
                this.dispose();
            }
        }
    }//GEN-LAST:event_gridDatosMouseClicked

    private void menuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBorrarActionPerformed
        PantallaConfirmaDialogo confirma = new PantallaConfirmaDialogo(this, true);
        confirma.setTitle("Borrar " + botonpulsado);
        confirma.etiqueta.setText("¿Desea borrar las filas seleccionadas?");
        confirma.repaint();
        confirma.setVisible(true);

        if (confirma.respuesta()) {
            borrarfilas();
        }
    }//GEN-LAST:event_menuBorrarActionPerformed

    private void gridDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridDatosMousePressed
        popupmenu(evt);
    }//GEN-LAST:event_gridDatosMousePressed

    private void gridDatosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridDatosMouseReleased
        popupmenu(evt);
    }//GEN-LAST:event_gridDatosMouseReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                final PantallaGrid dialog = new PantallaGrid(new PantallaPrincipal(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnviados;
    private javax.swing.JButton botonLotes;
    private javax.swing.JButton botonPendientes;
    private javax.swing.JTable gridDatos;
    private javax.swing.JMenuItem menuBorrar;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JScrollPane scrollGrid;
    // End of variables declaration//GEN-END:variables

    private void cargarLotes() {
        botonLotes.setBackground(Color.gray);
        botonPendientes.setBackground(Color.lightGray);
        botonEnviados.setBackground(Color.lightGray);

        setTitle(titulo + " - GUARDADOS");
        String ruta = ventanapadre.rutadigita + ventanapadre.separador + "lotes";
        File directorio = new File(ruta);
        if (directorio.exists() == false) {
            TablaSinEditarCol modeloLotes = new TablaSinEditarCol();
            gridDatos.setModel(modeloLotes);
            gridDatos.doLayout();
            return;
        }

        String[] listaDir = directorio.list();
        int numficheros = 0;
        int contador = 0;
        Object[][] datos = new Object[listaDir.length][6];
        Object[] cabecera = {"Nombre del Lote",
            "Tipo de proceso",
            "Nº páginas",
            "Fecha de creación",
            "IP del PC",
            "Editar"};
        int sinprops=0;
        int lotemalo=0;
        
        for (int n = 0; n < listaDir.length; n++) {
            Properties props = ventanapadre.utilidades.leerPropeties(ruta + ventanapadre.separador + listaDir[n].toString() + ventanapadre.separador + "lote.ini");
            if (props == null) {
                sinprops++;
                datos= (Object[][]) ventanapadre.utilidades.resizeArray(datos, listaDir.length-sinprops);
                continue;
            }
            numficheros = (props.getProperty("numpaginas") == null ? 0 : Integer.parseInt(props.getProperty("numpaginas")));
            String lote = listaDir[n].toString();
            if (lote.length() < 28) {
                lotemalo++;
                datos= (Object[][]) ventanapadre.utilidades.resizeArray(datos, listaDir.length-lotemalo);
                continue;
            }
            datos[n-lotemalo-sinprops][0] = lote;
            datos[n-lotemalo-sinprops][1] = "Recepción con Expediente";
            datos[n-lotemalo-sinprops][2] = "" + numficheros;
            datos[n-lotemalo-sinprops][3] = lote.substring(6, 8) + "/" + lote.substring(4, 6) + "/" + lote.substring(0, 4)
                    + " " + lote.substring(9, 11) + ":" + lote.substring(11, 13) + ":" + lote.substring(13, 15);
            datos[n-lotemalo-sinprops][4] = lote.substring(16, 19) + "." + lote.substring(19, 22) + "." + lote.substring(22, 25) + "." + lote.substring(25, 28);
            datos[n-lotemalo-sinprops][5] = false;
            contador++;
        }

        if (contador <= 0) {
            TablaSinEditarCol modeloLotes = new TablaSinEditarCol();
            gridDatos.setModel(modeloLotes);
            gridDatos.doLayout();
            return;
        }

        TablaSinEditarCol modeloLotes = new TablaSinEditarCol(datos, cabecera);


        gridDatos.setModel(modeloLotes);
        gridDatos.setShowHorizontalLines(true);
        gridDatos.setRowSelectionAllowed(true);
        gridDatos.setAutoCreateRowSorter(true);
//        gridDatos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        gridDatos.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        for (int i = 0; i < modeloLotes.getColumnCount(); i++) {
            TableColumn columna = gridDatos.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    columna.setPreferredWidth(125);
                    columna.setMinWidth(125);
                    break;
                case 1:
                    columna.setPreferredWidth(100);
                    columna.setMinWidth(100);
                    break;
                case 2:
                    columna.setPreferredWidth(20);
                    columna.setMinWidth(20);
                    break;

                default:
                    columna.setPreferredWidth(50);
            }
        }
        gridDatos.doLayout();

    }

    private void cargarPendientes() {
        int contador = 0;
        botonLotes.setBackground(Color.lightGray);
        botonPendientes.setBackground(Color.gray);
        botonEnviados.setBackground(Color.lightGray);
        setTitle(titulo + " - PENDIENTES");

        String ruta = ventanapadre.rutadigita + ventanapadre.separador + "pendientes";
        File directorio = new File(ruta);
        if (directorio.exists() == false) {
            return;
        }
        String[] listaDir = directorio.list();

        int filas = 0;
        for (int a = 0; a < listaDir.length; a++) {
            File ficheros = new File(ruta + ventanapadre.separador + listaDir[a].toString());
            String[] listaficheros = ficheros.list();
            String lote = listaDir[a].toString();
            for (int u = 0; u < listaficheros.length; u++) {
                filas++;
            }
        }


        Object[] cabecera = {"Nombre del Lote",
            "Tipo de proceso",
            "Nº páginas",
            "Fecha de creación",
            "Expediente",
            "Archivo"};

        Object[][] datos = new Object[filas][6];


        int lineas = 0;
        for (int n = 0; n < listaDir.length; n++) {
            File ficheros = new File(ruta + ventanapadre.separador + listaDir[n].toString());
            String[] listaficheros = ficheros.list();
            String lote = listaDir[n].toString();
            if (lote.length() < 28) {
                continue;
            }
            for (int i = 0; i < listaficheros.length; i++) {
                String archivo = ruta + ventanapadre.separador + listaDir[n].toString() + ventanapadre.separador + listaficheros[i].toString();
                datos[lineas][0] = lote;
                try {
                    PdfReader reader = new PdfReader(archivo);
                    datos[lineas][1] = (reader.getInfo().get("proceso") == null ? "" : reader.getInfo().get("proceso"));
                    datos[lineas][2] = reader.getNumberOfPages();
                    datos[lineas][4] = (reader.getInfo().get("Expediente") == null ? "" : reader.getInfo().get("Expediente"));
                } catch (IOException ex) {
                    Utilidades.escribeLog("Error al leer el PDF " + archivo + "  - Error " + ex.getMessage());
                }

                datos[lineas][3] = lote.substring(6, 8) + "/" + lote.substring(4, 6) + "/" + lote.substring(0, 4)
                        + " " + lote.substring(9, 11) + ":" + lote.substring(11, 13) + ":" + lote.substring(13, 15);
                datos[lineas][5] = listaficheros[i].toString();
                lineas++;
                contador++;
                //Utilidades.escribeLog(listaDir[n]);
            }
        }

        if (contador <= 0) {
            TablaSinEditarCol modeloLotes = new TablaSinEditarCol();
            gridDatos.setModel(modeloLotes);
            gridDatos.doLayout();
            return;
        }
        final TablaSinEditarCol modeloLotes = new TablaSinEditarCol(datos, cabecera);

        try {
            gridDatos.setModel(modeloLotes);
        } catch (Exception e) {
            Utilidades.escribeLog(e.getMessage());
        }
        gridDatos.setShowHorizontalLines(true);
        gridDatos.setRowSelectionAllowed(true);
        gridDatos.setAutoCreateRowSorter(true);
        gridDatos.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        for (int i = 0; i < modeloLotes.getColumnCount(); i++) {
            TableColumn columna = gridDatos.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    columna.setPreferredWidth(120);
                    columna.setMinWidth(120);
                    break;
                case 1:
                    columna.setPreferredWidth(100);
                    columna.setMinWidth(100);
                    break;
                case 2:
                    columna.setPreferredWidth(15);
                    columna.setMinWidth(15);
                    break;
                case 5:
                    columna.setPreferredWidth(120);
                    columna.setMinWidth(120);
                    break;
                default:
                    columna.setPreferredWidth(50);
            }
        }
        gridDatos.doLayout();
    }

    private void cargarEnviados() {
        botonLotes.setBackground(Color.lightGray);
        botonPendientes.setBackground(Color.lightGray);
        botonEnviados.setBackground(Color.gray);
        setTitle(titulo + " - ENVIADOS");

        TablaSinEditarCol modeloLotes = new TablaSinEditarCol();
        gridDatos.setModel(modeloLotes);
        gridDatos.doLayout();
    }

    private void asignarIconos() {
        java.net.URL imgURL = PantallaGrid.class.getResource("../Pantallas/imagenes/guardados.png");
        Icon imgicon = new ImageIcon(imgURL);
        this.botonLotes.setIcon(imgicon);

        imgURL = PantallaGrid.class.getResource("../Pantallas/imagenes/pendientes.png");
        imgicon = new ImageIcon(imgURL);
        this.botonPendientes.setIcon(imgicon);

        imgURL = PantallaGrid.class.getResource("../Pantallas/imagenes/enviados.png");
        imgicon = new ImageIcon(imgURL);
        this.botonEnviados.setIcon(imgicon);
    }

    private void popupmenu(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            JTable source = (JTable) evt.getSource();
            int row = source.rowAtPoint(evt.getPoint());
            int column = source.columnAtPoint(evt.getPoint());

            if (!source.isRowSelected(row)) {
                source.changeSelection(row, column, false, false);
            }

            popupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }

    }

    @Action
    private void borrarfilas() {
        DefaultTableModel model = (DefaultTableModel) this.gridDatos.getModel();
        int[] rows = gridDatos.getSelectedRows();
        for (int i = rows.length; i > 0; i--) {
            if (botonpulsado.equals("guardados")) {
                ventanapadre.borrarLote(gridDatos.getModel().getValueAt(rows[i - 1], 0).toString());
            } 
/*            else if (botonpulsado.equals("pendientes")) {
                ventanapadre.borrarPendientes(gridDatos.getModel().getValueAt(rows[i - 1], 0).toString()
                        + ventanapadre.separador + gridDatos.getModel().getValueAt(rows[i - 1], 5).toString());
            } else if (botonpulsado.equals("enviados")) {
                ventanapadre.borrarEnviados(gridDatos.getModel().getValueAt(rows[i - 1], 0).toString()
                        + ventanapadre.separador + gridDatos.getModel().getValueAt(rows[i - 1], 5).toString());
            }
            */
            model.removeRow(rows[i - 1]);
        }
    }
}
