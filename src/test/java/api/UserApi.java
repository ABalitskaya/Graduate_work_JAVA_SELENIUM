package api;

import com.github.javafaker.Faker;
import io.restassured.response.Response;

public class UserApi extends ApiBase {
    Response response;
    RegistrationDTO registrationDTO;
    Faker faker = new Faker();

    public UserApi() {
        registrationDTO = new RegistrationDTO();
    }
    public RegistrationDTO randomDataForNewUser(){
        registrationDTO.setName(faker.name().username());
        registrationDTO.setEmail(faker.internet().safeEmailAddress());
        registrationDTO.setPassword("123456");
        registrationDTO.setGenerate_link("false");
        return registrationDTO;
    }

    public Response registrationNewUserApi(Integer code){
        String endpoint = "/v1/api/users";
        response = doPostRequest(endpoint, code, randomDataForNewUser());
        return response;
    }
    public void deleteExistingUser(String userEmail, Integer code){
        String endpoint = "/v1/api/users/{email}";
        doDeleteRequest(endpoint,code, userEmail);
    }
}