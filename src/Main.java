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

        Personas personas1 = new Personas("Piero","Javier",27, 1.64,"Calle los tiroles 123");
        //Personas personas2 = new Personas();
        System.out.println("DATOS ANTIGUOS");
        System.out.println("============================\n");
        String nombre = personas1.getNombre();
        String apellido = personas1.getApellido();
        int edad = personas1.getEdad();
        double talla = personas1.getTalla();
        String direccion = personas1.getDireccion();

        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Talla: "+talla);
        System.out.println("Dirección: "+direccion);

        System.out.println("DATOS ACTUALES");
        System.out.println("============================\n");
        String _name= JOptionPane.showInputDialog("Ingresar su nombre: ");
        personas1.setNombre(_name);
        String _apellido =JOptionPane.showInputDialog("Ingresar su apellido: ");
        personas1.setApellido(_apellido);
        String _dato =JOptionPane.showInputDialog("Ingresar edad: ");
        int _edad =Integer.parseInt(_dato);
        personas1.setEdad(_edad);
        String _dato2=JOptionPane.showInputDialog("Ingresar talla: ");
        double _talla = Double.parseDouble(_dato2);
        personas1.setTalla(_talla);
        String _direccion=JOptionPane.showInputDialog("Ingresar dirección: ");
        personas1.setDireccion(_direccion);

        System.out.println("Nombre: "+_name);
        System.out.println("Apellido: "+_apellido);
        System.out.println("Edad: "+_edad);
        System.out.println("Talla: "+_talla);
        System.out.println("Dirección: "+_direccion);
    }
}