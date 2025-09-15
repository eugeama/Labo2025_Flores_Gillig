package Sistema_Sangre;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<Paciente>pacientes;
    private HashMap<Costo, Integer>enTratamiento;

    public Sistema(HashMap<Costo, Integer> enTratamiento, HashSet<Paciente> pacientes) {
        this.enTratamiento = enTratamiento;
        this.pacientes = pacientes;
    }

    public HashMap<Costo, Integer> getEnTratamiento() {
        return enTratamiento;
    }

    public void setEnTratamiento(HashMap<Costo, Integer> enTratamiento) {
        this.enTratamiento = enTratamiento;
    }

    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(HashSet<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void recorrerTratamiento(){
        for(Map.Entry<Costo, Integer>tratado: enTratamiento.entrySet()){
            if(tratado.getKey().puedeTratamiento()){
                tratado.setValue(tratado.getValue()+1);
            }
        }
    }

    public int pacientesNoTratados(){
        return pacientes.size()-enTratamiento.size();
    }
}
