+//Nama	: Akhmad Saifullah
 +//Nim	: 1301144242
 +//Kelas	: IF-38-02
  
 +public class Driver{
 +	public static void main(String[] args){
 +		StartUp stp = new StartUp();
 +		
 +		Member m1 = new Member("Alex");
 +		stp.addMember(m1);
 +		Member m2 = new Member("Beni");
 +		stp.addMember(m2);
 +		Member m3 = new Member("Cakra");
 +		stp.addMember(m3);
 +		Member m4 = new Member("Deni");
 +		stp.addMember(m4);
 +		Member m5 = new Member("Eric");
 +		stp.addMember(m5);
 +		stp.createNewProject("Project1");
 +		stp.createNewProject("Project2");
 +		
 +		Project p = stp.getProject(0);
 +		Member m = stp.getMember(0);
 +		stp.setProjectMember(p,m);
 +		
 +		p = stp.getProject(0);
 +		m = stp.getMember(1);
 +		stp.setProjectMember(p,m);
 +		
 +		p = stp.getProject(0);
 +		m = stp.getMember(3);
 +		stp.setProjectMember(p,m);
 +		
 +		p = stp.getProject(1);
 +		m = stp.getMember(1);
 +		stp.setProjectMember(p,m);
 +		
 +		p = stp.getProject(1);
 +		m = stp.getMember(2);
 +		stp.setProjectMember(p,m);
 +		
 +		p = stp.getProject(1);
 +		m = stp.getMember(3);
 +		stp.setProjectMember(p,m);
 +		
 +		p = stp.getProject(1);
 +		m = stp.getMember(4);
 +		stp.setProjectMember(p,m);
 +		
 +		stp.releaseProject(stp.getProject(1));
 +		
 +		System.out.println(stp.getMember(0).toString());
 +		System.out.println(stp.getMember(1).toString());
 +		System.out.println(stp.getMember(2).toString());
 +		System.out.println(stp.getMember(3).toString());
 +		System.out.println(stp.getMember(4).toString());
 +		
 +		System.out.println(stp.getProject(0).toString());
 +		System.out.println(stp.getProject(1).toString());
 +		
 +		System.out.println("Released Project: "+stp.getNumReleasedProject());
 +	}
 +}
