package modulos.produto;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@DisplayName("Testes de API REST do modulo de produto")
public class ProdutoTest {
    @Test
    @DisplayName("Validar os limites proibidos do valor do produto")
    public void testValidarLimitesValor() {
        //Configurar os dados da API
        baseURI = "http://165.227.93.41";
        basePath = "/lojinha";

        //Obter o token do usuario
        String token = given()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"usuarioLogin\": \"admin\",\n" +
                        "  \"usuarioSenha\": \"admin\"\n" +
                        "}")
                .when()
                    .post("/v2/login")
                .then()
                    .extract()
                    .path("data.token");
        System.out.println(token);
        //Inserir um produto com valor 00
    }
}