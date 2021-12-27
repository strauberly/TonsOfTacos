package tacos;
// colors could be set here to be used in other places through application
public class ANSIArt {

    public static void printTaco(){

        String tacoString = """
                   
                   
                   ||%Y%}YY}}//|||||||||||||||||||||\\\\
                  ||Y%%Y}%%Y//|||||||||||||||||||||||\\\\
                 ||}}Y%%Y}YY//|||||||||||||||||||||||||
                ||Y}}}}}%&&//||||||||||||||||||||||||||
                ||&&]&}%%&//|||||||||||||||||||||||||||
                ||&&]]&&}}//|||||||||||||||||||||||||||
                ||&}}%%}&//||||||||||||||||||||||||||||
                 ||&&&&&&//|||||||||||||||||||||||||//
                  \\\\|||||||||||||||||||||||||||||||/""";
        System.out.println(tacoString.replace("Y", "\u001B[38;5;214m" + "Y")
                .replace("%", "\u001B[31m" + "%")
                .replace("&","\u001B[38;5;94m" + "&" )
                .replace("}", "\u001B[32m" + "}")
                .replace("]", "\u001B[32m" + "]")
                .replace("|", "\u001B[38;5;226m" + "|")
                .replace("/", "\u001B[38;5;226m" + "/" ));
    }
}
