
package lcd_arduino;


public class rutas {
    String ruta;
    String lugares[] = new String[7];

    public rutas(String ruta) {
        this.ruta = ruta;
    }

    public rutas() {
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String[] getLugares(int i) {
        String lugar = lugares[0];
        return lugares;
    }

    public void setLugares(String[] lugares) {
        this.lugares = lugares;
    }
    
    
}
