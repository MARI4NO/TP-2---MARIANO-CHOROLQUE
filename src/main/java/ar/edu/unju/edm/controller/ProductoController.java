package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.servicies.IProducto;

@Controller
public class ProductoController {
	
	@Autowired
		IProducto ProductoServicio;
	
	//getmapping : enviar
	@GetMapping("/Producto")
		public String productoMostrar (Model modelo) {
			modelo.addAttribute("Producto", ProductoServicio.nuevoProducto());
			return "producto";
		}

	@GetMapping ("/Producto/UltimoProducto")
		public String mostrarUltimoProducto(Model modelo) {
			modelo.addAttribute("ultimo", ProductoServicio.obtenerUltimo());
			return "ultimo-Producto";
	}
	
	@GetMapping ("/Volver")
		public String volver() {
			return "redirect:/Producto";
	}
	
	//model permite enviar cosas a una pagina :)
	
	//PostMapping : recibir
	@PostMapping ("/Producto/Guardar")
		public String guardarProducto(@ModelAttribute(name ="Producto")Producto unProducto, Model modelo) {
			ProductoServicio.guardarProducto(unProducto);
			modelo.addAttribute("productos", ProductoServicio.obtenerTodos());
			return "resultado";
	}
	
	
	
}
