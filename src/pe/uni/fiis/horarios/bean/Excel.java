package pe.uni.fiis.horarios.bean;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Henry on 05/06/2015.
 */
public class Excel {
    public static void main(String[] args) throws IOException {
        Workbook libro = new HSSFWorkbook();
        FileOutputStream archivo = new FileOutputStream("D:\\excel\\excel.xls");
        Sheet hoja_1 = libro.createSheet("Horario de Salidas en Aeropuerto");
        Sheet hoja_2 = libro.createSheet("Horario de Entradas en Aeropuerto");

        for(int f=0;f<3;f++){
            Row fila = hoja_1.createRow(f);
                Cell celda_0 = fila.createCell(0);
                Cell celda_1 = fila.createCell(1);
                Cell celda_2 = fila.createCell(2);
                Cell celda_3 = fila.createCell(3);
            if(f==0) {
                celda_0.setCellValue("IdVuelo");
                celda_1.setCellValue("Nombre_Vuelo");
                celda_2.setCellValue("Destino");
                celda_3.setCellValue("Partida");
            }
            if (f==1)
            {
                celda_0.setCellValue("AF 483");
                celda_1.setCellValue("Air France");
                celda_2.setCellValue("Paris");
                celda_3.setCellValue("Mon May 04 09:00");
            }
        }

        for(int f=0;f<3;f++){
            Row fila = hoja_2.createRow(f);
            Cell celda_0 = fila.createCell(0);
            Cell celda_1 = fila.createCell(1);
            Cell celda_2 = fila.createCell(2);
            Cell celda_3 = fila.createCell(3);
            if(f==0) {
                celda_0.setCellValue("IdVuelo");
                celda_1.setCellValue("Nombre_Vuelo");
                celda_2.setCellValue("Lugar_Origen");
                celda_3.setCellValue("Llegada");

            }
            if (f==1)
            {
                celda_0.setCellValue("KL2237");
                celda_1.setCellValue("KLM");
                celda_2.setCellValue("China");
                celda_3.setCellValue("Fri May 05 23:30");
            }
        }
        libro.write(archivo);
        archivo.close();

    }

}

