/**Clase para manejar las entradas de un blog.
 * @since 21/03/1999.
 * @version 2.3
 * @author PFQ
 */
public class EntradaBlogPFQ {
    /**
     * separador es el carácter que separa ENTRADA DE del nombre del autor
     */

    public static char separador=':';
    private int id;
    private String texto;
    private String autor;

    /**Constructor de la clase. recibe el número de entrada, el nombre del autor
     * de la entrada y el texto que contiene la entrada.
     * Si el número de entradaes negativo, lanza una excepción.
     *
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */
    public EntradaBlogPFQ(int id,String autor,String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }
    @Override
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     * Devuelve el número de la entrada
     */
    public int getId(){
        return this.id;
    }

    /**
     * Devuelve el texto completo de la entrada
     */
    public String getTexto(){
        return this.texto;
    }

    /**
     * Devuelve el nombre del autor de la entrada en mayúsculas
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /**
     * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     */
    public String devuelveAutor(){
        return this.autor;
    }

    /**
     * No tiene porqué tener argumentos.
     */
    public static void main(String[] args) {
        //Modificar.
        EntradaBlogPFQ e1=new EntradaBlogPFQ (3,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}
