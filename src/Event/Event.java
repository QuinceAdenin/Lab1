package Event;

import Resource.Resource;//Подключили ресурсы
import Personnel.Personnel;//Подключили персонал
import Schedule.Visitor;//Подлючили посетителя
//Класс мероприятие вфывф
public class Event {
    private EventType type;
    private Resource resource;
    private Personnel personnel;
    private String description;

    public Event(EventType type, Resource resource, Personnel personnel, String description) {
        this.type = type;
        this.resource = resource;
        this.personnel = personnel;
        this.description = description;
    }
    //Реализация паттерна посетитель
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    //Вывод строки
    public String toString() {
        return "Event Type: " + type +
                ", Resource: " + resource.getDescription() +
                ", Personnel: " + personnel.getRole() +
                ", Description: " + description;
    }
}
