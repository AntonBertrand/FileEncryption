package com.example.mypackage;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        encodeString(readFile("D:\\Java Course\\FileEncoder\\File.txt"));
    }

    public static String readFile(String fileName){
        Path filePath = Paths.get(fileName);
        try
        {
            String content = Files.readString(filePath);
            return content;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void encodeString(String content){
        StringBuilder encodedString = new StringBuilder();

        for (int i = 0; i < content.length(); i++) {
            char character = content.charAt(i);

            if (character >= 'a' && character <= 'm') {
                character += 13;
            }
            else if (character >= 'n' && character <= 'z') {
                character -= 13;
            }
            encodedString.append(character);
        }
        System.out.println(encodedString.toString());
    }

}