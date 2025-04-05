package domain.inscripciones;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Inscripcion {

    private List<Materia> materiasAInscribir;
    private Alumno alumno;

    public boolean aprobada(){
        return this.materiasAInscribir.stream().allMatch(materia -> alumno.puedeCursar(materia));
    }

}
