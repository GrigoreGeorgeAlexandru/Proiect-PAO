import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


 class Profil {
     private String nume;
     private List<Grupa> grupe=new ArrayList<Grupa>();
     public String getNume() {
         return nume;
     }

     public void setNume(String newNume) {
         this.nume = newNume;
     }
     public List<Grupa> getGrupe() {
         return grupe;
           }

     public void addGrupa(Grupa newGrupa) {
         grupe.add(newGrupa);
         Collections.sort(grupe);
     }

}
