/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorfrase;

/**
 * @author Xavi Bermejo Borrella
 * @since 3/2/2025 10:15 AM
 * @version 1.0
 */
public final class ContadorFrase implements Metode {
    // variables
    private String frase;
    private int qt_Vocals = 0,qt_Consonants = 0,qt_Numeros=0,qt_Caracters_Especials = 0;
    // Constructor
    public ContadorFrase(String frase) {
        this.setFrase(frase);
    }
    //getters i setters 
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getQt_Vocals() {
        return qt_Vocals;
    }

    public void setQt_Vocals(int qt_Vocals) {
        this.qt_Vocals = qt_Vocals;
    }

    public int getQt_Consonants() {
        return qt_Consonants;
    }

    public void setQt_Consonants(int qt_Consonants) {
        this.qt_Consonants = qt_Consonants;
    }

    public int getQt_Numeros() {
        return qt_Numeros;
    }

    public void setQt_Numeros(int qt_Numeros) {
        this.qt_Numeros = qt_Numeros;
    }

    public int getQt_Caracters_Especials() {
        return qt_Caracters_Especials;
    }

    public void setQt_Caracters_Especials(int qt_Caracters_Especials) {
        this.qt_Caracters_Especials = qt_Caracters_Especials;
    }
    // Metode
    /**
     * 
     * @param frase es donara una frase i anirà llegint caracter per caracter.
     * si el caracter es una vocal, el qt_Vocal incrementa
     * si el caracter es una consonant, el qt_Consonant incrementa
     * si el caracter es un numero, el qt_Numero incrementa
     * si el caracter es un caracter especial('.','+','_'), el qt_Caracters_especials incrementa
     */
    @Override
    public void ContadorCadena(String frase) {
        this.setFrase(frase);
        for (int i = 0; i < this.getFrase().length(); i++) {
            if(this.getFrase().charAt(i) == 'a' || this.getFrase().charAt(i) == 'e' || this.getFrase().charAt(i) == 'i'||this.getFrase().charAt(i) == 'o' || this.getFrase().charAt(i) == 'u'){
               this.setQt_Vocals(this.getQt_Vocals()+1);
            }else if(this.getFrase().charAt(i) == 'A' || this.getFrase().charAt(i) == 'E' || this.getFrase().charAt(i) == 'I'||this.getFrase().charAt(i) == 'O' || this.getFrase().charAt(i) == 'U'){
                this.setQt_Vocals(this.getQt_Vocals()+1);
            }else if(this.getFrase().charAt(i) >= 'b' && this.getFrase().charAt(i) <='z'){
                this.setQt_Consonants(this.getQt_Consonants()+1);
            }else if(this.getFrase().charAt(i) >= 'B' && this.getFrase().charAt(i) <='Z'){
                this.setQt_Consonants(this.getQt_Consonants()+1);
            }else if(this.getFrase().charAt(i)>= '0'  && this.getFrase().charAt(i) <='9'){
                this.setQt_Numeros(this.getQt_Numeros()+1);
            }else{
                this.setQt_Caracters_Especials(this.getQt_Caracters_Especials()+1);
            }
        }   
        
    }

    @Override
    public String toString() {
        return "Frase = " +this.getFrase()+ "\nQuantitat de Vocals = " + this.getQt_Vocals() + "\nQuantitat de Consonants = " +this.getQt_Consonants()+ "\nQuantitat de Numeros = " +this.getQt_Numeros()+ "\nQuantitat de Caracters especials = " +this.getQt_Caracters_Especials();
    }
   
    
}
