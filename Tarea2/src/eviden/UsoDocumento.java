package eviden;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoDocumento {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(DocumentoConfig.class);

		// Creación de documentos
		InterfazDocumento documentoTexto = contexto.getBean("documentoTexto", DocumentoTexto.class);
		InterfazDocumento documentoTexto2 = contexto.getBean("documentoTexto", DocumentoTexto.class);
		InterfazDocumento documentoPresentacion = contexto.getBean("documentoPresentacion",
				DocumentoPresentacion.class);
		InterfazDocumento documentoPDF = contexto.getBean("documentoPDF", DocumentoPDF.class);

		// Setters
		documentoTexto.setTitulo("Documento de texto");
		documentoTexto.setContenidos("Contenido del documento de texto.");
		documentoTexto.setNumPaginasImpresion(5);

		documentoTexto2.setTitulo("Documento de texto");
		documentoTexto2.setContenidos("Contenido del documento de texto 2.");
		documentoTexto2.setNumPaginasImpresion(35);

		documentoPresentacion.setTitulo("Presentación");
		documentoPresentacion.setContenidos("Contenido de la presentación.");
		documentoPresentacion.setNumPaginasImpresion(10);

		documentoPDF.setTitulo("Documento PDF");
		documentoPDF.setContenidos("Contenido del documento PDF.");
		documentoPDF.setNumPaginasImpresion(15);

		// Getters

		System.out.println("Documento de presentación:");
		System.out.println("Título: " + documentoPresentacion.getTitulo());
		System.out.println("Contenido: " + documentoPresentacion.getContenido());
		System.out.println("Número de páginas: " + documentoPresentacion.getNumPaginasImpresion());
		System.out.println("Tipo de letra: " + documentoPresentacion.getTipoLetra());

		System.out.println(" ");

		System.out.println("Documento PDF:");
		System.out.println("Título: " + documentoPDF.getTitulo());
		System.out.println("Contenido: " + documentoPDF.getContenido());
		System.out.println("Número de páginas: " + documentoPDF.getNumPaginasImpresion());
		System.out.println("Tipo de letra: " + documentoPDF.getTipoLetra());

		System.out.println(" ");

		System.out.println("Documento de texto:");
		System.out.println("Título: " + documentoTexto.getTitulo());
		System.out.println("Contenido: " + documentoTexto.getContenido());
		System.out.println("Número de páginas: " + documentoTexto.getNumPaginasImpresion());
		System.out.println("Tipo de letra: " + documentoPresentacion.getTipoLetra());
		System.out.println(" ");

		System.out.println("Documento de texto2:");
		System.out.println("Título: " + documentoTexto2.getTitulo());
		System.out.println("Contenido: " + documentoTexto2.getContenido());
		System.out.println("Número de páginas: " + documentoTexto2.getNumPaginasImpresion());
		System.out.println("Tipo de letra: " + documentoPresentacion.getTipoLetra());

		System.out.println(" ");

		if (documentoTexto != documentoTexto2) {
			System.out.println("Los documentos de texto apuntan a diferente lugares en memoria");
			System.out.println(documentoTexto + "\n" + documentoTexto2);

		}
		
		// Cerramos el contexto
		
		contexto.close();

	}

}
