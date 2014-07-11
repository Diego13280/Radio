
package radio;
public class Radio {
    
    private int frecu;
    private double estacionFM[];
    private double estacionAM[];

    Radio(){
        frecu=0;
        estacionAM= new double[12];
        estacionFM= new double[12];
        
        for (int i = 0; 12 > i; i++){
            estacionAM[i] = 0.0;
            estacionFM[i] = 0.0;            
        }
    }
        public double subirEstacion(int frec,double Actual) //Subir de estacion
    {
            frecu = frec;
            if (frecu == 0){
                Actual = Actual + 0.2;
                if (Actual >107.9)
                    Actual = 87.9;
           
            }
            if (frecu == 1){
                Actual = Actual + 10;
                if (Actual > 1610){
                    Actual = 530;
                }
            
            }
         return Actual;
    }
    
        public double bajarEstacion(int frec,double Actual) //Subir de estacion
    {
             frecu = frec;
            if (frecu == 0){
                Actual = Actual - 0.2;
                if (Actual < 87.9)
                    Actual = 107.9;
           
            }
            if (frecu == 1){
                Actual = Actual - 10;
                if (Actual < 530){
                    Actual = 1610;
                }
            
            }
         return Actual;
   }
        
        public void Guardar(int pos, double x){
            if(frecu==0){
                estacionFM[pos] = x; 
            } else {
                estacionAM[pos] = x;
            }                
        }
        
        double sacar(int pos){
            double estacionActual;
            if (frecu == 0) {
                estacionActual = estacionFM[pos];
            } else {
                estacionActual = estacionAM[pos];
            }
            return estacionActual;
        }
        
       
    
}
