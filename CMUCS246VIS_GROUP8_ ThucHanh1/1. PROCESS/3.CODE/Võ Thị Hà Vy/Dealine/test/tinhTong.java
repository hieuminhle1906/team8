/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Acer
 */
public class tinhTong {

    public static int calsum(int a[])
    {
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s=s+a[i];
        }
        return s;
    }
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testCalsum() {
        int a[] = {1,2,3,4,5};
        int result = t.calsum(a);
        int s=15;
        assertEquals(result,s);
    }
    @Test
    public void testCalsum1() {
        int a[] = {1,2,3,4,5};
        int result = t.calsum(a);
        int s=16;
        assertEquals(result,s);
    }
    }
    

