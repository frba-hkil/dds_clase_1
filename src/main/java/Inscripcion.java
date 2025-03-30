import java.util.Arrays;
import java.util.stream.Stream;

public class Inscripcion {
    int id;
    Materia[] materias_inscriptas;
    Alumno inscripto;

    public Inscripcion(int id, Materia[] materias, Alumno inscripto) {
        this.id = id;
        this.materias_inscriptas = materias;
        this.inscripto = inscripto;
    }

    public void setInscripto(Alumno inscripto) {
        this.inscripto = inscripto;
    }

    public void setMateriasInscriptas(Materia[] materias) {
        this.materias_inscriptas = materias;
    }

    public boolean aprobada() {
        return Arrays.stream(materias_inscriptas).allMatch(materia -> inscripto.puedeCursar(materia));
    }
}
