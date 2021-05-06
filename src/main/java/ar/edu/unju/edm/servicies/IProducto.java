package ar.edu.unju.edm.servicies;

import java.util.List;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Producto;

@Service
public interface IProducto {
	public void eliminarProducto (int codigo);
	public void modificarProducto (int codigo);
	public Producto nuevoProducto ();
	public List<Producto> obtenerTodos ();
	public void guardarProducto (Producto unProducto);
	public Producto obtenerUltimo ();
}
