package com.palindrome.service;

import com.palindrome.utils.LongestPalindrome;
import com.palindrome.model.Palindrome;
import com.palindrome.repository.PalindromeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PalindromeService {

    @Autowired
    private PalindromeRepository palindromeRepository;

    @Autowired
    LongestPalindrome longestPalindrome;

    public List<Palindrome> findAll() {
        List<Palindrome> palindromes = palindromeRepository.findAll();
        if(palindromes.size() == 0) {
            return new ArrayList<Palindrome>();
        }
        return palindromes;
    }

    public Palindrome findById(String id) {
        Optional<Palindrome> palindrome = palindromeRepository.findById(id);
        return palindrome.orElseGet(Palindrome::new);
    }

    public Palindrome create(Palindrome palindrome){
        if(palindrome.getId() == null) {
            palindrome.setId(UUID.randomUUID().toString());
        }
        palindrome.setPalindrome(longestPalindrome.searchLongestPalindrome(palindrome.getString()));
        palindromeRepository.save(palindrome);
        return palindrome;
    }
}
