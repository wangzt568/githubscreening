package com.palindrome.repository;

import com.palindrome.model.Palindrome;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PalindromeRepository extends CrudRepository<Palindrome, String> {
    List<Palindrome> findAll();
}
