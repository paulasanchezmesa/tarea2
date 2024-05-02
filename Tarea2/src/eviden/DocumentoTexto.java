package eviden;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DocumentoTexto implements InterfazDocumento {
	private String titulo, contenido;
	private int numPaginas;
	@Value("${letra1}")
    private String letra;

	@Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public void setContenidos(String contenido) {
        this.contenido=contenido;
    }

    @Override
    public int getNumPaginasImpresion() {
        return numPaginas;
    }

    @Override
    public void setNumPaginasImpresion(int numPaginas) {
        this.numPaginas=numPaginas;
    }
    
    @Override
    public String getTipoLetra() {
    	return letra;
    }


}
