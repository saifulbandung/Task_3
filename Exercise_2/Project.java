+//Nama	: Akhmad Saifullah
 +//Nim	: 1301144242
 +//Kelas	: IF-38-02
  
 +public class Project{
 +	private String projectName;
 +	private Member[] teamMember = new Member[5];
 +	private int nTeam=0;
 +	private boolean releaseStatus=false;
 +	
 +	public Project(String projectName){
 +		this.projectName=projectName;
 +	}	
 +	
 +	public void addMember(Member m){
 +		teamMember[nTeam] = m;
 +		nTeam++;
 +	}
 +	
 +	public boolean isReleased(){
 +		return releaseStatus;
 +	}
 +	
 +	public void releaseApp(){
 +		releaseStatus=true;
 +	}
 +	
 +	public String toString(){
 +		String kondisi;
 +		if(releaseStatus){
 +			kondisi="release";
 +		}
 +		else{
 +			kondisi="in progress";
 +		}
 +		return "Project "+projectName+" status is "+kondisi+" with team member of "+nTeam;
 +	}
 +}
