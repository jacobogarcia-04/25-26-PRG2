package entregas.garciaJacobo;

public class Menu {
    private Console console;
    public Menu(){
         console=new Console();
    }

    public int pedirOpcion() {
        console.readInt("");
    }

    public void mostrarMenu() {
       
    }

}
