/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.amt.mavenproject1;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Supannika.Pattanodom
 */
@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private String name;
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
