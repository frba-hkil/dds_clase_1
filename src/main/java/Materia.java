public class Materia {
    private int id;
    private String nombre;
    private Materia[] correlativas;

    public Materia(int id, String nombre, Materia[] correlativas) {
        this.id = id;
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public Materia[] getCorrelativas() {
        return correlativas;
    }
}
