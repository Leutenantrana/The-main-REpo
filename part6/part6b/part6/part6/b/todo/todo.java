package part6.part6b.part6.part6.b.todo;

import java.util.ArrayList;

public class todo {

    ArrayList<String>taskStorer;

    public todo(){
        this.taskStorer =new ArrayList<>();
    }

    public void addTask(String tasks){
        this.taskStorer.add(tasks);
        
    }
    public void removeTask(int taskNum){
        int num = taskNum -1;

        this.taskStorer.remove(num);

    }
    public void print(){
        int index = this.taskStorer.size() ;
        int i=0;
        for(i=1;i<=index; i++){
            System.out.println(i +" :"+ " "+  this.taskStorer.get(i-1));
        }
    }

   


    
    
}
