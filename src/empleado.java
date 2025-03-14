public class empleado {
    private String nombre;
    private int Id_empleado;
    private double salario;
    private String Departamento;

    public empleado(){

    }

    public empleado(String nombre, int id_empleado, double salario, String departamento) {
        this.nombre = nombre;
        Id_empleado = id_empleado;
        this.salario = salario;
        Departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_empleado() {
        return Id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        Id_empleado = id_empleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    @Override
    public String toString() {
        return "empleado{" +
                "nombre='" + nombre + '\'' +
                ", Id_empleado=" + Id_empleado +
                ", salario=" + salario +
                ", Departamento='" + Departamento + '\'' +
                '}';
    }

    public void aumentarSalario(double porcentaje){
        this.salario += this.salario*(porcentaje/100);

    }
    public void cambiarDepartamento(String nuevo_departamento){
        this.Departamento=nuevo_departamento;
    }
    public void mostrarinfo(){
        System.out.println("Nombre "+nombre);
        System.out.println("ID "+Id_empleado);
        System.out.println("Salario "+ salario);
        System.out.println("Departamento "+Departamento);
    }

}
