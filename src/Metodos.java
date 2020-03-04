

import java.util.List;
import java.util.ArrayList;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Metodos {

	private ObjectContainer db = null;

	private void abrirRegistro() {
		db = Db4oEmbedded.openFile("registroClientes");
	}

	private void cerrarRegistro() {
		db.close();
	}

	void insertarRegistro(cliente p) {
		abrirRegistro();
		db.store(p);
		cerrarRegistro();
	}

	public List<cliente> seleccionarPersonas() {
		abrirRegistro();
		ObjectSet<Object> listaPersonas = db.queryByExample(cliente.class);
		List<cliente> lp = new ArrayList<>();

		for (Object listaPersonas1 : listaPersonas) {
			lp.add((cliente) listaPersonas1);
		}

		cerrarRegistro();

		return lp;
	}

	public cliente seleccionarPersona(cliente p) {
		abrirRegistro();
		ObjectSet<Object> resultado = db.queryByExample(p);
		cliente cliente = (cliente) resultado.next();
		cerrarRegistro();
		return cliente;
	}

	
             
	
	}


