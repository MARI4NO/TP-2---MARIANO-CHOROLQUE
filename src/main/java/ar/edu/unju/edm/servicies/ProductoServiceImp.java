package ar.edu.unju.edm.servicies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Producto;

@Service
public class ProductoServiceImp implements IProducto {
	//intanciar Lista
	public static List<Producto> listaProducto = new ArrayList<Producto> ();
	
	@Autowired
	//no hay que tocarlo ya que si le definimos un valor , este nos devolvera siempre el mismo :)
	Producto unProducto;
	
	@Override
	public void eliminarProducto(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarProducto(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto nuevoProducto() {
		// TODO Auto-generated method stub
		return unProducto;
	}

	@Override
	public List<Producto> obtenerTodos() {
		// TODO Auto-generated method stub
		return listaProducto;
	}

	@Override
	public void guardarProducto(Producto unProducto) {
		// TODO Auto-generated method stub
		listaProducto.add(unProducto);
	}

	@Override
	public Producto obtenerUltimo() {
		// TODO Auto-generated method stub
		int indice = listaProducto.size()-1;
		return listaProducto.get(indice);
	}
	
}
