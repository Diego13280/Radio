
package radio;
public class Radio {
    
    private double estacionFM[];
    private double estacionAM[];
    private double fm = 89.7, am = 530;
    private boolean encendido = false, frecuencia = true;

    Radio(){
        estacionAM= new double[12];
        estacionFM= new double[12];
        
        for (int i = 0; 12 > i; i++){
            estacionAM[i] = 0.0;
            estacionFM[i] = 0.0;            
        }
    }
    //Subir de estacion
        public double subirEstacion() {
            if (frecuencia){
                fm = fm + 0.2;
                if (fm >107.9) {
                    fm = 89.7;  
                }
                return fm;
            } else {
                am = am + 10;
                if (am > 1610){
                    am = 530;
                }
                return am;            
            }   
    }
    
        public double bajarEstacion() {
            if (frecuencia){
                fm = fm - 0.2;
                if (fm < 89.7) {
                    fm = 107.9;  
                }
                return fm;
            } else {
                am = am - 10;
                if (am < 530){
                    am = 1610;
                }
                return am;            
            }   
    }
        
        public void Guardar(int pos, double x){
            if(frecuencia){
                estacionFM[pos] = x; 
            } else {
                estacionAM[pos] = x;
            }                
        }
        
        double sacar(int pos){
            double estacionActual;
            if (frecuencia) {
                estacionActual = estacionFM[pos];
            } else {
                estacionActual = estacionAM[pos];
            }
            return estacionActual;
        }
        
        public void cambiarFrecuencia(boolean frec){
             if (frec) {
                 frecuencia = false;
             } else {
                 frecuencia = true;
             }
        }
        
        public boolean getEncendido() {
            return encendido;
        }   
        public double getEstacionAM() {
            return estacionAM[2];
        }
        public double getEstacionFM() {
            return estacionFM[2];
            
        }
        public boolean getFrecuencia(){
            return frecuencia;
             
        }
        
       
    
}
