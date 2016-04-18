+//Nama	: Akhmad Saifullah
 +//Nim	: 1301144242
 +//Kelas	: IF-38-02
  
 +public class SmartPhone{
 +	private Application[] appList = new Application[10];
 +	private int totalApp;
 +	private int memory;
 +	private int totalMemory;
 +	
 +	public void setMemory(int memory){
 +		this.memory = memory;
 +		totalMemory = this.memory;
 +	}
 +	
 +	public void addApplication(AppStore appStore, int appId){
 +		if(appStore.getApp(appId).getAppSize()<=getRemainingSize()){
 +			appList[totalApp]=appStore.getApp(appId);
 +			totalApp++;
 +		}
 +	}
 +	
 +	public Application getApp(int id){
 +		return appList[id];
 +	}
 +	
 +	public int getRemainingSize(){
 +		int x=0;
 +		for(int i=0;i<appList.length;i++){
 +			if(appList[i]!=null){
 +				x=x+appList[i].getAppSize();
 +			}
 +		}
 +		return memory=memory-x;
 +	}
 +	
 +	public String toString(){
 +		return "memory size "+totalMemory+"MB, "+totalApp+" application installed, remaining memory "+memory;
 +	}
 +}
