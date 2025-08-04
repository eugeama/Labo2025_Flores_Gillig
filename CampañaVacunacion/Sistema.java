package CampañaVacunacion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    HashSet<Vacuna>vacunas= new HashSet<>();
    HashMap<Ciudadano, HashSet<Vacuna>>vacunados= new HashMap<Ciudadano, HashSet<Vacuna>>();

    public HashMap<Ciudadano, HashSet<Vacuna>> getVacunados() {
        return vacunados;
    }

    public void setVacunados(HashMap<Ciudadano, HashSet<Vacuna>> vacunados) {
        this.vacunados = vacunados;
    }

    public void agregarVacunado(Ciudadano ciudadanoN, HashSet<Vacuna>vacunadoN){
        vacunados.put(ciudadanoN, vacunadoN);
    }

    public void agregarVacuna(String ciudadanoN, Vacuna vacunadoN){
        for(Map.Entry<Ciudadano, HashSet<Vacuna>> vacuna: vacunados.entrySet()) {
            if(ciudadanoN.equals(vacuna.getKey().getNombre())){
                vacuna.getValue().add(vacunadoN);
            }
        }
    }

    public HashSet<Vacuna> consultarVacunados(int dniIng){
        HashSet<Vacuna>vacunasUs= new HashSet<Vacuna>();
        for(Map.Entry<Ciudadano, HashSet<Vacuna>> vacuna: vacunados.entrySet()){
            if(vacuna.getKey().getDni() == dniIng){
                vacunasUs= vacuna.getValue();
            }
        }
        return vacunasUs;
    }

    public HashMap<Provincia, Integer> vacunadosProvincia(){
        HashMap<Provincia, Integer>provinciasAgrup= new HashMap<>();
        for(Map.Entry<Ciudadano, HashSet<Vacuna>> vacuna: vacunados.entrySet()) {
            if (provinciasAgrup.containsKey(vacuna.getKey().getProvincia())){
                provinciasAgrup.put(vacuna.getKey().getProvincia(), provinciasAgrup.get(vacuna.getKey().getProvincia())+1);
            }
            else{
                provinciasAgrup.put(vacuna.getKey().getProvincia(), 1);
            }
        }
        return provinciasAgrup;
    }

    public HashSet<Ciudadano> cantVacunas(int vacunasNec){
        HashSet<Ciudadano>ciudadanosVac= new HashSet<>();
        for(Map.Entry<Ciudadano, HashSet<Vacuna>> vacuna: vacunados.entrySet()) {
            if(vacuna.getValue().size()==vacunasNec){
                ciudadanosVac.add(vacuna.getKey());
            }
        }

        return ciudadanosVac;
    }

    public HashSet<Ciudadano> vacunadoEsp(String nombreVacuna){
        HashSet<Ciudadano>ciudadanosVac= new HashSet<>();
        for(Map.Entry<Ciudadano, HashSet<Vacuna>> vacuna: vacunados.entrySet()) {
            for(Vacuna vacs: vacuna.getValue()) {
                if (vacs.getNombreComercial().equals(nombreVacuna)) {
                    ciudadanosVac.add(vacuna.getKey());
                }
            }
        }

        return ciudadanosVac;
    }
}
