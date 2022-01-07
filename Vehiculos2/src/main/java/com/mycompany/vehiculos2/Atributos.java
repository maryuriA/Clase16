/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehiculos2;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Atributos {

         private String propietario;
        private double valorComercial;
        private  String color;
         private  String placa;
          private  String matriculado;
           private  int aniofabricacion;

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(String matriculado) {
        this.matriculado = matriculado;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }
           
          
           public Atributos (String propietario){
               this.propietario = propietario;
                 JOptionPane.showInternalMessageDialog(null,"BIENVENIDOS,Los ddatos de vehiculos son:");
          
           }
    public String calcularAnio(){
        double anioActual = 2021-aniofabricacion;
        
        if(anioActual >=2){
            return "NO DEBE PRESENTARSE A LA REVISION";
        }else{
            return "SI DEBE PRESENTARSE A LA REVISION";
        }
    }
    
    public String datos(){
        String informacion = "INFORMACION DEL VEHICULO\n"
                +"Propietario:"+ propietario+"\n"
                +"Vlor Comercal:"+ valorComercial +"\n"
                +"Placa:"+ placa + "\n"
                +"Matricual:"+ matriculado + "\n"
                +"Anio Fabricacion:"+ aniofabricacion + "\n";
                
                return informacion;
       
                
    }
}

    

