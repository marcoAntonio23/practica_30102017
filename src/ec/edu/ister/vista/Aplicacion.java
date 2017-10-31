package ec.edu.ister.vista;

import ec.edu.ister.modelo.ControlFlujo;
import ec.edu.ister.modelo.OperacionesBasicas;
import javax.swing.JOptionPane;

public class Aplicacion {
    public static void main(String[] args) {
        String sopcion;
        int opcion;
            sopcion= JOptionPane.showInputDialog("MENUn1.CONTRO FLUJO2.OPERACIONES BASICAS3.SALIR");
            opcion=Integer.parseInt(sopcion);
            switch (opcion)
            {
                case 1:
                    int m = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese #"));
                    int n = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese #"));
                    OperacionesBasicas.sumaConParametros(m,n);
                case 2:
                    ControlFlujo.ifAnidado();
                    break;
            }
          }
        }
