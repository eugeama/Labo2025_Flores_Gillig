package Calorias;
import java.util.HashSet;

public class Familia {
    HashSet<PersonaC>familias;

    public Familia(HashSet<PersonaC> familias) {
        this.familias = familias;
    }

    public Familia() {
        this.familias = new HashSet<>();
    }

    public HashSet<PersonaC> getFamilias() {
        return familias;
    }

    public void setFamilias(HashSet<PersonaC> familias) {
        this.familias = familias;
    }

    public int promedioFamilia(){
        int calorias= 0;
        for(PersonaC familia: familias){
            calorias+=familia.getCalorias();
        }

        return calorias/familias.size();
    }

    public PersonaC masCalorias(){
        PersonaC persona = new PersonaC();
        int calorias= 0;
        for (PersonaC familiasT: familias) {
            if(familiasT.getCalorias()>calorias){
                persona=familiasT;
            }
        }

        return persona;
    }

    public PersonaC menosCalorias(){
        PersonaC persona= new PersonaC();
        int calorias= 0;
        for (PersonaC familiasT: familias) {
            if(familiasT.getCalorias()>calorias){
                persona=familiasT;
            }
            else if(calorias> 0 && familiasT.getCalorias()<calorias){
                persona=familiasT;
            }
        }

        return persona;
    }
}
