package eviden;

public interface InterfazDocumento {

	String getTitulo();

	void setTitulo(String titulo);

	String getContenido();

	void setContenidos(String contenido);

	int getNumPaginasImpresion();

	void setNumPaginasImpresion(int numPaginas);
	
	String getTipoLetra();
}
