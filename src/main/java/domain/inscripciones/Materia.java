package domain.inscripciones;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Materia {

    private String nombre;
    private List<Materia> correlativasNecesarias;
    public Materia(String nombre) {
        this.nombre = nombre;
    }

}

