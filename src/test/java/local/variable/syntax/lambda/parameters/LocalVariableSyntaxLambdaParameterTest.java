package local.variable.syntax.lambda.parameters;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LocalVariableSyntaxLambdaParameterTest {

    @Test
    public void before() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer numero) {
                System.out.println(numero);
            }
        });
    }

    @Test
    public void methodTest() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.forEach((var numero) -> {
            System.out.println(numero);
        });
    }

}
