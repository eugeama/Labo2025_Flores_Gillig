package SIstemaPrestamosV;

import java.time.LocalDate;

public class Prestamo {
    private MetodoPrestamo articulo;
    private int numeroSocio;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(MetodoPrestamo articulo, int numeroSocio, LocalDate fechaPrestamo) {
        this.articulo = articulo;
        this.numeroSocio = numeroSocio;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaPrestamo.plusDays(this.articulo.devolucion());
    }

    public MetodoPrestamo getArticulo() {
        return articulo;
    }

    public void setArticulo(MetodoPrestamo articulo) {
        this.articulo = articulo;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean devueltoEnFecha() {
        if (getFechaDevolucion().isAfter(LocalDate.now())) {
            return true;
        }
        return false;
    }

    public void verificarPrestamo(Usuario usuarioV, Prestamo prestamoV) throws ExcepcionFueraDeFecha {
        if (!prestamoV.devueltoEnFecha()) {
            usuarioV.setCredito(prestamoV.getArticulo().calcularMulta(usuarioV));
            throw new ExcepcionFueraDeFecha("Prestamo devuelto fuera de fecha");
        }
        usuarioV.getPublisPrestadas().put(prestamoV, usuarioV.getPublisPrestadas().get(prestamoV) + 1);
    }
}
