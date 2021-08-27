package week3.day2.assignments;

public class ExeDesktop extends Desktop implements Hardware,SoftWare{

	@Override
	public void softwareResources(String str1, String str2, int a) {

		System.out.println("\n.............S/W Interface....................");
		System.out.println(str1+","+str2+" are the "+a+" resources provided by Software interface" );
	}

	@Override
	public void hardwareResources(String str1, String str2) {
		// TODO Auto-generated method stub
		System.out.println("\n.............H/W Interface....................");
		System.out.println("Resocurces provided by Hardware Interface: "+str1+" ,"+str2);
	}
	
	
	void ownMethod()
	{
		System.out.println("\n.............Own Method....................");
		System.out.println("Own method in Desktop class");
	}

	@Override
	void dsktopModel2() {
		// TODO Auto-generated method stub
		System.out.println("\n.............Abtract method from desktop class....................");
		
		String str="Mac Book pro";
		
	System.out.println("Destop model 2:" +str);
		
	}
	
	public static void main(String[] args) {
		
		ExeDesktop absObj=new ExeDesktop();
		absObj.hardwareResources("RAM","Monitor");
		absObj.softwareResources("JDK1.8", "Eclipse", 2);
		absObj.ownMethod();
		absObj.desktopModel1("Dell Inspiron");
		absObj.dsktopModel2();
		absObj.interfaceName("Hardware","SoftWare");
		
		
	}
}



