package classwork_07_16;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ND 07.16
//
//        Tarkime turime DB užklausą su neapibrėžtu kiekiu AND kriterijų SELECT * FROM users WHERE name='Jonas' AND surname='Jonaitis'...
//        0. Perrašyti buildQuery metodą (rašytą klasės darbo metu), kad nenulūžtų padavus null arba tuščią mapą ir kad užklausą liktų teisinga (be WHERE pvz. SELECT * FROM users).
//        1. Parašyti metodą, kuris pakeičia visus AND į OR.
//        2. Parašyti metodą, kuris palieka tik pirmą kriterijų (rezultato pvz.: SELECT * FROM users WHERE name='Jonas').

class Main {

    public static void main(String[] args) {
        Map<String, String> criteria = new HashMap<>();
        Map<String, String> criteria3 = new HashMap<>();
        Map<String, String> criteria2 = null;
        criteria.put("name", "Jonas");
        criteria.put("surname", "Jonaitis");
        criteria.put("age", "28");
        criteria.put("nationality", "Lithuanian");
        criteria.put("income", "3000$");
        criteria.put("status", "alive");


        // SELECT * FROM users WHERE name='Jonas' AND surname='Jonaitis'
        String query = buildQuery("users", criteria);
        System.out.println(query);

        System.out.println(andToOr( query ));

        System.out.println(firstCriteria( query ));

    }

    static String buildQuery(String table, Map<String, String> criteria) {
        final String and = " AND ";
        // SELECT * db_table WHERE column1 = 'val1' AND column2 = 'val2'....
        StringBuilder builder = new StringBuilder(String.format("SELECT * FROM %s WHERE ", table));
        try {
            criteria.forEach( (k, v) -> builder.append( k ).append( "='" ).append( v ).append( "'" ).append( and ) );
            if(criteria.size() == 0) {
                return builder.substring( 0, builder.length() - and.length() - 2 );
            } else  {
                return builder.substring( 0, builder.length() - and.length() );
            }
        } catch (NullPointerException e) {
            return builder.substring( 0, builder.length() - and.length() - 2 );
        }
    }

    static String andToOr(String query) {
        return query.replaceAll( "AND", "OR" );
    }

    static String firstCriteria(String query) {
        Matcher match = Pattern.compile( "(\\sname='[\\w]+')" ).matcher( query );
        match.find();
        return "SELECT * FROM users WHERE" + match.group( 1 );
    }
}

//NIKANORO
//import java.io.Serializable;
//import java.util.HashMap;
//import java.util.Map;
//
//class StringMain implements Serializable{
//
//    static transient String str;
//
//    public static void main(String[] args) {
//        Map<String, String> criteria = new HashMap<>();
//        Map<String, String> criteria2 = new HashMap<>();
//        criteria.put("name", "Jonas");
//        criteria.put("surname", "Jonaitis");
//        criteria.put("age", "25");
//        criteria.put("city", "Vilnius");
//
//        // SELECT * FROM users WHERE name='Jonas' AND surname='Jonaitis'...
//        String query = buildQuery("users", criteria);
//        System.out.println(query);
//        // SELECT * FROM users
//        System.out.println(changeAndtoOr(query));
////        System.out.println(query.substring(0, query.indexOf("WHERE") - 1).trim());
////        System.out.println(query.replaceFirst("(WHERE)(.*)", ""));
//        System.out.println(leaveFirstCriteria(query));
//    }
//
//    static String buildQuery(String table, Map<String, String> criteria) {
//        final String and = " AND ";
//        // SELECT * db_table WHERE column1 = 'val1' AND column2 = 'val2'....
//        StringBuilder builder = new StringBuilder(String.format("SELECT * FROM %s WHERE ", table));
//        if (criteria == null) {
//            return String.valueOf(builder.replace(builder.length()-7,builder.length(),""));
//        } else {
//            criteria.forEach((k, v) -> builder.append(k).append("='").append(v).append("'").append(and));
//        }
//        return builder.substring(0, builder.length() - and.length());
//    }
//
//    static String changeAndtoOr(String query) {
//        return query.replaceAll("(AND*)","OR");
//    }
//
//    static String leaveFirstCriteria(String query) {
//        return query.replaceAll("(AND)(.*) || (OR)(.*)", "");
//    }
//}
