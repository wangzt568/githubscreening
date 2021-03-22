package com.palindrome.controller;

import com.palindrome.model.Palindrome;
import com.palindrome.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "v1/palindrome")
public class PalindromeController {

    @Autowired
    PalindromeService palindromeService;

    @GetMapping
    public ResponseEntity<List<Palindrome>> retrieveAll(){
        return ResponseEntity.ok(palindromeService.findAll());
    }

    @GetMapping(value = "/{palindromeId}")
    public ResponseEntity<Palindrome> findById(@PathVariable("palindromeId") String id) {
        return ResponseEntity.ok(palindromeService.findById(id));
    }

    @PostMapping(consumes = "text/plain")
    public ResponseEntity<Palindrome> createPalindrome(@RequestBody String request){
        Palindrome create = new Palindrome();
        create.setString(request);
        return ResponseEntity.ok(palindromeService.create(create));
    }
}
