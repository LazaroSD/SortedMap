import java.util.SortedMap;
import java.util.TreeMap;

public class UwU {
    public int idPersona; public String nombre; public int altura;public SortedMap<String,String> agendatel;
    
    public UwU(int idPersona, String nombre, int altura) {
        this.idPersona = idPersona; this.nombre = nombre; this.altura = altura;
        this.agendatel = new TreeMap<String,String>();
    }

    public String toString() {
        return "Persona-> ID: "+idPersona+" Nombre: "+nombre +" Altura: "+altura+"\nAgenda:\n"+agendatel.toString().replaceAll(",","\n");
    }

    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }
        final UwU other = (UwU) obj;
        if (this.idPersona != other.idPersona) { return false; }
        return true;
    }

}