
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

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
public class Mapa extends javax.swing.JFrame {

  private JLayeredPane actual = null;
  private CostaRica costaRica;

  /**
   * Creates new form Mapa
   *
   * @throws java.io.IOException
   */
  public Mapa() {

    costaRica = new CostaRica();

    this.getContentPane().setBackground(Color.BLACK);
    initComponents();
    //this.puntarenasProvincia.setVisible(false);

    BufferedImage image = null;
    this.setSize(1300, 700); //1260, 520

    this.sanJoseProvincia.setVisible(false);
    this.alajuelaProvincia.setVisible(false);
    this.cartagoProvincia.setVisible(false);
    this.herediaProvincia.setVisible(false);
    this.puntarenasProvincia.setVisible(false);
    this.guanacasteProvincia.setVisible(false);
    this.limonProvincia.setVisible(false);

    /*
    try {
      image = ImageIO.read(new File("image (1).png"));
    } catch (IOException ex) {
      Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    for (int x = 0; x < image.getWidth(); x++) {
      for (int y = 0; y < image.getHeight(); y++) {
        if (image.getRGB(x,y) != 0) {
          image.setRGB(x, y, -454414);
        }
      }
    }
    ImageIcon imagen = new ImageIcon(image);
    this.jLabel2.setIcon(imagen);
    //this.jLabel2.setBorder(LineBorder.createGrayLineBorder());*/
    JLabel provincias[] = {herediaProv, cartagoProv1, alajuelaProv, sanJoseProv1, guanacasteProv, limonProv, puntarenasProv};
    this.sanJoseProv1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    this.sanJoseProv1.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() > 0) {
          JLabel etiqueta = (JLabel) e.getComponent();
          String nombre = etiqueta.getName();
          if (actual != null) {
            actual.setVisible(false);
          }
          switch (nombre) {
            case "San José":
              actual = sanJoseProvincia;
              break;
            case "Alajuela":
              actual = alajuelaProvincia;
              break;
            case "Cartago":
              actual = cartagoProvincia;
              break;
            case "Heredia":
              actual = herediaProvincia;
              break;
            case "Puntarenas":
              actual = puntarenasProvincia;
              break;
            case "Guanacaste":
              actual = guanacasteProvincia;
              break;
            case "Limón":
              actual = limonProvincia;
              break;
          }
          actual.setVisible(true);
        }
      }
    });
    //this.puntarenasProv.addMouseListener(sanJoseProv1.getMouseListeners()[0]);
    for (JLabel etiqueta : provincias) {
      //this.jLayeredPane2.add(etiqueta);
      etiqueta.setToolTipText(etiqueta.getName());
      if (etiqueta != sanJoseProv1) {
        etiqueta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etiqueta.addMouseListener(sanJoseProv1.getMouseListeners()[0]);
      }
    }

    JLabel cantones[] = {montesDeOca, goicoechea, moravia, tibas, sanJose, curridabat, alajuelita, escazu, santaAna, desamparados, aserri, leonCortesCastro, acosta, puriscal, turrubares, tarrazu, dota, perezZeledon, vazquezDeCoronado, mora, hojancha, tilaran, cannas, carrillo, bagaces, abangares, liberia, laCruz1, nicoya, santaCruz, sanMateo, orotina, palmares, atenas, poas, valverdeVega, naranjo, alfaro, sanRamon, alajuela, grecia, guatuso, upala, losChiles, sanCarlos, belen, flores, sanPablo, sanIsidro, santoDomingo, sanRafael, barva, santaBarbara, heredia, sarapiqui, siquirres, matina, guacimo, pococi, limon, talamanca, alvarado, laUnion, cartago, elGuarco, jimenez, paraiso, turrialba, oreamuno, montesDeOro, esparza, garabito, parrita, aguirre, puntarenas, corredores, cotoBrus, golfito, osa, buenosAires};
    this.acosta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    JFrame ventana = this;
    this.acosta.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() > 0) {
          JLabel etiqueta = (JLabel) e.getComponent();
          String nombre = etiqueta.getName();
          Canton canton = costaRica.getCanton(nombre);
          VentanaInformacion ventanaInformacion = new VentanaInformacion(ventana, canton);
          ventana.setVisible(false);
        }
      }
    });
    for (JLabel etiqueta : cantones) {
      //this.jLayeredPane2.add(etiqueta);
      etiqueta.setToolTipText(etiqueta.getName());
      if (etiqueta != acosta) {
        etiqueta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etiqueta.addMouseListener(acosta.getMouseListeners()[0]);
      }
    }
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLayeredPane1 = new javax.swing.JLayeredPane();
    puntarenasProvincia = new javax.swing.JLayeredPane();
    jLayeredPane3 = new javax.swing.JLayeredPane();
    jLayeredPane4 = new javax.swing.JLayeredPane();
    jLayeredPane5 = new javax.swing.JLayeredPane();
    buenosAires = new javax.swing.JLabel();
    osa = new javax.swing.JLabel();
    golfito = new javax.swing.JLabel();
    corredores = new javax.swing.JLabel();
    aguirre = new javax.swing.JLabel();
    parrita = new javax.swing.JLabel();
    garabito = new javax.swing.JLabel();
    esparza = new javax.swing.JLabel();
    montesDeOro = new javax.swing.JLabel();
    puntarenas = new javax.swing.JLabel();
    cotoBrus = new javax.swing.JLabel();
    jLayeredPane6 = new javax.swing.JLayeredPane();
    jLayeredPane7 = new javax.swing.JLayeredPane();
    jLayeredPane8 = new javax.swing.JLayeredPane();
    jLayeredPane9 = new javax.swing.JLayeredPane();
    buenosAires1 = new javax.swing.JLabel();
    osa1 = new javax.swing.JLabel();
    golfito1 = new javax.swing.JLabel();
    corredores1 = new javax.swing.JLabel();
    aguirre1 = new javax.swing.JLabel();
    parrita1 = new javax.swing.JLabel();
    garabito1 = new javax.swing.JLabel();
    esparza1 = new javax.swing.JLabel();
    montesDeOro1 = new javax.swing.JLabel();
    puntarenas1 = new javax.swing.JLabel();
    cotoBrus1 = new javax.swing.JLabel();
    jLayeredPane10 = new javax.swing.JLayeredPane();
    sanJoseProvincia = new javax.swing.JLayeredPane();
    perezZeledon = new javax.swing.JLabel();
    dota = new javax.swing.JLabel();
    tarrazu = new javax.swing.JLabel();
    leonCortesCastro = new javax.swing.JLabel();
    aserri = new javax.swing.JLabel();
    acosta = new javax.swing.JLabel();
    puriscal = new javax.swing.JLabel();
    turrubares = new javax.swing.JLabel();
    desamparados = new javax.swing.JLabel();
    mora = new javax.swing.JLabel();
    santaAna = new javax.swing.JLabel();
    escazu = new javax.swing.JLabel();
    alajuelita = new javax.swing.JLabel();
    tibas = new javax.swing.JLabel();
    curridabat = new javax.swing.JLabel();
    montesDeOca = new javax.swing.JLabel();
    goicoechea = new javax.swing.JLabel();
    vazquezDeCoronado = new javax.swing.JLabel();
    moravia = new javax.swing.JLabel();
    sanJose = new javax.swing.JLabel();
    herediaProvincia = new javax.swing.JLayeredPane();
    sarapiqui = new javax.swing.JLabel();
    heredia = new javax.swing.JLabel();
    santaBarbara = new javax.swing.JLabel();
    barva = new javax.swing.JLabel();
    sanRafael = new javax.swing.JLabel();
    sanIsidro = new javax.swing.JLabel();
    santoDomingo = new javax.swing.JLabel();
    sanPablo = new javax.swing.JLabel();
    flores = new javax.swing.JLabel();
    belen = new javax.swing.JLabel();
    alajuelaProvincia = new javax.swing.JLayeredPane();
    sanCarlos = new javax.swing.JLabel();
    losChiles = new javax.swing.JLabel();
    guatuso = new javax.swing.JLabel();
    upala = new javax.swing.JLabel();
    sanRamon = new javax.swing.JLabel();
    alajuela = new javax.swing.JLabel();
    valverdeVega = new javax.swing.JLabel();
    alfaro = new javax.swing.JLabel();
    naranjo = new javax.swing.JLabel();
    grecia = new javax.swing.JLabel();
    poas = new javax.swing.JLabel();
    palmares = new javax.swing.JLabel();
    atenas = new javax.swing.JLabel();
    sanMateo = new javax.swing.JLabel();
    orotina = new javax.swing.JLabel();
    guanacasteProvincia = new javax.swing.JLayeredPane();
    liberia = new javax.swing.JLabel();
    laCruz1 = new javax.swing.JLabel();
    bagaces = new javax.swing.JLabel();
    carrillo = new javax.swing.JLabel();
    santaCruz = new javax.swing.JLabel();
    nicoya = new javax.swing.JLabel();
    hojancha = new javax.swing.JLabel();
    cannas = new javax.swing.JLabel();
    tilaran = new javax.swing.JLabel();
    abangares = new javax.swing.JLabel();
    nandayure1 = new javax.swing.JLabel();
    limonProvincia = new javax.swing.JLayeredPane();
    guacimo = new javax.swing.JLabel();
    matina = new javax.swing.JLabel();
    limon = new javax.swing.JLabel();
    siquirres = new javax.swing.JLabel();
    talamanca = new javax.swing.JLabel();
    pococi = new javax.swing.JLabel();
    jLayeredPane11 = new javax.swing.JLayeredPane();
    jLayeredPane2 = new javax.swing.JLayeredPane();
    guanacasteProv = new javax.swing.JLabel();
    herediaProv = new javax.swing.JLabel();
    cartagoProv1 = new javax.swing.JLabel();
    sanJoseProv1 = new javax.swing.JLabel();
    alajuelaProv = new javax.swing.JLabel();
    herediaProv1 = new javax.swing.JLabel();
    limonProv = new javax.swing.JLabel();
    puntarenasProv = new javax.swing.JLabel();
    cartagoProvincia = new javax.swing.JLayeredPane();
    turrialba = new javax.swing.JLabel();
    oreamuno = new javax.swing.JLabel();
    paraiso = new javax.swing.JLabel();
    elGuarco = new javax.swing.JLabel();
    laUnion = new javax.swing.JLabel();
    alvarado = new javax.swing.JLabel();
    cartago = new javax.swing.JLabel();
    jimenez = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    cerrar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));
    getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));
    getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 0, 0));

    puntarenasProvincia.add(jLayeredPane3);
    jLayeredPane3.setBounds(760, 470, 400, 380);

    jLayeredPane4.add(jLayeredPane5);
    jLayeredPane5.setBounds(760, 470, 400, 380);

    puntarenasProvincia.add(jLayeredPane4);
    jLayeredPane4.setBounds(170, 460, 400, 380);

    buenosAires.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Buenos Aires.png")); // NOI18N
    buenosAires.setName("Buenos Aires"); // NOI18N
    puntarenasProvincia.add(buenosAires);
    buenosAires.setBounds(260, 190, 80, 80);

    osa.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Osa.png")); // NOI18N
    osa.setName("Osa"); // NOI18N
    puntarenasProvincia.add(osa);
    osa.setBounds(200, 200, 130, 100);

    golfito.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Golfito.png")); // NOI18N
    golfito.setName("Golfito"); // NOI18N
    puntarenasProvincia.add(golfito);
    golfito.setBounds(240, 250, 125, 120);

    corredores.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Corredores.png")); // NOI18N
    corredores.setName("Corredores"); // NOI18N
    puntarenasProvincia.add(corredores);
    corredores.setBounds(300, 210, 40, 60);

    aguirre.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Aguirre.png")); // NOI18N
    aguirre.setName("Aguirre"); // NOI18N
    puntarenasProvincia.add(aguirre);
    aguirre.setBounds(170, 150, 75, 70);

    parrita.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Parrita.png")); // NOI18N
    parrita.setName("Parrita"); // NOI18N
    puntarenasProvincia.add(parrita);
    parrita.setBounds(120, 140, 70, 40);

    garabito.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Garabito.png")); // NOI18N
    garabito.setName("Garabito"); // NOI18N
    puntarenasProvincia.add(garabito);
    garabito.setBounds(90, 90, 40, 80);

    esparza.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Esparza.png")); // NOI18N
    esparza.setName("Esparza"); // NOI18N
    puntarenasProvincia.add(esparza);
    esparza.setBounds(90, 50, 60, 60);

    montesDeOro.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Montes De Oro.png")); // NOI18N
    montesDeOro.setName("Montes De Oro"); // NOI18N
    puntarenasProvincia.add(montesDeOro);
    montesDeOro.setBounds(80, 10, 50, 50);

    puntarenas.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Puntarenas.png")); // NOI18N
    puntarenas.setName("Puntarenas"); // NOI18N
    puntarenasProvincia.add(puntarenas);
    puntarenas.setBounds(-30, 0, 160, 130);

    cotoBrus.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Coto Brus.png")); // NOI18N
    cotoBrus.setName("Coto Brus"); // NOI18N
    puntarenasProvincia.add(cotoBrus);
    cotoBrus.setBounds(310, 210, 70, 80);

    jLayeredPane6.add(jLayeredPane7);
    jLayeredPane7.setBounds(760, 470, 400, 380);

    jLayeredPane8.add(jLayeredPane9);
    jLayeredPane9.setBounds(760, 470, 400, 380);

    jLayeredPane6.add(jLayeredPane8);
    jLayeredPane8.setBounds(170, 460, 400, 380);

    buenosAires1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Buenos Aires.png")); // NOI18N
    buenosAires1.setName("Buenos Aires"); // NOI18N
    jLayeredPane6.add(buenosAires1);
    buenosAires1.setBounds(260, 190, 80, 80);

    osa1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Osa.png")); // NOI18N
    osa1.setName("Osa"); // NOI18N
    jLayeredPane6.add(osa1);
    osa1.setBounds(200, 200, 130, 100);

    golfito1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Golfito.png")); // NOI18N
    golfito1.setName("Golfito"); // NOI18N
    jLayeredPane6.add(golfito1);
    golfito1.setBounds(240, 250, 125, 120);

    corredores1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Corredores.png")); // NOI18N
    corredores1.setName("Corredores"); // NOI18N
    jLayeredPane6.add(corredores1);
    corredores1.setBounds(300, 210, 40, 60);

    aguirre1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Aguirre.png")); // NOI18N
    aguirre1.setName("Aguirre"); // NOI18N
    jLayeredPane6.add(aguirre1);
    aguirre1.setBounds(170, 150, 75, 70);

    parrita1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Parrita.png")); // NOI18N
    parrita1.setName("Parrita"); // NOI18N
    jLayeredPane6.add(parrita1);
    parrita1.setBounds(120, 140, 70, 40);

    garabito1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Garabito.png")); // NOI18N
    garabito1.setName("Garabito"); // NOI18N
    jLayeredPane6.add(garabito1);
    garabito1.setBounds(90, 90, 40, 80);

    esparza1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Esparza.png")); // NOI18N
    esparza1.setName("Esparza"); // NOI18N
    jLayeredPane6.add(esparza1);
    esparza1.setBounds(90, 50, 60, 60);

    montesDeOro1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Montes De Oro.png")); // NOI18N
    montesDeOro1.setName("Montes De Oro"); // NOI18N
    jLayeredPane6.add(montesDeOro1);
    montesDeOro1.setBounds(80, 10, 50, 50);

    puntarenas1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Puntarenas.png")); // NOI18N
    puntarenas1.setName("Puntarenas"); // NOI18N
    jLayeredPane6.add(puntarenas1);
    puntarenas1.setBounds(-30, 0, 160, 130);

    cotoBrus1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Coto Brus.png")); // NOI18N
    cotoBrus1.setName("Coto Brus"); // NOI18N
    jLayeredPane6.add(cotoBrus1);
    cotoBrus1.setBounds(310, 210, 70, 80);

    puntarenasProvincia.add(jLayeredPane6);
    jLayeredPane6.setBounds(180, 460, 400, 380);

    getContentPane().add(puntarenasProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 400, 380));
    getContentPane().add(jLayeredPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 0, 0));

    sanJoseProvincia.setMinimumSize(new java.awt.Dimension(400, 380));

    perezZeledon.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Pérez Zeledón.png")); // NOI18N
    perezZeledon.setName("Pérez Zeledón"); // NOI18N
    perezZeledon.setRequestFocusEnabled(false);
    perezZeledon.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(perezZeledon);
    perezZeledon.setBounds(210, 220, 100, 94);

    dota.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Dota.png")); // NOI18N
    dota.setName("Dota"); // NOI18N
    dota.setRequestFocusEnabled(false);
    dota.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(dota);
    dota.setBounds(200, 180, 60, 80);

    tarrazu.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Tarrazú.png")); // NOI18N
    tarrazu.setName("Tarrazú"); // NOI18N
    tarrazu.setRequestFocusEnabled(false);
    tarrazu.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(tarrazu);
    tarrazu.setBounds(160, 200, 60, 60);

    leonCortesCastro.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\León Cortés Castro.png")); // NOI18N
    leonCortesCastro.setName("León Cortés Castro"); // NOI18N
    leonCortesCastro.setRequestFocusEnabled(false);
    leonCortesCastro.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(leonCortesCastro);
    leonCortesCastro.setBounds(180, 190, 50, 32);

    aserri.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Aserrí.png")); // NOI18N
    aserri.setName("Aserrí"); // NOI18N
    aserri.setRequestFocusEnabled(false);
    aserri.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(aserri);
    aserri.setBounds(160, 160, 50, 75);

    acosta.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Acosta.png")); // NOI18N
    acosta.setName("Acosta"); // NOI18N
    acosta.setRequestFocusEnabled(false);
    acosta.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(acosta);
    acosta.setBounds(130, 160, 60, 75);

    puriscal.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Puriscal.png")); // NOI18N
    puriscal.setName("Puriscal"); // NOI18N
    puriscal.setRequestFocusEnabled(false);
    puriscal.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(puriscal);
    puriscal.setBounds(110, 160, 50, 75);

    turrubares.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Turrubares.png")); // NOI18N
    turrubares.setName("Turrubares"); // NOI18N
    turrubares.setRequestFocusEnabled(false);
    turrubares.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(turrubares);
    turrubares.setBounds(90, 160, 40, 75);

    desamparados.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Desamparados.png")); // NOI18N
    desamparados.setName("Desamparados"); // NOI18N
    desamparados.setRequestFocusEnabled(false);
    desamparados.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(desamparados);
    desamparados.setBounds(190, 150, 40, 60);

    mora.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Mora.png")); // NOI18N
    mora.setName("Mora"); // NOI18N
    mora.setRequestFocusEnabled(false);
    mora.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(mora);
    mora.setBounds(120, 150, 80, 42);

    santaAna.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Santa Ana.png")); // NOI18N
    santaAna.setName("Santa Ana"); // NOI18N
    santaAna.setRequestFocusEnabled(false);
    santaAna.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(santaAna);
    santaAna.setBounds(180, 120, 50, 50);

    escazu.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Escazú.png")); // NOI18N
    escazu.setName("Escazú"); // NOI18N
    escazu.setRequestFocusEnabled(false);
    escazu.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(escazu);
    escazu.setBounds(200, 110, 40, 60);

    alajuelita.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Alajuelita.png")); // NOI18N
    alajuelita.setName("Alajuelita"); // NOI18N
    alajuelita.setRequestFocusEnabled(false);
    alajuelita.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(alajuelita);
    alajuelita.setBounds(210, 120, 40, 60);

    tibas.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Tibás.png")); // NOI18N
    tibas.setName("Tibás"); // NOI18N
    tibas.setRequestFocusEnabled(false);
    tibas.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(tibas);
    tibas.setBounds(180, 110, 30, 30);

    curridabat.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Curridabat.png")); // NOI18N
    curridabat.setName("Curridabat"); // NOI18N
    curridabat.setRequestFocusEnabled(false);
    curridabat.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(curridabat);
    curridabat.setBounds(240, 130, 30, 20);

    montesDeOca.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Montes de Oca.png")); // NOI18N
    montesDeOca.setName("Montes De Oca"); // NOI18N
    montesDeOca.setRequestFocusEnabled(false);
    montesDeOca.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(montesDeOca);
    montesDeOca.setBounds(240, 120, 30, 10);

    goicoechea.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Goicoechea.png")); // NOI18N
    goicoechea.setName("Goicoechea"); // NOI18N
    goicoechea.setRequestFocusEnabled(false);
    goicoechea.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(goicoechea);
    goicoechea.setBounds(220, 100, 50, 40);

    vazquezDeCoronado.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Vásquez de Coronado.png")); // NOI18N
    vazquezDeCoronado.setName("Vásquez de Coronado"); // NOI18N
    vazquezDeCoronado.setRequestFocusEnabled(false);
    vazquezDeCoronado.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(vazquezDeCoronado);
    vazquezDeCoronado.setBounds(220, 50, 60, 90);

    moravia.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Moravia.png")); // NOI18N
    moravia.setName("Moravia"); // NOI18N
    moravia.setRequestFocusEnabled(false);
    moravia.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(moravia);
    moravia.setBounds(220, 90, 20, 30);

    sanJose.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\San José.png")); // NOI18N
    sanJose.setName("San José"); // NOI18N
    sanJose.setRequestFocusEnabled(false);
    sanJose.setVerifyInputWhenFocusTarget(false);
    sanJoseProvincia.add(sanJose);
    sanJose.setBounds(200, 100, 60, 50);

    getContentPane().add(sanJoseProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 400, 380));

    sarapiqui.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Sarapiquí.png")); // NOI18N
    sarapiqui.setName("Sarapiquí"); // NOI18N
    herediaProvincia.add(sarapiqui);
    sarapiqui.setBounds(170, 80, 90, 120);

    heredia.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Heredia.png")); // NOI18N
    heredia.setName("Heredia"); // NOI18N
    herediaProvincia.add(heredia);
    heredia.setBounds(170, 160, 70, 70);

    santaBarbara.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Santa Bárbara.png")); // NOI18N
    santaBarbara.setName("Santa Bárbara"); // NOI18N
    herediaProvincia.add(santaBarbara);
    santaBarbara.setBounds(170, 190, 30, 60);

    barva.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Barva.png")); // NOI18N
    barva.setName("Barba"); // NOI18N
    herediaProvincia.add(barva);
    barva.setBounds(180, 200, 40, 50);

    sanRafael.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\San Rafael.png")); // NOI18N
    sanRafael.setName("San Rafael"); // NOI18N
    herediaProvincia.add(sanRafael);
    sanRafael.setBounds(210, 200, 20, 30);

    sanIsidro.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\San Isidro.png")); // NOI18N
    sanIsidro.setName("San Isidro"); // NOI18N
    herediaProvincia.add(sanIsidro);
    sanIsidro.setBounds(200, 240, 25, 24);

    santoDomingo.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Santo Domingo.png")); // NOI18N
    santoDomingo.setName("Santo Domingo"); // NOI18N
    herediaProvincia.add(santoDomingo);
    santoDomingo.setBounds(200, 220, 50, 30);

    sanPablo.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\San Pablo.png")); // NOI18N
    sanPablo.setName("San Pablo"); // NOI18N
    herediaProvincia.add(sanPablo);
    sanPablo.setBounds(200, 220, 25, 20);

    flores.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Flores.png")); // NOI18N
    flores.setName("Flores"); // NOI18N
    herediaProvincia.add(flores);
    flores.setBounds(190, 240, 25, 30);

    belen.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Belén.png")); // NOI18N
    belen.setName("Belén"); // NOI18N
    herediaProvincia.add(belen);
    belen.setBounds(170, 240, 30, 20);

    getContentPane().add(herediaProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 400, 380));

    sanCarlos.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\San Carlos.png")); // NOI18N
    sanCarlos.setName("San Carlos"); // NOI18N
    alajuelaProvincia.add(sanCarlos);
    sanCarlos.setBounds(170, 110, 120, 118);

    losChiles.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Los Chiles.png")); // NOI18N
    losChiles.setName("Los Chiles"); // NOI18N
    alajuelaProvincia.add(losChiles);
    losChiles.setBounds(170, 100, 75, 60);

    guatuso.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Guatuso.png")); // NOI18N
    guatuso.setName("Guatuso"); // NOI18N
    alajuelaProvincia.add(guatuso);
    guatuso.setBounds(150, 120, 80, 65);

    upala.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Upala.png")); // NOI18N
    upala.setName("Upala"); // NOI18N
    alajuelaProvincia.add(upala);
    upala.setBounds(110, 90, 75, 70);

    sanRamon.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\San Ramón.png")); // NOI18N
    sanRamon.setName("San Ramón"); // NOI18N
    alajuelaProvincia.add(sanRamon);
    sanRamon.setBounds(190, 190, 70, 80);

    alajuela.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Alajuela.png")); // NOI18N
    alajuela.setName("Alajuela"); // NOI18N
    alajuelaProvincia.add(alajuela);
    alajuela.setBounds(250, 200, 50, 75);

    valverdeVega.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Valverde Vega.png")); // NOI18N
    valverdeVega.setName("Valverde Vega"); // NOI18N
    alajuelaProvincia.add(valverdeVega);
    valverdeVega.setBounds(260, 220, 25, 30);

    alfaro.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Alfaro Ruiz.png")); // NOI18N
    alfaro.setName("Alfaro"); // NOI18N
    alajuelaProvincia.add(alfaro);
    alfaro.setBounds(240, 220, 20, 20);

    naranjo.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Naranjo.png")); // NOI18N
    naranjo.setName("Naranjo"); // NOI18N
    alajuelaProvincia.add(naranjo);
    naranjo.setBounds(250, 220, 20, 50);

    grecia.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Grecia.png")); // NOI18N
    grecia.setName("Grecia"); // NOI18N
    alajuelaProvincia.add(grecia);
    grecia.setBounds(230, 170, 70, 100);

    poas.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Poás.png")); // NOI18N
    poas.setName("Poás"); // NOI18N
    alajuelaProvincia.add(poas);
    poas.setBounds(270, 220, 20, 40);

    palmares.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Palmares.png")); // NOI18N
    palmares.setName("Palmares"); // NOI18N
    alajuelaProvincia.add(palmares);
    palmares.setBounds(240, 240, 20, 30);

    atenas.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Atenas.png")); // NOI18N
    atenas.setName("Atenas"); // NOI18N
    alajuelaProvincia.add(atenas);
    atenas.setBounds(250, 260, 20, 20);

    sanMateo.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\San Mateo.png")); // NOI18N
    sanMateo.setName("San Mateo"); // NOI18N
    alajuelaProvincia.add(sanMateo);
    sanMateo.setBounds(240, 260, 25, 20);

    orotina.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Orotina.png")); // NOI18N
    orotina.setName("Orotina"); // NOI18N
    alajuelaProvincia.add(orotina);
    orotina.setBounds(240, 270, 30, 20);

    getContentPane().add(alajuelaProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 400, 380));

    liberia.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Liberia.png")); // NOI18N
    liberia.setName("Liberia"); // NOI18N
    guanacasteProvincia.add(liberia);
    liberia.setBounds(140, 80, 90, 110);

    laCruz1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\La Cruz.png")); // NOI18N
    laCruz1.setName("La Cruz"); // NOI18N
    guanacasteProvincia.add(laCruz1);
    laCruz1.setBounds(100, 50, 130, 70);

    bagaces.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Bagaces.png")); // NOI18N
    bagaces.setName("Bagaces"); // NOI18N
    guanacasteProvincia.add(bagaces);
    bagaces.setBounds(190, 110, 80, 110);

    carrillo.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Carrillo.png")); // NOI18N
    carrillo.setName("Carillo"); // NOI18N
    guanacasteProvincia.add(carrillo);
    carrillo.setBounds(100, 120, 110, 90);

    santaCruz.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Santa Cruz.png")); // NOI18N
    santaCruz.setName("Santa Cruz"); // NOI18N
    guanacasteProvincia.add(santaCruz);
    santaCruz.setBounds(90, 150, 110, 130);

    nicoya.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Nicoya.png")); // NOI18N
    nicoya.setName("Nicoya"); // NOI18N
    guanacasteProvincia.add(nicoya);
    nicoya.setBounds(130, 190, 120, 100);

    hojancha.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Hojancha.png")); // NOI18N
    hojancha.setName("Hojancha"); // NOI18N
    guanacasteProvincia.add(hojancha);
    hojancha.setBounds(170, 230, 60, 80);

    cannas.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Cañas.png")); // NOI18N
    cannas.setName("Cañas"); // NOI18N
    guanacasteProvincia.add(cannas);
    cannas.setBounds(210, 110, 100, 130);

    tilaran.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Tilarán.png")); // NOI18N
    tilaran.setName("Tilarán"); // NOI18N
    guanacasteProvincia.add(tilaran);
    tilaran.setBounds(260, 130, 70, 70);

    abangares.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Abangares.png")); // NOI18N
    abangares.setName("Abangares"); // NOI18N
    guanacasteProvincia.add(abangares);
    abangares.setBounds(230, 190, 110, 50);

    nandayure1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Nandayure.png")); // NOI18N
    nandayure1.setName("Nandayure"); // NOI18N
    guanacasteProvincia.add(nandayure1);
    nandayure1.setBounds(190, 240, 90, 90);

    getContentPane().add(guanacasteProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 400, 380));

    guacimo.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Guácimo.png")); // NOI18N
    guacimo.setName("Guácimo"); // NOI18N
    limonProvincia.add(guacimo);
    guacimo.setBounds(120, 110, 70, 70);

    matina.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Matina.png")); // NOI18N
    matina.setName("Matina"); // NOI18N
    limonProvincia.add(matina);
    matina.setBounds(170, 130, 60, 70);

    limon.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Limón.png")); // NOI18N
    limon.setName("Limón"); // NOI18N
    limonProvincia.add(limon);
    limon.setBounds(150, 140, 130, 120);

    siquirres.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Siquirres.png")); // NOI18N
    siquirres.setName("Siquirres"); // NOI18N
    limonProvincia.add(siquirres);
    siquirres.setBounds(140, 120, 80, 60);

    talamanca.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Talamanca.png")); // NOI18N
    talamanca.setName("Talamanca"); // NOI18N
    limonProvincia.add(talamanca);
    talamanca.setBounds(150, 190, 170, 130);

    pococi.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Pococí.png")); // NOI18N
    pococi.setName("Pococí"); // NOI18N
    limonProvincia.add(pococi);
    pococi.setBounds(100, 50, 100, 100);

    getContentPane().add(limonProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 400, 370));

    jLayeredPane11.add(jLayeredPane2);
    jLayeredPane2.setBounds(540, 60, 0, 0);

    guanacasteProv.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Guanacaste Provincia.png")); // NOI18N
    guanacasteProv.setName("Guanacaste"); // NOI18N
    jLayeredPane11.add(guanacasteProv);
    guanacasteProv.setBounds(30, -10, 240, 220);

    herediaProv.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Heredia Provincia_.png")); // NOI18N
    herediaProv.setName("Heredia"); // NOI18N
    jLayeredPane11.add(herediaProv);
    herediaProv.setBounds(300, 40, 150, 140);

    cartagoProv1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Cartago Provincia.png")); // NOI18N
    cartagoProv1.setName("Cartago"); // NOI18N
    jLayeredPane11.add(cartagoProv1);
    cartagoProv1.setBounds(320, 130, 190, 140);

    sanJoseProv1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\San José Provincia.png")); // NOI18N
    sanJoseProv1.setName("San José"); // NOI18N
    jLayeredPane11.add(sanJoseProv1);
    sanJoseProv1.setBounds(280, 130, 200, 210);

    alajuelaProv.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Alajuela Provincia.png")); // NOI18N
    alajuelaProv.setName("Alajuela"); // NOI18N
    jLayeredPane11.add(alajuelaProv);
    alajuelaProv.setBounds(140, 10, 240, 200);

    herediaProv1.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Heredia Provincia_.png")); // NOI18N
    jLayeredPane11.add(herediaProv1);
    herediaProv1.setBounds(280, 50, 150, 140);

    limonProv.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Limón Provincia.png")); // NOI18N
    limonProv.setName("Limón"); // NOI18N
    jLayeredPane11.add(limonProv);
    limonProv.setBounds(310, 10, 320, 325);

    puntarenasProv.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Puntarenas Provincia.png")); // NOI18N
    puntarenasProv.setName("Puntarenas"); // NOI18N
    jLayeredPane11.add(puntarenasProv);
    puntarenasProv.setBounds(160, 110, 460, 393);

    getContentPane().add(jLayeredPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 690, 490));

    turrialba.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Turrialba.png")); // NOI18N
    turrialba.setName("Turrialba"); // NOI18N
    cartagoProvincia.add(turrialba);
    turrialba.setBounds(200, 140, 110, 120);

    oreamuno.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Oreamuno.png")); // NOI18N
    oreamuno.setName("Oreamuno"); // NOI18N
    cartagoProvincia.add(oreamuno);
    oreamuno.setBounds(140, 90, 40, 60);

    paraiso.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Paraíso.png")); // NOI18N
    paraiso.setName("Paraíso"); // NOI18N
    cartagoProvincia.add(paraiso);
    paraiso.setBounds(150, 160, 100, 120);

    elGuarco.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\El Guarco.png")); // NOI18N
    elGuarco.setName("El Guarco"); // NOI18N
    cartagoProvincia.add(elGuarco);
    elGuarco.setBounds(120, 190, 90, 90);

    laUnion.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\La Unión.png")); // NOI18N
    laUnion.setName("La Unión"); // NOI18N
    cartagoProvincia.add(laUnion);
    laUnion.setBounds(110, 140, 70, 57);

    alvarado.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Alvarado.png")); // NOI18N
    alvarado.setName("Alvarado"); // NOI18N
    cartagoProvincia.add(alvarado);
    alvarado.setBounds(160, 100, 40, 70);

    cartago.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Cartago.png")); // NOI18N
    cartago.setName("Cartago"); // NOI18N
    cartagoProvincia.add(cartago);
    cartago.setBounds(110, 160, 100, 110);

    jimenez.setIcon(new javax.swing.ImageIcon("C:\\Users\\felip\\Downloads\\TamCorrecto\\Jiménez.png")); // NOI18N
    jimenez.setName("Jiménez"); // NOI18N
    cartagoProvincia.add(jimenez);
    jimenez.setBounds(170, 130, 80, 130);

    getContentPane().add(cartagoProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 400, 380));

    jLabel1.setBackground(new java.awt.Color(255, 255, 255));
    jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 100)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Costa Rica");
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

    cerrar.setBackground(new java.awt.Color(204, 0, 0));
    cerrar.setText("X");
    cerrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cerrarActionPerformed(evt);
      }
    });
    getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, -1, -1));

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
    this.dispose();
  }//GEN-LAST:event_cerrarActionPerformed

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
      java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Mapa().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel abangares;
  private javax.swing.JLabel acosta;
  private javax.swing.JLabel aguirre;
  private javax.swing.JLabel aguirre1;
  private javax.swing.JLabel alajuela;
  private javax.swing.JLabel alajuelaProv;
  private javax.swing.JLayeredPane alajuelaProvincia;
  private javax.swing.JLabel alajuelita;
  private javax.swing.JLabel alfaro;
  private javax.swing.JLabel alvarado;
  private javax.swing.JLabel aserri;
  private javax.swing.JLabel atenas;
  private javax.swing.JLabel bagaces;
  private javax.swing.JLabel barva;
  private javax.swing.JLabel belen;
  private javax.swing.JLabel buenosAires;
  private javax.swing.JLabel buenosAires1;
  private javax.swing.JLabel cannas;
  private javax.swing.JLabel carrillo;
  private javax.swing.JLabel cartago;
  private javax.swing.JLabel cartagoProv1;
  private javax.swing.JLayeredPane cartagoProvincia;
  private javax.swing.JButton cerrar;
  private javax.swing.JLabel corredores;
  private javax.swing.JLabel corredores1;
  private javax.swing.JLabel cotoBrus;
  private javax.swing.JLabel cotoBrus1;
  private javax.swing.JLabel curridabat;
  private javax.swing.JLabel desamparados;
  private javax.swing.JLabel dota;
  private javax.swing.JLabel elGuarco;
  private javax.swing.JLabel escazu;
  private javax.swing.JLabel esparza;
  private javax.swing.JLabel esparza1;
  private javax.swing.JLabel flores;
  private javax.swing.JLabel garabito;
  private javax.swing.JLabel garabito1;
  private javax.swing.JLabel goicoechea;
  private javax.swing.JLabel golfito;
  private javax.swing.JLabel golfito1;
  private javax.swing.JLabel grecia;
  private javax.swing.JLabel guacimo;
  private javax.swing.JLabel guanacasteProv;
  private javax.swing.JLayeredPane guanacasteProvincia;
  private javax.swing.JLabel guatuso;
  private javax.swing.JLabel heredia;
  private javax.swing.JLabel herediaProv;
  private javax.swing.JLabel herediaProv1;
  private javax.swing.JLayeredPane herediaProvincia;
  private javax.swing.JLabel hojancha;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLayeredPane jLayeredPane1;
  private javax.swing.JLayeredPane jLayeredPane10;
  private javax.swing.JLayeredPane jLayeredPane11;
  private javax.swing.JLayeredPane jLayeredPane2;
  private javax.swing.JLayeredPane jLayeredPane3;
  private javax.swing.JLayeredPane jLayeredPane4;
  private javax.swing.JLayeredPane jLayeredPane5;
  private javax.swing.JLayeredPane jLayeredPane6;
  private javax.swing.JLayeredPane jLayeredPane7;
  private javax.swing.JLayeredPane jLayeredPane8;
  private javax.swing.JLayeredPane jLayeredPane9;
  private javax.swing.JLabel jimenez;
  private javax.swing.JLabel laCruz1;
  private javax.swing.JLabel laUnion;
  private javax.swing.JLabel leonCortesCastro;
  private javax.swing.JLabel liberia;
  private javax.swing.JLabel limon;
  private javax.swing.JLabel limonProv;
  private javax.swing.JLayeredPane limonProvincia;
  private javax.swing.JLabel losChiles;
  private javax.swing.JLabel matina;
  private javax.swing.JLabel montesDeOca;
  private javax.swing.JLabel montesDeOro;
  private javax.swing.JLabel montesDeOro1;
  private javax.swing.JLabel mora;
  private javax.swing.JLabel moravia;
  private javax.swing.JLabel nandayure1;
  private javax.swing.JLabel naranjo;
  private javax.swing.JLabel nicoya;
  private javax.swing.JLabel oreamuno;
  private javax.swing.JLabel orotina;
  private javax.swing.JLabel osa;
  private javax.swing.JLabel osa1;
  private javax.swing.JLabel palmares;
  private javax.swing.JLabel paraiso;
  private javax.swing.JLabel parrita;
  private javax.swing.JLabel parrita1;
  private javax.swing.JLabel perezZeledon;
  private javax.swing.JLabel poas;
  private javax.swing.JLabel pococi;
  private javax.swing.JLabel puntarenas;
  private javax.swing.JLabel puntarenas1;
  private javax.swing.JLabel puntarenasProv;
  private javax.swing.JLayeredPane puntarenasProvincia;
  private javax.swing.JLabel puriscal;
  private javax.swing.JLabel sanCarlos;
  private javax.swing.JLabel sanIsidro;
  private javax.swing.JLabel sanJose;
  private javax.swing.JLabel sanJoseProv1;
  private javax.swing.JLayeredPane sanJoseProvincia;
  private javax.swing.JLabel sanMateo;
  private javax.swing.JLabel sanPablo;
  private javax.swing.JLabel sanRafael;
  private javax.swing.JLabel sanRamon;
  private javax.swing.JLabel santaAna;
  private javax.swing.JLabel santaBarbara;
  private javax.swing.JLabel santaCruz;
  private javax.swing.JLabel santoDomingo;
  private javax.swing.JLabel sarapiqui;
  private javax.swing.JLabel siquirres;
  private javax.swing.JLabel talamanca;
  private javax.swing.JLabel tarrazu;
  private javax.swing.JLabel tibas;
  private javax.swing.JLabel tilaran;
  private javax.swing.JLabel turrialba;
  private javax.swing.JLabel turrubares;
  private javax.swing.JLabel upala;
  private javax.swing.JLabel valverdeVega;
  private javax.swing.JLabel vazquezDeCoronado;
  // End of variables declaration//GEN-END:variables
}
