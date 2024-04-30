package com.example;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Userclass 
{
	private int sno;
	private String name;
	private long phn;
}
