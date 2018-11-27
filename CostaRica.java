/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Felipe Pacheco Cerdas
 * @author Kendall Tenorio Chevez
 */
public class CostaRica {

  Canton[] cantones;
  CantonFactory fabricaCantones;
  /*
  * El constructor de la clase CostaRica
  */
  public CostaRica() {
    cantones = new Canton[81];
    fabricaCantones = new CantonFactory();
    JSONParser parser = new JSONParser();

    try {
      JSONArray arregloElementosJson = (JSONArray) parser.parse(new FileReader("Data.json"));
      for (int i = 0; i < arregloElementosJson.size(); i++) {
        JSONObject cantonData = (JSONObject) arregloElementosJson.get(i);

        String pNombre = cantonData.get("Nombre").toString();
        int pCantHabitantes = Integer.parseInt(cantonData.get("Población total").toString());
        int pSuperficie = Integer.parseInt(cantonData.get("Superficie (km2)").toString());
        int pDensisadXkm2 = Integer.parseInt(cantonData.get("Densidad de población-Personas por km2").toString());
        int pPersonasUrbanasX100 = Integer.parseInt(cantonData.get("Porcentaje de población urbana-Personas que viven en zona urbana por cada 100").toString());
        int pHombresX100Mujeres = Integer.parseInt(cantonData.get("Relación hombres-mujeres-Hombres por cada 100 mujeres").toString());
        int pDependientesX100Productivas = Integer.parseInt(cantonData.get("Relación de dependencia demográfica-Personas dependientes (menores de 15 años o de 65 y más) por cada 100 personas en edad productiva (15 a 64 años)").toString());
        int pCantViviendas = Integer.parseInt(cantonData.get("Viviendas individuales ocupadas").toString());
        int pPersonasXVivienda = Integer.parseInt(cantonData.get("Promedio de ocupantes-Promedio de personas por vivienda individual ocupada").toString());
        int pPorViviendasBuenEstado = Integer.parseInt(cantonData.get("Porcentaje de viviendas en buen estado").toString());
        int pPorViviendasHacinadas = Integer.parseInt(cantonData.get("Porcentaje de viviendas hacinadas").toString());
        int pPorAlfabetismo = Integer.parseInt(cantonData.get("Porcentaje de alfabetismo").toString());
        int pPaDe10a24 = Integer.parseInt(cantonData.get("10 a 24 años").toString());
        int pPaDe24aMas = Integer.parseInt(cantonData.get("25 y más años").toString());
        int pEscolaridadPromedio = Integer.parseInt(cantonData.get("Escolaridad promedio").toString());
        int pEpDe25a49 = Integer.parseInt(cantonData.get("25 a 49 años").toString());
        int pEpDe50aMas = Integer.parseInt(cantonData.get("50 o más años").toString());
        int pEpDe5a17 = Integer.parseInt(cantonData.get("5 a 17 años").toString());
        int pEpDe18a24 = Integer.parseInt(cantonData.get("18 a 24 años").toString());
        int pPorDesempleo = Integer.parseInt(cantonData.get("Personas fuera de la fuerza de trabajo (15 años y más)").toString());
        int pParticipacion = Integer.parseInt(cantonData.get("Tasa neta de participación").toString());
        int pParticipacionHombres = Integer.parseInt(cantonData.get("Hombres").toString());
        int pParticipacionMujeres = Integer.parseInt(cantonData.get("Mujeres").toString());
        int pPorOcupadaNoAsegurada = Integer.parseInt(cantonData.get("Porcentaje de población ocupada no asegurada").toString());
        int pPorExtranjera = Integer.parseInt(cantonData.get("Porcentaje de población nacida en el extranjero").toString());
        int pPorDiscapacidad = Integer.parseInt(cantonData.get("Porcentaje de población con discapacidad").toString());
        int pPorNoAsegurada = Integer.parseInt(cantonData.get("Porcentaje de población no asegurada").toString());
        int pPorJefaturaFemenina = Integer.parseInt(cantonData.get("Porcentaje de hogares con jefatura femenina").toString());

        cantones[i] = fabricaCantones.crearCanton(pNombre, pCantHabitantes, pSuperficie, pDensisadXkm2, pPersonasUrbanasX100, pHombresX100Mujeres, pDependientesX100Productivas, pCantViviendas, pPersonasXVivienda, pPorViviendasBuenEstado, pPorViviendasHacinadas, pPorAlfabetismo, pPaDe10a24, pPaDe24aMas, pEscolaridadPromedio, pEpDe25a49, pEpDe50aMas, pEpDe5a17, pEpDe18a24, pPorDesempleo, pParticipacion, pParticipacionHombres, pParticipacionMujeres, pPorOcupadaNoAsegurada, pPorExtranjera, pPorDiscapacidad, pPorNoAsegurada, pPorJefaturaFemenina);
      }
    } catch (FileNotFoundException e) {
      //e.printStackTrace();
    } catch (IOException e) {
      //e.printStackTrace();
    } catch (ParseException e) {
      //e.printStackTrace(); 
    } catch (Exception e) {
      //e.printStackTrace(); 
    }
  }

  public Canton getCanton(String nombre) {
    for (Canton canton : cantones) {
      if (canton.getNombre().equals(nombre)) {
        return canton;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    CostaRica costaRica = new CostaRica();
  }

}
