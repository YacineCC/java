package fr.univtln.haouas.samples;

public class ComparateurNom implements Comparable<Animal>{


    @Override
    public int compareTo(Animal o) {
        return o.compareTo(o.nom);
    }
}
