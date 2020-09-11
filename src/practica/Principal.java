
package practica;



public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Algebra al=new Algebra();
        Analisis an=new Analisis();
        AlumnosRepetidos ar=new AlumnosRepetidos();
        
       Alumnos alm=new Alumnos(7,"Diana");
       al.introducirAlumno(alm);
       an.introducirAlumno(alm);
       alm=new Alumnos(6, "Valery");
       al.introducirAlumno(alm);
       an.introducirAlumno(alm);
       
       ar.buscarElementos(al, an);
       ar.mostrarDatos();
    }
    
}
