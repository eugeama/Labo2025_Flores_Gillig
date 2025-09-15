package Sistema_Sangre;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Paciente>pacientes;
    private HashMap<Paciente, Integer>enTratamiento;

    public Sistema(HashMap<Paciente, Integer> enTratamiento, HashSet<Paciente> pacientes) {
        this.enTratamiento = enTratamiento;
        this.pacientes = pacientes;
    }

    public HashMap<Paciente, Integer> getEnTratamiento() {
        return enTratamiento;
    }

    public void setEnTratamiento(HashMap<Paciente, Integer> enTratamiento) {
        this.enTratamiento = enTratamiento;
    }

    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(HashSet<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    
}
