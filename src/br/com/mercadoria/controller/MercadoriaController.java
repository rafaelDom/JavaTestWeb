package br.com.mercadoria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.mercadoria.dao.MercadoriaDAO;
import br.com.mercadoria.modelo.Mercadoria;

@Controller
public class MercadoriaController {

	MercadoriaDAO dao = new MercadoriaDAO();

	@RequestMapping("mercadoria-incluir")
	public String viem_mercadoria_incluir() {

		return "mercadoria/mercadoria-incluir";
	}

	@RequestMapping("mercadoria")
	public String viem_mercadoria() {

		return "mercadoria/mercadoria";
	}

	@RequestMapping("home")
	public String viem_home() {

		return "home";
	}

	@RequestMapping("adicionaMercadoria")
	public String form(Mercadoria mercadoria) {
		MercadoriaDAO dao = new MercadoriaDAO();
		dao.inserir(mercadoria);
		return "mercadoria/mercadoria-incluir";
	}

	@RequestMapping(value = "/mercadoria", method = RequestMethod.GET)
	public ModelAndView getdata(){
		List<Mercadoria> list = getList();
		ModelAndView model = new ModelAndView("mercadoria/mercadoria");
		model.addObject("lists",list); 
		
		return model;
		
	}

	private List<Mercadoria> getList() {

		List<Mercadoria> list = new ArrayList<Mercadoria>();
		list = dao.listar();

		return list;

	}
}
