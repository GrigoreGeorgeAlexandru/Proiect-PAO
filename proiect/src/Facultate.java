import java.util.ArrayList;
import java.util.List;

 class Facultate {
    private String nume;
    private List<Profil> profiluri=new ArrayList<Profil>();
    public String getNume() {
        return nume;
    }

    public void setNume(String newNume) {
        this.nume = newNume;
    }
    public List<Profil> getProfiluri() {
        return profiluri;
    }

    public void addProfil(Profil newProfil) {

        profiluri.add(newProfil);

    }


}
