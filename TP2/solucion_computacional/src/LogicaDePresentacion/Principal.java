/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDePresentacion;

import Atributos.VentanillaSeguridad;
import Atributos.VentanillaNoPerecederos;
import Atributos.VentanillaPerecederos;
import Atributos.Usuario;
import Atributos.TipoUsuario;
import Atributos.TipoPaquete;
import Atributos.Sms;
import Atributos.Quiosco;
import Estructuras.Heap;
import Estructuras.ColaPrioridad;
import Estructuras.Prioridad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *GUI principal donde se daran las funciones principales del proyecto 
 * 
 */
public class Principal extends javax.swing.JFrame {
    
    private Sms mensaje= new Sms();
    private Quiosco kiosco= new Quiosco();
    private Timer t;
    
    
    private DefaultListModel modeloP = new DefaultListModel<>();
    private DefaultListModel modeloNP = new DefaultListModel<>();
    private DefaultListModel modeloS = new DefaultListModel<>();
    private DefaultListModel historialP = new DefaultListModel<>();
    private DefaultListModel historialNP = new DefaultListModel<>();
    
    private Object estructuraEntregas;
    private Object estructuraSeguridad;
    
    private Heap colaEjecutiva= (Heap) new Heap(250);
    private Heap colaPAdmin= new Heap(250);
    private Heap colaNPAdmin= new Heap(250);
    
    private int minimoE;
    private int maximoE;
    private int cantC;
    private int cantS;
    private int atendidosNP;
    private int atendidosP;
    private int iNP;
    private int iP;
    private int totalP;
    private int totalNP;
    
    private int totalAP;
    private int totalANP;
    
    private int totalRP;
    private int totlaRNP;
    
    private int totalMP;
    private int totalMNP;
    
    private int totalAMP;
    private int totalAMNP;
    
    private int totalDP;
    private int totalDNP;
    
    private int totaldiscapacitado;
    private int totalregular;
    private int totalembarazada;
    private int totaladultomayor;
    private int tiempoEsperaSeguridad;
    private int tiempoEsperaP;
    private int tiempoEsperaNP;
    
    private String modo;
    private String manejoEntregas;
    private String manejoSeguridad;
    
    private long inicioP;
    private long inicioNP;
    private long finalP;
    private long finalNP;
    
    
    private float resultadoP;
    private float resultadoNP;
    private Usuario[] colaP;
    private Usuario[] colaNP;
    
    
    
    /**
     * Creates new form Principal
     */
    public Principal(int ventanillasCheckin, String manejoEntregas, int ventanillasSeguridad, String manejoSeguridad,
            int minimoE, int maximoE) {        
        if(manejoEntregas=="cola"){
            this.estructuraEntregas= new ColaPrioridad();
        }else{
            this.estructuraEntregas= new Heap(250);
        }        
        if (manejoSeguridad=="cola"){
            this.estructuraSeguridad=new ColaPrioridad();
        }else{
            this.estructuraSeguridad= new Heap(250);
        }
        
        colaP= new Usuario[250];
        colaNP= new Usuario[250];
        initComponents();
        
        this.manejoEntregas=manejoEntregas;
        this.manejoSeguridad=manejoSeguridad;
        this.minimoE=minimoE;
        this.maximoE=maximoE;
        
        modo=manejoEntregas;        
        grupoEstado.add(radioAdulto);
        grupoEstado.add(radioEmbarazada);
        grupoEstado.add(radioDiscapacitado);
        grupoEstado.add(radioRegular);
        
        grupoClase.add(radioPerecederos);
        grupoClase.add(radioNoPerecederos);   
        
        for (int i = 0; i < ventanillasSeguridad; i++) {
            VentanillaSeguridad nuevaVentanilla= new VentanillaSeguridad("Seguridad",+i+1,"Seguridad",estructuraSeguridad,minimoE,maximoE);
            modeloS.addElement(nuevaVentanilla);
        }
        
        for (int i = 0; i < ventanillasCheckin; i++) {
            VentanillaPerecederos nuevaVentanilla= new VentanillaPerecederos("Perecederos",i+1,"Entregas",estructuraEntregas);
            modeloP.addElement(nuevaVentanilla);
        } 
        
        for (int i = 0; i < ventanillasCheckin; i++) {
            VentanillaNoPerecederos nuevaVentanilla= new VentanillaNoPerecederos("No Perecederos",i+1,"Entregas",estructuraEntregas);
            modeloNP.addElement(nuevaVentanilla);
        }
        
        lblTipoCola.setText("Tipo de cola utilizadas: Entregas: "+manejoEntregas+".  "+
                "\nSeguridad: "+manejoSeguridad);
        lblCantidadS.setText("Clientes en cola de seguridad: "+cantS);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEstado = new javax.swing.ButtonGroup();
        grupoClase = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldNumero = new javax.swing.JTextField();
        fieldNombre = new javax.swing.JTextField();
        fieldCorreo = new javax.swing.JTextField();
        radioDiscapacitado = new javax.swing.JRadioButton();
        radioAdulto = new javax.swing.JRadioButton();
        radioEmbarazada = new javax.swing.JRadioButton();
        radioRegular = new javax.swing.JRadioButton();
        radioPerecederos = new javax.swing.JRadioButton();
        radioNoPerecederos = new javax.swing.JRadioButton();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEC = new javax.swing.JList<>(modeloP);
        btnAtenderP = new javax.swing.JButton();
        btnLiberarP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEJ = new javax.swing.JList<>(modeloNP);
        jLabel8 = new javax.swing.JLabel();
        btnAtenderNP = new javax.swing.JButton();
        btnLiberarNP = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaS = new javax.swing.JList<>(modeloS);
        lblTiempo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTipoCola = new javax.swing.JLabel();
        lblVentanasE = new javax.swing.JLabel();
        lblCantidadC = new javax.swing.JLabel();
        lblCantidadS = new javax.swing.JLabel();
        lblSiguienteP = new javax.swing.JLabel();
        lblSiguienteNP = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listHE = new javax.swing.JList<>(historialP);
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listHEj = new javax.swing.JList<>(historialNP);
        jLabel14 = new javax.swing.JLabel();
        fieldNumEco = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fieldNumEje = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fieldNumSeguridad = new javax.swing.JTextField();
        btnCambiarP = new javax.swing.JButton();
        btnCambiarNP = new javax.swing.JButton();
        btnCambiarSegu = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblTipoCola1 = new javax.swing.JLabel();
        lblPromedioNP = new javax.swing.JLabel();
        lblPromedioP = new javax.swing.JLabel();
        lblPromedioSeguridad = new javax.swing.JLabel();
        lblTipoCola5 = new javax.swing.JLabel();
        lblTotalP = new javax.swing.JLabel();
        lblTotalNP = new javax.swing.JLabel();
        lblTipoCola8 = new javax.swing.JLabel();
        lblTipoCola9 = new javax.swing.JLabel();
        lblTipoCola10 = new javax.swing.JLabel();
        lblTipoCola11 = new javax.swing.JLabel();
        lblDP = new javax.swing.JLabel();
        lblDNP = new javax.swing.JLabel();
        lblAMP = new javax.swing.JLabel();
        lblTAMNP = new javax.swing.JLabel();
        lblMP = new javax.swing.JLabel();
        lblMNP = new javax.swing.JLabel();
        lblTipoCola18 = new javax.swing.JLabel();
        lblRP = new javax.swing.JLabel();
        lblRNP = new javax.swing.JLabel();
        lblTipoCola6 = new javax.swing.JLabel();
        lblTotalAP = new javax.swing.JLabel();
        lblTotalANP = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel9.setText("Económica");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quiosco");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre y Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número teléfonico:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de usuario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clase de paquete:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        getContentPane().add(fieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 221, -1));
        getContentPane().add(fieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 221, -1));
        getContentPane().add(fieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 221, -1));

        radioDiscapacitado.setForeground(new java.awt.Color(255, 255, 255));
        radioDiscapacitado.setText("Discapacitado");
        getContentPane().add(radioDiscapacitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        radioAdulto.setForeground(new java.awt.Color(255, 255, 255));
        radioAdulto.setText("Adulto Mayor");
        getContentPane().add(radioAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        radioEmbarazada.setForeground(new java.awt.Color(255, 255, 255));
        radioEmbarazada.setText("Embarazada");
        getContentPane().add(radioEmbarazada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        radioRegular.setForeground(new java.awt.Color(255, 255, 255));
        radioRegular.setText("Regular");
        getContentPane().add(radioRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        radioPerecederos.setForeground(new java.awt.Color(255, 255, 255));
        radioPerecederos.setText("Perecedero");
        radioPerecederos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPerecederosActionPerformed(evt);
            }
        });
        getContentPane().add(radioPerecederos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        radioNoPerecederos.setForeground(new java.awt.Color(255, 255, 255));
        radioNoPerecederos.setText("No Perecedero");
        getContentPane().add(radioNoPerecederos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        btnEnviar.setBackground(new java.awt.Color(0, 102, 0));
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 92, 30));

        jScrollPane1.setViewportView(listaEC);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 240, 210));

        btnAtenderP.setBackground(new java.awt.Color(0, 102, 0));
        btnAtenderP.setForeground(new java.awt.Color(255, 255, 255));
        btnAtenderP.setText("Atender");
        btnAtenderP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtenderPMouseClicked(evt);
            }
        });
        getContentPane().add(btnAtenderP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 102, -1));

        btnLiberarP.setBackground(new java.awt.Color(0, 102, 0));
        btnLiberarP.setForeground(new java.awt.Color(255, 255, 255));
        btnLiberarP.setText("Liberar y atender");
        btnLiberarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLiberarPMouseClicked(evt);
            }
        });
        getContentPane().add(btnLiberarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 130, -1));

        jScrollPane2.setViewportView(listaEJ);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 240, 210));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No Perecedero");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        btnAtenderNP.setBackground(new java.awt.Color(0, 102, 0));
        btnAtenderNP.setForeground(new java.awt.Color(255, 255, 255));
        btnAtenderNP.setText("Atender");
        btnAtenderNP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtenderNPMouseClicked(evt);
            }
        });
        getContentPane().add(btnAtenderNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 100, -1));

        btnLiberarNP.setBackground(new java.awt.Color(0, 102, 0));
        btnLiberarNP.setForeground(new java.awt.Color(255, 255, 255));
        btnLiberarNP.setText("Liberar y atender");
        btnLiberarNP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLiberarNPMouseClicked(evt);
            }
        });
        getContentPane().add(btnLiberarNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 131, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Seguridad");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 150, -1));

        jScrollPane3.setViewportView(listaS);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 330, 157));

        lblTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempo.setText("Atendiendo en seguridad a: ");
        getContentPane().add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Administración");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        lblTipoCola.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoCola.setForeground(new java.awt.Color(240, 240, 240));
        lblTipoCola.setText("Tipo de cola utilizadas: ");
        getContentPane().add(lblTipoCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        lblVentanasE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVentanasE.setForeground(new java.awt.Color(240, 240, 240));
        lblVentanasE.setText("Ventanillas existentes: Entregas y Seguridad");
        getContentPane().add(lblVentanasE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        lblCantidadC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCantidadC.setForeground(new java.awt.Color(240, 240, 240));
        lblCantidadC.setText("Clientes en cola entregas: ");
        getContentPane().add(lblCantidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        lblCantidadS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCantidadS.setForeground(new java.awt.Color(240, 240, 240));
        lblCantidadS.setText("Clientes en cola de seguridad:");
        getContentPane().add(lblCantidadS, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, -1));

        lblSiguienteP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSiguienteP.setForeground(new java.awt.Color(240, 240, 240));
        lblSiguienteP.setText("Siguiente cliente en ventana perecederos: ");
        getContentPane().add(lblSiguienteP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, -1, -1));

        lblSiguienteNP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSiguienteNP.setForeground(new java.awt.Color(240, 240, 240));
        lblSiguienteNP.setText("Siguiente cliente en ventana no perecederos: ");
        getContentPane().add(lblSiguienteNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, -1, -1));

        jScrollPane4.setViewportView(listHE);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, 170, 150));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Clientes Perecederos");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Clientes No Perecederos");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 250, -1, -1));

        jScrollPane5.setViewportView(listHEj);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 280, 160, 150));

        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Cantidad de ventanas perecederos:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 180, 20));
        getContentPane().add(fieldNumEco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 110, -1));

        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Cantidad de ventanas no perecederos:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 200, 20));
        getContentPane().add(fieldNumEje, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 110, -1));

        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Cantidad de ventanas de seguridad:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 180, 20));
        getContentPane().add(fieldNumSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, 110, -1));

        btnCambiarP.setBackground(new java.awt.Color(0, 102, 0));
        btnCambiarP.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarP.setText("Cambiar");
        btnCambiarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarPMouseClicked(evt);
            }
        });
        getContentPane().add(btnCambiarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 70, -1, -1));

        btnCambiarNP.setBackground(new java.awt.Color(0, 102, 0));
        btnCambiarNP.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarNP.setText("Cambiar");
        btnCambiarNP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarNPMouseClicked(evt);
            }
        });
        getContentPane().add(btnCambiarNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 130, -1, -1));

        btnCambiarSegu.setBackground(new java.awt.Color(0, 102, 0));
        btnCambiarSegu.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarSegu.setText("Cambiar");
        btnCambiarSegu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarSeguMouseClicked(evt);
            }
        });
        getContentPane().add(btnCambiarSegu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 190, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Entregas");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 140, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Perecedero");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        lblTipoCola1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTipoCola1.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoCola1.setText("Tiempo promedio");
        getContentPane().add(lblTipoCola1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 580, -1, -1));

        lblPromedioNP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPromedioNP.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedioNP.setText("No Perecederos:");
        getContentPane().add(lblPromedioNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 620, -1, -1));

        lblPromedioP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPromedioP.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedioP.setText("Perecederos:");
        getContentPane().add(lblPromedioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, -1, -1));

        lblPromedioSeguridad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPromedioSeguridad.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedioSeguridad.setText("Seguridad:");
        getContentPane().add(lblPromedioSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 640, -1, -1));

        lblTipoCola5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTipoCola5.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoCola5.setText("Total de tiquetes ");
        getContentPane().add(lblTipoCola5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 580, 120, -1));

        lblTotalP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTotalP.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalP.setText("Perecederos:");
        getContentPane().add(lblTotalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 600, 90, -1));

        lblTotalNP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTotalNP.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalNP.setText("No Perecederos:");
        getContentPane().add(lblTotalNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 620, 100, -1));

        lblTipoCola8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTipoCola8.setForeground(new java.awt.Color(240, 240, 240));
        lblTipoCola8.setText("Total de Tiquetes dispensados");
        getContentPane().add(lblTipoCola8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, -1, -1));

        lblTipoCola9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoCola9.setForeground(new java.awt.Color(240, 240, 240));
        lblTipoCola9.setText("Discapacidad:");
        getContentPane().add(lblTipoCola9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, -1, -1));

        lblTipoCola10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoCola10.setForeground(new java.awt.Color(240, 240, 240));
        lblTipoCola10.setText("Adulto Mayor:");
        getContentPane().add(lblTipoCola10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, -1, -1));

        lblTipoCola11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoCola11.setForeground(new java.awt.Color(240, 240, 240));
        lblTipoCola11.setText("Mujer embarazada:");
        getContentPane().add(lblTipoCola11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, -1, -1));

        lblDP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDP.setForeground(new java.awt.Color(240, 240, 240));
        lblDP.setText("P:");
        getContentPane().add(lblDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, -1, -1));

        lblDNP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDNP.setForeground(new java.awt.Color(240, 240, 240));
        lblDNP.setText("NP:");
        getContentPane().add(lblDNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, -1, -1));

        lblAMP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAMP.setForeground(new java.awt.Color(240, 240, 240));
        lblAMP.setText("P:");
        getContentPane().add(lblAMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, -1, -1));

        lblTAMNP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTAMNP.setForeground(new java.awt.Color(240, 240, 240));
        lblTAMNP.setText("NP:");
        getContentPane().add(lblTAMNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, -1, -1));

        lblMP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMP.setForeground(new java.awt.Color(240, 240, 240));
        lblMP.setText("P:");
        getContentPane().add(lblMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, -1, 20));

        lblMNP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMNP.setForeground(new java.awt.Color(240, 240, 240));
        lblMNP.setText("NP:");
        getContentPane().add(lblMNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, -1, -1));

        lblTipoCola18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoCola18.setForeground(new java.awt.Color(240, 240, 240));
        lblTipoCola18.setText("Regular:");
        getContentPane().add(lblTipoCola18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 620, -1, -1));

        lblRP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRP.setForeground(new java.awt.Color(240, 240, 240));
        lblRP.setText("P:");
        getContentPane().add(lblRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, -1, -1));

        lblRNP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRNP.setForeground(new java.awt.Color(240, 240, 240));
        lblRNP.setText("NP:");
        getContentPane().add(lblRNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, -1, -1));

        lblTipoCola6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTipoCola6.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoCola6.setText("Total atendios por ventana");
        getContentPane().add(lblTipoCola6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 490, -1, -1));

        lblTotalAP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTotalAP.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalAP.setText("Perecederos:");
        getContentPane().add(lblTotalAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 510, -1, -1));

        lblTotalANP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTotalANP.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalANP.setText("No Perecederos:");
        getContentPane().add(lblTotalANP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 530, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public int buscarVentanas(){        
        VentanillaSeguridad salida = (VentanillaSeguridad)modeloS.getElementAt(0);
        
        for (int i = 0;modeloS.getSize()!=i; i++) {
            salida= (VentanillaSeguridad)modeloS.getElementAt(i);
            if(salida.estaTrabajando()!=true){                                            
                return i;
            }
        }
        
        salida = (VentanillaSeguridad)modeloS.getElementAt(0);
        salida.atender();
        return 0;                             
    }
    /**
     * realiza el cronomeraje de los cliente en la estructura economica 
     */
    public void cronometroEco(){
        finalP= System.nanoTime();
        float temp=(float) ((finalP-inicioP)*Math.pow(10, -9));
        resultadoP=  (resultadoP+temp);
        atendidosP++;
        float promedio= (float) (resultadoP/atendidosP);
        lblPromedioP.setText("Perecedero: "+promedio);
    }
    /**
     * realiza el cronomeraje de los cliente en la estructura ejecutiva  
     */
    public void cronometroEju(){
        finalNP= System.nanoTime();
        float temp=(float) ((finalNP-inicioNP)*Math.pow(10, -9));
        resultadoNP=  (resultadoNP+temp);
        atendidosNP++;
        float promedio= (float) (resultadoNP/atendidosNP);
        lblPromedioNP.setText("No Perecedero: "+promedio);
    }
    /**
     * realiza el inicio del conteo donde se determina el numero random asgnado,
     * el tiempo y las ventanas  
     * @param minimo
     * @param maximo 
     */
    private void iniciarConteo(int minimo,int maximo){ 
        Prioridad eliminado=null;
        Random rand = new Random();
        int n=rand.nextInt(maximo*1000)+minimo*1000;        
        
        t = new Timer(n, new ActionListener(){	             
            @Override
            public void actionPerformed(ActionEvent e){
                Prioridad eliminado= null;

                VentanillaSeguridad porAtender= (VentanillaSeguridad)modeloS.getElementAt(buscarVentanas());                         

                if(estructuraSeguridad instanceof Heap){
                      eliminado= Heap.class.cast(estructuraSeguridad).remove();                

                }else{
                      eliminado= ColaPrioridad.class.cast(estructuraSeguridad).remove();
                }                
                if(eliminado!=null){
                    
                    cantS--;
                    lblCantidadS.setText("Clientes en cola de seguridad: "+cantS);      
                    Usuario eliminadoC= eliminado.getTask();  
                    porAtender.atender();
                    porAtender.addAtendidos();
                    listaS.setModel(modeloS);
                    lblTiempo.setText("Atendiendo en seguridad a: "+eliminadoC.getNombre());
                }
            }
        });  
        

        t.start();         
    }
    /**
     * Inserta los elemntos insertados en la GUI a la estructura selecionada
     * @param nuevoU
     * @param tipoC 
     */
    public void insertarEnFila(Usuario nuevoU, String tipoC){        
        if (tipoC== "eco"){
            colaP[iP]=nuevoU;
            iP++;
        }else{
            colaNP[iNP]=nuevoU;
            iNP++;
        }
    }
    /**
     * Actualiza los elementos que se encuentran en la jlist 
     * @param tipo 
     */
    private void actualizarList(String tipo){
        if(tipo=="eco"){                
            historialP.clear();
            for (int i = 0; i < colaP.length; i++) {   
                if(colaP[i]!=null && colaP[i].getCorreo()!="a")
                    historialP.addElement(colaP[i]);                
            }
        }else{
            historialNP.clear();
            for (int i = 0; i < colaNP.length; i++) {   
                if(colaNP[i]!=null && colaNP[i].getCorreo()!="a")
                    historialNP.addElement(colaNP[i]);                
            }
        }  
    }                  
    /**
     * Elmina los objetos que fuero atendidos de la estructura y la GUI 
     * @param aEliminar
     * @param tipo 
     */
    public void eliminarEnFila(Usuario aEliminar,String tipo){
        if(tipo=="eco"){                    
            for (int j = 0; j < colaP.length; j++) {
                if(aEliminar.getNombre()==colaP[j].getNombre()){
                    colaP[j]=new Usuario("a","a","a",0,0,"a");
                    actualizarList("eco");
                    iP--;
                    return;
                }
            }
        }else{            
            for (int j = 0; j < colaNP.length; j++) {
                if(aEliminar.getNombre()==colaNP[j].getNombre()){                    
                    colaNP[j]=new Usuario("a","a","a",0,0,"a");
                    actualizarList("eju");
                    iNP--;
                    return;
                }
            }            
        }
    }
    /**
     * Determina la cantidad de boletos segun la priordad de estos 
     * @param prioridad
     * @param boleto 
     */
    public void determinarCantidaBoleto (int prioridad, String paquete){
       
        if (prioridad == 1){
           if ("EC".equals(paquete)){
               totalRP++;
               lblRP.setText("Perecederos: "+ totalRP);
           }
        }else if (prioridad==2){
            if ("EC".equals(paquete)){
               totalMP++;
               lblMP.setText("Perecederos: "+ totalMP);
           }else if ("EJ".equals(paquete)){
               totlaRNP++;
               lblRNP.setText("No Perecederos: "+ totlaRNP);
           }
        }else if (prioridad==3){
            if (paquete=="EC"){
               totalAMP++;
               lblAMP.setText("Perecederos: "+ totalAMP);
           }else if (paquete=="EJ"){
               totalMNP++;
               lblMNP.setText("No Perecederos: "+ totalMNP);
           }
        }else if (prioridad==4){
             if (paquete=="EC"){
               totalDP++;
               lblDP.setText("Perecederos: "+ totalDP);
           }else if (paquete=="EJ"){
               totalAMNP++;
               lblTAMNP.setText("No Perecederos: "+ totalAMNP);
        }    
        }else{
            totalDNP++;
            lblDNP.setText("No Perecederos: "+ totalDNP);
            
        }
    }

     
    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        String tipoBoleto;
        String tipoUsuario;
        int prioridad=1;
        Usuario nuevoUsuario;
        
        //validación de tipo de usuario 
        if(radioAdulto.isSelected()==true){
            tipoUsuario= TipoUsuario.ADULTOMAYOR.getTipoUsuario();
            prioridad+=2;
        }else if(radioDiscapacitado.isSelected()==true){
            tipoUsuario= TipoUsuario.DISCAPACITADO.getTipoUsuario();
            prioridad+=3;
        }else if (radioEmbarazada.isSelected()==true){
            tipoUsuario= TipoUsuario.EMBARAZADA.getTipoUsuario();
            prioridad+=1;
        }else if (radioRegular.isSelected()==true){
            tipoUsuario= TipoUsuario.REGULAR.getTipoUsuario();
        }else{
            JOptionPane.showMessageDialog(this, "Por favor, escoger su condición");
            return;                           
        }
        
     
        try{                    
            //validación de tipo de clase de vuelo
            if(radioNoPerecederos.isSelected()==true){
                totalNP++;
                lblTotalNP.setText("No Perecedero: "+totalNP);
                prioridad++;
                tipoBoleto= TipoPaquete.NOPERECEDERO.getTipoPaquete();
                //se crea un usuario según la información ingresada
                nuevoUsuario= new Usuario(fieldNombre.getText(),fieldCorreo.getText(),tipoUsuario,
                        Integer.parseInt(fieldNumero.getText()),kiosco.venderBoleto(),tipoBoleto);
                
                colaEjecutiva.insert(nuevoUsuario, prioridad);
                colaNPAdmin.insert(nuevoUsuario, prioridad);
                
                insertarEnFila(nuevoUsuario,"eju");
                actualizarList("eju");
                
                inicioNP= System.nanoTime();  
                
            }else if(radioPerecederos.isSelected()==true){
                totalP++;
                lblTotalP.setText("Perecedero: "+totalP);
                tipoBoleto=TipoPaquete.PERECEDERO.getTipoPaquete();
                nuevoUsuario= new Usuario(fieldNombre.getText(),fieldCorreo.getText(),tipoUsuario,
                    Integer.parseInt(fieldNumero.getText()),kiosco.venderBoleto(),tipoBoleto);
                
                if(estructuraEntregas instanceof Heap){
                    Heap.class.cast(estructuraEntregas).insert(nuevoUsuario, prioridad);
                }else{
                    ColaPrioridad.class.cast(estructuraEntregas).insert(new Prioridad(nuevoUsuario,prioridad),prioridad);
                }
                colaPAdmin.insert(nuevoUsuario, prioridad);
                insertarEnFila(nuevoUsuario,"eco");
                actualizarList("eco");
            }else{
                JOptionPane.showMessageDialog(this, "Por favor, escoger un tipo de paquete");
                return;               
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Por favor, ingresar un número válido");
            return;                   
        }   
        
        aumentarC();
        mensaje.enviarMensaje(nuevoUsuario.getNombre()+", buen día " + fieldNombre.getText(),"506"+fieldNumero.getText());
        JOptionPane.showMessageDialog(this, "Código de ficha: "+nuevoUsuario.getNombre());
        determinarCantidaBoleto(prioridad,tipoBoleto); 
        
    }//GEN-LAST:event_btnEnviarMouseClicked
    private void aumentarC(){
        cantC++;
        lblCantidadC.setText("Clientes en cola entregas: "+cantC);        
    }
    
    private void disminuirC(){
        cantC--;
        lblCantidadC.setText("Clientes en cola entregas: "+cantC);  
    }
    
    private void aumentarS(){
        cantS++;
        lblCantidadS.setText("Clientes en cola de seguridad: "+cantS);        
    } 
    
    private void obtenerSiguiente(Object usr,String tipo){
        if (manejoEntregas=="cola"){     
            if (tipo =="eco"){    
                Prioridad eliminado= colaPAdmin.remove();
                Usuario eliminadoC= eliminado.getTask(); 
                lblSiguienteP.setText("Siguiente cliente en perecederos: "+eliminadoC);
            }else{
                Prioridad eliminado= colaNPAdmin.remove();
                Usuario eliminadoC= eliminado.getTask();
                lblSiguienteNP.setText("Siguiente cliente en no perecederos: "+eliminadoC);
            }
        }
    }
    
    private void btnAtenderPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtenderPMouseClicked
    
        int i=listaEC.getSelectedIndex();
        
        if (i==-1){
            JOptionPane.showMessageDialog(this, "Por favor, escoger una ventanilla");
            return;              
        }
        
        VentanillaPerecederos porAtender= (VentanillaPerecederos)modeloP.getElementAt(i);
        Prioridad eliminado= null;
        if(estructuraEntregas instanceof Heap){           
             eliminado= Heap.class.cast(estructuraEntregas).remove();        
        }else{
             eliminado= ColaPrioridad.class.cast(estructuraEntregas).remove();
        }
        if (porAtender.estaTrabajando()==true){
            JOptionPane.showMessageDialog(this, "Ventanilla ocupada");
        }else if(eliminado!=null){  
            cronometroEco();
            porAtender.addAtendidos();
            disminuirC();          
            Usuario eliminadoC= eliminado.getTask();                         
            porAtender.atender();
            listaEC.setModel(modeloP); 
            obtenerSiguiente(colaPAdmin,"eco");
            
            eliminarEnFila(eliminadoC,"eco");
            actualizarList("eco");
            
            JOptionPane.showMessageDialog(this, "Atendiendo en ventana perecederos número:"+porAtender.getNumero()+
                    "\nal usuario: "+eliminadoC.getNombre());
        }
     totalAP++;
     lblTotalAP.setText("Perecederos: "+ totalAP);
    }//GEN-LAST:event_btnAtenderPMouseClicked

    private void btnLiberarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLiberarPMouseClicked
        // TODO add your handling code here:
        int i=listaEC.getSelectedIndex();
        if (i==-1){
            JOptionPane.showMessageDialog(this, "Por favor, escoger una ventanilla");
            return;              
        }
        
        VentanillaPerecederos porAtender= (VentanillaPerecederos)modeloP.getElementAt(i);
        
        Prioridad eliminado= null;
        if(estructuraEntregas instanceof Heap){           
             eliminado= Heap.class.cast(estructuraEntregas).remove();        
        }else{
             eliminado= ColaPrioridad.class.cast(estructuraEntregas).remove();
        }
        
        if(eliminado!=null){
            porAtender.addAtendidos();
            cronometroEco();
            disminuirC();                         
            aumentarS();
            Usuario eliminadoC= eliminado.getTask();
            porAtender.atender();
            listaEC.setModel(modeloP);
            if(estructuraSeguridad instanceof Heap){                           
                Heap.class.cast(estructuraSeguridad).insert(eliminadoC, eliminado.getPrioridad());
            }else{
                ColaPrioridad.class.cast(estructuraSeguridad).insert(new Prioridad(eliminadoC,eliminado.getPrioridad()), eliminado.getPrioridad());
            }
            //estructuraSeguridad.insert(eliminadoC, eliminado.getPrioridad());  
            iniciarConteo(minimoE, maximoE);
            
            obtenerSiguiente(colaPAdmin,"eco");                        
            eliminarEnFila(eliminadoC,"eco");
            actualizarList("eco");            
            
            JOptionPane.showMessageDialog(this, "Atendiendo en ventana perecederos número:"+porAtender.getNumero()+
                    "\nal usuario: "+eliminadoC.getNombre());
        }
    totalAP++;
    lblTotalAP.setText("Perecederos: "+ totalAP);


    }//GEN-LAST:event_btnLiberarPMouseClicked

    private void btnAtenderNPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtenderNPMouseClicked
        // TODO add your handling code here:
        int i=listaEJ.getSelectedIndex();                        
        if (i==-1){
            JOptionPane.showMessageDialog(this, "Por favor, escoger una ventanilla");
            return;              
        }
        
        VentanillaNoPerecederos porAtender= (VentanillaNoPerecederos)modeloNP.getElementAt(i);
        Prioridad eliminado= colaEjecutiva.remove();
        
        if (porAtender.estaTrabajando()==true){
            JOptionPane.showMessageDialog(this, "Ventanilla ocupada");
        
        }else if(eliminado!=null){
            disminuirC(); 
            cronometroEju();
            porAtender.addAtendidos();
            Usuario eliminadoC= eliminado.getTask();
            porAtender.atender();
            listaEJ.setModel(modeloNP);
            obtenerSiguiente(colaPAdmin,"eju");
            eliminarEnFila(eliminadoC,"eju");
            actualizarList("eju");
            JOptionPane.showMessageDialog(this, "Atendiendo en ventana no perecederos número:"+porAtender.getNumero()+
                    "\nal usuario: "+eliminadoC.getNombre());
        }
        totalANP++;
        lblTotalANP.setText("Perecederos: "+ totalANP);

    }//GEN-LAST:event_btnAtenderNPMouseClicked

    private void btnLiberarNPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLiberarNPMouseClicked
        // TODO add your handling code here:
        int i=listaEJ.getSelectedIndex();                        
        if (i==-1){
            JOptionPane.showMessageDialog(this, "Por favor, escoger una ventanilla");
            return;              
        }        
        VentanillaNoPerecederos porAtender= (VentanillaNoPerecederos)modeloNP.getElementAt(i);
        Prioridad eliminado= colaEjecutiva.remove();
        
        if(eliminado!=null){
            disminuirC();                            
            aumentarS();   
            cronometroEju();
            porAtender.addAtendidos();

            Usuario eliminadoC= eliminado.getTask();
            listaEJ.setModel(modeloNP);
            if(estructuraSeguridad instanceof Heap){                            
                Heap.class.cast(estructuraSeguridad).insert(eliminadoC, eliminado.getPrioridad());
            }else{
                ColaPrioridad.class.cast(estructuraSeguridad).insert(new Prioridad(eliminadoC,eliminado.getPrioridad()), eliminado.getPrioridad());
            }
            //estructuraSeguridad.insert(eliminadoC, eliminado.getPrioridad());  
            iniciarConteo(minimoE, maximoE);
            obtenerSiguiente(colaPAdmin,"eju");
            eliminarEnFila(eliminadoC,"eju");
            actualizarList("eju");
            JOptionPane.showMessageDialog(this, "Atendiendo en ventana no perecederos número:"+porAtender.getNumero()+
                    "\nal usuario: "+eliminadoC.getNombre());
        }
        totalANP++;
        lblTotalANP.setText("No Perecederos: "+ totalANP);

        
    }//GEN-LAST:event_btnLiberarNPMouseClicked

    private void btnCambiarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarPMouseClicked
        // TODO add your handling code here:
        try{
            cambiarEcoVentanas(Integer.parseInt(fieldNumEco.getText()));
                  
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ingresar número válido");
        }
    }//GEN-LAST:event_btnCambiarPMouseClicked

    private void btnCambiarNPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarNPMouseClicked
        // TODO add your handling code here:
        try{
            cambiarEjeVentanas(Integer.parseInt(fieldNumEje.getText()));                  
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ingresar número válido");
        }
    }//GEN-LAST:event_btnCambiarNPMouseClicked

    private void btnCambiarSeguMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarSeguMouseClicked
        // TODO add your handling code here:
        try{
            cambiarSeguVentanas(Integer.parseInt(fieldNumSeguridad.getText()));                  
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ingresar número válido");
        }        
    }//GEN-LAST:event_btnCambiarSeguMouseClicked

    private void radioPerecederosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPerecederosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPerecederosActionPerformed
    
    private void cambiarSeguVentanas(int ventanasSegu){
        modeloS.clear();
        
        for (int i = 0; i < ventanasSegu; i++) {
            VentanillaSeguridad nuevaVentanilla= new VentanillaSeguridad("Seguridad",+i+1,"Seguridad",estructuraSeguridad,minimoE,maximoE);
            modeloS.addElement(nuevaVentanilla);
        }        
    }
    
    private void cambiarEjeVentanas(int ventanasEju){
        modeloNP.clear();
        for (int i = 0; i < ventanasEju; i++) {
            VentanillaNoPerecederos nuevaVentanilla= new VentanillaNoPerecederos("No Perecedero",i+1,"Entregas",estructuraEntregas);
            modeloNP.addElement(nuevaVentanilla);
        
        }         
    }
    
    private void cambiarEcoVentanas(int ventanasEco){
        modeloP.clear();
        for (int i = 0; i < ventanasEco; i++) {
                VentanillaPerecederos nuevaVentanilla= new VentanillaPerecederos("Perecedero",i+1,"Entregas",estructuraEntregas);
                modeloP.addElement(nuevaVentanilla);
        }       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAtenderNP;
    private javax.swing.JButton btnAtenderP;
    private javax.swing.JButton btnCambiarNP;
    private javax.swing.JButton btnCambiarP;
    private javax.swing.JButton btnCambiarSegu;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLiberarNP;
    private javax.swing.JButton btnLiberarP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField fieldCorreo;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldNumEco;
    private javax.swing.JTextField fieldNumEje;
    private javax.swing.JTextField fieldNumSeguridad;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.ButtonGroup grupoClase;
    private javax.swing.ButtonGroup grupoEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAMP;
    private javax.swing.JLabel lblCantidadC;
    private javax.swing.JLabel lblCantidadS;
    private javax.swing.JLabel lblDNP;
    private javax.swing.JLabel lblDP;
    private javax.swing.JLabel lblMNP;
    private javax.swing.JLabel lblMP;
    private javax.swing.JLabel lblPromedioNP;
    private javax.swing.JLabel lblPromedioP;
    private javax.swing.JLabel lblPromedioSeguridad;
    private javax.swing.JLabel lblRNP;
    private javax.swing.JLabel lblRP;
    private javax.swing.JLabel lblSiguienteNP;
    private javax.swing.JLabel lblSiguienteP;
    private javax.swing.JLabel lblTAMNP;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTipoCola;
    private javax.swing.JLabel lblTipoCola1;
    private javax.swing.JLabel lblTipoCola10;
    private javax.swing.JLabel lblTipoCola11;
    private javax.swing.JLabel lblTipoCola18;
    private javax.swing.JLabel lblTipoCola5;
    private javax.swing.JLabel lblTipoCola6;
    private javax.swing.JLabel lblTipoCola8;
    private javax.swing.JLabel lblTipoCola9;
    private javax.swing.JLabel lblTotalANP;
    private javax.swing.JLabel lblTotalAP;
    private javax.swing.JLabel lblTotalNP;
    private javax.swing.JLabel lblTotalP;
    private javax.swing.JLabel lblVentanasE;
    private javax.swing.JList<String> listHE;
    private javax.swing.JList<String> listHEj;
    private javax.swing.JList<String> listaEC;
    private javax.swing.JList<String> listaEJ;
    private javax.swing.JList<String> listaS;
    private javax.swing.JRadioButton radioAdulto;
    private javax.swing.JRadioButton radioDiscapacitado;
    private javax.swing.JRadioButton radioEmbarazada;
    private javax.swing.JRadioButton radioNoPerecederos;
    private javax.swing.JRadioButton radioPerecederos;
    private javax.swing.JRadioButton radioRegular;
    // End of variables declaration//GEN-END:variables
}
