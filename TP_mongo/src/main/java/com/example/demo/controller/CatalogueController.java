package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IProduitRepository;
import com.example.demo.entities.Produit;

@RestController
public class CatalogueController {

	@Autowired
	private IProduitRepository prodRepo;
	
	@RequestMapping("/save")
	public Produit saveProduit(Produit p) {
		prodRepo.save(p);
		return p;	
	}
	
	@RequestMapping("/getall")
	public List<Produit> saveProduit() {
		
		return prodRepo.findAll();	
	}

	@RequestMapping ("/produits")

	public Page<Produit> getProduits(int page) {
		//return prodRepo.findAll(pageable);
		  return prodRepo.findAll(PageRequest.of(page, 5, Sort.by("id")));	

}
}
