package co.edu.uniquindio.poo;

public enum EstadoOperativo {
    DISPONIBLE(0), EN_MISION(1), EN_MANTENIMIENTO(2);

    private final int valor;

    EstadoOperativo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
