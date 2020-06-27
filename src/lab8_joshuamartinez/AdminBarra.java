package lab8_joshuamartinez;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;


public class AdminBarra extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;

    public AdminBarra(JProgressBar barra) {
        this.barra = barra;
        avanzar=true;
        vive=true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }


    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }


    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==10000){
                    vive=false;
                }                
            } 
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }

    
}
