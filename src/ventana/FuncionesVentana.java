package ventana;

import fecha_y_hora.FechaYHora;
import javax.swing.JLabel;

public class FuncionesVentana {

    FechaYHora fechaYHora;

    public FuncionesVentana() {
        fechaYHora = new FechaYHora();
    }

    protected void setHoraYFecha(JLabel jlb_hora){
        fechaYHora = new FechaYHora();
        
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                while(true){
                    try {
                        jlb_hora.setText(fechaYHora.obtenerFechaYHora());
                        Thread.sleep(100);
                        Thread.yield();
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        
        Thread hilo = new Thread(runnable);
        hilo.start();
        //Pensar lo del join()
    }
    
}
