package BehaivoralDP.MediatorDP;

import java.util.HashMap;
import java.util.Map;

public class MessageMediator implements Mediator{

    //tum actorleri uzman olduklari konu ile birlikte burada tutalim
    Map<String,Actor> registeredActor = new HashMap<>();
    //mape actorleri konulari ile kaydedilim
    public void register(String topic, Actor actor){
        registeredActor.put(topic,actor);
    }

    @Override
    public void dispatch(String topic, String message) {
        //topic hakkinda uzman olan katilimciyi bulalim
        Actor actor= registeredActor.get(topic);
        if (actor==null){
            System.out.println("bu konu hakkinda uzman bir katilmi bulunmamaktadir");
        }else {
            actor.receiveMessage(message);
        }

    }
}
