class Box {
   	double length; double breadth; double height;
	void setdata(double l) {
		length = l; breadth=l; height=l;
		System.out.println("Length : "+length);
	}

	void setdata(double l, double h) {
		length=l; breadth=l; height=h;
		System.out.println("Length : "+length+"Height : "+height);
	}

	void setdata(double l, double b, double h ) {
		length=l; breadth=b; height=h;
		System.out.println("Length : "+length+" Breadth : "+breadth+"Height : "+height);
	}
	
	double get() {
		return length * breadth * height;
	}

public static void main(String[] args) {
	Box obj = new Box();

	obj.setdata(5.0);
	obj.setdata(5.0, 10.0);
	obj.setdata(5.0, 10.0, 15.0);

	System.out.println("Volume : "+obj.get());
	
}
}
