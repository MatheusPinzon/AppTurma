package br.com.matheus.utilitarios.validadores;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {
    
    @Test
    public void ehInteiro(){
        assertTrue( StringUtils.ehInteiro("1"));
        assertTrue( StringUtils.ehInteiro("1020"));
        assertFalse( StringUtils.ehInteiro(""));
        assertFalse(StringUtils.ehInteiro(","));
        assertFalse(StringUtils.ehInteiro("1.0"));
        assertFalse(StringUtils.ehInteiro("A"));
        assertFalse(StringUtils.ehInteiro("1A"));
        
        
    }
    
    
}
