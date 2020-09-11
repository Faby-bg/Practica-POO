
package practica;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Analisis {
     ArrayList<Alumnos> alum = new ArrayList<Alumnos>();

    public Analisis() {
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
