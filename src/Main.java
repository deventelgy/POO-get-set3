import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
     /*
        String _nombre= JOptionPane.showInputDialog("Ingresar su nombre: ");
        String _apellido =JOptionPane.showInputDialog("Ingresar su apellido: ");
        String _dato =JOptionPane.showInputDialog("Ingresar edad: ");
        int _edad =Integer.parseInt(_dato);
        String _dato2=JOptionPane.showInputDialog("Ingresar talla: ");
        double _talla = Double.parseDouble(_dato2);
        String _direccion=JOptionPane.showInputDialog("Ingresar dirección: ");
     */

        Personas personas = new Personas("Piero", "Javier", 28, 1.65,"Calle los tiroles N° 123");
        System.out.println("Nombre: "+personas.nombre);
        System.out.println("Apellido: "+personas.apellido);
        System.out.println("Edad: "+personas.edad);
        System.out.println("Talla: "+personas.talla);
        System.out.println("Direccion: "+personas.direccion);
    }
}