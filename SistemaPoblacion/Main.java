package SistemaPoblacion;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Coordenadas cor1= new Coordenadas(100, 200);
        HashSet<Coordenadas>c1= new HashSet<>();
        c1.add(cor1);

        Coordenadas cor2= new Coordenadas(200, 300);
        HashSet<Coordenadas>c2= new HashSet<>();
        c2.add(cor2);

        Coordenadas cor3= new Coordenadas(500, 700);
        HashSet<Coordenadas>c3= new HashSet<>();
        c3.add(cor3);


        Barrio b1 = new Barrio("barrio1",20192,c1, 4000);
        Barrio b2 = new Barrio("barrio2",20193,c2, 6000);
        Barrio b3 = new Barrio("barrio3",20194,c3, 2000);

        Barrio b4 = new Barrio("barrio4",20192,c1, 7000);
        Barrio b5 = new Barrio("barrio5",20193,c2, 5000);
        Barrio b6 = new Barrio("barrio6",20194,c3, 1000);
        HashSet<Barrio>barrios= new HashSet<>();
        barrios.add(b1);
        barrios.add(b2);
        barrios.add(b3);
        HashSet<Barrio>barrios2= new HashSet<>();
        barrios2.add(b4);
        barrios2.add(b5);
        barrios2.add(b6);


        Ciudad ci1= new Ciudad("ciudad1", 10203,c1, barrios);
        Ciudad ci2= new Ciudad("ciudad2", 10204, c2, barrios2);
        Ciudad ci3= new Ciudad("ciudad3", 10205, c2, barrios2);

        Ciudad ci4= new Ciudad("ciudad4", 10206,c1, barrios2);
        Ciudad ci5= new Ciudad("ciudad5", 10207, c2, barrios);
        Ciudad ci6= new Ciudad("ciudad6", 10208, c2, barrios);
        HashSet<Ciudad>ciudades= new HashSet<>();
        ciudades.add(ci1);
        ciudades.add(ci2);
        ciudades.add(ci3);
        HashSet<Ciudad>ciudades2= new HashSet<>();
        ciudades2.add(ci4);
        ciudades2.add(ci5);
        ciudades2.add(ci6);


        Provincia pr1= new Provincia("provincia1", 40123,c2,ciudades);
        Provincia pr2= new Provincia("provincia2", 40124,c1,ciudades2);
        Provincia pr3= new Provincia("provincia3", 40125,c1,ciudades2);

        Provincia pr4= new Provincia("provincia4", 40126,c1,ciudades);
        Provincia pr5= new Provincia("provincia5", 40127,c2,ciudades);
        Provincia pr6= new Provincia("provincia6", 40128,c2,ciudades2);
        HashSet<Provincia>provincias1= new HashSet<>();
        provincias1.add(pr1);
        provincias1.add(pr2);
        provincias1.add(pr3);
        HashSet<Provincia>provincias2= new HashSet<>();
        provincias2.add(pr4);
        provincias2.add(pr5);
        provincias2.add(pr6);


        Pais p1 = new Pais("pais1", 19213,c1,provincias1);
        Pais p2 = new Pais("pais2", 19214,c2,provincias2);
        Pais p3 = new Pais("pais3", 19215,c2,provincias2);

        Pais p4 = new Pais("pais4", 19216,c1,provincias1);
        Pais p5 = new Pais("pais5", 19217,c2,provincias1);
        Pais p6 = new Pais("pais6", 19218,c2,provincias2);
        HashSet<Pais>paises1= new HashSet<>();
        paises1.add(p1);
        paises1.add(p2);
        paises1.add(p3);
        HashSet<Pais>paises2= new HashSet<>();
        paises2.add(p4);
        paises2.add(p5);
        paises2.add(p6);


        Continente cont1 = new Continente("Continente1", 13023, c2, paises1);
        Continente cont2 = new Continente("Continente2", 13024, c1, paises2);
        Continente cont3 = new Continente("Continente3", 13025, c1, paises2);

        Continente cont4 = new Continente("Continente4", 13023, c1, paises1);
        Continente cont5 = new Continente("Continente5", 13024, c2, paises1);
        Continente cont6 = new Continente("Continente6", 13025, c2, paises2);
        HashSet<Continente>continentes1=new HashSet<>();
        continentes1.add(cont1);
        continentes1.add(cont2);
        continentes1.add(cont3);
        continentes1.add(cont4);
        continentes1.add(cont5);
        continentes1.add(cont6);
        HashMap<Integer, Lugar>lugarCodigo= new HashMap<>();
        lugarCodigo.put(13023, cont4);
        lugarCodigo.put(19216, p4);
        lugarCodigo.put(40128, pr6);
        lugarCodigo.put(10207, ci5);
        lugarCodigo.put(20192, b4);

        Mundo m1 = new Mundo(continentes1, lugarCodigo);
        Mundo m= new Mundo();
        Continente c= new Continente();

        System.out.println("la cantidad de poblaci{on de ese lugar es: "+m.codigoLugar(13023));
        System.out.println(m.continenteMas());
        System.out.println(m.continenteMenos());
        System.out.println(c.paisMas());
        System.out.println(c.paisMenos());
    }
}
