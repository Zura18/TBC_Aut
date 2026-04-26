package example;

import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.example.data.models.MoneyTransferSystem;
import org.example.steps.api.MoneyTransferApi;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertNotNull;

public class MoneyTransferTest {
    @Test
    public void MoneyTransferTest() {
        Response response = MoneyTransferApi.getMoneyTransfer();
        response.prettyPrint();
        assertEquals(response.getStatusCode(), 200);

        List<MoneyTransferSystem> systems =
                response.as(new TypeRef<List<MoneyTransferSystem>>() {});

        //assertFalse(MoneyTransferApi.isEmpty(), "Response is empty");

        systems.forEach(system -> {
            assertNotNull(system.getMtSystem(), "mtSystem is missing");
            assertNotNull(system.getName(), "name is missing");
            assertNotNull(system.getImageUrl(), "imageUrl is missing");
            assertNotNull(String.valueOf(system.getCurrencies()), "currencies is missing");

            // დამატებითი ვალიდაცია (რეკომენდებულია)
            assertFalse("mtSystem is blank", system.getMtSystem().isBlank());
            assertFalse("name is blank", system.getName().isBlank());
            assertFalse("imageUrl is blank", system.getImageUrl().isBlank());
            assertFalse("currencies is empty", system.getCurrencies().isEmpty());
        });
    }
}