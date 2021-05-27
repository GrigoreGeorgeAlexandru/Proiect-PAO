import java.util.ArrayList;
import java.util.List;

class Materie {
    private String nume;
    private String nota;
    private List<Profesor> profesori=new ArrayList<Profesor>();
    public String getNume() {
        return nume;
    }

    public void setNume(String newNume) {
        this.nume = newNume;
    }
    public String getNota() {
        return nota;
    }

    public void setNota(String newNota) {
        this.nota = newNota;

    }
    public List<Profesor> getProfesori() {
        return profesori;
    }

    public void addProfesor(Profesor newProfesor) {
        profesori.add(newProfesor);
    }

}