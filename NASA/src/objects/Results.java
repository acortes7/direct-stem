package objects;

public class Results {
	private String url;
	private double time;
	
	public Results(){
	}
	public Results(String url, double time){
		this.url = url;
		this.time = time;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Results [url=" + url + ", time=" + time + "]";
	}
}
