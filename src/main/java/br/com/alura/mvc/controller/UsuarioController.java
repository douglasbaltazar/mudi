package br.com.alura.mvc.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.model.Pedido;
import br.com.alura.mvc.model.StatusPedido;
import br.com.alura.mvc.repository.PedidoRepository;

@Controller
@RequestMapping("usuario")
public class UsuarioController {
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
	public String home(Model model, Principal principal) {
		List<Pedido> pedidos = pedidoRepository.findAllByUsuario(principal.getName());
		model.addAttribute("pedidos", pedidos);
		return "usuario/home";
	}
	@GetMapping("{status}")
	public String porStatus(@PathVariable("status") String status, Model model, Principal principal) {
		List<Pedido> pedidos = pedidoRepository.findByStatusEUsuario(StatusPedido.valueOf(status.toUpperCase()), principal.getName());
		model.addAttribute("pedidos", pedidos);
		model.addAttribute("status", status);
		return "usuario/home";
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/usuario";
	}
}
