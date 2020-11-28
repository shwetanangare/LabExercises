package com.cg.training.service;


@FunctionalInterface
public interface Authentication
{
	public Boolean Authenticate(String username,String password);
}