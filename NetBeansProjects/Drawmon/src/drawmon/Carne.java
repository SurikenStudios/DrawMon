
package drawmon;

/**
 *
 * @author jczr8
 */
public class Carne extends Item {

    protected int pVida = 30;
    protected int pHambre = 20;
    protected int pPeso = 10;
    
    public Carne() {
    }

    public Carne(int pVida, int pHambre, int pPeso) {
        this.pVida = pVida;
        this.pHambre = pHambre;
        this.pPeso = pPeso;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }

    
    @Override
    public void consumir() {
        m.hambre += pHambre;
        m.salud += pVida;
        m.peso += pPeso;
    }

 

}
