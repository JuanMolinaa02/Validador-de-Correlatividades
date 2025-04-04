package domain.inscripciones;

import java.util.List;

public class Alumno {

    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
