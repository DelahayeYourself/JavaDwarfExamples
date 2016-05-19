package percevalgenerator.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author sam
 */
public class Quotes {
    private List<String> begin = new ArrayList();
    private List<String> middle = new ArrayList();
    private List<String> end = new ArrayList();
    
    private Random random = new Random();
    
    public Quotes(){
        this.begin.add("Si on faisait le coup du bouclier humain ?");
        this.begin.add("Putain, en plein dans sa mouille !");
        this.begin.add("Faut faire comme avec les scorpions qui se suicident quand ils sont entourés par le feu,");
        this.begin.add("Faut arrêter ces conneries de nord et de sud ! ");
        this.begin.add("Donc, pour résumer, je suis souvent victime des colibris,");
        
        this.middle.add("Par exemple, Sire, Léodagan et moi on fait semblant de vous prendre en otage :");
        this.middle.add("faut faire un feu en forme de cercle, autour d’eux, comme ça ils se suicident,");
        this.middle.add("Toi un jour je te crame ta famille, toi.");
        this.middle.add("Une fois pour toutes, le nord, suivant comment on est tourné, ça change tout !");
        this.middle.add("sous-entendu des types qu’oublient toujours tout.");
        
        this.end.add("on vous met une dague sous le cou et on traverse le camp adverse en gueulant : \" Bougez pas, bougez pas ou on bute le roi!\"...");
        this.end.add("pendant que nous on fait le tour et on lance de la caillasse de l’autre côté pour brouiller... Non ?");
        this.end.add("Euh, non… ");
        this.end.add("Bref, tout ça pour dire, que je voudrais bien qu’on me considère en tant que Tel.");
        this.end.add("C’est pas faux.");
    }
    
    private String random(List<String> list){
        return list.get(random.nextInt(list.size()));
    }
    
    public String randomBegin(){
        return random(begin);
    }
    
    public String randomMiddle(){
        return random(middle);
    }
    
    public String randomEnd(){
        return random(end);
    }
    
    public String randomQuote(){
        return String.format("%s %s %s", randomBegin(), randomMiddle(), randomEnd());
    }
}
