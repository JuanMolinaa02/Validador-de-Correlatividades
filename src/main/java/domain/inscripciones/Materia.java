package domain.inscripciones;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class Materia {

    private String nombre;
    private List<Materia> correlativasNecesarias;
    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativasNecesarias = new ArrayList<>();
    }

    public void agregarCorrelativas(Materia ... correlativas){
        Collections.addAll(this.correlativasNecesarias,correlativas);
    }

}

