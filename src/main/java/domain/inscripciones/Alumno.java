package domain.inscripciones;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Alumno {

    private List<Materia> materiasAprobadas;

    public boolean puedeCursar(Materia materia){

        List<Materia> correlativas = materia.getCorrelativasNecesarias();

        if(correlativas == null || correlativas.isEmpty()){
            return true;
        }

        return materiasAprobadas.containsAll(correlativas);
    }
}
