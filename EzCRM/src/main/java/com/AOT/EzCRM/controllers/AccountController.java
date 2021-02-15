package com.AOT.EzCRM.controllers;


import com.AOT.EzCRM.dtos.UserGetDto;
import com.AOT.EzCRM.dtos.UserPostDto;
import com.AOT.EzCRM.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")

public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping
    public ResponseEntity<UserGetDto> createStudent(@RequestBody UserPostDto userPostDto) {
        UserGetDto userGetDto = accountService.createUser(userPostDto);

        return ResponseEntity.ok(userGetDto);
    }


}
