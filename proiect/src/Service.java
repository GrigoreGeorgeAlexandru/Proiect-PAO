


import java.io.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Service {
    public void PrintAll(List<Facultate> facultati) {
        for (int o = 0; o < facultati.size(); o++){
            System.out.print(facultati.get(o).getNume()+ " are profilurile:\n");
        for (int i = 0; i < facultati.get(o).getProfiluri().size(); i++) {
            System.out.println(facultati.get(o).getProfiluri().get(i).getNume());
            System.out.print("cu grupele:\n");
            for (int j = 0; j < facultati.get(o).getProfiluri().get(i).getGrupe().size(); j++) {
                System.out.println(facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getNume());
                System.out.print("cu studentii:\n");
                for (int k = 0; k < facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().size(); k++) {
                    System.out.println(facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getNume());
                    System.out.print("care studiaza materiile:\n");
                    for (int l = 0; l < facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getMaterii().size(); l++) {
                        System.out.println(facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getMaterii().get(l).getNume());
                        System.out.print("predata de profesorii:\n");
                        for (int p = 0; p < facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getMaterii().get(l).getProfesori().size(); p++) {
                            System.out.println(facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getMaterii().get(l).getProfesori().get(p).getNume());
                            System.out.print("la care au nota ");
                            System.out.println(facultati.get(o).getProfiluri().get(i).getGrupe().get(j).getStudenti().get(k).getMaterii().get(l).getNota());

                        }
                    }

                }
            }

        }
    }


    }

public List<Facultate> ReadFile( ) throws IOException {
    List<Facultate> facultati=new ArrayList<Facultate>();
        String path="D:/Games/games/java/proiect/src/input.csv";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line="";
        while((line=br.readLine()) != null) {
            String[] values=line.split(",");
            int fpar=0;
            int flag=0;
            for(int i=0;i< facultati.size();i++)
            {
                if (facultati.get(i).getNume().equals(values[0]))
             {fpar=i;
                flag=1;
                break;
             }

            }
            if(flag==0)
            { Facultate facultate=new Facultate();
                facultate.setNume(values[0]);
                fpar=facultati.size();
                facultati.add(facultate);

            }
            int ppar=0;
            flag=0;
            for(int i=0;i< facultati.get(fpar).getProfiluri().size();i++) {
               if( facultati.get(fpar).getProfiluri().get(i).getNume().equals(values[1])){
                   ppar=i;
                   flag=1;
                   break;


               }

            }
            if(flag==0)
            { Profil profil=new Profil();
                profil.setNume(values[1]);
                ppar=facultati.get(fpar).getProfiluri().size();
                facultati.get(fpar).getProfiluri().add(profil);

            }
            int gpar=0;
            flag=0;
            for(int i=0;i< facultati.get(fpar).getProfiluri().get(ppar).getGrupe().size();i++) {
                if( facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(i).getNume().equals(values[2])){
                    gpar=i;
                    flag=1;
                    break;


                }
            }
            if(flag==0)
            { Grupa grupa=new Grupa();
                grupa.setNume(values[2]);
                grupa.setAn(values[3]);
                gpar=facultati.get(fpar).getProfiluri().get(ppar).getGrupe().size();
                facultati.get(fpar).getProfiluri().get(ppar).getGrupe().add(grupa);

            }
            int spar=0;
            flag=0;
            for(int i=0;i< facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().size();i++) {
                if( facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(i).getNume().equals(values[4])){
                    spar=i;
                    flag=1;
                    break;


                }

            }
            if(flag==0)
            { Student student=new Student();
                student.setNume(values[4]);
                spar=facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().size();
                facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().add(student);

            }
            int mpar=0;
            flag=0;
            for(int i=0;i< facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().size();i++) {
                if( facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().get(i).getNume().equals(values[5])){
                    mpar=i;
                    flag=1;
                    break;


                }


            }
            if(flag==0)
            { Materie materie=new Materie();
                materie.setNume(values[5]);
                materie.setNota(values[7]);
                mpar=facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().size();
                facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().add(materie);

            }
            int prpar=0;
            flag=0;
            for(int i=0;i< facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().get(mpar).getProfesori().size();i++) {
                if( facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().get(mpar).getProfesori().get(i).getNume().equals(values[6])){
                    prpar=i;
                    flag=1;
                    break;


                }
            }
            if(flag==0)
            { Profesor profesor=new Profesor();
                profesor.setNume(values[6]);

                prpar=facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().get(mpar).getProfesori().size();
                facultati.get(fpar).getProfiluri().get(ppar).getGrupe().get(gpar).getStudenti().get(spar).getMaterii().get(mpar).getProfesori().add(profesor);

            }
        }

return facultati;}

    public void Audit(String action){
        Timestamp timestamp=new Timestamp(System.currentTimeMillis());
        try(FileWriter fw = new FileWriter("audit.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);

            PrintWriter out = new PrintWriter(bw))
        {
            out.println(action+","+timestamp);

        } catch (IOException e) {

        }




    }




}




