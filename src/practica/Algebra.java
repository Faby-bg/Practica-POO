
package practica;

import java.util.ArrayList;


public class Algebra {
    ArrayList<Alumnos> alum = new ArrayList<Alumnos>();

    public Algebra() {
    }

    public ArrayList<Alumnos> getAlum() {
        return alum;
    }

    public void setAlum(ArrayList<Alumnos> alum) {
        this.alum = alum;
    }
   public void introducirAlumno(Alumnos al){
       alum.add(al);
   }
    
}
