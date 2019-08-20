package test;

//TODO make this singleton instance threadsafe
//Synchronize method?
// what else?
// add a list variable in singleton that will store some values
class Singleton 
{ 

    private static Singleton instance = null; 
  
    // private constructor restricted to this class itself 
    private Singleton() 
    { 
    } 
  
    // static method to create instance of Singleton class 
    public static Singleton getInstance() 
    { 
        if (instance == null) 
            instance = new Singleton(); 
  
        return instance; 
    } 
}