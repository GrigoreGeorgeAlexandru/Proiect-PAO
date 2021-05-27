import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintAll {
    private static PrintAll single_instance = null;
    public static PrintAll getInstance(List<Facultate> facultati) throws IOException {
        if (single_instance == null)
            single_instance = new PrintAll( facultati);

        return single_instance;
    }
    private PrintAll(List<Facultate> facultati) throws IOException {
        Service service=new Service();
        service.Audit("Print");
        FileWriter myWriter = new FileWriter("output.txt");
        for (int o = 0; o < facultati.size(); o++){
            myWriter.write(facultati.get(o).getNume()+ " are profilurile:\n");
            for (int i = 0; i < facultati.get(o).getProfiluri().size(); i++) {
                myWriter.write(facultati.get(o).getProfiluri().get(i).getNume());
                myWriter.write(" cu grupele:\n");
                for (int j = 0; j < facultati.get(o).getProfiluri().get(i).getGrupe().size(); j++) {
                    myWriter.write(facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getNume());
                    myWriter.write(" cu studentii:\n");
                    for (int k = 0; k < facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().size(); k++) {
                        myWriter.write(facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getNume());
                        myWriter.write("  studiaza materiile:\n");
                        for (int l = 0; l < facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getMaterii().size(); l++) {
                            myWriter.write(facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getMaterii().get(l).getNume());
                            myWriter.write(" predata de profesorii:\n");
                            for (int p = 0; p < facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getMaterii().get(l).getProfesori().size(); p++) {
                                myWriter.write(facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getMaterii().get(l).getProfesori().get(p).getNume());
                                myWriter.write(" la care au nota ");
                                myWriter.write(facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getMaterii().get(l).getNota());
                                myWriter.write("\n");
                            }
                        }

                    }
                }

            }
        }
        myWriter.close();

    }}
