


    package entregas.garciaJacobo;

class Fecha {

    public Fecha();

    public Fecha(int dia, int mes, int anio);

    public Fecha(int dia, int mes);

    public Fecha(int anio);

    public Fecha(String fechaTexto);

    public boolean esBisiesto();

    public int diasDelMes();

    public boolean fechaValida();

    public void sumarDias(int dias);

    public void restarDias(int dias);

    public int compararCon(Fecha otraFecha);

    public int diasEntre(Fecha otraFecha);

    public boolean esAnteriorA(Fecha otraFecha);

    public boolean esPosteriorA(Fecha otraFecha);

    public void mostrarFecha();

    public void nuevaFecha();

    public void editarFecha(int dias, int meses, int anio);

}

class Intervalo {

    public Intervalo (double inicio, double fin )

    public Intervalo (double fin)

    public Intervalo ()

    public Intervalo (Intervalo intervalo )

    public double longitud();

    public void desplazar(double desplazamiento)

    public Intervalo desplazado(double desplazamiento)

    public boolean incluye(double punto)

    public boolean incluye (Intervalo intervalo)

    public boolean igual(Intervalo intervalo)

    public Intervalo interseccion(Intervalo intervalo)

    public boolean intersecta (Intervalo intervalo)

    public void mostrar()

    public void editar()

    public Intervalo[] cortar(int trozos)

    public Intervalo union(Intervalo intervalo)

    public double puntoMedio();

}

}
