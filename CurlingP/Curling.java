package CurlingP;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Curling {
    private ArrayList<Equipo>equipos;
    private ArrayList<Partido>fixture;


    public Curling() {
        equipos = new ArrayList<Equipo>();
        fixture = new ArrayList<Partido>();
    }


    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getFixture() {
        return fixture;
    }

    public void setFixture(ArrayList<Partido> fixture) {
        this.fixture = fixture;
    }


    public void agregarequipo(Equipo equipo){

        this.equipos.add(equipo);
    }

    public void todosvstodos () {
        boolean nojugaron= true;

        for (int i = 0; i < this.equipos.size(); i++) {
            for (int j = i + 1; j < this.equipos.size(); j++) {
                for(Equipo equipo : this.equipos){
                    if(equipo.getPartidosJugados() < i){

                        equipo.setPartidosJugados(equipo.getPartidosJugados()+1);
                        for(Equipo equipoContra : this.equipos){
                            nojugaron= true;

                            if(equipoContra.getPartidosJugados() < i){
                                for(Partido partidos : fixture){
                                    if(equipo.getNombreEquipo().equals(partidos.getEquipo1().getNombreEquipo())&&equipoContra.getNombreEquipo().equals(partidos.getEquipo2().getNombreEquipo())){
                                        nojugaron= false;
                                    }
                                    if(equipo.getNombreEquipo().equals(partidos.getEquipo2().getNombreEquipo())&&equipoContra.getNombreEquipo().equals(partidos.getEquipo1().getNombreEquipo())){
                                        nojugaron= false;
                                    }
                                }

                                if(nojugaron){
                                    if(equipo.getDisponibilidad().equals(equipoContra.getDisponibilidad())){
                                        equipoContra.setDisponibilidad(equipo.getDisponibilidad()+1);

                                        fixture.add(new Partido(1, 10, 2018, equipo, equipoContra, equipo.getDisponibilidad()));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void mostrarFixture(){
        int cantidad= 0;
        for(int i= 0; i<fixture.size();i++){
            cantidad++;
            System.out.println("fecha del partido: "+cantidad);
            System.out.println("Equipos que juegan: "+fixture.get(i).getEquipo1().getNombreEquipo()+" contra: "+fixture.get(i).getEquipo2().getNombreEquipo());
        }
    }


    public static void main(String[] args) {
        Curling curling = new Curling();
        ArrayList<Partido>fixture= new ArrayList<Partido>();
        ArrayList<Equipo>equipos= new ArrayList<Equipo>();
        ArrayList<Jugador>equipo= new ArrayList<Jugador>();

        Equipo losSillys = new Equipo("losSillys","Liniers", "Tarde", 0);
        Equipo coquimbo = new Equipo("Coquimbo Unido", "Saavedra", "Mañana", 0);
        Equipo allBoys = new Equipo("All Boys", "Floresta", "Mañana", 0);
        Equipo iquique= new Equipo("Deportes Iquique", "Iquique", "Tarde", 0);

        losSillys.getEquipo().add( new Jugador("Franco", "megarejo",12, 8, 2007, 30, true));
        losSillys.getEquipo().add(new Jugador("Luciano","megarejo", 5, 6, 2006, 25, false));
        losSillys.getEquipo().add(new Jugador("Mateo","megarejo", 17, 3, 2008, 22, false));
        losSillys.getEquipo().add(new Jugador("Santiago","megarejo", 1, 12, 2007, 28, false));
        losSillys.getEquipo().add(new Jugador("Bruno", "megarejo",9, 4, 2006, 27, false));
        losSillys.getEquipo().add(new Jugador("Lucas", "megarejo",11, 1, 2008, 26, false));
        losSillys.getEquipo().add(new Jugador("Nicolás", "megarejo",21, 10, 2007, 29, false));
        losSillys.getEquipo().add(new Jugador("Tomás", "megarejo",14, 2, 2006, 24, false));
        losSillys.getEquipo().add(new Jugador("Benjamín", "megarejo",3, 7, 2008, 23, false));
        losSillys.getEquipo().add(new Jugador("Thiago", "megarejo",8, 9, 2007, 21, false));
        losSillys.getEquipo().add(new Jugador("Gonzalo", "megarejo", 19, 5, 2006, 22, false));

        coquimbo.getEquipo().add(new Jugador("Facundo", "megarejo", 7, 6, 2007, 20, true));
        coquimbo.getEquipo().add(new Jugador("Martín", "megarejo" ,6, 8, 2008, 19, false));
        coquimbo.getEquipo().add(new Jugador("Ignacio", "megarejo" ,30, 3, 2006, 18, false));
        coquimbo.getEquipo().add(new Jugador("Joaquín", "megarejo",2, 12, 2007, 17, false));
        coquimbo.getEquipo().add(new Jugador("Valentino","megarejo", 25, 1, 2006, 16, false));
        coquimbo.getEquipo().add(new Jugador("Simón", "megarejo",12, 10, 2008, 15, false));
        coquimbo.getEquipo().add(new Jugador("Ramiro", "megarejo",4, 2, 2007, 14, false));
        coquimbo.getEquipo().add(new Jugador("Lautaro","megarejo", 10,4, 2006, 13, false));
        coquimbo.getEquipo().add(new Jugador("Emiliano", "megarejo",16, 6, 2007, 12, false));
        coquimbo.getEquipo().add(new Jugador("Pedro", "megarejo", 20, 9, 2008, 11, false));
        coquimbo.getEquipo().add(new Jugador("Dylan", "megarejo",18, 11, 2006, 10, false));

        allBoys.getEquipo().add(new Jugador("Alan", "megarejo",13, 5, 2007, 9, true));
        allBoys.getEquipo().add(new Jugador("Aaron", "megarejo", 24, 7, 2006, 8, false));
        allBoys.getEquipo().add(new Jugador("Federico", "megarejo",15, 8, 2008, 7, false));
        allBoys.getEquipo().add(new Jugador("Leandro", "megarejo", 23, 3, 2006, 6, false));
        allBoys.getEquipo().add(new Jugador("Agustín", "megarejo", 22, 1, 2007, 5, false));
        allBoys.getEquipo().add(new Jugador("Esteban", "megarejo", 26, 2, 2008, 4, false));
        allBoys.getEquipo().add(new Jugador("Julián", "megarejo", 27, 4, 2007, 3, false));
        allBoys.getEquipo().add(new Jugador("Cristian", "megarejo",28, 6, 2006, 2, false));
        allBoys.getEquipo().add(new Jugador("Marco", "megarejo", 29, 8, 2008, 1, false));
        allBoys.getEquipo().add(new Jugador("Renzo", "megarejo",31, 10, 2007, 0, false));
        allBoys.getEquipo().add(new Jugador("Iván", "megarejo",32, 11, 2006, 15, false));

        iquique.getEquipo().add(new Jugador("Nahuel", "megarejo",33, 12, 2008, 13, true));
        iquique.getEquipo().add(new Jugador("Ulises", "megarejo",34, 1, 2007, 11, false));
        iquique.getEquipo().add(new Jugador("Jaziel", "megarejo",35, 2, 2006, 9, false));
        iquique.getEquipo().add(new Jugador("Tobías", "megarejo",36, 3, 2008, 7, false));
        iquique.getEquipo().add(new Jugador("Leonel", "megarejo",37, 4, 2007, 5, false));
        iquique.getEquipo().add(new Jugador("Damian", "megarejo",38, 5, 2006, 3, false));
        iquique.getEquipo().add(new Jugador("Diego", "melgarejo",39, 6, 2008, 1, false));
        iquique.getEquipo().add(new Jugador("Eduardo", "megarejo",40, 7, 2007, 2, false));
        iquique.getEquipo().add(new Jugador("Raúl", "megarejo",41, 8, 2006, 4, false));
        iquique.getEquipo().add(new Jugador("Pablo", "megarejo",42, 9, 2008, 6, false));
        iquique.getEquipo().add(new Jugador("Oscar", "megarejo",43, 10, 2007, 8, false));


        curling.equipos.add(losSillys);
        curling.equipos.add(coquimbo);
        curling.equipos.add(allBoys);
        curling.equipos.add(iquique);


        curling.todosvstodos();
        System.out.println("El fixture es: ");
        curling.mostrarFixture();
    }
}




















