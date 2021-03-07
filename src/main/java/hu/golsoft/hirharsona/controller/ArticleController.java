package hu.golsoft.hirharsona.controller;

import hu.golsoft.hirharsona.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ArticleController {

    @Autowired
    ArticleService artRepo;

    @RequestMapping("/")
    public String fullart(Model model){
        model.addAttribute("pageTitle","Hírharsona");
        model.addAttribute("sideTitle", "Minden cikk");
        model.addAttribute("articles", artRepo.getSel());
        ArrayList<String> jour = new ArrayList<>();
        for (int i = 0; i < artRepo.getSel().size(); i++) {
            jour.add(artRepo.getSel().get(i).getAuthName());
            System.out.println(artRepo.getSel().get(i).getAuthName());
        }
        model.addAttribute("authors",jour);
        model.addAttribute("meret",artRepo.getSel().size());
        return "main";
    }

    @RequestMapping("/tenf")
    public String lastTen(Model model){
        model.addAttribute("pageTitle","Hírharsona");
        model.addAttribute("sideTitle", "Legfrissebb tíz cikk");
        model.addAttribute("articles", artRepo.getLast());
        ArrayList<String> jour = new ArrayList<>();
        for (int i = 0; i < artRepo.getLast().size(); i++) {
            jour.add(artRepo.getLast().get(i).getAuthName());
            System.out.println(artRepo.getLast().get(i).getAuthName());
        }
        model.addAttribute("authors",jour);
        model.addAttribute("meret",artRepo.getLast().size());
        return "last";
    }
}
