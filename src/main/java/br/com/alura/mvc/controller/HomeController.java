package br.com.alura.mvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		Pedido p = new Pedido();
		p.setNomeProduto("Celular Xiaomi Redmi 8");
		p.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/41JRH9AIznL._AC_.jpg");
		p.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Redmi-Dual-Sapphire/dp/B07Z626NTB/ref=asc_df_B07Z626NTB/?tag=googleshopp00-20&linkCode=df0&hvadid=379727795989&hvpos=&hvnetw=g&hvrand=11529382236782558772&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9047717&hvtargid=pla-834986734930&psc=1");
		p.setDescricao("uma descrição qualquer");
		//p.setValorNegociado(1090);
		
		List<Pedido> pedidos = Arrays.asList(p);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
