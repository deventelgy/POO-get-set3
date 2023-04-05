public class Personas {
    public String nombre;
    public String apellido;
    public int edad;
    public double talla;
    public String direccion;

    public Personas(String _nombre, String _apellido, int _edad, double _talla, String _direccion){
        this.nombre=_nombre;
        this.apellido=_apellido;
        this.edad=_edad;
        this.talla=_talla;
        this.direccion=_direccion;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String _nombre){
        this.nombre=_nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String _apellido){
        this.apellido=_apellido;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int _edad){
        this.edad=_edad;
    }
    public double getTalla(){
        return talla;
    }
    public void setTalla(double _talla){
        this.talla=_talla;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String _direccion){
        this.direccion=_direccion;
    }
}
