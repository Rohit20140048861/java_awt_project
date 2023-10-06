import java.awt.*;  // java.awt package is used     

private class InfoFrame extends Frame  //user defined class(InfoFrame) and than extends Frame class (inheritance)
// class InfoFrame 
{
	InfoFrame()
	{
		this.setVisible(true);    // here we have provided all frame properties using this keyword 
		this.setSize(400, 400);
		this.setTitle("Student database");
		this.setLayout(null);
        
		// Color c1=new Color(255,0,0);        //using rgb value 
		Color c2= Color(0Xceff00);  //using hexagonal value where 0X is neccessary before staring 
		this.setBackground(c1);    //set the background color of frame
		
		
	






































		// Frame f = new Frame();  //give the frame 
		// f.setVisible(true);  //set the visiblity
		// f.setSize(400,400);
		// f.setTitle(" Student Data base");
		// f.setLayout(null);
		
		// Label l =new Label("Name");
		// l.setBounds(50,50,100,20);
		// f.add(l);

		// TextField t= new TextField();
		// t.setBounds(150,50,100,20);
		// f.add(t);
		
		// Label l2 =new Label("Address");
		// l2.setBounds(50,100,100,20);
		// f.add(l2);

		// TextField t2  =new TextField();
		// t2.setBounds(150,100,100,20);
		// f.add(t2);

		// Label l3=new Label("Gender");
		// l3.setBounds(50,120,100,50);
		// f.add(l3);
		
		// CheckboxGroup grp =new CheckboxGroup();
		// Checkbox c1  =new Checkbox("Male",grp,false);
		// c1.setBounds(150,120,50,50);
		// f.add(c1);
		
		// Checkbox c2  =new Checkbox("Female",grp,false);
		// c2.setBounds(220,120,70,50);
		// f.add(c2);

		// Label l4=new Label("Qualification");
		// l4.setBounds(50,180,100,50);
		// f.add(l4);

		// Choice t6  =new Choice();
		// t6.setBounds(150,195,100,50);
		// t6.add("10th");
		// t6.add("12th");
		// t6.add("Graduate");
		// f.add(t6);
		
		// Button b1 = new Button("Submit");
		// b1.setBounds(80,250,100,40);
		// f.add(b1);

		// Button b2 = new Button("Cancel");
		// b2.setBounds(220,250,100,40);
		// f.add(b2);




	}
	public static void main(String arg[])
	{
		InfoFrame f1= new InfoFrame();   //main() method is call
	}	
	
}