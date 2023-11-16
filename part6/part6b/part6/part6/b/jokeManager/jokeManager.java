package part6.part6b.part6.part6.b.JokeMaker;
import java.util.ArrayList;
import java.util.Random;

public class jokeManager {
    private ArrayList<String> jokes;

    public jokeManager(){
        this.jokes = new ArrayList<>();
    }

    public void addJokes(String joke){
        this.jokes.add(joke);
    }

    public void drawJokes(){
        Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        System.out.println(this.jokes.get(index));
    }

    public void removeJoke(int jokeNumber){
        int index = jokeNumber-1;
        this.jokes.remove(index);
    }

    public void printJokes(){
        for(int i=0; i<this.jokes.size();i++){
            System.out.println((i+1) + " " + this.jokes.get(i));
            System.out.println(" ");
        }
    }

    public void alreadyAddedJokes(){
        this.jokes.add("I was digging in our garden and found a chest full of gold coins. I wanted to run straight home to tell my wife about it. Then I remembered why I was digging in our garden.");
        this.jokes.add(" I visited my new friend in his apartment. He told me to make myself at home. So I threw him out. I hate having visitors.");
        this.jokes.add(" Do you know the phrase “One man’s trash is another man’s treasure”? Wonderful saying, horrible way to find out that you were adopted.");
        this.jokes.add(" Want to know how you make any salad into a caesar salad? Stab it twenty-three times.");
        this.jokes.add(" Give a man a match, and he’ll be warm for a few hours. Set him on fire, and he will be warm for the rest of his life.");
        this.jokes.add(" My grandfather said my generation relies too much on the latest technology. So I unplugged his life support.");
        this.jokes.add(" My parents raised me as an only child, which really pissed off my sister.");
        this.jokes.add(" What did the Titanic say as it sank? I’m nominating all passengers for the Ice Bucket Challenge!");
        this.jokes.add("I have many jokes about unemployed people—sadly none of them work.");
       
        this.jokes.add(" I threw a boomerang a few years ago. I now live in constant fear.");
        this.jokes.add(" I made a website for orphans. It doesn’t have a home page.");
        this.jokes.add(" The other day, my girlfriend asked me to pass her lipstick but I accidentally passed her a glue stick. She still isn't talking to me.");
        this.jokes.add(" You don’t need a parachute to go skydiving. You need a parachute to go skydiving twice.");
        this.jokes.add("  Today was the worst day of my life. My ex got hit by a school bus, and I lost my job as a bus driver.");
        this.jokes.add("They say the surest way to a man’s heart is through the stomach. But, I find going through the ribcage a lot easier.");
       
        



    }

    

    
    
}
