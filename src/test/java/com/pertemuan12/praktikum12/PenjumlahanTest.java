package com.pertemuan12.praktikum12;

import com.pertemuan12.praktikum12.Penjumlahan;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class PenjumlahanTest {

    @Test
    public void duaAngkaTest(){
        Penjumlahan penjumlahan = new Penjumlahan();
        int hasil = penjumlahan.duaAngka(3,7);
        assertEquals(10,hasil);
        System.out.println("Program berjalan");
    }

}
