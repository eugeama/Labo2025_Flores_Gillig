package Electrodomesticos;

import CurlingP.Equipo;

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


    public int stockTelevisor (){
        int cantTele= 0;
        for (Televisor tele: televisores) {
            cantTele = cantTele + 1;
        }
        return cantTele;
    }

    public int stockEquipoSonido (){
        int cantSonido= 0;
        for (EquipoSonido sonido: equiposSonido){
            cantSonido= cantSonido +1;
        }
        return cantSonido;
    }

    public int stockCargador(){
        int cantPortatil= 0;
        for (CargadorPortatil cargador: cargadores){
            cantPortatil= cantPortatil+1;
        }
        return cantPortatil;
    }

    public String mayorStock(){
        EquipoSonido e1= new EquipoSonido();
        Televisor t1= new Televisor();
        CargadorPortatil c1= new CargadorPortatil();
        String nombreProducto= "";
        int cantPortatil= stockCargador();
        int cantSonido= stockEquipoSonido();
        int cantTele= stockTelevisor();

        if(cantPortatil > cantSonido && cantPortatil>cantTele){
            nombreProducto= c1.getNombre();
        }
        if (cantSonido>cantPortatil && cantSonido>cantTele){
            nombreProducto= e1.getNombre();
        }
        if(cantTele>cantSonido && cantTele>cantPortatil){
            nombreProducto= t1.getNombre();
        }
        return nombreProducto;
    }

    public String menorStock(){
        EquipoSonido e1= new EquipoSonido();
        Televisor t1= new Televisor();
        CargadorPortatil c1= new CargadorPortatil();
        String nombreProducto= "";
        int cantPortatil= stockCargador();
        int cantSonido= stockEquipoSonido();
        int cantTele= stockTelevisor();

        if(cantPortatil < cantSonido && cantPortatil<cantTele){
            nombreProducto= c1.getNombre();
        }
        if (cantSonido<cantPortatil && cantSonido<cantTele){
            nombreProducto= e1.getNombre();
        }
        if(cantTele<cantSonido && cantTele<cantPortatil){
            nombreProducto= t1.getNombre();
        }
        return nombreProducto;
    }
}
