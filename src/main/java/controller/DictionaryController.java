package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @GetMapping
    public String home(){
        return "dictionary";
    }
    @PostMapping
    public String save(@RequestParam(name = "english", required = true)String english, Model model){
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("hello","Xin Chao");
        dictionary.put("dog", "Cho");
        dictionary.put("cat", "Meo");
        String result = null;

        if (dictionary.containsKey(english)) {
            result = dictionary.get(english);
        } else {
            result = "Khong tim thay";
        }

        System.out.println(english);
        model.addAttribute("result", result);
        return "dictionary";
    }
}
