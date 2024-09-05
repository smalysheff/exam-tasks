package ru.smal.simple_test;

import lombok.Getter;

@Getter
public class Generator{

	private String license;
	private String author;
	private String name;
	private String description;
	private String main;
	private Scripts scripts;
	private String version;
	private Dependencies dependencies;
}
