package domain;

import domain.inscripciones.Alumno;
import domain.inscripciones.Inscripcion;
import domain.inscripciones.Materia;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseTest {

    // Materias
    protected Materia discreta;
    protected Materia algoritmos;
    protected Materia paradigmas;
    protected Materia arquitectura;
    protected Materia operativos;

    // Correlativas
    protected List<Materia> correlativasParadigmas;
    protected List<Materia> correlativasSO;

    // Alumno y materias aprobadas
    protected Alumno alumno;
    protected List<Materia> materiasAprobadas;

    // Inscripción y materias a inscribirse
    protected Inscripcion inscripcion;
    protected List<Materia> materiasAInscribir;

    @BeforeEach
    private void setContexto() {
        discreta = new Materia("Matematica Discreta");
        algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        paradigmas = new Materia("Paradigmas de Programacion");
        arquitectura = new Materia("Arquitectura de Computadoras");
        operativos = new Materia("Sistemas Operativos");

//        correlativasParadigmas = new ArrayList<>();
//        correlativasSO = new ArrayList<>();
        materiasAprobadas = new ArrayList<>();
        materiasAInscribir = new ArrayList<>();

        alumno = new Alumno(materiasAprobadas);
        inscripcion = new Inscripcion();

        paradigmas.agregarCorrelativas(discreta,algoritmos);
        operativos.agregarCorrelativas(arquitectura);

//        setCorrelativas();
    }

/*    private void setCorrelativas() {
        correlativasParadigmas.add(discreta);
        correlativasParadigmas.add(algoritmos);
        paradigmas.setCorrelativasNecesarias(correlativasParadigmas);

        correlativasSO.add(arquitectura);
        operativos.setCorrelativasNecesarias(correlativasSO);
    }*/

}