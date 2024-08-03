package test;

import atividade.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PessoaTest {

/*
    @Test
    public void testSaudacao() throws Exception {
        Pessoa pessoa = new Pessoa("Guilherme");
        Assert.assertEquals("Olá, Guilherme", pessoa.saudacao());
    }
*/

    @Test
    public void testSaudacao() throws Exception {
        Pessoa pessoa = new Pessoa("Guilherme");

        Method method = Pessoa.class.getDeclaredMethod("saudacao");
        method.setAccessible(true);

        String saudacao = (String) method.invoke(pessoa);
        Assert.assertEquals("Olá, Guilherme", saudacao);
    }

    @Test
    public void testModificarCampoPrivado() throws Exception {
        Pessoa pessoa = new Pessoa("Guilherme");

        Field field = Pessoa.class.getDeclaredField("name");
        field.setAccessible(true);

        field.set(pessoa, "Gabriel");
        Assert.assertEquals("Gabriel", pessoa.getName());
    }

}
