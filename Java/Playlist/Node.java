public class Node{
	Song data;
	Node next;
	public Node (Song enter){
		data=new Song();
		data.title=enter.title;
		data.band=enter.band;
		data.duration=enter.duration;
	}
	public void visualizeNode(){
		System.out.println(data.title+"-"+data.band+" ("+data.duration+":00)");
	}
}
