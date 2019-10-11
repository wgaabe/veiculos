/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProvaMODEL;

import ProvaPOJO.VeiculosPOJO;


public class CadVeicMODEL {
    
    public void verificar_campos (VeiculosPOJO vp) throws IllegalArgumentException
    
    
    {
            if(vp.getPlaca().equals("")){
            vp.setErro("Preencha a Placa");
            throw new IllegalArgumentException();
        }
            if(vp.getRenavan().equals("")){
            vp.setErro("Preencha o Renavan");
            throw new IllegalArgumentException();
        }
            if(vp.getChassi().equals("")){
            vp.setErro("Preencha o Chassi");
            throw new IllegalArgumentException();
        }
    
    
    }  
        
    
    
    
    } 
    

