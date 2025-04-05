package domain.inscripciones;

import domain.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionSimpleTest extends BaseTest {

    @Test
    @DisplayName("Test inscripcion aprobada si alumno intenta inscribirse a materia sin correlativas")
    void inscripcionAprobadaSinCorrelativas() {

        inscripcion.setAlumno(alumno);

        materiasAInscribir.add(discreta);
        inscripcion.setMateriasAInscribir(materiasAInscribir);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test inscripcion aprobada si alumno cumple con las correlatividades necesarias")
    void inscripcionAprobada() {

        alumno.aprobarMateria(algoritmos,discreta);
        
        inscripcion.setAlumno(alumno);

        materiasAInscribir.add(paradigmas);
        inscripcion.setMateriasAInscribir(materiasAInscribir);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test inscripcion desaprobada si alumno no cumple con alguna de las correlatividades necesarias")
    void inscripcionDesaprobada() {


        alumno.aprobarMateria(algoritmos);

        inscripcion.setAlumno(alumno);

        materiasAInscribir.add(paradigmas);
        inscripcion.setMateriasAInscribir(materiasAInscribir);

        Assertions.assertFalse(inscripcion.aprobada());
    }

}