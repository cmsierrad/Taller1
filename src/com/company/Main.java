package com.company;

import clases.CapacidadEndedudamiento;
import clases.Constantes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String entrada = "SI";
        boolean correcto;

        while (entrada.equalsIgnoreCase("SI")) {
            int ingMesuales = 0;
            int gastosFijos = 0;
            int gastosVariables = 0;
            String entradaUsuario;

            // Instancia de la clase Endeudamiento.
            CapacidadEndedudamiento ce = new CapacidadEndedudamiento();

            // Preguntar al usuario el valor de los Ingresos Mensuales.
            correcto = true;
            do {
                System.out.print(Constantes.MONTO_INGRESOS_MENSUALES);
                entradaUsuario = in.nextLine();
                if (isNumeric(entradaUsuario)) {
                    ingMesuales = Integer.parseInt(entradaUsuario);
                    correcto = false;
                }
                ce.setIngresosTotales(ingMesuales);
            } while (correcto);

            // Preguntar al usuario el valor de los Gastos Fijos.
            correcto = true;
            do {
                System.out.print(Constantes.MONTO_GASTOS_FIJOS);
                entradaUsuario = in.nextLine();
                if (isNumeric(entradaUsuario)){
                    gastosFijos = Integer.parseInt(entradaUsuario);
                    correcto = false;
                }
                ce.setGastosFijos(gastosFijos);
            } while (correcto);

            // Preguntar al usuario el valor de los Gastos Variables.
            correcto = true;
            do {
                System.out.print(Constantes.MONTO_GASTOS_VARIABLES);
                entradaUsuario = in.nextLine();
                if (isNumeric(entradaUsuario)){
                    gastosVariables = Integer.parseInt(entradaUsuario);
                    correcto = false;
                }
                ce.setGastoVaribales(gastosVariables);
            } while (correcto);

            // Mostrar cálculo del Endeudamiento y valores para su cálculo.
            System.out.println(Constantes.LINEA_BLANCO);
            System.out.println(Constantes.VALOR_INGRESOS_MENSUALES + ce.getIngresosTotales());
            System.out.println(Constantes.VALOR_GASTOS_FIJOS + ce.getGastosFijos());
            System.out.println(Constantes.VALOR_GASTOS_VARIABLES + ce.getGastoVaribales());
            System.out.println(Constantes.VALOR_PORCENTAJE_FIJO + ce.getPOR_FIJO());
            System.out.println(Constantes.MONTO_ENDEUDAMIENTO + ce.getCapacidadEndeudamiento());

            // Preguntar al usuario si desea continuar.
            System.out.println(Constantes.LINEA_BLANCO);
            System.out.print(Constantes.CONTINUAR);
            entrada = in.nextLine();
        }
        in.close();
    }

    // Valida que el valor ingresado sea numérico y mayor de cero.
    public static boolean isNumeric(String value) {
        try {
            if (Double.parseDouble(value) > 0) {
                return true;
            }else{
                System.out.println(Constantes.ERROR_NUMERO_NEGATIVO);
                return false;
            }
        }

        catch (NumberFormatException e) {
            System.out.println(Constantes.ERROR_NO_NUMERICO);
            return false;
        }
    }
}



