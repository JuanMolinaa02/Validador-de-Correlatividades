package domain.inscripciones;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class Alumno {

    private List<Materia> materiasAprobadas;

    public Alumno(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = new ArrayList<>();
    }

    public boolean puedeCursar(Materia materia){

        List<Materia> correlativas = materia.getCorrelativasNecesarias();

        if(correlativas == null || correlativas.isEmpty()){
            return true;
        }

        return materiasAprobadas.containsAll(correlativas);
    }

    public void aprobarMateria(Materia ... materias){
        Collections.addAll(this.materiasAprobadas,materias);
    }

}
