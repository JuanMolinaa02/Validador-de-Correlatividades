package domain.inscripciones;

import domain.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionComplejaTest extends BaseTest {

    @Test
    @DisplayName("Test inscripcion aprobada si alumno cumple con las correlatividades necesarias de todas las materias")
    void inscripcionAprobada() {

        alumno.aprobarMateria(discreta,algoritmos,arquitectura);

        inscripcion.setAlumno(alumno);

        materiasAInscribir.add(paradigmas);
        materiasAInscribir.add(operativos);
        inscripcion.setMateriasAInscribir(materiasAInscribir);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test inscripcion desaprobada si alumno no cumple con las correlatividades necesarias de al menos una de las materias a inscribirse")
    void inscripcionDesaprobada() {

        alumno.aprobarMateria(discreta,algoritmos);

        inscripcion.setAlumno(alumno);

        materiasAInscribir.add(paradigmas);
        materiasAInscribir.add(operativos);
        inscripcion.setMateriasAInscribir(materiasAInscribir);

        Assertions.assertFalse(inscripcion.aprobada());
    }

}