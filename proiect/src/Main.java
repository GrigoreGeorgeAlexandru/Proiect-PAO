import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        /*Facultate fmi=new Facultate();
        facultati.add(fmi);
        fmi.setNume("Facultatea de Matematică și Informatică");
        Profil info=new Profil();
        info.setNume("Informatica");
        Grupa grupa1=new Grupa();
        grupa1.setNume("232");
        grupa1.setAn(2);
        Student student1=new Student();
        student1.setNume("Popescu Andrei");
        Materie pao=new Materie();
        pao.setNume("Programare avansta pe obiecte");
        Profesor prof1=new Profesor();
        prof1.setNume("Ionescu Radu");
        pao.setNota(8);
        pao.addProfesor(prof1);
        student1.addMaterie(pao);
        grupa1.addStudent(student1);
        info.addGrupa(grupa1);
        fmi.addProfil(info);
         Service service=new Service();
        service.PrintAll(fmi);
*/

        ReadFile f=ReadFile.getInstance();
        PrintAll p=PrintAll.getInstance(f.GetFacultati());

    }
}
