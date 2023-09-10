package BehaivoralDP.MediatorDP;

public class Profesor implements Actor{

  public String name;
    public Mediator mediator;

    public Profesor(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name+" mesaji aldı. soruyu cevapliyor: "+ message);
    }

    @Override
    public void sendMessage(String topic, String message) {
            mediator.dispatch(topic,message);
    }
}
