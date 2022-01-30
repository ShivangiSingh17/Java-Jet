using System;
using System.Collections.Generic;
class HelloWorld {
  static void Main() {
        //Read input from user
        string str = Console.ReadLine();
        
        //Dictionary to store distinct character and its number of occurences
        Dictionary<char,int> dict = new Dictionary<char,int>();
        
        //Loop through every character of string.
        for(int i=0;i<str.Length;i++){
            if(dict.ContainsKey(str[i]))
                dict[str[i]]++;
            else 
                dict[str[i]] = 1;
        }
        
        //Print only distinct character which occurs more than once
        foreach(KeyValuePair<char,int> kvp in dict){
            if(kvp.Value > 1)
                 Console.WriteLine(kvp.Key + " " + kvp.Value);
        }
    }
}