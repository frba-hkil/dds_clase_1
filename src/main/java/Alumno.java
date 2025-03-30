import java.util.Collection;
import java.util.List;

public class Alumno {
    private String nombre;
    private String legajo;
    private Materia[] materias_aprobadas;

    public Alumno(Materia[] materias_aprobadas) {
        this.materias_aprobadas = materias_aprobadas;
    }

    public Materia[] getMaterias_aprobadas() {
        return materias_aprobadas;
    }

    public boolean puedeCursar(Materia materia) {
        Collection<Materia> correlativas = List.of(materia.getCorrelativas());
        Collection<Materia> materias_aprobadas = List.of(this.materias_aprobadas);

        return materias_aprobadas.containsAll(correlativas);
    }
}
