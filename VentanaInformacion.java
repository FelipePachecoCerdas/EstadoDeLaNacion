
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Felipe Pacheco Cerdas
 * @author Kendall Tenorio Chevez
 */
public class VentanaInformacion extends javax.swing.JFrame {

  private JFrame ventanaPrincipal;
  priavte Canton canton;

  /**
   * Creates new form VentanaInformacion
   */
  public VentanaInformacion(JFrame pVentanaPrincipal, Canton pCanton) {
    ventanaPrincipal = pVentanaPrincipal;
    canton = pCanton;

    this.getContentPane().setBackground(Color.BLACK);
    initComponents();

    this.nombre.setText(canton.getNombre());
    ImageIcon image = new ImageIcon(new ImageIcon(canton.getNombre() + ".png").getImage().getScaledInstance(318, 264, Image.SCALE_DEFAULT));
    this.imagen.setIcon(image);
    this.cantHabitantes.setText(canton.getCantHabitantes() + "");
    this.superficie.setText(canton.getSuperficie() + "");
    this.densidad.setText(canton.getDensisadXkm2() + "");
    this.urbanoX100.setText(canton.getPersonasUrbanasX100() + "");
    this.dependientes.setText(canton.getDependientesX100Productivas() + "");
    this.viviendas.setText(canton.getCantViviendas() + "");
    this.ocupantesXVivienda.setText(canton.getPersonasXVivienda() + "");
    this.viviendasBuenEstado.setText(canton.getPorViviendasBuenEstado() + "%");
    this.viviendasHacinadas.setText(canton.getPorViviendasHacinadas() + "%");
    this.analfabetismo.setText(canton.getPorAlfabetismo() + "%");
    this.entre10y24.setText(canton.getPaDe10a24() + "%");
    this.entre25oMas.setText(canton.getPaDe24aMas() + "%");

    this.escolaridad.setText(canton.getEscolaridadPromedio() + "%");
    this.entre5y17.setText(canton.getEpDe5a17() + "%");
    this.entre18y24.setText(canton.getEpDe18a24() + "%");
    this.entre25y49.setText(canton.getEpDe25a49() + "%");
    this.entre50oMas.setText(canton.getEpDe50aMas() + "%");
    this.desempleadas.setText(canton.getPorDesempleo() + "%");
    this.paticipacion.setText(canton.getParticipacion() + "%");
    this.hombres.setText(canton.getParticipacionHombres() + "%");
    this.mujeres.setText(canton.getParticipacionMujeres() + "%");
    this.ocupadaNoAsegurada.setText(canton.getPorOcupadaNoAsegurada() + "%");
    this.extranjeros.setText(canton.getPorExtranjera() + "%");
    this.discapacitados.setText(canton.getPorDiscapacidad() + "%");
    this.noAsegurada.setText(canton.getPorNoAsegurada() + "%");
    this.jefaturaFemenina.setText(canton.getPorJefaturaFemenina()+ "%");

    this.setVisible(true);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    imagen = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    cantHabitantes = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    superficie = new javax.swing.JLabel();
    urbanoX100 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    densidad = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    dependientes = new javax.swing.JLabel();
    ocupantesXVivienda = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    viviendas = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    hombresX100 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    viviendasBuenEstado = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    viviendasHacinadas = new javax.swing.JLabel();
    entre25oMas = new javax.swing.JLabel();
    entre10y24 = new javax.swing.JLabel();
    jLabel16 = new javax.swing.JLabel();
    analfabetismo = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    paticipacion = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    entre50oMas = new javax.swing.JLabel();
    jLabel18 = new javax.swing.JLabel();
    jLabel19 = new javax.swing.JLabel();
    mujeres = new javax.swing.JLabel();
    jLabel20 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    ocupadaNoAsegurada = new javax.swing.JLabel();
    noAsegurada = new javax.swing.JLabel();
    discapacitados = new javax.swing.JLabel();
    jLabel22 = new javax.swing.JLabel();
    extranjeros = new javax.swing.JLabel();
    jLabel23 = new javax.swing.JLabel();
    jLabel24 = new javax.swing.JLabel();
    escolaridad = new javax.swing.JLabel();
    jLabel25 = new javax.swing.JLabel();
    entre5y17 = new javax.swing.JLabel();
    entre25y49 = new javax.swing.JLabel();
    jLabel26 = new javax.swing.JLabel();
    entre18y24 = new javax.swing.JLabel();
    jLabel27 = new javax.swing.JLabel();
    desempleadas = new javax.swing.JLabel();
    hombres = new javax.swing.JLabel();
    jLabel28 = new javax.swing.JLabel();
    jefaturaFemenina = new javax.swing.JLabel();
    cerrar = new javax.swing.JButton();
    nombre = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);

    imagen.setBackground(null);
    imagen.setForeground(null);

    jLabel2.setBackground(new java.awt.Color(255, 255, 255));
    jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Población Total:");

    cantHabitantes.setBackground(new java.awt.Color(255, 255, 255));
    cantHabitantes.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    cantHabitantes.setForeground(new java.awt.Color(255, 255, 255));
    cantHabitantes.setText("0");

    jLabel3.setBackground(new java.awt.Color(255, 255, 255));
    jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Superficie en Km2:");

    superficie.setBackground(new java.awt.Color(255, 255, 255));
    superficie.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    superficie.setForeground(new java.awt.Color(255, 255, 255));
    superficie.setText("0");

    urbanoX100.setBackground(new java.awt.Color(255, 255, 255));
    urbanoX100.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    urbanoX100.setForeground(new java.awt.Color(255, 255, 255));
    urbanoX100.setText("0");

    jLabel4.setBackground(new java.awt.Color(255, 255, 255));
    jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Densidad Poblacional por Km2:");

    densidad.setBackground(new java.awt.Color(255, 255, 255));
    densidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    densidad.setForeground(new java.awt.Color(255, 255, 255));
    densidad.setText("0");

    jLabel5.setBackground(new java.awt.Color(255, 255, 255));
    jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setText("Personas que viven en zona urbana por cada 100:");

    dependientes.setBackground(new java.awt.Color(255, 255, 255));
    dependientes.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    dependientes.setForeground(new java.awt.Color(255, 255, 255));
    dependientes.setText("0");

    ocupantesXVivienda.setBackground(new java.awt.Color(255, 255, 255));
    ocupantesXVivienda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    ocupantesXVivienda.setForeground(new java.awt.Color(255, 255, 255));
    ocupantesXVivienda.setText("0");

    jLabel6.setBackground(new java.awt.Color(255, 255, 255));
    jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Viviendas Indivuales Ocupadas:");

    viviendas.setBackground(new java.awt.Color(255, 255, 255));
    viviendas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    viviendas.setForeground(new java.awt.Color(255, 255, 255));
    viviendas.setText("0");

    jLabel7.setBackground(new java.awt.Color(255, 255, 255));
    jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Cantidad de Ocupantes por Vivienda Individual:");

    jLabel8.setBackground(new java.awt.Color(255, 255, 255));
    jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Relación de hombres por cada 100 mujeres:");

    hombresX100.setBackground(new java.awt.Color(255, 255, 255));
    hombresX100.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    hombresX100.setForeground(new java.awt.Color(255, 255, 255));
    hombresX100.setText("0");

    jLabel9.setBackground(new java.awt.Color(255, 255, 255));
    jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("Personas dependientes por cada 100 personas productivas:");

    jLabel11.setBackground(new java.awt.Color(255, 255, 255));
    jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(255, 255, 255));
    jLabel11.setText("Porcentaje de Viviendas en Buen Estado:");

    viviendasBuenEstado.setBackground(new java.awt.Color(255, 255, 255));
    viviendasBuenEstado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    viviendasBuenEstado.setForeground(new java.awt.Color(255, 255, 255));
    viviendasBuenEstado.setText("0");

    jLabel13.setBackground(new java.awt.Color(255, 255, 255));
    jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(255, 255, 255));
    jLabel13.setText("Porcentaje de Viviendas Hacinadas:");

    jLabel14.setBackground(new java.awt.Color(255, 255, 255));
    jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(255, 255, 255));
    jLabel14.setText("Entre 25 o más años:");

    viviendasHacinadas.setBackground(new java.awt.Color(255, 255, 255));
    viviendasHacinadas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    viviendasHacinadas.setForeground(new java.awt.Color(255, 255, 255));
    viviendasHacinadas.setText("0");

    entre25oMas.setBackground(new java.awt.Color(255, 255, 255));
    entre25oMas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    entre25oMas.setForeground(new java.awt.Color(255, 255, 255));
    entre25oMas.setText("0");

    entre10y24.setBackground(new java.awt.Color(255, 255, 255));
    entre10y24.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    entre10y24.setForeground(new java.awt.Color(255, 255, 255));
    entre10y24.setText("0");

    jLabel16.setBackground(new java.awt.Color(255, 255, 255));
    jLabel16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(255, 255, 255));
    jLabel16.setText("Porcentaje de Analfabetismo:");

    analfabetismo.setBackground(new java.awt.Color(255, 255, 255));
    analfabetismo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    analfabetismo.setForeground(new java.awt.Color(255, 255, 255));
    analfabetismo.setText("0");

    jLabel17.setBackground(new java.awt.Color(255, 255, 255));
    jLabel17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(255, 255, 255));
    jLabel17.setText("Entre 10 y 24 años:");

    jLabel10.setBackground(new java.awt.Color(255, 255, 255));
    jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 255, 255));
    jLabel10.setText("Tasa Neta de Participación:");

    paticipacion.setBackground(new java.awt.Color(255, 255, 255));
    paticipacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    paticipacion.setForeground(new java.awt.Color(255, 255, 255));
    paticipacion.setText("0");

    jLabel12.setBackground(new java.awt.Color(255, 255, 255));
    jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setText("Participación de Hombres:");

    jLabel15.setBackground(new java.awt.Color(255, 255, 255));
    jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(255, 255, 255));
    jLabel15.setText("Entre 50 o más años");

    entre50oMas.setBackground(new java.awt.Color(255, 255, 255));
    entre50oMas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    entre50oMas.setForeground(new java.awt.Color(255, 255, 255));
    entre50oMas.setText("0");

    jLabel18.setBackground(new java.awt.Color(255, 255, 255));
    jLabel18.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel18.setForeground(new java.awt.Color(255, 255, 255));
    jLabel18.setText("Personas mayores a 15 años desempleadas:");

    jLabel19.setBackground(new java.awt.Color(255, 255, 255));
    jLabel19.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel19.setForeground(new java.awt.Color(255, 255, 255));
    jLabel19.setText("Participación de Mujeres:");

    mujeres.setBackground(new java.awt.Color(255, 255, 255));
    mujeres.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    mujeres.setForeground(new java.awt.Color(255, 255, 255));
    mujeres.setText("0");

    jLabel20.setBackground(new java.awt.Color(255, 255, 255));
    jLabel20.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel20.setForeground(new java.awt.Color(255, 255, 255));
    jLabel20.setText("Porcentaje de Población Ocupada no Asegurada:");

    jLabel21.setBackground(new java.awt.Color(255, 255, 255));
    jLabel21.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel21.setForeground(new java.awt.Color(255, 255, 255));
    jLabel21.setText("Porcentaje de Población no Asegurada:");

    ocupadaNoAsegurada.setBackground(new java.awt.Color(255, 255, 255));
    ocupadaNoAsegurada.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    ocupadaNoAsegurada.setForeground(new java.awt.Color(255, 255, 255));
    ocupadaNoAsegurada.setText("0");

    noAsegurada.setBackground(new java.awt.Color(255, 255, 255));
    noAsegurada.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    noAsegurada.setForeground(new java.awt.Color(255, 255, 255));
    noAsegurada.setText("0");

    discapacitados.setBackground(new java.awt.Color(255, 255, 255));
    discapacitados.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    discapacitados.setForeground(new java.awt.Color(255, 255, 255));
    discapacitados.setText("0");

    jLabel22.setBackground(new java.awt.Color(255, 255, 255));
    jLabel22.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel22.setForeground(new java.awt.Color(255, 255, 255));
    jLabel22.setText("Porcentaje de Población Nacida en el Extrajero:");

    extranjeros.setBackground(new java.awt.Color(255, 255, 255));
    extranjeros.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    extranjeros.setForeground(new java.awt.Color(255, 255, 255));
    extranjeros.setText("0");

    jLabel23.setBackground(new java.awt.Color(255, 255, 255));
    jLabel23.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel23.setForeground(new java.awt.Color(255, 255, 255));
    jLabel23.setText("Porcentaje de Población con Discapacidad:");

    jLabel24.setBackground(new java.awt.Color(255, 255, 255));
    jLabel24.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel24.setForeground(new java.awt.Color(255, 255, 255));
    jLabel24.setText("Porcentaje de Escolaridad Promedio:");

    escolaridad.setBackground(new java.awt.Color(255, 255, 255));
    escolaridad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    escolaridad.setForeground(new java.awt.Color(255, 255, 255));
    escolaridad.setText("0");

    jLabel25.setBackground(new java.awt.Color(255, 255, 255));
    jLabel25.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel25.setForeground(new java.awt.Color(255, 255, 255));
    jLabel25.setText("Entre 5 y 17 años:");

    entre5y17.setBackground(new java.awt.Color(255, 255, 255));
    entre5y17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    entre5y17.setForeground(new java.awt.Color(255, 255, 255));
    entre5y17.setText("0");

    entre25y49.setBackground(new java.awt.Color(255, 255, 255));
    entre25y49.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    entre25y49.setForeground(new java.awt.Color(255, 255, 255));
    entre25y49.setText("0");

    jLabel26.setBackground(new java.awt.Color(255, 255, 255));
    jLabel26.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel26.setForeground(new java.awt.Color(255, 255, 255));
    jLabel26.setText("Entre 18 y 24 años:");

    entre18y24.setBackground(new java.awt.Color(255, 255, 255));
    entre18y24.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    entre18y24.setForeground(new java.awt.Color(255, 255, 255));
    entre18y24.setText("0");

    jLabel27.setBackground(new java.awt.Color(255, 255, 255));
    jLabel27.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel27.setForeground(new java.awt.Color(255, 255, 255));
    jLabel27.setText("Entre 25 y 49 años:");

    desempleadas.setBackground(new java.awt.Color(255, 255, 255));
    desempleadas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    desempleadas.setForeground(new java.awt.Color(255, 255, 255));
    desempleadas.setText("0");

    hombres.setBackground(new java.awt.Color(255, 255, 255));
    hombres.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    hombres.setForeground(new java.awt.Color(255, 255, 255));
    hombres.setText("0");

    jLabel28.setBackground(new java.awt.Color(255, 255, 255));
    jLabel28.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel28.setForeground(new java.awt.Color(255, 255, 255));
    jLabel28.setText("Porcentaje de Hogares con Jefatura Femenina:");

    jefaturaFemenina.setBackground(new java.awt.Color(255, 255, 255));
    jefaturaFemenina.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jefaturaFemenina.setForeground(new java.awt.Color(255, 255, 255));
    jefaturaFemenina.setText("0");

    cerrar.setBackground(new java.awt.Color(204, 0, 0));
    cerrar.setText("X");
    cerrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarActionPerformed(evt);
      }
    });

    nombre.setBackground(new java.awt.Color(255, 255, 255));
    nombre.setFont(new java.awt.Font("Segoe Script", 0, 60)); // NOI18N
    nombre.setForeground(new java.awt.Color(255, 255, 255));
    nombre.setText("Nombre");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(455, 455, 455)
        .addComponent(nombre)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(cerrar)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(36, 36, 36)
        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(37, 37, 37)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel13)
              .addComponent(jLabel11)
              .addComponent(jLabel16)
              .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel14)
                  .addComponent(jLabel17))))
            .addGap(112, 112, 112)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(viviendasBuenEstado)
                .addComponent(viviendasHacinadas, javax.swing.GroupLayout.Alignment.LEADING))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(analfabetismo)
                .addComponent(entre10y24, javax.swing.GroupLayout.Alignment.LEADING))
              .addComponent(entre25oMas)))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(jLabel2)
              .addComponent(jLabel5)
              .addComponent(jLabel4)
              .addComponent(jLabel9)
              .addComponent(jLabel8)
              .addComponent(jLabel7)
              .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(cantHabitantes)
                .addComponent(superficie, javax.swing.GroupLayout.Alignment.LEADING))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(densidad)
                .addComponent(urbanoX100, javax.swing.GroupLayout.Alignment.LEADING))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(hombresX100)
                .addComponent(dependientes, javax.swing.GroupLayout.Alignment.LEADING))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(viviendas)
                .addComponent(ocupantesXVivienda, javax.swing.GroupLayout.Alignment.LEADING)))))
        .addGap(103, 103, 103)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel19)
          .addComponent(jLabel12)
          .addComponent(jLabel24)
          .addComponent(jLabel10)
          .addGroup(layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel25)
              .addComponent(jLabel27)
              .addComponent(jLabel26)
              .addComponent(jLabel15)))
          .addComponent(jLabel18)
          .addComponent(jLabel20)
          .addComponent(jLabel22)
          .addComponent(jLabel21)
          .addComponent(jLabel23)
          .addComponent(jLabel28))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(mujeres)
            .addComponent(ocupadaNoAsegurada, javax.swing.GroupLayout.Alignment.LEADING))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(extranjeros)
            .addComponent(discapacitados, javax.swing.GroupLayout.Alignment.LEADING))
          .addComponent(noAsegurada)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(escolaridad)
            .addComponent(entre5y17, javax.swing.GroupLayout.Alignment.LEADING))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(entre18y24)
            .addComponent(entre25y49, javax.swing.GroupLayout.Alignment.LEADING))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(entre50oMas)
            .addComponent(desempleadas, javax.swing.GroupLayout.Alignment.LEADING))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(paticipacion)
            .addComponent(hombres, javax.swing.GroupLayout.Alignment.LEADING))
          .addComponent(jefaturaFemenina))
        .addGap(74, 74, 74))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(cerrar)
          .addComponent(nombre))
        .addGap(23, 23, 23)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(9, 9, 9)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel24)
                  .addComponent(escolaridad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel25)
                  .addComponent(entre5y17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel26)
                  .addComponent(entre18y24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel27)
                  .addComponent(entre25y49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel15)
                  .addComponent(entre50oMas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel18)
                  .addComponent(desempleadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel10)
                  .addComponent(paticipacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel12)
                  .addComponent(hombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel19)
                  .addComponent(mujeres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel20)
                  .addComponent(ocupadaNoAsegurada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel22)
                  .addComponent(extranjeros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel23)
                  .addComponent(discapacitados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel21)
                  .addComponent(noAsegurada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel28)
                  .addComponent(jefaturaFemenina)))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel2)
                  .addComponent(cantHabitantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel3)
                  .addComponent(superficie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel4)
                  .addComponent(densidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel5)
                  .addComponent(urbanoX100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel8)
                  .addComponent(hombresX100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel9)
                  .addComponent(dependientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel6)
                  .addComponent(viviendas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel7)
                  .addComponent(ocupantesXVivienda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel11)
                  .addComponent(viviendasBuenEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel13)
                  .addComponent(viviendasHacinadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel16)
                  .addComponent(analfabetismo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel17)
                  .addComponent(entre10y24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel14)
                  .addComponent(entre25oMas)))))
          .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(57, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
    this.dispose();
    ventanaPrincipal.setVisible(true);
  }//GEN-LAST:event_cerrarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel analfabetismo;
  private javax.swing.JLabel cantHabitantes;
  private javax.swing.JButton cerrar;
  private javax.swing.JLabel densidad;
  private javax.swing.JLabel dependientes;
  private javax.swing.JLabel desempleadas;
  private javax.swing.JLabel discapacitados;
  private javax.swing.JLabel entre10y24;
  private javax.swing.JLabel entre18y24;
  private javax.swing.JLabel entre25oMas;
  private javax.swing.JLabel entre25y49;
  private javax.swing.JLabel entre50oMas;
  private javax.swing.JLabel entre5y17;
  private javax.swing.JLabel escolaridad;
  private javax.swing.JLabel extranjeros;
  private javax.swing.JLabel hombres;
  private javax.swing.JLabel hombresX100;
  private javax.swing.JLabel imagen;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel18;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel20;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JLabel jLabel22;
  private javax.swing.JLabel jLabel23;
  private javax.swing.JLabel jLabel24;
  private javax.swing.JLabel jLabel25;
  private javax.swing.JLabel jLabel26;
  private javax.swing.JLabel jLabel27;
  private javax.swing.JLabel jLabel28;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JLabel jefaturaFemenina;
  private javax.swing.JLabel mujeres;
  private javax.swing.JLabel noAsegurada;
  private javax.swing.JLabel nombre;
  private javax.swing.JLabel ocupadaNoAsegurada;
  private javax.swing.JLabel ocupantesXVivienda;
  private javax.swing.JLabel paticipacion;
  private javax.swing.JLabel superficie;
  private javax.swing.JLabel urbanoX100;
  private javax.swing.JLabel viviendas;
  private javax.swing.JLabel viviendasBuenEstado;
  private javax.swing.JLabel viviendasHacinadas;
  // End of variables declaration//GEN-END:variables
}
