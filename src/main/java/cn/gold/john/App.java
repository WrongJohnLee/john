package cn.gold.john;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        Arrays.asList("a","b","c").forEach( (String e) ->  System.out.println(e));
        Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );
    }


}
