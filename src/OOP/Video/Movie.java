package OOP;

public class Movie extends Video{
    String director;
    String rating;

    // Super Keyword
    /*
        A constructor for a child class always starts with an invocation
        of one of the constructors in the parent class. IF the parent clas
        has several constructors then the one which is invoked is determined
        by matching argument lists.
    */
    public Movie(String ttl, int lnght, String dir, String rtng){
        super(ttl, lnght); // super always needs to be the first line of the constructor
                          //  the parameters need to be written exactly the same way as
                          //  in the super class
        director = dir;
        rating = rtng;
    }
}
