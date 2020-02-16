package controlador;

/*
This side of the sofrtware calls the class found in  "Funciones Trigo"  and allows via a loop the conversion and final result of the operation
 */

public class FuncionesTrigo {
    
    
    public double sin(int grados, int tamaño){
        FuncionesMate m = new FuncionesMate();
        double sin = 0,suma=0;
        
        for(int i = 0 ; i< tamaño;i++){
            sin=((m.signo(i)/m.Factorial(2*i+1))* m.Potencia(m.GradosRadianes(grados), 2*i+1));
            suma += sin;
        }
        return suma;
    }
    
      
    
}
