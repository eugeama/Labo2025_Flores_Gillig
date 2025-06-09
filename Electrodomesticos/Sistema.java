package Electrodomesticos;

import java.util.ArrayList;

public class Sistema {
    ArrayList<EquipoSonido>equiposSonido;
    ArrayList<Televisor>televisores;
    ArrayList<CargadorPortatil>cargadores;



    public void agregarEquipoSonido (EquipoSonido nuevoEquipo){
        equiposSonido.add(nuevoEquipo);
    }

    public void eliminarEquipoSonido (EquipoSonido nuevoEquipo){
        for (EquipoSonido sonido: equiposSonido){
            if(sonido.equals(nuevoEquipo)){
                equiposSonido.remove(nuevoEquipo);
            }
        }
    }

    public void modificarEquipoSonido(EquipoSonido nuevoEquipo, EquipoSonido viejoEquipo){
        for (EquipoSonido sonido: equiposSonido){
            if(sonido.equals(viejoEquipo)){
                equiposSonido.remove(viejoEquipo);
                equiposSonido.add(nuevoEquipo);
            }
        }
    }


    public void agregarTelevisor(Televisor nuevoTelevisor){
        televisores.add(nuevoTelevisor);
    }

    public void eliminarTelevisor (Televisor nuevoTelevisor){
        for (Televisor tele: televisores){
            if(tele.equals(nuevoTelevisor)){
                televisores.remove(nuevoTelevisor);
            }
        }
    }

    public void modificarTelevisor (Televisor nuevoTelevisor, Televisor viejoTelevisor){
        for (Televisor tele: televisores){
            if(tele.equals(viejoTelevisor)){
                televisores.remove(viejoTelevisor);
                televisores.add(nuevoTelevisor);
            }
        }
    }


    public void agregarCargador (CargadorPortatil nuevoCargador){
        cargadores.add(nuevoCargador);
    }

    public void eliminarCargador (CargadorPortatil nuevoCargador){
        for (CargadorPortatil cargador: cargadores){
            if(cargador.equals(nuevoCargador)){
                cargadores.remove(nuevoCargador);
            }
        }
    }

    public void modificarCargador (CargadorPortatil nuevoCargador, CargadorPortatil viejoCargador){
        for (CargadorPortatil cargador: cargadores){
            if(cargador.equals(viejoCargador)){
                cargadores.remove(viejoCargador);
                cargadores.add(nuevoCargador);
            }
        }
    }



}
