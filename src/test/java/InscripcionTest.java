import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    @DisplayName("un alumno que aprobo am1 y discreta puede inscribirse a am2")
    public void aprobarInscripcion() {
        Materia m1 = new Materia(1, "analisis1", null);
        Materia m2 = new Materia(2, "discreta", null);
        Materia[] correlativas = { m1, m2 };
        Materia asignatura = new Materia(3, "analisis2", correlativas);
        Inscripcion inscripcion = new Inscripcion(1, new Materia[] {asignatura}, new Alumno(correlativas));

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("un alumno que solo aprobo discreta no puede inscribirse a am2")
    public void desaprobarInscripcion() {
        Materia m1 = new Materia(1, "analisis1", null);
        Materia m2 = new Materia(2, "discreta", null);
        Materia[] correlativas = { m1, m2 };
        Materia asignatura = new Materia(3, "analisis2", correlativas);
        Inscripcion inscripcion = new Inscripcion(1, new Materia[] {asignatura}, new Alumno(new Materia[] {m2}));

        Assertions.assertFalse(inscripcion.aprobada());
    }

    // Podria escribir muchos casos mas pero bueno
}