package domain.alumnos;

import domain.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest extends BaseTest {

    @Test
    @DisplayName("Test alumno puede cursar materia sin correlativas")
    void puedeCursarMateriasSinCorrelativas() {
        Assertions.assertTrue(alumno.puedeCursar(discreta));
    }

    @Test
    @DisplayName("Test alumno puede cursar materia en la que cumple con las correlativas")
    void puedeCursarMateria() {

        materiasAprobadas.add(algoritmos);
        materiasAprobadas.add(discreta);
        alumno.setMateriasAprobadas(materiasAprobadas);

        Assertions.assertTrue(alumno.puedeCursar(paradigmas));
    }

    @Test
    @DisplayName("Test alumno NO puede cursar materia ya que no cumple con al menos una de las correlativas necesarias")
    void noPuedeCursarMateria() {

        materiasAprobadas.add(algoritmos);
        alumno.setMateriasAprobadas(materiasAprobadas);

        Assertions.assertFalse(alumno.puedeCursar(paradigmas));
    }

}