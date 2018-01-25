package com.mesfin.fizzbuzz;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzbuzzController {
    @RequestMapping("/")
    public String fizzbuzz(){
        String finalResult="fizz";
for(int i = 1 ; i <=100; i++){
    if ( i % 3  == 0 ){
    System.out.println("fizz");}
    if (i % 5 == 0 ){
    System.out.println("buzz");}
    if ( i % 3== 0 && i % 5 == 0){
        System.out.println("fizzbuzz");
            }

        }


return (finalResult);
    }



}
