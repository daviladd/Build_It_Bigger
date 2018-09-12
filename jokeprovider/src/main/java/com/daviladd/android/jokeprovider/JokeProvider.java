package com.daviladd.android.jokeprovider;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JokeProvider {

    // Really bad jokes taken from https://short-funny.com
    static List<String> jokes = Arrays.asList(
            "Can a kangaroo jump higher than a house?\nOf course, a house doesn't jump at all.\n",
            "Doctor: I'm sorry but you suffer from a terminal illness and have only 10 to live.\n"
                    + "Patient: What do you mean, 10? 10 what? Months? Weeks?!\n"
                    + "Doctor: Nine.\n",
            "Anton, do you think I'm a bad mother?\nMy name is Paul.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.\n",
            "In a boomerang shop:\nI'd like to buy a new boomerang please. \nAlso, can you tell me how to throw the old one away?",
            "Patient: Oh doctor, I'm just so nervous. This is my first operation.\n"
                    + "Doctor: Don't worry. Mine too.\n",
            "Mr. Smith: Doctor, you remember this strengthening solution you prescribed me yesterday?\n"
                    + "Doctor: Yes, what's the matter?\n"
                    + "Mr. Smith: I would like to use it but I can't open the bottle!\n"
    );

    public JokeProvider() {
    }

    public static String getRandomJoke() {
        Random randomItem = new Random();
        return jokes.get(randomItem.nextInt(jokes.size()));
    }
}
