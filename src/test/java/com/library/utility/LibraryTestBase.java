package com.library.utility;

import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.baseURI;
public class LibraryTestBase {

    public static ResponseSpecification reqLibrarianSpec;
    public static ResponseSpecification reqStudentSpec;
    public static void init(){
      baseURI ="https://library2.cydeo.com/rest/v1";


//        reqLibrarianSpec = (ResponseSpecification) given().
//                log().all()
//               .accept(ContentType.JSON)
//               .auth().basic("librarian10@library", "libraryUser");
//
//
//
//        reqStudentSpec = (ResponseSpecification) given().
//                log().all()
//                .accept(ContentType.JSON)
//                .auth().basic("student5@library", "libraryUser");
//
//    }

//    public static ResponseSpecification dynamicReqSpec(String username, String password){
//        return (ResponseSpecification) given().log().all()
//                .accept(ContentType.JSON)
//                .auth().basic(username,password);
//
//    }
//    public static ResponseSpecification dynamicResSpec(int statusCode){
//        return expect().statusCode(statusCode)
//                .contentType(ContentType.JSON);
//
//    }
//
//    public static void deleteBook(String bookId){
//
//        given().accept(ContentType.JSON)
//                .delete("https://library2.cydeo.com/rest/v1/"+bookId);



    }

}
