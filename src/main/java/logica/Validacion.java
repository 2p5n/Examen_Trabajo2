package logica;

import java.util.Scanner;
import modelo.Celular;
import modelo.Recargas;
import modelo.Cliente;

public class Validacion {

    Scanner sc = new Scanner(System.in);

    public void validarEstadoCelularPorcetanje(int n, Celular cl, Recargas rc, Cliente cli) throws Exception {
        int gb = 5000;
        int porcentaje;
        int total;
        int megas;
        int saldo;
        int valor = rc.getValor(); 
        total = gb * valor;

        if (n == 1) {
            System.out.println("Cuanto % de megas desea: ");
            porcentaje = sc.nextInt();
            megas = (int) (total * (porcentaje / 100.0));
            saldo = total - megas;

            rc.setMegas(megas);
            rc.setSaldo(saldo);
            cl.setSaldo(saldo);
            cl.setMegas(megas);
        } else {
            System.out.println("Su telefono no esta activo");
        }
    }

    public void validarEstadoCelularDistribucion(int n, Celular cl, Recargas rc, Cliente cli) throws Exception {
        int gb = 5000;
        int total;
        double megas;
        double saldo;
        int valor = rc.getValor();
        total = gb * valor;

        if (n == 1) {
            megas = total * 0.33;
            saldo = total * 0.66;

            rc.setMegas(megas);
            rc.setSaldo(saldo);
            cl.setMegas(megas);
            cl.setSaldo(saldo);
        } else {
            System.out.println("Su telefono no esta activo");
        }
    }
}
