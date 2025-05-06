package presentacion;

import logica.CelularJpaController;
import logica.ClienteJpaController;
import logica.RecargasJpaController;
import logica.Validacion;
import modelo.Celular;
import modelo.Cliente;
import modelo.Recargas;

public class Examen_Trabajo2 {

    public static void main(String[] args) throws Exception {
        Celular cel = new Celular(2, 1, "34567");
        Cliente cli = new Cliente(2, 21323, "Juan", "Alimaña");
        Recargas rec = new Recargas(2, 2);

        CelularJpaController jpaCel = new CelularJpaController();
        ClienteJpaController jpaCli = new ClienteJpaController();
        RecargasJpaController jpaRc = new RecargasJpaController();

        Validacion vali = new Validacion();

        vali.validarEstadoCelularDistribucion(cel.getEstado(), cel, rec, cli);

        jpaCel.create(cel);
        jpaCli.create(cli);
        jpaRc.create(rec);
    }
}
