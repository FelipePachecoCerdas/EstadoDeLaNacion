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
public class CantonFactory {

  public CantonFactory() {

  }
  /*
  * Crea un canton de modo factory
  */
  public Canton crearCanton(String pNombre, int pCantHabitantes, int pSuperficie, int pDensisadXkm2, int pPersonasUrbanasX100,
    int pHombresX100Mujeres, int pDependientesX100Productivas, int pCantViviendas, int pPersonasXVivienda, int pPorViviendasBuenEstado,
    int pPorViviendasHacinadas, int pPorAlfabetismo, int pPaDe10a24, int pPaDe24aMas, int pEscolaridadPromedio, int pEpDe25a49, int pEpDe50aMas,
    int pEpDe5a17, int pEpDe18a24, int pPorDesempleo, int pParticipacion, int pParticipacionHombres, int pParticipacionMujeres, int pPorOcupadaNoAsegurada,
    int pPorExtranjera, int pPorDiscapacidad, int pPorNoAsegurada, int pPorJefaturaFemenina) {
    return new Canton(pNombre, pCantHabitantes, pSuperficie, pDensisadXkm2, pPersonasUrbanasX100,
      pHombresX100Mujeres, pDependientesX100Productivas, pCantViviendas, pPersonasXVivienda, pPorViviendasBuenEstado,
      pPorViviendasHacinadas, pPorAlfabetismo, pPaDe10a24, pPaDe24aMas, pEscolaridadPromedio, pEpDe25a49, pEpDe50aMas,
      pEpDe5a17, pEpDe18a24, pPorDesempleo, pParticipacion, pParticipacionHombres, pParticipacionMujeres, pPorOcupadaNoAsegurada,
      pPorExtranjera, pPorDiscapacidad, pPorNoAsegurada, pPorJefaturaFemenina);
  }
}
