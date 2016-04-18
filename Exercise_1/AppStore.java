+//Nama	: Ahmad Saifullah
 +//Nim	: 1301144242
 +//Kelas	: IF-38-02
  
 +public class AppStore{
 +	private Application[] appList = new Application[100];
 +	private int totalApp;
 +	
 +	public void createNewApp(String appName, int appSize){
 +		appList[totalApp] = new Application(appName,appSize);
 +		totalApp++;
 +	}
 +	
 +	public Application getApp(int id){
 +		return appList[id];
 +	}
 +	
 +	public int getTotalApp(){
 +		return totalApp;
 +	}
 +	
 +	public Application[] getAppList(){
 +		return appList;
 +	}
 +	
 +	public String toString(){
 +		return "There are "+totalApp+" ready to instal";
 +	}
 +}
