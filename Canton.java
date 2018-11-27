/**
 *
 * @author Felipe Cerdas Pacheco
 * @author Kendall Tenorio Chevez
 */
public class Canton {

  private String nombre;
  private int cantHabitantes;
  private int superficie;
  private int densisadXkm2;
  private int personasUrbanasX100;
  private int hombresX100Mujeres;
  private int dependientesX100Productivas;
  private int cantViviendas;
  private int personasXVivienda;
  private int porViviendasBuenEstado;
  private int porViviendasHacinadas;
  private int porAlfabetismo;
  private int paDe10a24;
  private int paDe24aMas;
  private int escolaridadPromedio;
  private int epDe25a49;
  private int epDe50aMas;
  private int epDe5a17;
  private int epDe18a24;
  private int porDesempleo;
  private int participacion;
  private int participacionHombres;
  private int participacionMujeres;
  private int porOcupadaNoAsegurada;
  private int porExtranjera;
  private int porDiscapacidad;
  private int porNoAsegurada;
  private int porJefaturaFemenina;
  /*
  * Constructor de la clase Canton
  */
  public Canton(String pNombre, int pCantHabitantes, int pSuperficie, int pDensisadXkm2, int pPersonasUrbanasX100, int pHombresX100Mujeres,
    int pDependientesX100Productivas, int pCantViviendas, int pPersonasXVivienda, int pPorViviendasBuenEstado, int pPorViviendasHacinadas,
    int pPorAlfabetismo, int pPaDe10a24, int pPaDe24aMas, int pEscolaridadPromedio, int pEpDe25a49, int pEpDe50aMas, int pEpDe5a17, int pEpDe18a24,
    int pPorDesempleo, int pParticipacion, int pParticipacionHombres, int pParticipacionMujeres, int pPorOcupadaNoAsegurada, int pPorExtranjera,
    int pPorDiscapacidad, int pPorNoAsegurada, int pPorJefaturaFemenina) {
    nombre = pNombre;
    cantHabitantes = pCantHabitantes;
    superficie = pSuperficie;
    densisadXkm2 = pDensisadXkm2;
    personasUrbanasX100 = pPersonasUrbanasX100;
    hombresX100Mujeres = pHombresX100Mujeres;
    dependientesX100Productivas = pDependientesX100Productivas;
    cantViviendas = pCantViviendas;
    personasXVivienda = pPersonasXVivienda;
    porViviendasBuenEstado = pPorViviendasBuenEstado;
    porViviendasHacinadas = pPorViviendasHacinadas;
    porAlfabetismo = pPorAlfabetismo;
    paDe10a24 = pPaDe10a24;
    paDe24aMas = pPaDe24aMas;
    escolaridadPromedio = pEscolaridadPromedio;
    epDe25a49 = pEpDe25a49;
    epDe50aMas = pEpDe50aMas;
    epDe5a17 = pEpDe5a17;
    epDe18a24 = pEpDe18a24;
    porDesempleo = pPorDesempleo;
    participacion = pParticipacion;
    participacionHombres = pParticipacionHombres;
    participacionMujeres = pParticipacionMujeres;
    porOcupadaNoAsegurada = pPorOcupadaNoAsegurada;
    porExtranjera = pPorExtranjera;
    porDiscapacidad = pPorDiscapacidad;
    porNoAsegurada = pPorNoAsegurada;
    porJefaturaFemenina = pPorJefaturaFemenina;
  }

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @return the cantHabitantes
   */
  public int getCantHabitantes() {
    return cantHabitantes;
  }

  /**
   * @return the superficie
   */
  public int getSuperficie() {
    return superficie;
  }

  /**
   * @return the densisadXkm2
   */
  public int getDensisadXkm2() {
    return densisadXkm2;
  }

  /**
   * @return the personasUrbanasX100
   */
  public int getPersonasUrbanasX100() {
    return personasUrbanasX100;
  }

  /**
   * @return the hombresX100Mujeres
   */
  public int getHombresX100Mujeres() {
    return hombresX100Mujeres;
  }

  /**
   * @return the dependientesX100Productivas
   */
  public int getDependientesX100Productivas() {
    return dependientesX100Productivas;
  }

  /**
   * @return the cantViviendas
   */
  public int getCantViviendas() {
    return cantViviendas;
  }

  /**
   * @return the personasXVivienda
   */
  public int getPersonasXVivienda() {
    return personasXVivienda;
  }

  /**
   * @return the porViviendasBuenEstado
   */
  public int getPorViviendasBuenEstado() {
    return porViviendasBuenEstado;
  }

  /**
   * @return the porViviendasHacinadas
   */
  public int getPorViviendasHacinadas() {
    return porViviendasHacinadas;
  }

  /**
   * @return the porAlfabetismo
   */
  public int getPorAlfabetismo() {
    return porAlfabetismo;
  }

  /**
   * @return the paDe10a24
   */
  public int getPaDe10a24() {
    return paDe10a24;
  }

  /**
   * @return the paDe24aMas
   */
  public int getPaDe24aMas() {
    return paDe24aMas;
  }

  /**
   * @return the escolaridadPromedio
   */
  public int getEscolaridadPromedio() {
    return escolaridadPromedio;
  }

  /**
   * @return the epDe25a49
   */
  public int getEpDe25a49() {
    return epDe25a49;
  }

  /**
   * @return the epDe50aMas
   */
  public int getEpDe50aMas() {
    return epDe50aMas;
  }

  /**
   * @return the epDe5a17
   */
  public int getEpDe5a17() {
    return epDe5a17;
  }

  /**
   * @return the epDe18a24
   */
  public int getEpDe18a24() {
    return epDe18a24;
  }

  /**
   * @return the porDesempleo
   */
  public int getPorDesempleo() {
    return porDesempleo;
  }

  /**
   * @return the participacion
   */
  public int getParticipacion() {
    return participacion;
  }

  /**
   * @return the participacionHombres
   */
  public int getParticipacionHombres() {
    return participacionHombres;
  }

  /**
   * @return the participacionMujeres
   */
  public int getParticipacionMujeres() {
    return participacionMujeres;
  }

  /**
   * @return the porOcupadaNoAsegurada
   */
  public int getPorOcupadaNoAsegurada() {
    return porOcupadaNoAsegurada;
  }

  /**
   * @return the porExtranjera
   */
  public int getPorExtranjera() {
    return porExtranjera;
  }

  /**
   * @return the porDiscapacidad
   */
  public int getPorDiscapacidad() {
    return porDiscapacidad;
  }

  /**
   * @return the porNoAsegurada
   */
  public int getPorNoAsegurada() {
    return porNoAsegurada;
  }

  /**
   * @return the porJefaturaFemenina
   */
  public int getPorJefaturaFemenina() {
    return porJefaturaFemenina;
  }

}
