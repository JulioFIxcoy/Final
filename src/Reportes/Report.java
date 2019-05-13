/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import Archivos.RecuperarPlantilla;
import Clases.Jugador;
import Vistas.Principal;
import static Vistas.Principal.idioma;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Julio
 */
public class Report {
    /**
     * genera el reporte de los jugadores  en html5
     */
    public void writeReport(){
         FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            
            
            fichero = new FileWriter(Principal.mkdirReportes+"report"+File.separatorChar+"ListadoJugadores"+".html");
            pw = new PrintWriter(fichero);
        
        
            
        
        
        
        File jugadores = new File(Principal.mkdirPlayer);
                pw.println("<!DOCTYPE HTML>\n" +
                            "<html>\n" +
                            "	<head>\n" +
                            "		<title>Reportes</title>\n" +
                            "		<meta charset=\"utf-8\" />\n" +
                            "		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n" +
                            "		<meta name=\"description\" content=\"\" />\n" +
                            "		<meta name=\"keywords\" content=\"\" />\n" +
                   //         "		<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n" +
                            "	</head>"+
                        "	<body >");
                
                pw.println("<h1>Listado De Jugadores </h1>");
                pw.println("	<table style=\"border-collapse: collapse;\">");
                pw.println("<tr>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">"+idioma.getProperty("nombre")+"</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">Nivel</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">Oro</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">Experiencia</th>\n" +
                            "	    <th style=\"border: 1px solid #000000;\">Juegos</th>\n" +
                            "</tr>");
            
        for (String string : jugadores.list()) {
            if (string.contains(".player")) {
               RecuperarPlantilla<Jugador> importar = new RecuperarPlantilla<>();
               Jugador recuperado = importar.recuperar(Principal.mkdirPlayer, string, "");
                pw.println(" <tr>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+recuperado.getNombre()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+recuperado.getNivel()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+recuperado.getOro()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+recuperado.getExperiencia()+"</td>\n" +
                            "	    <td style=\"border: 1px solid #000000;\">"+recuperado.getCantidadDeJuegos()+"</td>\n" +
                            "	  </tr>");
                
            }
        }
        pw.println("</body>"+
                "</html>");

                
                

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    /*
	  
	  <tr>
	    <td style="border: 1px solid #000000;">21/03/2018</td>
	    <td style="border: 1px solid #000000;">CARGO</td>
	    <td style="border: 1px solid #000000;">Compra de gasolina</td>
	    <td style="border: 1px solid #000000;">Gasolinera</td>
	    <td style="border: 1px solid #000000;">257.25</td>
	  </tr>
	  <tr>
	    <td style="border: 1px solid #000000;">10/04/2018</td>
	    <td style="border: 1px solid #000000;">CARGO</td>
	    <td style="border: 1px solid #000000;">Abarrotes</td>
	    <td style="border: 1px solid #000000;">WMart</td>
	    <td style="border: 1px solid #000000;">325.15</td>
	  </tr>
	</table>
    */
    }
}
