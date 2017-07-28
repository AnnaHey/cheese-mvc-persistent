package org.launchcode.controllers;

import org.launchcode.models.data.CategoryDao;
import org.launchcode.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Anna Hexter on 7/21/2017.
 */

@Controller
@RequestMapping(value = "category")
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("categories", categoryDao.findAll());
        model.addAttribute("title", "Categories");

        return "category/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {

        model.addAttribute("newCategory()");
        model.addAttribute ("title", "Add Category");

        return "category/add";

        }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(Model model, @ModelAttribute @Valid Category category,
        Errors errors) {

        if (errors.hasErrors()) {
        model.addAttribute("title", "Add Category");
        return "category/add";
        }

        categoryDao.save(category);
        return "redirect:";
    }
}