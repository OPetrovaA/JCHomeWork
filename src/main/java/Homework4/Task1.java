package Homework4;
/*
@author Petrova Olya
 */
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Task1 {
    public static void main(String[] args) {
                List<String> vegetables = Arrays.asList(
                        "broccoli", "carrot", "pumpkin", "pepper", "potato",
                        "cucumber", "a tomato", "beet", "cabbage",  "carrot", "pumpkin", "pepper", "carrot", "pumpkin", "pepper",
                        "broccoli", "carrot", "pumpkin"
                );

                Set<String> unique = new HashSet<String>(vegetables);

                System.out.println("Овощная корзина");
                System.out.println(vegetables.toString());
                System.out.println("Уникальные овощи");
                System.out.println(unique.toString());
                System.out.println("по сколько овощей в корзине");
                for (String key : unique) {
                    System.out.println(key + ": " + Collections.frequency(vegetables, key));
                }
            }
        }

