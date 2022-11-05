// Tabuada das dezenas no formato:
// x + y = z    x - y = z   x * y = z   x / y = z

package semana4;

import java.text.DecimalFormat;

public class TabuadaDezenas {
    public static void main(String[] args) {
        
        Integer x = 1;
        Integer y = 1;
        Integer espaco = 16;

        DecimalFormat df = new DecimalFormat("#.##");

        while (y <= 10) {
            StringBuilder sb = new StringBuilder();
            sb.append(x).append(" + ").append(y).append(" = ").append(x+y);
            while (sb.length() < espaco) sb.append(" ");
            
            sb.append(x).append(" - ").append(y).append(" = ").append(x-y);
            while (sb.length() < espaco * 2) sb.append(" ");
            
            sb.append(x).append(" x ").append(y).append(" = ").append(x*y);
            while (sb.length() < espaco * 3) sb.append(" ");
            
            sb.append(x).append(" / ").append(y).append(" = ").append( df.format( ((double) x/ (double) y) ) );
            
            System.out.println(sb);

            y += 1;

            if(y == 11 & x < 10){
                x += 1;
                y = 1;
                System.out.println();
            }
        }
    }
}
