package br.com.treinaweb.springmvc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.treinaweb.springmvc.dominio.Album;

@Controller
@RequestMapping("/albuns")
public class AlbumController {
	
	@RequestMapping(value="/adicionar",method=RequestMethod.GET)
	public String Adicionar(Model model)
	{
		model.addAttribute("album",new Album());
		return "albuns/adicionar";
	}
	@RequestMapping(value="/adicionar",method=RequestMethod.POST)
	public String Adicionar(@ModelAttribute("album") @Valid Album novoAlbum,BindingResult result, Model model)
	
	{
		if (result.hasErrors()) {
			return "albuns/adicionar";
		}
		model.addAttribute("album", novoAlbum);
		
		return "albuns/exibir";
	}

}
