package com.mesfin.fizzbuzz;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzbuzzController {
    @RequestMapping("/")
    public String fizzbuzz(){
        String finalResult="";

for(int i = 1 ; i <=100; i++){
    System.out.println(i);
    if ( i % 3  == 0 ){
    System.out.println("fizz");
   finalResult+= "fizz";}
    if (i % 5 == 0 ){
    System.out.println("buzz");
    finalResult+= ("buzz");}
    if ( i % 3== 0 && i % 5 == 0){
        System.out.println("fizzbuzz");
        finalResult+= ("fizzbuzz");
            }

        }


return (finalResult);
    }



}
