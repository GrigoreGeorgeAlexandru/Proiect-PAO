import java.util.ArrayList;
import java.util.List;


class Student {
    private String nume;
    private List<Materie> materii=new ArrayList<Materie>();
    public String getNume() {
        return nume;
    }

    public void setNume(String newNume) {
        this.nume = newNume;
    }
    public List<Materie> getMaterii() {
        return materii;
    }

    public void addMaterie(Materie newMaterie) {
        materii.add(newMaterie);
    }




    }

