package Biblioteca_Virtual;

public enum Membresias {
    BRONCE(5), PLATA(15), ORO(50);

    private int prestamo;

    private Membresias(int prestamo){
        this.prestamo= prestamo;
    }

    public int getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
    }
}
