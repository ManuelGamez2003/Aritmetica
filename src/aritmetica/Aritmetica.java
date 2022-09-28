/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author Alumno Mañana
 */
public class Aritmetica {
    private float num1;
    private float num2;

    public Aritmetica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public float suma(float num1, float num2){
        
        return num1+num2;
    }
    public float resta(float num1, float num2){
        
        return num1-num2;
    }
    public float multiplicacion(float num1, float num2){
        
        return num1*num2;
    }
    public float division(float num1, float num2){
         
        return num1/num2;
    }
    
    
}
