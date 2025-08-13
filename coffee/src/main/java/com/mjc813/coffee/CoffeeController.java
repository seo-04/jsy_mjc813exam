package com.mjc813.coffee;

import org.springframework.stereotype.Controller;
import com.mjc813.coffee.dto.coffeeDto;
import com.mjc813.coffee.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CoffeeController {
    @Autowired
    private CoffeeService service;

    @GetMapping("/")
    public String list(Model model) {
        List<coffeeDto> coffeeList = service.getAll();
        model.addAttribute("coffeeList", coffeeList);
        return "coffee/list";
    }

    @PostMapping("/insert")
    public String insert(coffeeDto dto) {
        try {
            service.insert(dto);
        } catch (Exception e) {
            return "error";
        }
        return "redirect:/";
    }

    @PostMapping("/update")
    public String update(coffeeDto dto) {
        try {
            service.update(dto);
        } catch (Exception e) {
            return "error";
        }
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        try {
            service.delete(id);
        } catch (Exception e) {
            return "error";
        }
        return "redirect:/";
    }
}
