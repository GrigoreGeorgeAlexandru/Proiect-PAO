import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static ReadFile single_instance = null;
   private List<Facultate> facultati=new ArrayList<Facultate>();
    public List<Facultate> GetFacultati(){
        return facultati;
    }
    String path="D:/Games/games/java/proiect/src/input.csv";
    BufferedReader br = new BufferedReader(new FileReader(path));
    String line="";
    private ReadFile() throws FileNotFoundException {
        Service service=new Service();
        service.Audit("Read");
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] values = line.split(",");
            int fpar = 0;
            int flag = 0;
            for (int i = 0; i < facultati.size(); i++) {
                if (facultati.get(i).getNume().equals(values[0])) {
                    fpar = i;
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                Facultate facultate = new Facultate();
                facultate.setNume(values[0]);
                fpar = facultati.size();
                facultati.add(facultate);

            }
            int ppar = 0;
            flag = 0;
            for (int i = 0; i < facultati.get(fpar).getProfiluri().size(); i++) {
                if (facultati.get(fpar).getProfiluri().get(i).getNume().equals(values[1])) {
                    ppar = i;
                    flag = 1;
                    break;


                }

            }
            if (flag == 0) {
                Profil profil = new Profil();
                profil.setNume(values[1]);
                ppar = facultati.get(fpar).getProfiluri().size();
                facultati.get(fpar).getProfiluri().add(profil);

            }
            int gpar = 0;
            flag = 0;
            for (int i = 0; i < facultati.get(fpar).getProfiluri().get(ppar).getGrupe().size(); i++) {
                if (facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(i).getNume().equals(values[2])) {
                    gpar = i;
                    flag = 1;
                    break;


                }
            }
            if (flag == 0) {
                Grupa grupa = new Grupa();
                grupa.setNume(values[2]);
                grupa.setAn(values[3]);
                gpar = facultati.get(fpar).getProfiluri().get(ppar).getGrupe().size();
                facultati.get(fpar).getProfiluri().get(ppar).getGrupe().add(grupa);

            }
            int spar = 0;
            flag = 0;
            for (int i = 0; i < facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().size(); i++) {
                if (facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(i).getNume().equals(values[4])) {
                    spar = i;
                    flag = 1;
                    break;


                }

            }
            if (flag == 0) {
                Student student = new Student();
                student.setNume(values[4]);
                spar = facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().size();
                facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().add(student);

            }
            int mpar = 0;
            flag = 0;
            for (int i = 0; i < facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().size(); i++) {
                if (facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().get(i).getNume().equals(values[5])) {
                    mpar = i;
                    flag = 1;
                    break;


                }


            }
            if (flag == 0) {
                Materie materie = new Materie();
                materie.setNume(values[5]);
                materie.setNota(values[7]);
                mpar = facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().size();
                facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().add(materie);

            }
            int prpar = 0;
            flag = 0;
            for (int i = 0; i < facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().get(mpar).getProfesori().size(); i++) {
                if (facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().get(mpar).getProfesori().get(i).getNume().equals(values[6])) {
                    prpar = i;
                    flag = 1;
                    break;


                }
            }
            if (flag == 0) {
                Profesor profesor = new Profesor();
                profesor.setNume(values[6]);

                prpar = facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().get(mpar).getProfesori().size();
                facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().get(mpar).getProfesori().add(profesor);

            }
        }
    }
    public static ReadFile getInstance() throws FileNotFoundException {
        if (single_instance == null)
            single_instance = new ReadFile();

        return single_instance;
    }
}
