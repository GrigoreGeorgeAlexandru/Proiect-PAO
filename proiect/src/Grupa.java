import java.util.ArrayList;
import java.util.List;

 class Grupa extends An implements Comparable< Grupa >{
    private String nume;
    private List<Student> studenti=new ArrayList<Student>();
    public String getNume() {
        return nume;
    }

    public void setNume(String newNume) {
        this.nume = newNume;
    }
    public List<Student> getStudenti() {
        return studenti;
    }

    public void addStudent(Student newStudent) {
        studenti.add(newStudent);
    }
     public int compareTo(Grupa o) {
         return this.getNume().compareTo(o.getNume());
     }

}
