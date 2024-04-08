package arrayList_HashMap;

public class Discos implements Comparable<Discos>{
    private int codigo;
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private int genero;

    public Discos(String titulo, String autor, int anoPublicacion, int genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Disco: " +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", genero='" + genero + '\'';
    }

    @Override
    public int compareTo(Discos o) {
        return Integer.compare(this.getCodigo(), o.getCodigo());
    }
}
