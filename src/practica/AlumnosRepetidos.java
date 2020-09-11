package practica;

import java.util.ArrayList;

public class AlumnosRepetidos {

    ArrayList<Alumnos> alum = new ArrayList<Alumnos>();

    public AlumnosRepetidos() {
    }

    public ArrayList<Alumnos> getAlum() {
        return alum;
    }

    public void setAlum(ArrayList<Alumnos> alum) {
        this.alum = alum;
    }

    public  void buscarElementos(Algebra al, Analisis an) {
        int contador = 0, tam = 0;
         alum = new ArrayList<Alumnos>();
       
        for (int i = 0; i < al.getAlum().size(); i++) {
             Alumnos alm1 = al.getAlum().get(i);
             Alumnos alm2 = an.getAlum().get(i);
            
            if (alm1.getId() == alm2.getId()) {
                
                System.out.println("El alumno esta repetido");
                contador++;
                
               alum.add(alm2);
                
            } else {
                System.out.println("El alumno no esta repetido");

            }

        }
        tam=alum.size();
    }
    public void mostrarDatos(){
        for (int i = 0; i < alum.size(); i++) {
            System.out.println("Los datos del Estudiante son: "+alum.get(i).getNombre()+ " " +alum.get(i).getId());
            
        }
        System.out.println("La cantidad de estudiantes repetidos es: "+ alum.size());
    }
}
