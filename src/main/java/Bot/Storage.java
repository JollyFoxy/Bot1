package Bot;

import java.util.ArrayList;

public class Storage {
    private ArrayList<String> quoteList;
    public Storage(){
        quoteList = new ArrayList<>();
        quoteList.add("Начинать всегда стоит с того, что сеет сомнения. \n\nБорис Стругацкий.");
        quoteList.add("80% успеха - это появиться в нужном месте в нужное время.\n\nВуди Аллен");
        quoteList.add("Мы должны признать очевидное: понимают лишь те,кто хочет понять.\n\nБернар Вербер");
        quoteList.add("Срать стоя тоже достижение!!!\n\nя");
    }
    public String getQuote(){
        int randValue = (int)(Math.random() * quoteList.size());
        return quoteList.get(randValue);
    }
}
