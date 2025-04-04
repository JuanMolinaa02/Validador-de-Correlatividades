package domain.inscripciones;

import java.util.List;

public class Materia {

    private String nombre;
    private List<Materia> materiasCorrelativasNecesarias;

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getMateriasCorrelativasNecesarias() {
        return materiasCorrelativasNecesarias;
    }

    public void setMateriasCorrelativasNecesarias(List<Materia> materiasCorrelativasNecesarias) {
        this.materiasCorrelativasNecesarias = materiasCorrelativasNecesarias;
    }
}
