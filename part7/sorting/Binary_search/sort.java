package part7.sorting.Binary_search;
import java.util.ArrayList;

import part4.bbb.book;

public class sort {

    ArrayList<books> list;

    public sort(ArrayList<books> collection){
        this.list = collection;

    }
    public int indexOfSmallest(int index){
        books sampleBook = this.list.get(index);
        int sampleBookNum = sampleBook.getId();


        int i = -1;
        for( i =index; i<this.list.size(); i++){
            books nextBooks = this.list.get(i);
            int nextBooksNum = nextBooks.getId();

            if (nextBooksNum<sampleBookNum) {

                sampleBook = this.list.get(i);
                sampleBookNum = sampleBook.getId();
                
            }
        }
        return list.indexOf(sampleBook);
        
    }

    public void swap (int index1, int index2){
        books element1 = this.list.get(index1);
        books element2 = this.list.get(index2);

        this.list.set(index2, element1);
        this.list.set(index1, element2);

        System.out.println(" ");
        System.out.println(this.list);
        System.out.println(" ");
        

    }

    public void sort(){
        for(int i=0; i<this.list.size();i++){
            int index1 = indexOfSmallest(i);
            swap(i, index1);

        }

        
    }

    

    
}
