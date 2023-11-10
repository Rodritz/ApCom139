package Models;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Materia implements Comparable<Object>{

    private int legajo;
    private String nombre;
    private Set<Materia> materiasCorrelativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        //this.setMateriasCorrelativas(new HashSet<>());
        this.setMateriasCorrelativas(new TreeSet<>());//el TreeSet requiere implementar Comparable<Object>
    }
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void setMateriasCorrelativas(Set<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }

    @Override
    public int compareTo(Object o) {
        Materia m = (Materia) o;
        return this.getNombre().compareTo(m.getNombre());
    }
}
