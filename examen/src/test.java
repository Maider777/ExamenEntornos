import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class test{

    @Test
    @DisplayName("test1")//dar nombre al test
    public void test1(){//crear test
        calculadora calc = new calculadora();//crear objeto de calculadora
        int resultado = calc.NumInt("unoo  ");//crear resultado de tipo entero
        assertEquals(1, resultado);//comparar resultados
    }

    @Test
    @DisplayName("devolver array")//dar nombre al test
    public void test2(){//crear test
        calculadora calc = new calculadora();//crear objeto
        List<Integer> result = new ArrayList<Integer>();//crear lista de enteros, array list
        result = calc.valorDeNumero("unoo  Doss");//crear resultado referenciando con calculadora
        List<Integer> solucion = new ArrayList<Integer>(List.of(1, 2));//dar valores a la solucion
        assertEquals(solucion, result);//comparar resultados
    }

}