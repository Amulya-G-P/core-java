class Executor
{
	Calendar calendar=new Calendar();
	Event event=new Event();
	event.eventType=EventType.BIRTHDAYS;
	event.title="";
	calendar.addEvent(event);
	calendar.getEvent();
}
	